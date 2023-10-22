package com.giselle.pilares_do_POO.autodromo;

public abstract class Veiculo {

  private String chassi;

  public String getChassi() {
    return chassi;
  }

  public String setChassi(String chassi) {
    return this.chassi = chassi;
  }

  public abstract void ligar();
}