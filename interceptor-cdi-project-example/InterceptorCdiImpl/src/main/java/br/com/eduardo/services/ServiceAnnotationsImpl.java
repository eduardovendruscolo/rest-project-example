package br.com.eduardo.services;

import javax.interceptor.Interceptors;

import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.interceptor.interceptor.InterceptorImplementation;
import br.com.eduardo.utils.Log;

/**
 * Classe para testar chamada de métodos com anotações de interceptadores de diferentes modos.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
@Interceptors( InterceptorImplementation.class )
public class ServiceAnnotationsImpl implements ServiceAnnotationsInterface {

    @Override
    @InterceptAnnotation
    public void test() {
        Log.log( "test 1" );
    }

    @Override
    public void test2() {
        Log.log( "test 2" );
    }

    @Override
    public void test3() {
        Log.log( "test 3" );
    }

}
