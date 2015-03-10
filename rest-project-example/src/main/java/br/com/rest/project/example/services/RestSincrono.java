package br.com.rest.project.example.services;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.rest.project.example.dto.Carro;

@Path( "Sync" )
@RequestScoped
public class RestSincrono {

    /**
     * Método REST que recebe um parâmetro e tem uma validação para ele se é um número, através a anotação @Pattern.
     *
     * @param id
     *            parametro identificador.
     * @return String com o valor do parametro.
     */
    @GET
    @Path( "{id}" )
    @Produces( "application/json; charset=UTF-8" )
    public String getId( @PathParam( "id" ) @Pattern( regexp = "[0-9]+" ) String id ) {
        return "O id é = " + id;
    }

    /**
     * Método REST sem parâmetros.
     *
     * @param id
     *            parametro identificador.
     * @return String com o valor do parametro.
     */
    @GET
    @Produces( "application/json; charset=UTF-8" )
    public String getId() {
        return "get sem parametros";
    }

    /**
     * Método post passando um objeto como parâmetro.
     *
     * @param carro
     * @return
     */
    @POST
    @Produces( "application/json; charset=UTF-8" )
    @Consumes( "application/json; charset=UTF-8" )
    public Response save( Carro carro ) {
        return Response.ok( carro ).build();
    }

    /**
     * Método POST com charset iso-8859-1 para testes de chamadas de métodos.
     *
     * @param carro
     * @return
     */
    @POST
    @Produces( "application/json; charset=iso-8859-1" )
    @Consumes( "application/json; charset=iso-8859-1" )
    public Response saveDois( Carro carro ) {
        carro.setAno( 2016 );
        carro.setNome( "BMW 135i" );
        return Response.ok( carro ).build();
    }

    /**
     * Um teste para quando houver necessidade de realizar operações em um item apenas ou em vários, como REST não
     * permite sobrecarga, criado um novo Path a partir do atual "saveList".
     *
     * @param carros
     * @return
     */
    @POST
    @Path( "saveList" )
    @Produces( "application/json; charset=UTF-8" )
    @Consumes( "application/json; charset=UTF-8" )
    public Response save( Carro[] carros ) {
        return Response.ok( carros ).build();
    }

}
