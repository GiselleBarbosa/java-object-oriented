package com.giselle.interfaces.estabelecimento;

import com.giselle.interfaces.equipamentos.copiadora.Copiadora;
import com.giselle.interfaces.equipamentos.digitalizadora.Digitalizadora;
import com.giselle.interfaces.equipamentos.impressora.Impressora;
import com.giselle.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        // Deskjet deskjet = new Deskjet();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        digitalizadora.digitalizar();
        impressora.imprimir();
        copiadora.copiar();

    }
}