package com.giselle.pilares_do_POO.servico_mensagem_instantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {

  @Override
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo FACEBOOK");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo FACEBOOK");
  }
}
