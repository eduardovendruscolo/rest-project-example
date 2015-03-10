package br.com.eduardo.services;

public interface ServiceInterface {

    /**
     * Realiza uma tarefa, chamando uma outra encadeada, com o mesmo interceptador.
     * 
     * @param string
     */
    public abstract void fazerCoisa( String string );

}