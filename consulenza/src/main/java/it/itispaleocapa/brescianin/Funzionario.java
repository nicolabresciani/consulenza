package it.itispaleocapa.brescianin;

public class Funzionario extends Personale {
    private int anniEsperienza;

    public Funzionario(String codice, String cognome, String nome, int annoAssunzione, int anniEsperienza) {
        super(codice, cognome, nome, annoAssunzione);
        this.anniEsperienza = anniEsperienza;
    }

    public double getCostoOrario() {
        double costoOrario = 70.0;
        
        if (anniEsperienza >= 10) {
            costoOrario = 80.0;
        }
        
        return costoOrario;
    }
    public double getOreAttivita() {
        return 35.0; // Esempio: assume che ogni tecnico lavori sempre 40 ore di attività
    }
    public String toString() {
        return "Funzionario [anniEsperienza=" + anniEsperienza + ", " + super.toString() + "]";
    }
}
