package br.com.dados;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Mapeamento ORM da entidade cad_cnae.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 26/12/2014
 */
@Entity
@Table( name = Cnae.TABLE_NAME )
public class Cnae implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String TABLE_NAME = "cad_cnae";

    /**
     * Chave primária.
     */
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_cnae" )
    private Integer idCnae;

    /**
     * Descrição do Cnae
     */
    @Column( name = "ds_cnae" )
    @NotNull
    @Size( min = 3, max = 240 )
    private String dsCnae;

    /**
     * Número do Cnae
     */
    @Column( name = "nr_cnae" )
    @NotNull
    @Size( max = 10 )
    private String nrCnae;

    /**
     * Informa se o Cnae foi excluido ou não.
     */
    @Column( name = "fg_excluido" )
    @NotNull
    private ExclusaoLogica fgExcluido;

    public Integer getIdCnae() {
        return idCnae;
    }

    public void setIdCnae( Integer idCnae ) {
        this.idCnae = idCnae;
    }

    public String getDsCnae() {
        return dsCnae;
    }

    public void setDsCnae( String dsCnae ) {
        this.dsCnae = dsCnae;
    }

    public String getNrCnae() {
        return nrCnae;
    }

    public void setNrCnae( String nrCnae ) {
        this.nrCnae = nrCnae;
    }

    public ExclusaoLogica getFgExcluido() {
        return fgExcluido;
    }

    public void setFgExcluido( ExclusaoLogica fgExcluido ) {
        this.fgExcluido = fgExcluido;
    }

    /**
     * Construtor.
     */
    public Cnae() {

    }

    /**
     * Construtor.
     *
     * @param idCnae
     *            Código do Cnae
     * @param dsCnae
     *            Descrição do Cnae
     * @param nrCnae
     *            Numero do Cnae
     * @param fgExcluido
     *            Informa se o Cnae foi excluido ou não.
     */
    public Cnae( Integer idCnae, String dsCnae, String nrCnae, ExclusaoLogica fgExcluido ) {
        super();
        this.idCnae = idCnae;
        this.dsCnae = dsCnae;
        this.nrCnae = nrCnae;
        this.fgExcluido = fgExcluido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( dsCnae == null ) ? 0 : dsCnae.hashCode() );
        result = prime * result + ( ( fgExcluido == null ) ? 0 : fgExcluido.hashCode() );
        result = prime * result + ( ( idCnae == null ) ? 0 : idCnae.hashCode() );
        result = prime * result + ( ( nrCnae == null ) ? 0 : nrCnae.hashCode() );
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
        Cnae other = ( Cnae ) obj;
        if ( dsCnae == null ) {
            if ( other.dsCnae != null ) {
                return false;
            }
        } else if ( !dsCnae.equals( other.dsCnae ) ) {
            return false;
        }
        if ( fgExcluido != other.fgExcluido ) {
            return false;
        }
        if ( idCnae == null ) {
            if ( other.idCnae != null ) {
                return false;
            }
        } else if ( !idCnae.equals( other.idCnae ) ) {
            return false;
        }
        if ( nrCnae == null ) {
            if ( other.nrCnae != null ) {
                return false;
            }
        } else if ( !nrCnae.equals( other.nrCnae ) ) {
            return false;
        }
        return true;
    }

}
