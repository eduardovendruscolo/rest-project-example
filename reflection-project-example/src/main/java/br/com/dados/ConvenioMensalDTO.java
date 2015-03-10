package br.com.dados;

/**
 * Data Transfer Object que representa um convênio de venda mensal.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 30/01/2015
 */
public class ConvenioMensalDTO {

    /**
     * Código do convênio mensal.
     */
    private Integer idConvenioMensal;

    /**
     * Dia de fechamento.
     */
    private Integer diFechamento;

    /**
     * Dia de vencimento.
     */
    private Integer diVencimento;

    /**
     * Convenio de venda relacionado ao convenio mensal.
     */
    private ConvenioVendaDTO convenioVenda;

    /**
     * teste de nível 3 de dependência entre objetos.
     */
    private ChildDTO child;

    public Integer getIdConvenioMensal() {
        return idConvenioMensal;
    }

    public void setIdConvenioMensal( Integer idConvenioMensal ) {
        this.idConvenioMensal = idConvenioMensal;
    }

    public Integer getDiFechamento() {
        return diFechamento;
    }

    public void setDiFechamento( Integer diFechamento ) {
        this.diFechamento = diFechamento;
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

    public ChildDTO getChild() {
        return child;
    }

    public void setChild( ChildDTO child ) {
        this.child = child;
    }

}
