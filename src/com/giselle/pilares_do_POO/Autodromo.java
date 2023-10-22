package com.giselle.pilares_do_POO;

public class Autodromo {
  public static void main(String[] args) {

    Carro jeep = new Carro();
    jeep.setChassi("85874232");
    // jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("123455");
    // Z400.ligar();

    Veiculo coringa = jeep;
    // Veiculo coringa = z400; 

    coringa.ligar();
  }
}