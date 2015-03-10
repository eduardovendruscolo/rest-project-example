package br.com.rest.project.example.services;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 * Executa um método assíncrono.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 31/12/2014
 */
@Path( "Async" )
@RequestScoped
public class RestAssincrono {

    @GET
    public void asyncGet( @Suspended final AsyncResponse asyncResponse ) {

        new Thread( new Runnable() {

            @Override
            public void run() {
                String result = this.veryExpensiveOperation();
                asyncResponse.resume( result );
            }

            private String veryExpensiveOperation() {
                try {
                    Thread.sleep( 500 );
                } catch ( InterruptedException e ) {
                    e.printStackTrace();
                }
                return "Retorna tarefa muito custosa para a aplicação!";
            }

        } ).start();

    }

}
