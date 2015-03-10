package br.com.dados.conta;

import java.io.Serializable;

import br.com.dados.ExclusaoLogica;

/**
 * Mapeamento ORM referente a tabela CAD_CONTA_BANCARIA.
 */

public class ContaBancaria implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String table_name = "CAD_CONTA_BANCARIA";

    /**
     * Chave primária da instituição bancária.
     */

    private Integer idContaBancaria;

    /**
     * Instituição bancária relacionada a conta bancária.
     */

    private InstituicaoBancaria instituicaoBancaria;

    /**
     * Número da agência bancária.
     */

    private String nrAgencia;

    /**
     * Dígito verificador da agência bancária.
     */

    private String nrDigitoAgencia;

    /**
     * Número da conta bancária.
     */

    private String nrConta;

    /**
     * Dígito verificador da conta bancária.
     */

    private String nrDigitoConta;

    /**
     * Informa se a instituição foi excluída ou não.
     */

    private ExclusaoLogica fgExcluido;

    public Integer getIdContaBancaria() {
        return idContaBancaria;
    }

    public void setIdContaBancaria( Integer idContaBancaria ) {
        this.idContaBancaria = idContaBancaria;
    }

    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    public void setInstituicaoBancaria( InstituicaoBancaria instituicaoBancaria ) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public String getNrAgencia() {
        return nrAgencia;
    }

    public void setNrAgencia( String nrAgencia ) {
        this.nrAgencia = nrAgencia;
    }

    public String getNrDigitoAgencia() {
        return nrDigitoAgencia;
    }

    public void setNrDigitoAgencia( String nrDigitoAgencia ) {
        this.nrDigitoAgencia = nrDigitoAgencia;
    }

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta( String nrConta ) {
        this.nrConta = nrConta;
    }

    public String getNrDigitoConta() {
        return nrDigitoConta;
    }

    public void setNrDigitoConta( String nrDigitoConta ) {
        this.nrDigitoConta = nrDigitoConta;
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
        result = prime * result + ( ( fgExcluido == null ) ? 0 : fgExcluido.hashCode() );
        result = prime * result + ( ( idContaBancaria == null ) ? 0 : idContaBancaria.hashCode() );
        result = prime * result + ( ( instituicaoBancaria == null ) ? 0 : instituicaoBancaria.hashCode() );
        result = prime * result + ( ( nrAgencia == null ) ? 0 : nrAgencia.hashCode() );
        result = prime * result + ( ( nrConta == null ) ? 0 : nrConta.hashCode() );
        result = prime * result + ( ( nrDigitoAgencia == null ) ? 0 : nrDigitoAgencia.hashCode() );
        result = prime * result + ( ( nrDigitoConta == null ) ? 0 : nrDigitoConta.hashCode() );
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
        ContaBancaria other = ( ContaBancaria ) obj;
        if ( fgExcluido != other.fgExcluido ) {
            return false;
        }
        if ( idContaBancaria == null ) {
            if ( other.idContaBancaria != null ) {
                return false;
            }
        } else if ( !idContaBancaria.equals( other.idContaBancaria ) ) {
            return false;
        }
        if ( instituicaoBancaria == null ) {
            if ( other.instituicaoBancaria != null ) {
                return false;
            }
        } else if ( !instituicaoBancaria.equals( other.instituicaoBancaria ) ) {
            return false;
        }
        if ( nrAgencia == null ) {
            if ( other.nrAgencia != null ) {
                return false;
            }
        } else if ( !nrAgencia.equals( other.nrAgencia ) ) {
            return false;
        }
        if ( nrConta == null ) {
            if ( other.nrConta != null ) {
                return false;
            }
        } else if ( !nrConta.equals( other.nrConta ) ) {
            return false;
        }
        if ( nrDigitoAgencia == null ) {
            if ( other.nrDigitoAgencia != null ) {
                return false;
            }
        } else if ( !nrDigitoAgencia.equals( other.nrDigitoAgencia ) ) {
            return false;
        }
        if ( nrDigitoConta == null ) {
            if ( other.nrDigitoConta != null ) {
                return false;
            }
        } else if ( !nrDigitoConta.equals( other.nrDigitoConta ) ) {
            return false;
        }
        return true;
    }

}
