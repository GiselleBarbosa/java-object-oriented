package com.giselle.interfaces.equipamentos.multifuncional;

import com.giselle.interfaces.equipamentos.copiadora.Copiadora;
import com.giselle.interfaces.equipamentos.digitalizadora.Digitalizadora;
import com.giselle.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando via equipamento MULTIFUNCIONAL");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo via equipamento MULTIFUNCIONAL");

  }

  @Override
  public void copiar() {
    System.out.println("Copiando via equipamento MULTIFUNCIONAL");

  }

}