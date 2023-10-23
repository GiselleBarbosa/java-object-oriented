package com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps;

public abstract class ServicoMensagemInstantanea {

  public abstract void enviarMensagem();

  public abstract void receberMensagem();

  // somente os filhos conhecem este método
  protected void validarConectadoInternet() {
    System.out.println("Validando se está conectado a internet");

  }
}