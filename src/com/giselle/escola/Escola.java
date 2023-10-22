package com.giselle.escola;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();
    felipe.setIdade(7);
    ;
    felipe.setNome("Felipe");

    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    // RESULTADO NO CONSOLE
    // O aluno Felipe tem 8 anos
  }
}