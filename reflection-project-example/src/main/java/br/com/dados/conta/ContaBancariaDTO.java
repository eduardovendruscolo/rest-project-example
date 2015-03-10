package br.com.dados.conta;

/**
 * Data Transfer Object para a entidade {@link #ContaBancaria}.
 *
 * @author eduardojose <eduardo@ciss.com.br>
 * @version 1.0
 * @since 26/01/2015
 */
public class ContaBancariaDTO {

    /**
     * Chave primária da conta bancária.
     */
    private Integer idContaBancaria;

    /**
     * Código de relacionamento com a instituição bancária.
     */
    private Integer idInstituicaoBancaria;

    /**
     * Número da agência da conta bancária.
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

    public Integer getIdContaBancaria() {
        return idContaBancaria;
    }

    public void setIdContaBancaria( Integer idContaBancaria ) {
        this.idContaBancaria = idContaBancaria;
    }

    public Integer getIdInstituicaoBancaria() {
        return idInstituicaoBancaria;
    }

    public void setIdInstituicaoBancaria( Integer idInstituicaoBancaria ) {
        this.idInstituicaoBancaria = idInstituicaoBancaria;
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

}
