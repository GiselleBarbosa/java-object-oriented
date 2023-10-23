package com.giselle.pilares_do_POO.servico_mensagem_instantanea;

import com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps.FacebookMessenger;
import com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps.MSNMessenger;
import com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps.ServicoMensagemInstantanea;
import com.giselle.pilares_do_POO.servico_mensagem_instantanea.apps.Telegram;

public class ComputadorPedrinho {
  public static void main(String[] args) {

    ServicoMensagemInstantanea smi = null;

    /*
     * NÃO SE SABE QUAL APP
     * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
     */
    String appEscolhido = "msn";

    if (appEscolhido.equals("msn"))
      smi = new MSNMessenger();
    else if (appEscolhido.equals("fbm"))
      smi = new FacebookMessenger();
    else if (appEscolhido.equals("tlg"))
      smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();
  }
}