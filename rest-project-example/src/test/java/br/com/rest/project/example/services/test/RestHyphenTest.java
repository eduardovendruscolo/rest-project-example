package br.com.rest.project.example.services.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testes com REST.
 * 
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 26/01/2015
 */
public class RestHyphenTest {

    /**
     * Faz um teste com um REST realiza um simples GET sem parâmetros.
     */
    @Test
    public void testeRestSincronoSemParametros() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/rest-hyphen" );
        Response response = target.request().get();

        final String readEntityResult = response.readEntity( String.class );
        // status http 400 Requisição OK
        Assert.assertEquals( 200, response.getStatus() );
        Assert.assertTrue( "Path com hífen executado com sucesso!".compareTo( readEntityResult ) == 0 );

    }

}
