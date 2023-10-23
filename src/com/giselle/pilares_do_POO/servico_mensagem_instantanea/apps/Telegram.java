package com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps;

public class Telegram extends ServicoMensagemInstantanea {
  @Override
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo TELEGRAM");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo TELEGRAM");
  }
}
