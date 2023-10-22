package com.giselle.pilares_do_POO.msn_messenger;

public class FacebookMessenger  {
  public void enviarMensagem() {
    // primeiro confirmar se esta conectado a internet
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Facebook");
    // depois de enviada, salva o histórico da mensagem
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Facebook");
  }

  // métodos privadas, visíveis somente na classe
  private void validarConectadoInternet() {
    System.out.println("Validando se está conectado a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico da mensagem");
  }
}