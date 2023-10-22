package com.giselle.pilares_do_POO;

public class Autodromo {
  public static void main(String[] args) {

    Carro jeep = new Carro();
    jeep.setChassi("85874232");
    jeep.ligar();

    Moto Z400 = new Moto();
    Z400.setChassi("123455");
    Z400.ligar();
  }
}