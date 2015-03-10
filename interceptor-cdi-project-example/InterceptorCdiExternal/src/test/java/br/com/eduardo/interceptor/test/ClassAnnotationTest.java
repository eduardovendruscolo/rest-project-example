package br.com.eduardo.interceptor.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.eduardo.external.ExternalClassAnnotationInterface;
import br.com.eduardo.utils.WeldJUnit4Runner;

/**
 * Utiliza-se do projeto interceptorCdiImpl, injetando um EJB com interceptação na classe do EJB.
 * 
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
@RunWith( WeldJUnit4Runner.class )
public class ClassAnnotationTest {

    @Inject
    private ExternalClassAnnotationInterface externalClassAnnotationInterface;

    @Test
    public void classAnnotationTest() {
        externalClassAnnotationInterface.classAnnotation();
    }

}
