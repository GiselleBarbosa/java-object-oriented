package com.giselle.pilares_do_POO.msn_messenger;

public class ComputadorPedrinho {
  // abrindo mensagem
  public static void main(String[] args) {

    MSNMessenger msn = new MSNMessenger();
    msn.enviarMensagem();
    msn.receberMensagem();

    FacebookMessenger facebook = new FacebookMessenger();
    facebook.enviarMensagem();
    facebook.receberMensagem();

    Telegram telegram = new Telegram();
    telegram.enviarMensagem();
    telegram.receberMensagem();

  }
}