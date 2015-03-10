package br.com.eduardo.services;

import javax.ejb.Stateless;

import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.utils.Log;

@Stateless
public class ServiceEncadeadoImpl implements ServiceEncadeadoInterface {

    /*
     * (non-Javadoc)
     * @see br.com.eduardo.services.ServiceEncadeadoInterface#fazerCoisaEncadeada()
     */
    @Override
    @InterceptAnnotation
    public void fazerCoisaEncadeada() {
        Log.log( "Executando uma tarefa encadeada" );
    }

}
