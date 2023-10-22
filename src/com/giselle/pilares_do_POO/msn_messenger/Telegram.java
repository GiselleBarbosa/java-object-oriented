package com.giselle.pilares_do_POO.msn_messenger;

public class Telegram {

  public void enviarMensagem() {
    // primeiro confirmar se esta conectado a internet
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Telegram");
    // depois de enviada, salva o histórico da mensagem
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }

  // métodos privadas, visíveis somente na classe
  private void validarConectadoInternet() {
    System.out.println("Validando se está conectado a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico da mensagem");
  }

}