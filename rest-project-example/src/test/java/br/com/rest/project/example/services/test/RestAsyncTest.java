package br.com.rest.project.example.services.test;

import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Testa uma requisição REST assíncrona.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 31/12/2014
 */
public class RestAsyncTest {

    /**
     * Realiza testes em um Rest assíncrono.
     */
    @Test
    @Ignore
    public void testeRestAssincrono() {

        // TODO Criar uma maneira de ficar testando, para verificar se retornou ou não a solicitação assíncrona.
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://localhost:8080/rest-project-example/api/Async" );

        final AsyncInvoker asyncInvoker = target.request().async();
        final Future<Response> responseFuture = asyncInvoker.get();
        System.out.println( "Request Assincrono" );
        try {
            Thread.sleep( 500 );
            final Response response = responseFuture.get();
            final String readEntityResult = response.readEntity( String.class );
            // status http 400 Requisição OK
            Assert.assertEquals( 200, response.getStatus() );
            Assert.assertTrue( readEntityResult.contains( "Retorna tarefa muito custosa para a aplicação!" ) );
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            System.out.println( "Fim" );
        }

    }
}
