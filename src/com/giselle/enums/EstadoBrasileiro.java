package com.giselle.enums;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
  SAO_PAULO("SP", "São Paulo", 11),
  RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
  PIAUI("MG", "Minas Gerais", 34),
  MARANHAO("RS", "Rio Grande do Sul", 51);

  private String nome;
  private String sigla;
  private int ddd;

  private EstadoBrasileiro(String sigla, String nome, int ddd) {
    this.sigla = sigla;
    this.nome = nome;
    this.ddd = ddd;
  }

  public int getDdd() {
    return ddd;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }

}
