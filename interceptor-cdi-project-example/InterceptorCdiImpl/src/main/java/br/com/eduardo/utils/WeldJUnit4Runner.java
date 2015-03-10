package br.com.eduardo.utils;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Classe para rodar injeção de dependências no testes unitário.
 * 
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
public class WeldJUnit4Runner extends BlockJUnit4ClassRunner {

    private final Class<?> klass;
    private final Weld weld;
    private final WeldContainer container;

    @Override
    protected Object createTest() throws Exception {
        final Object test = container.instance().select( klass ).get();
        return test;
    }

    public WeldJUnit4Runner( final Class<Object> klass )
                    throws InitializationError {
        super( klass );
        this.klass = klass;
        this.weld = new Weld();
        this.container = weld.initialize();
    }

}
