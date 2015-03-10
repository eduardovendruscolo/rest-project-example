package br.com.dados;

import java.util.Date;

public class ChildDTO {

    private Integer numero;

    private String texto;

    private Date data;

    private Date data2;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero( Integer numero ) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto( String texto ) {
        this.texto = texto;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2( Date data2 ) {
        this.data2 = data2;
    }

}
