package br.com.eduardo.interceptor.interceptor;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.utils.Log;
import br.com.eduardo.utils.TransactionFake;

/**
 * @author eduardojose <eduardo@ciss.com.br>
 *         <p>
 * @since 27/12/2014
 *        <p>
 *        Interceptor que fornece uma maneira de saber se este interceptor já foi interceptado antes, para fins de não
 *        ocorrer problemas com interceptações encadeadas do mesmo intereceptor.
 *        <p>
 *        Exlicação detalhada do escopo da Local-Thread. http://imasters.com.br/linguagens
 *        /java/aprenda-mais-sobre-o-escopo-thread-local/#
 */

@Interceptor
@InterceptAnnotation
public class InterceptorImplementation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ThreadLocal é um recurso que permite ter um objeto no escopo de uma Thread, ou seja, atribuido a ThreadLocal é
     * acessível dentro do ciclo de vida e escopo da Thread atual.
     */
    private static final ThreadLocal<String> INTERCEPTION_IDENTIFICATION = new ThreadLocal<String>();

    /**
     * Transação do banco de dados, colocado também em um contexto de ThreadLocal, pois não pode ser interna do método
     * devido a necessidade de progagação da mesma em interceptadores encadeados, e pode haver problemas de concorrência
     * se for estática.
     */
    private static final ThreadLocal<TransactionFake> CONTEXT_TRANSACTION = new ThreadLocal<TransactionFake>();

    /**
     * Interceptação da Annotation @Transacional e implementação da abertura e fechamento de transação em caso de
     * sucesso e rollback em caso de falha. Esse processo é utilizado em nosso projeto devido ao nosso processo de
     * criação de factorys dinâmicas para a camada de persistencia.
     * <p>
     * A exception lançada neste método pode ser propagada, basta o método que está sendo interceptado lançar a mesma
     * exception que o método interceptador, neste caso <code>Exception</code>, e quem invocar o método anotado pode
     * capturar a Exception e fazer a administração da Excessão.
     *
     * @param context
     *            Interceptação.
     * @return Object object.
     * @throws Exception
     *             Excessão ocorrida durante a interceptação.
     */
    @AroundInvoke
    public Object intercept( InvocationContext context ) throws Exception {
        Object obj = null;

        if ( INTERCEPTION_IDENTIFICATION.get() == null ) {
            INTERCEPTION_IDENTIFICATION.set( interceptKeys( context ) );
            CONTEXT_TRANSACTION.set( TransactionFake.beginTransaction() );
        }

        try {
            obj = context.proceed();
        } catch ( Exception interceptedMethodException ) {
            Log.log( " Exception " + interceptKeys( context ) );
            if ( interceptKeys( context ).equals( INTERCEPTION_IDENTIFICATION.get() ) ) {
                try {
                    CONTEXT_TRANSACTION.get().rollback();
                } catch ( Exception rollbackException ) {
                    throw rollbackException;
                } finally {
                    clearLocalThreadObjects();
                }
            }
            throw interceptedMethodException;
        }

        if ( interceptKeys( context ).equals( INTERCEPTION_IDENTIFICATION.get() ) ) {
            try {
                CONTEXT_TRANSACTION.get().commit();
            } catch ( Exception commitException ) {
                try {
                    CONTEXT_TRANSACTION.get().rollback();
                } catch ( Exception rollbackException ) {
                    throw rollbackException;
                }
                throw commitException;
            } finally {
                clearLocalThreadObjects();
            }
        }

        return obj;
    }

    /**
     * Limpa os objetos da transação e identificação de interceptação da Thread Local.
     */
    private void clearLocalThreadObjects() {
        Log.log( "clearLocalThreadObjects" );
        CONTEXT_TRANSACTION.remove();
        INTERCEPTION_IDENTIFICATION.remove();
    }

    /**
     * Recupera o nome da classe, o nome da método e os parametros do método interceptado, para montar uma String de
     * identificação da interceptação única, para realizar controle de interceptações encadeadas.
     *
     * @param context
     *            Contexto do método interceptado.
     * @return String com chave identificadora do método interceptado.
     */
    private String interceptKeys( InvocationContext context ) {
        final String interceptedClassName = context.getMethod().getDeclaringClass().getName();
        final String interceptedMethodName = context.getMethod().getName();
        final StringBuilder interceptedMethodParams = new StringBuilder( "" );
        for ( Class<?> paramType : context.getMethod().getParameterTypes() ) {
            interceptedMethodParams.append( paramType );
        }
        final String interceptionKey = interceptedClassName + interceptedMethodName + interceptedMethodParams;
        return interceptionKey.replaceAll( " ", "" );
    }

}
