package br.com.eduardo.interceptor.ejb;

import javax.interceptor.Interceptors;

import br.com.eduardo.external.LocalEjbClassAnnotation;

import br.com.eduardo.interceptor.interceptor.InterceptorImplementation;
import br.com.eduardo.utils.Log;

@Interceptors( InterceptorImplementation.class )
public class LocalEjbClassAnnotationImpl implements LocalEjbClassAnnotation {

    public void test() {
        Log.log( "local EJB class annotation (InterceptorCdiExternal)" );
    }

}
