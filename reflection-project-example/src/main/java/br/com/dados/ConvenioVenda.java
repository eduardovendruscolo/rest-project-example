package br.com.dados;

import java.io.Serializable;
import java.util.List;

/**
 * Mapeamento ORM da entidade cad_convenio_venda.
 */

public class ConvenioVenda implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nome da tabela no banco de dados.
     */
    protected static final String TABLE_NAME = "cad_convenio_venda";

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

    private ConvenioVendaType tpConvenio;

    /**
     * Convênio mensal relacionado ao convenio de venda.
     */

    private ConvenioMensal convenioMensal;

    /**
     * Convênio quinzenal relacionado ao convenio de venda.
     */

    private ConvenioQuinzenal convenioQuinzenal;

    /**
     * Convênio semanal relacionado ao convenio de venda.
     */

    private ConvenioSemanal convenioSemanal;

    /**
     * Teste com lista para reflection.
     */
    private List<ConvenioSemanal> conveniosSemanais;

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

    public ConvenioVendaType getTpConvenio() {
        return tpConvenio;
    }

    public void setTpConvenio( ConvenioVendaType tpConvenio ) {
        this.tpConvenio = tpConvenio;
    }

    public ConvenioMensal getConvenioMensal() {
        return convenioMensal;
    }

    public void setConvenioMensal( ConvenioMensal convenioMensal ) {
        this.convenioMensal = convenioMensal;
    }

    public ConvenioQuinzenal getConvenioQuinzenal() {
        return convenioQuinzenal;
    }

    public void setConvenioQuinzenal( ConvenioQuinzenal convenioQuinzenal ) {
        this.convenioQuinzenal = convenioQuinzenal;
    }

    public ConvenioSemanal getConvenioSemanal() {
        return convenioSemanal;
    }

    public void setConvenioSemanal( ConvenioSemanal convenioSemanal ) {
        this.convenioSemanal = convenioSemanal;
    }

    /**
     * Construtor.
     */
    public ConvenioVenda() {

    }

    /**
     * Construtor com parâmetros. Código do convênio. Descrição da convênio. Percentual de desconto do convênio.
     * Convênio mensal relacionado ao convenio de venda. Convênio quinzenal relacionado ao convenio de venda. Convênio
     * semanal relacionado ao convenio de venda.
     */
    public ConvenioVenda( Integer idConvenioVenda, String dsConvenio, Double peDesconto, ConvenioMensal convenioMensal,
                    ConvenioQuinzenal convenioQuinzenal, ConvenioSemanal convenioSemanal ) {
        super();
        this.idConvenioVenda = idConvenioVenda;
        this.dsConvenio = dsConvenio;
        this.peDesconto = peDesconto;
        this.convenioMensal = convenioMensal;
        this.convenioQuinzenal = convenioQuinzenal;
        this.convenioSemanal = convenioSemanal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( convenioMensal == null ) ? 0 : convenioMensal.hashCode() );
        result = prime * result + ( ( convenioQuinzenal == null ) ? 0 : convenioQuinzenal.hashCode() );
        result = prime * result + ( ( convenioSemanal == null ) ? 0 : convenioSemanal.hashCode() );
        result = prime * result + ( ( dsConvenio == null ) ? 0 : dsConvenio.hashCode() );
        result = prime * result + ( ( idConvenioVenda == null ) ? 0 : idConvenioVenda.hashCode() );
        result = prime * result + ( ( peDesconto == null ) ? 0 : peDesconto.hashCode() );
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
        ConvenioVenda other = ( ConvenioVenda ) obj;
        if ( convenioMensal == null ) {
            if ( other.convenioMensal != null ) {
                return false;
            }
        } else if ( !convenioMensal.equals( other.convenioMensal ) ) {
            return false;
        }
        if ( convenioQuinzenal == null ) {
            if ( other.convenioQuinzenal != null ) {
                return false;
            }
        } else if ( !convenioQuinzenal.equals( other.convenioQuinzenal ) ) {
            return false;
        }
        if ( convenioSemanal == null ) {
            if ( other.convenioSemanal != null ) {
                return false;
            }
        } else if ( !convenioSemanal.equals( other.convenioSemanal ) ) {
            return false;
        }
        if ( dsConvenio == null ) {
            if ( other.dsConvenio != null ) {
                return false;
            }
        } else if ( !dsConvenio.equals( other.dsConvenio ) ) {
            return false;
        }
        if ( idConvenioVenda == null ) {
            if ( other.idConvenioVenda != null ) {
                return false;
            }
        } else if ( !idConvenioVenda.equals( other.idConvenioVenda ) ) {
            return false;
        }
        if ( peDesconto == null ) {
            if ( other.peDesconto != null ) {
                return false;
            }
        } else if ( !peDesconto.equals( other.peDesconto ) ) {
            return false;
        }
        return true;
    }

    public List<ConvenioSemanal> getConveniosSemanais() {
        return conveniosSemanais;
    }

    public void setConveniosSemanais( List<ConvenioSemanal> conveniosSemanais ) {
        this.conveniosSemanais = conveniosSemanais;
    }

}