package br.com.eduardo.services.external;

import javax.interceptor.Interceptors;

import br.com.eduardo.external.ExternalClassAnnotationInterface;
import br.com.eduardo.interceptor.interceptor.InterceptorImplementation;
import br.com.eduardo.utils.Log;

@Interceptors( InterceptorImplementation.class )
public class ServiceExternalClassAnnotationsImpl implements ExternalClassAnnotationInterface {

    @Override
    public void classAnnotation() {
        Log.log( "Anotação na classe (InterceptorCdiImpl)" );
    }

}
