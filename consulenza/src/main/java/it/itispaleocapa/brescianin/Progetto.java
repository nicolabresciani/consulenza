package it.itispaleocapa.brescianin;

import java.util.HashMap;

public class Progetto {
    private HashMap<String, Personale> personale;

    public Progetto() {
        personale = new HashMap<>();
    }

    public void aggiungiPersonale(Personale membro) {
        personale.put(membro.getCodice(), membro);
    }

    public double getCostoComplessivo() {
        double costoComplessivo = 0.0;
    
        for (Personale persona : personale.values()) {
            double oreAttivita = persona.getOreAttivita();
            double costoOrario = persona.getCostoOrario();
            costoComplessivo += oreAttivita * costoOrario;
        }
    
        return costoComplessivo;
    }    
    
}
