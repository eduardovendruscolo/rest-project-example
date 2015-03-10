package br.com.eduardo.interceptor.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.eduardo.services.ServiceAnnotationsInterface;
import br.com.eduardo.utils.WeldJUnit4Runner;

/**
 * Faz testes com tipos de anotações de interceptor diferentes, uma sob o nome da classe e outra sob o nome do método.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 20/01/2015
 */
@RunWith( WeldJUnit4Runner.class )
public class MultipleAnnotationsTest {

    @Inject
    private ServiceAnnotationsInterface sa;

    @Test
    public void testAnnotations() {
        sa.test();
        sa.test2();
        sa.test3();
    }

}
