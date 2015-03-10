package br.com.eduardo.interceptor.ejb;

import br.com.eduardo.external.LocalEjbMethodAnnotation;

import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.utils.Log;

public class LocalEjbMethodAnnotationImpl implements LocalEjbMethodAnnotation {

    @InterceptAnnotation
    public void test() {
        Log.log( "local EJB method annotation (InterceptorCdiExternal)" );
    }

}
