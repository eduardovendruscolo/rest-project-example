package br.com.eduardo.utils;

/**
 * Classe que simula um gerenciamento de transação.
 * 
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 23/01/2015
 */
public class TransactionFake {

    // Trecho de código para simular erro
    // String[] error = new String[] { "a" };
    // String d = error[1];

    public static TransactionFake beginTransaction() {
        Log.log( "criada uma TransactionFake" );
        return new TransactionFake();
    }

    public String commit() {
        Log.log( "commit" );
        return "commit transaction";
    }

    public String rollback() {
        Log.log( "rollback" );
        return "rollback transaction";
    }

}
