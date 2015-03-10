package br.com.dados;

/**
 * Data Transfer Object que representa um convênio de venda quinzenal.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public class ConvenioQuinzenalDTO {

    /**
     * Código do convênio quinzenal.
     */
    private Integer idConvenioQuinzenal;

    /**
     * Dia do primeiro fechamento.
     */
    private Integer diPrimeiroFechamento;

    /**
     * Dia do segundo fechamento.
     */
    private Integer diSegundoFechamento;

    /**
     * Convenio de venda relacionado ao convenio quinzenal.
     */
    private ConvenioVendaDTO convenioVenda;

    public Integer getIdConvenioQuinzenal() {
        return idConvenioQuinzenal;
    }

    public void setIdConvenioQuinzenal( Integer idConvenioQuinzenal ) {
        this.idConvenioQuinzenal = idConvenioQuinzenal;
    }

    public Integer getDiPrimeiroFechamento() {
        return diPrimeiroFechamento;
    }

    public void setDiPrimeiroFechamento( Integer diPrimeiroFechamento ) {
        this.diPrimeiroFechamento = diPrimeiroFechamento;
    }

    public Integer getDiSegundoFechamento() {
        return diSegundoFechamento;
    }

    public void setDiSegundoFechamento( Integer diSegundoFechamento ) {
        this.diSegundoFechamento = diSegundoFechamento;
    }

    public ConvenioVendaDTO getConvenioVenda() {
        return convenioVenda;
    }

    public void setConvenioVenda( ConvenioVendaDTO convenioVenda ) {
        this.convenioVenda = convenioVenda;
    }

}
