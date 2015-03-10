package br.com.rest.project.example.services.test;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

import br.com.rest.project.example.dto.Carro;

public class RestSyncTest {

    /**
     * Faz um teste com um REST realiza um simples GET em um método e retorna o mesmo id passado como parâmetro.
     */
    @Test
    public void testeRestSincrono() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" + "/1" );

        Response response = target.request().get();
        final String readEntityResult = response.readEntity( String.class );

        // status http 400 Requisição OK
        Assert.assertEquals( 200, response.getStatus() );
        Assert.assertTrue( "O id é = 1".compareTo( readEntityResult ) == 0 );

    }

    /**
     * Faz um teste com um REST realiza um simples GET sem parâmetros.
     */
    @Test
    public void testeRestSincronoSemParametros() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" );
        Response response = target.request().get();

        final String readEntityResult = response.readEntity( String.class );
        // status http 400 Requisição OK
        Assert.assertEquals( 200, response.getStatus() );
        Assert.assertTrue( "get sem parametros".compareTo( readEntityResult ) == 0 );

    }

    /**
     * Testa um erro no método, espera um id inteiro, mas é passado um número e um sufixo com uma letra A para forçar o
     * erro, pois "1A" não passa no Regex anotado com @Pattern( regexp = "[0-9]+" ).
     */
    @Test
    public void testeRestSincronoErro() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://localhost:8080/rest-project-example/api/Sync/1A" );

        Response response = target.request().get();
        final String readEntityResult = response.readEntity( String.class );

        // status http 400 Requisição inválida
        Assert.assertEquals( 400, response.getStatus() );
        Assert.assertTrue( readEntityResult.contains( "deve corresponder à \"[0-9]+\"" ) );

    }

    /**
     * Faz um teste passando um objeto como parametro, para um post, e retornando o mesmo objeto, via JSON.
     */
    @Test
    public void testCarro() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" );
        Carro c = new Carro( 2008, "Civic" );
        Response response = target.request( MediaType.APPLICATION_JSON_TYPE ).post(
                        Entity.entity( c, "application/json; charset=UTF-8" ) );
        Assert.assertEquals( "{\"ano\":2008,\"nome\":\"Civic\"}", response.readEntity( String.class ) );

    }

    /**
     * Faz um teste de sobregarga no rest, alterando o Media Type, no caso este passa um iso-8859-1, por isso chama
     * outro método no endpoint, se chamar com UTF-8 chama o padrão.
     */
    @Test
    public void testCarroSobrecargaCharsetIso88591() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" );
        Carro c = new Carro( 2008, "Civic" );
        Response response = target.request( MediaType.APPLICATION_JSON_TYPE ).post(
                        Entity.entity( c, "application/json; charset=iso-8859-1" ) );
        Assert.assertEquals( "{\"ano\":2016,\"nome\":\"BMW 135i\"}", response.readEntity( String.class ) );

    }

    /**
     * Faz um teste passando uma lista de objetos como parametro, para um post, e retornando os mesmos objetos, via
     * JSON. Note que para que funcione teve que ser adicinoado este sufixo /saveList, que foi definido no serviço REST
     * pois REST não aceita a sobrecarga de métodos como funciona na linguagem Java. ou seja não posso anotar dois
     * métodos com @POST para um mesmo endpoint.
     *
     * @throws IOException
     */
    @Test
    public void testCarroLista() throws IOException {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync/saveList" );
        Carro c1 = new Carro( 2008, "Civic" );
        Carro c2 = new Carro( 2010, "Corolla" );
        Carro[] carros = new Carro[] { c1, c2 };

        Response response = target.request( MediaType.APPLICATION_JSON_TYPE ).post(
                        Entity.entity( carros, "application/json; charset=UTF-8" ) );
        Assert.assertEquals( "[{\"ano\":2008,\"nome\":\"Civic\"},{\"ano\":2010,\"nome\":\"Corolla\"}]",
                        response.readEntity( String.class ) );

    }
}
