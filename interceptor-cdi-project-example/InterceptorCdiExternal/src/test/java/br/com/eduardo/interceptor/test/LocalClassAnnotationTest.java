package br.com.eduardo.interceptor.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.eduardo.external.LocalEjbClassAnnotation;

import br.com.eduardo.utils.WeldJUnit4Runner;

@RunWith( WeldJUnit4Runner.class )
public class LocalClassAnnotationTest {

    @Inject
    private LocalEjbClassAnnotation localEjbClassAnnotation;

    @Test
    public void localAnnotationTest() {
        localEjbClassAnnotation.test();
    }

}
