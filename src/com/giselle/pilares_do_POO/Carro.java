package com.giselle.pilares_do_POO;

public class Carro {

  public void ligar() {
    checkCalibragemPneus();
    checkCombustivelDisponivel();
    System.out.println("O carro está ligado");
  }

  private void checkCombustivelDisponivel() {
    System.out.println("Verificando combustivel");
  }

  private void checkCalibragemPneus() {
    System.out.println("Verificando se pneus estão calibrados");
  }
}