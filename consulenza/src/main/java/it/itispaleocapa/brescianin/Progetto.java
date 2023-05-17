package it.itispaleocapa.brescianin;

import java.util.HashMap;
import java.util.LinkedList;

class Progetto {
    private LinkedList<Personale> personale;
    private HashMap<Ruolo, Double> tariffe;

    public Progetto() {
        personale = new LinkedList<>();
        tariffe = new HashMap<>();
        tariffe.put(Ruolo.TECNICO_INFORMATICA, 40.0);
        tariffe.put(Ruolo.TECNICO_ELETTRONICA, 50.0);
        tariffe.put(Ruolo.FUNZIONARIO_JUNIOR, 70.0);
        tariffe.put(Ruolo.FUNZIONARIO_SENIOR, 80.0);
        tariffe.put(Ruolo.DIRIGENTE, 100.0);
    }

    public void aggiungiPersonale(Personale membro) throws Exception {
        if (membro == null) {
            throw new Exception();
        }
        personale.add(membro);
    }

    public double getTariffa(Ruolo ruolo) {
        return tariffe.get(ruolo);
    }

    public void setTariffa(Ruolo ruolo, double tariffa) {
        tariffe.put(ruolo, tariffa);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personale nel progetto:\n");
        for (Personale membro : personale) {
            sb.append(membro.toString()).append("\n");
        }
        return sb.toString();
    }
}

enum Ruolo {
    TECNICO_INFORMATICA,
    TECNICO_ELETTRONICA,
    FUNZIONARIO_JUNIOR,
    FUNZIONARIO_SENIOR,
    DIRIGENTE
}