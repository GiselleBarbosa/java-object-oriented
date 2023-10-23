package com.giselle.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando");
  }

}