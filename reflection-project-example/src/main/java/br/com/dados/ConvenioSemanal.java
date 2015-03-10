package br.com.dados;

import java.io.Serializable;

/**
 * Mapeamento ORM da entidade cad_convenio_semanal.
 */

public class ConvenioSemanal implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String TABLE_NAME = "cad_convenio_semanal";

    /**
     * Código do convênio semanal.
     */

    private Integer idConvenioSemanal;

    /**
     * Dia de vencimento.
     */

    private DiaSemana diVencimento;

    /**
     * Convenio de venda relacionado ao convenio semanal.
     */
    // TODO Relacionamento
    private ConvenioVenda convenioVenda;

    public Integer getIdConvenioSemanal() {
        return idConvenioSemanal;
    }

    public void setIdConvenioSemanal( Integer idConvenioSemanal ) {
        this.idConvenioSemanal = idConvenioSemanal;
    }

    public DiaSemana getDiVencimento() {
        return diVencimento;
    }

    public void setDiVencimento( DiaSemana diVencimento ) {
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
    public ConvenioSemanal() {

    }

    /**
     * Construtor com parametros. Código do convênio semanal. Dia de vencimento.
     */
    public ConvenioSemanal( Integer idConvenioSemanal, DiaSemana diVencimento ) {
        super();
        this.idConvenioSemanal = idConvenioSemanal;
        this.diVencimento = diVencimento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( diVencimento == null ) ? 0 : diVencimento.hashCode() );
        result = prime * result + ( ( idConvenioSemanal == null ) ? 0 : idConvenioSemanal.hashCode() );
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
        ConvenioSemanal other = ( ConvenioSemanal ) obj;
        if ( diVencimento != other.diVencimento ) {
            return false;
        }
        if ( idConvenioSemanal == null ) {
            if ( other.idConvenioSemanal != null ) {
                return false;
            }
        } else if ( !idConvenioSemanal.equals( other.idConvenioSemanal ) ) {
            return false;
        }
        return true;
    }

}