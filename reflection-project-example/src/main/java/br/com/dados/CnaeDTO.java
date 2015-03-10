package br.com.dados;

/**
 * Data Transfer Object para a entidade Cnae.
 *
 * @author Gilso Manfredi <gilsomanfredi@ciss.com.br>
 * @version 1.0
 * @since 26/12/2014
 */
public class CnaeDTO {

    /**
     * Código do Cnae
     */
    private Integer idCnae;

    /**
     * Descrição do Cnae
     */
    private String dsCnae;

    /**
     * Número do Cnae
     */
    private String nrCnae;

    private Integer fgExcluido;

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

    public Integer getFgExcluido() {
        return fgExcluido;
    }

    public void setFgExcluido( Integer fgExcluido ) {
        this.fgExcluido = fgExcluido;
    }

}
