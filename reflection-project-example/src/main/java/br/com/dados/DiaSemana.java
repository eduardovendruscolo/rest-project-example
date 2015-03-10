package br.com.dados;

/**
 * Enum que representa os dias da semana.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public enum DiaSemana {

    /**
     * Representa o Domingo.
     */
    DOMINGO,

    /**
     * Representa a Segunda-feira.
     */
    SEGUNDA,

    /**
     * Representa a Terça-feira.
     */
    TERCA,

    /**
     * Representa a Quarta-feira.
     */
    QUARTA,

    /**
     * Representa a Quinta-feira.
     */
    QUINTA,

    /**
     * Representa a Sexta-feira.
     */
    SEXTA,

    /**
     * Representa o Sabado.
     */
    SABADO;

    /**
     * Retorna o respectivo enum com base no valor passado por parametro.
     *
     * @param value
     *            dia da semana em formato inteiro.
     * @return dia da semana em formato de enum.
     */
    public static DiaSemana getByValue( Integer value ) {
        for ( DiaSemana diaSemana : DiaSemana.values() ) {
            if ( value.equals( diaSemana.ordinal() ) ) {
                return diaSemana;
            }
        }
        return null;
    }
}
