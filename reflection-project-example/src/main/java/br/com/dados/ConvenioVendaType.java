package br.com.dados;

/**
 * Enum que representa os tipos de convênios de vendas.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public enum ConvenioVendaType {

    /**
     * Representa a opção "Mensal" do convenio de vendas.
     */
    MENSAL,

    /**
     * Representa a opção "Quinzenal" do convenio de vendas.
     */
    QUINZENAL,

    /**
     * Representa a opção "Semanal" do convenio de vendas.
     */
    SEMANAL;

    /**
     * Retorna o respectivo enum com base no valor passado por parametro.
     *
     * @param value
     *            Valor no formato inteiro.
     * @return Valor do Enum que representado pelo valor passado por parametro.
     */
    public static ConvenioVendaType getByValue( Integer value ) {
        for ( ConvenioVendaType convenioVendaType : ConvenioVendaType.values() ) {
            if ( value.equals( convenioVendaType.ordinal() ) ) {
                return convenioVendaType;
            }
        }
        return null;
    }

}
