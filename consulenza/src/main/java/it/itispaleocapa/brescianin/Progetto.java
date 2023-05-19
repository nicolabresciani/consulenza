package it.itispaleocapa.brescianin;

import java.util.HashMap;
import java.util.Map;

public class Progetto {
    private Map<String, Personale> personale;

    public Progetto() {
        personale = new HashMap<>();
    }

    public void aggiungiPersonale(Personale membro) {
        personale.put(membro.getCodice(), membro);
    }

    public double getCostoComplessivo() {
        double costoComplessivo = 0.0;

        for (Personale persona : personale.values()) {
            double oreAttivita = ((Tecnico) persona).getOreAttivita();
            double costoOrario = ((Tecnico) persona).getCostoOrario();
            costoComplessivo += oreAttivita * costoOrario;
        }

        return costoComplessivo;
    }

    private double calcolaCostoOrario(Personale membro) {
        double costoOrario = 0.0;

        if (membro instanceof Tecnico) {
            Tecnico tecnico = (Tecnico) membro;
            costoOrario = tecnico.getCostoOrario();
        } else if (membro instanceof Funzionario) {
            Funzionario funzionario = (Funzionario) membro;
            costoOrario = funzionario.getCostoOrario();
        } else if (membro instanceof Dirigente) {
            Dirigente dirigente = (Dirigente) membro;
            costoOrario = dirigente.getCostoOrario();
        }

        return costoOrario;
    }
}
