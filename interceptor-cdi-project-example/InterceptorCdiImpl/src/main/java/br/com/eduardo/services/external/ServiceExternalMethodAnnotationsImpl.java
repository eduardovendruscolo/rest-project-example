package br.com.eduardo.services.external;

import br.com.eduardo.external.ExternalMethodAnnotationInterface;
import br.com.eduardo.interceptor.annotation.InterceptAnnotation;
import br.com.eduardo.utils.Log;

public class ServiceExternalMethodAnnotationsImpl implements ExternalMethodAnnotationInterface {

    @Override
    @InterceptAnnotation
    public void methodAnnotation() {
        Log.log( "Anotação no método (InterceptorCdiImpl)" );
    }

}
