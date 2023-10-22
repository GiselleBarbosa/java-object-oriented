package com.giselle.lanchonete;

import com.giselle.lanchonete.area.cliente.Cliente;
import com.giselle.lanchonete.atendimento.Atendente;
import com.giselle.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    // ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Atendente atendente = new Atendente();
    atendente.servindoMesa();
    atendente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();
  }
}
