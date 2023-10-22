package com.giselle.escola;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();
    felipe.setIdade(7);
    felipe.setNome(" Marcos Felipe");
    felipe.setSerie(1);

    System.out.println(
        "O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + "e esta na " + felipe.getSerie()+ " serie");
  }
}