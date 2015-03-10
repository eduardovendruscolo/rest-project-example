package br.com.eduardo.utils;

/**
 * Log para imprimir informações no console.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
public class Log {

    /**
     * Imprime informações no console.
     *
     * @param msg
     *            Mensgem para impressão.
     */
    public static void log( String msg ) {
        System.out.println( String.format( "---( Thread = %s ) ---> %s", Thread.currentThread().getName(), msg ) );
    }

}
