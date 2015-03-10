package br.com.rest.project.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Testa se não ocorre problemas de REST com uma URL de endpoint contendo hífen.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 26/01/2015
 */
@Path( "rest-hyphen" )
public class RestHiphenPath {

    @GET
    @Produces( "application/json; charset=UTF-8" )
    public String getHyphenRest() {

        return "Path com hífen executado com sucesso!";

    }

}
