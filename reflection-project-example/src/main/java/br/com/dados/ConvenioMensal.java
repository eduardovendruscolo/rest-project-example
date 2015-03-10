package br.com.dados;

import java.io.Serializable;

/**
 * Mapeamento ORM da entidade cad_convenio_mensal.
 */

public class ConvenioMensal implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String TABLE_NAME = "cad_convenio_mensal";

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
    // TODO Relacionamento
    private ConvenioVenda convenioVenda;

    /**
     * teste de nível 3 de dependência entre objetos.
     */
    private Child child;

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

    public ConvenioVenda getConvenioVenda() {
        return convenioVenda;
    }

    public void setConvenioVenda( ConvenioVenda convenioVenda ) {
        this.convenioVenda = convenioVenda;
    }

    /**
     * Construtor.
     */
    public ConvenioMensal() {

    }

    /**
     * Construtor com parâmetros. Código do convênio mensal. Dia de fechamento. Dia de vencimento.
     */
    public ConvenioMensal( Integer idConvenioMensal, Integer diFechamento, Integer diVencimento ) {
        super();
        this.idConvenioMensal = idConvenioMensal;
        this.diFechamento = diFechamento;
        this.diVencimento = diVencimento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( diFechamento == null ) ? 0 : diFechamento.hashCode() );
        result = prime * result + ( ( diVencimento == null ) ? 0 : diVencimento.hashCode() );
        result = prime * result + ( ( idConvenioMensal == null ) ? 0 : idConvenioMensal.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        ConvenioMensal other = ( ConvenioMensal ) obj;
        if ( diFechamento == null ) {
            if ( other.diFechamento != null ) {
                return false;
            }
        } else if ( !diFechamento.equals( other.diFechamento ) ) {
            return false;
        }
        if ( diVencimento == null ) {
            if ( other.diVencimento != null ) {
                return false;
            }
        } else if ( !diVencimento.equals( other.diVencimento ) ) {
            return false;
        }
        if ( idConvenioMensal == null ) {
            if ( other.idConvenioMensal != null ) {
                return false;
            }
        } else if ( !idConvenioMensal.equals( other.idConvenioMensal ) ) {
            return false;
        }
        return true;
    }

    public Child getChild() {
        return child;
    }

    public void setChild( Child child ) {
        this.child = child;
    }

}
