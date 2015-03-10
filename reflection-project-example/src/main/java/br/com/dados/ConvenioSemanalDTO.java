package br.com.dados;

/**
 * Data Transfer Object que representa um convênio de venda semanal.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public class ConvenioSemanalDTO {

    /**
     * Código do convênio semanal.
     */
    private Integer idConvenioSemanal;

    /**
     * Dia de vencimento.
     */
    private Integer diVencimento;

    /**
     * Convenio de venda relacionado ao convenio semanal.
     */
    private ConvenioVendaDTO convenioVenda;

    public Integer getIdConvenioSemanal() {
        return idConvenioSemanal;
    }

    public void setIdConvenioSemanal( Integer idConvenioSemanal ) {
        this.idConvenioSemanal = idConvenioSemanal;
    }

    public Integer getDiVencimento() {
        return diVencimento;
    }

    public void setDiVencimento( Integer diVencimento ) {
        this.diVencimento = diVencimento;
    }

    public ConvenioVendaDTO getConvenioVenda() {
        return convenioVenda;
    }

    public void setConvenioVenda( ConvenioVendaDTO convenioVenda ) {
        this.convenioVenda = convenioVenda;
    }

}
