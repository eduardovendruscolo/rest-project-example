package br.com.dados;

import java.util.List;

/**
 * Data Transfer Object que representa um convênio de venda.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public class ConvenioVendaDTO {

    /**
     * Código do convênio.
     */
    private Integer idConvenioVenda;

    /**
     * Descrição da convênio.
     */
    private String dsConvenio;

    /**
     * Percentual de desconto do convênio.
     */
    private Double peDesconto;

    /**
     * Tipo do convênio de vendas.
     */
    private Integer tpConvenio;

    /**
     * Convênio mensal relacionado ao convenio de venda.
     */
    private ConvenioMensalDTO convenioMensal;

    /**
     * Convênio quinzenal relacionado ao convenio de venda.
     */
    private ConvenioQuinzenalDTO convenioQuinzenal;

    /**
     * Convênio semanal relacionado ao convenio de venda.
     */
    private ConvenioSemanalDTO convenioSemanal;

    /**
     * Teste com lista para reflection.
     */
    private List<ConvenioSemanalDTO> conveniosSemanais;

    public Integer getIdConvenioVenda() {
        return idConvenioVenda;
    }

    public void setIdConvenioVenda( Integer idConvenioVenda ) {
        this.idConvenioVenda = idConvenioVenda;
    }

    public String getDsConvenio() {
        return dsConvenio;
    }

    public void setDsConvenio( String dsConvenio ) {
        this.dsConvenio = dsConvenio;
    }

    public Double getPeDesconto() {
        return peDesconto;
    }

    public void setPeDesconto( Double peDesconto ) {
        this.peDesconto = peDesconto;
    }

    public Integer getTpConvenio() {
        return tpConvenio;
    }

    public void setTpConvenio( Integer tpConvenio ) {
        this.tpConvenio = tpConvenio;
    }

    public ConvenioMensalDTO getConvenioMensal() {
        return convenioMensal;
    }

    public void setConvenioMensal( ConvenioMensalDTO convenioMensal ) {
        this.convenioMensal = convenioMensal;
    }

    public ConvenioQuinzenalDTO getConvenioQuinzenal() {
        return convenioQuinzenal;
    }

    public void setConvenioQuinzenal( ConvenioQuinzenalDTO convenioQuinzenal ) {
        this.convenioQuinzenal = convenioQuinzenal;
    }

    public ConvenioSemanalDTO getConvenioSemanal() {
        return convenioSemanal;
    }

    public void setConvenioSemanal( ConvenioSemanalDTO convenioSemanal ) {
        this.convenioSemanal = convenioSemanal;
    }

    public List<ConvenioSemanalDTO> getConveniosSemanais() {
        return conveniosSemanais;
    }

    public void setConveniosSemanais( List<ConvenioSemanalDTO> conveniosSemanais ) {
        this.conveniosSemanais = conveniosSemanais;
    }

}
