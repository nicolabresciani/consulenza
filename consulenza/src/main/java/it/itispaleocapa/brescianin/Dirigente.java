package it.itispaleocapa.brescianin;

public class Dirigente extends Personale {
    public Dirigente(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    public double getCostoOrario() {
        return 100.0;
    }
    public String toString() {
        return "Dirigente [" + super.toString() + "]";
    }
    public double getOreAttivita(){
        return 0.0;
    }
}

