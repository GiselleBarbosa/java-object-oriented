package com.giselle.pilares_do_POO.servico_mensagem_instantanea;

public class ComputadorPedrinho {
  // abrindo mensagem
  public static void main(String[] args) {

    System.out.println("MSN");
    MSNMessenger msn = new MSNMessenger();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("Facebook");
    FacebookMessenger facebook = new FacebookMessenger();
    facebook.enviarMensagem();
    facebook.receberMensagem();

    System.out.println("Telegram");
    Telegram telegram = new Telegram();
    telegram.enviarMensagem();
    telegram.receberMensagem();

  }
}