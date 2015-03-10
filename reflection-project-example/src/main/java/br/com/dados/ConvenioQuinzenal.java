package br.com.dados;

import java.io.Serializable;

/**
 * Mapeamento ORM da entidade cad_convenio_quinzenal.
 */

public class ConvenioQuinzenal implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String TABLE_NAME = "cad_convenio_quinzenal";

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
    // TODO Relacionamento
    private ConvenioVenda convenioVenda;

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

    public ConvenioVenda getConvenioVenda() {
        return convenioVenda;
    }

    public void setConvenioVenda( ConvenioVenda convenioVenda ) {
        this.convenioVenda = convenioVenda;
    }

    /**
     * Construtor.
     */
    public ConvenioQuinzenal() {

    }

    /**
     * Construtor com parâmetros. Código do convênio quinzenal. Dia do primeiro fechamento. Dia do segundo fechamento.
     */
    public ConvenioQuinzenal( Integer idConvenioQuinzenal, Integer diPrimeiroFechamento, Integer diSegundoFechamento ) {
        super();
        this.idConvenioQuinzenal = idConvenioQuinzenal;
        this.diPrimeiroFechamento = diPrimeiroFechamento;
        this.diSegundoFechamento = diSegundoFechamento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( diPrimeiroFechamento == null ) ? 0 : diPrimeiroFechamento.hashCode() );
        result = prime * result + ( ( diSegundoFechamento == null ) ? 0 : diSegundoFechamento.hashCode() );
        result = prime * result + ( ( idConvenioQuinzenal == null ) ? 0 : idConvenioQuinzenal.hashCode() );
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
        ConvenioQuinzenal other = ( ConvenioQuinzenal ) obj;
        if ( diPrimeiroFechamento == null ) {
            if ( other.diPrimeiroFechamento != null ) {
                return false;
            }
        } else if ( !diPrimeiroFechamento.equals( other.diPrimeiroFechamento ) ) {
            return false;
        }
        if ( diSegundoFechamento == null ) {
            if ( other.diSegundoFechamento != null ) {
                return false;
            }
        } else if ( !diSegundoFechamento.equals( other.diSegundoFechamento ) ) {
            return false;
        }
        if ( idConvenioQuinzenal == null ) {
            if ( other.idConvenioQuinzenal != null ) {
                return false;
            }
        } else if ( !idConvenioQuinzenal.equals( other.idConvenioQuinzenal ) ) {
            return false;
        }
        return true;
    }

}