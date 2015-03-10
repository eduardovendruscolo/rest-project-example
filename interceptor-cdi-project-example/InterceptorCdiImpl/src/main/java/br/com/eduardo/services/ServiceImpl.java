package br.com.eduardo.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.utils.Log;

@Stateless
public class ServiceImpl implements ServiceInterface {

    /**
     * Injeção de um EJB para executar tarefa encadeada com mesmo @InterceptAnnotation.
     */
    @Inject
    private ServiceEncadeadoInterface sei;

    /*
     * (non-Javadoc)
     * @see br.com.eduardo.services.ServiceInterface#fazerCoisa(java.lang.String)
     */
    @Override
    @InterceptAnnotation
    public void fazerCoisa( String string ) {
        Log.log( "Executando uma tarefa - antes" );
        sei.fazerCoisaEncadeada();
        Log.log( "Executando uma tarefa - depois" );
    }

}
