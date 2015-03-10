package br.com.eduardo.interceptor.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.eduardo.services.ServiceInterface;
import br.com.eduardo.utils.WeldJUnit4Runner;

/**
 * Faz testes com interceptadores.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
@RunWith( WeldJUnit4Runner.class )
public class InterceptorEncadeadoTest {

    @Inject
    private ServiceInterface si1;

    /**
     * Realiza um teste, chamando um método de um EJB onde este método tem nele uma chamada para outro EJB, onde ambos
     * os métodos tem a anotação @InterceptAnnotation, o comportamento deve ser criar uma transação e finalizar apenas
     * na última interceptação, ou seja, a transação deve ser atômica.
     */
    @Test
    public void testInterceptor() {
        si1.fazerCoisa( "chained" );
    }

}
