package br.com.rest.project.example.dto;

public class Carro {

    private Integer ano;
    private String nome;

    public Carro() {

    }

    public Carro( Integer ano, String nome ) {
        super();
        this.ano = ano;
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno( Integer ano ) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

}
