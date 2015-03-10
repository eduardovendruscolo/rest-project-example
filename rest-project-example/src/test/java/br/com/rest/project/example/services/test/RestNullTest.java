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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.rest.project.example.dto.Carro;

public class RestNullTest {

    /**
     * Faz um teste passando um objeto como parametro, para um post, com algum atributo do objeto valorizado com null.
     */
    @Test
    public void testCarroAtributosNulos() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" );
        Carro carro = new Carro( null, null );
        Response response = target.request( MediaType.APPLICATION_JSON_TYPE ).post(
                        Entity.entity( carro, "application/json; charset=UTF-8" ) );
        String compare = "{\"ano\":null,\"nome\":null}";
        String readEntityStr = response.readEntity( String.class );
        Assert.assertEquals( compare, readEntityStr );
        System.out.println( readEntityStr );

    }

    /**
     * Faz um teste passando um objeto como parametro, para um post, com algum atributo do objeto valorizado em branco.
     */
    @Test
    public void testCarroAtributosEmBanco() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target( "http://127.0.0.1:8080/rest-project-example/api/Sync" );
        Carro carro = new Carro( null, "" );
        Response response = target.request( MediaType.APPLICATION_JSON_TYPE ).post(
                        Entity.entity( carro, "application/json; charset=UTF-8" ) );
        String compare = "{\"ano\":null,\"nome\":\"\"}";
        String readEntityStr = response.readEntity( String.class );
        Assert.assertEquals( compare, readEntityStr );
        System.out.println( readEntityStr );

    }

    /**
     * Testa a biblioteca Jackson, responsável por fazer os binds de DTO´s para Json e vice versa.
     *
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @Test
    public void jacksonTest() throws JsonParseException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        Carro carro = mapper.readValue( "{\"ano\":2008,\"nome\":\"Civic\"}", Carro.class );
        Assert.assertTrue( carro.getNome().equals( "Civic" ) );
        Assert.assertTrue( carro.getAno().equals( 2008 ) );

    }
}
