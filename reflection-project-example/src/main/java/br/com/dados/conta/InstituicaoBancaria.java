package br.com.dados.conta;

import java.io.Serializable;
import java.util.List;

import br.com.dados.ExclusaoLogica;

/**
 * Mapeamento ORM da entidade CAD_INSTITUICAO_BANCARIA.
 */

public class InstituicaoBancaria implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String table_name = "CAD_INSTITUICAO_BANCARIA";

    /**
     * Chave primária da instituição bancária.
     */

    private Integer idInstituicaoBancaria;

    /**
     * Descrição da instituição bancária.
     */

    private String dsInstituicao;

    /**
     * Identificador da instituição no banco central.
     */

    private String nrBacen;

    /**
     * Informa se a instituição foi excluída ou não.
     */

    private ExclusaoLogica fgExcluido;

    private List<ContaBancaria> listContaBancaria;

    public Integer getIdInstituicaoBancaria() {
        return idInstituicaoBancaria;
    }

    public void setIdInstituicaoBancaria( Integer idInstituicaoBancaria ) {
        this.idInstituicaoBancaria = idInstituicaoBancaria;
    }

    public String getDsInstituicao() {
        return dsInstituicao;
    }

    public void setDsInstituicao( String dsInstituicao ) {
        this.dsInstituicao = dsInstituicao;
    }

    public String getNrBacen() {
        return nrBacen;
    }

    public void setNrBacen( String nrBacen ) {
        this.nrBacen = nrBacen;
    }

    public ExclusaoLogica getFgExcluido() {
        return fgExcluido;
    }

    public void setFgExcluido( ExclusaoLogica fgExcluido ) {
        this.fgExcluido = fgExcluido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( dsInstituicao == null ) ? 0 : dsInstituicao.hashCode() );
        result = prime * result + ( ( fgExcluido == null ) ? 0 : fgExcluido.hashCode() );
        result = prime * result + ( ( idInstituicaoBancaria == null ) ? 0 : idInstituicaoBancaria.hashCode() );
        result = prime * result + ( ( nrBacen == null ) ? 0 : nrBacen.hashCode() );
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
        InstituicaoBancaria other = ( InstituicaoBancaria ) obj;
        if ( dsInstituicao == null ) {
            if ( other.dsInstituicao != null ) {
                return false;
            }
        } else if ( !dsInstituicao.equals( other.dsInstituicao ) ) {
            return false;
        }
        if ( fgExcluido != other.fgExcluido ) {
            return false;
        }
        if ( idInstituicaoBancaria == null ) {
            if ( other.idInstituicaoBancaria != null ) {
                return false;
            }
        } else if ( !idInstituicaoBancaria.equals( other.idInstituicaoBancaria ) ) {
            return false;
        }
        if ( nrBacen == null ) {
            if ( other.nrBacen != null ) {
                return false;
            }
        } else if ( !nrBacen.equals( other.nrBacen ) ) {
            return false;
        }
        return true;
    }

    public List<ContaBancaria> getListContaBancaria() {
        return listContaBancaria;
    }

    public void setListContaBancaria( List<ContaBancaria> listContaBancaria ) {
        this.listContaBancaria = listContaBancaria;
    }

}
