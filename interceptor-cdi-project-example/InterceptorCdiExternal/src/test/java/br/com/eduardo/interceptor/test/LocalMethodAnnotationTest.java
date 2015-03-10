package br.com.eduardo.interceptor.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.eduardo.external.LocalEjbMethodAnnotation;

import br.com.eduardo.utils.WeldJUnit4Runner;

@RunWith( WeldJUnit4Runner.class )
public class LocalMethodAnnotationTest {

    @Inject
    private LocalEjbMethodAnnotation localEjbMethodAnnotation;

    @Test
    public void localAnnotationTest() {
        localEjbMethodAnnotation.test();
    }

}
