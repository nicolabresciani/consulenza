package it.itispaleocapa.brescianin;

public class Tecnico extends Personale {
    private boolean interno;
    private String areaCompetenza;

    public Tecnico(String codice, String cognome, String nome, int annoAssunzione, boolean interno, String areaCompetenza) {
        super(codice, cognome, nome, annoAssunzione);
        this.interno = interno;
        this.areaCompetenza = areaCompetenza;
    }

    public double getCostoOrario() {
        double costoBase = 0.0;
    
        if (areaCompetenza.equals("informatica-telecomunicazioni")) {
            costoBase = 40.0;
        } else {
            costoBase = 50.0;
        }
    
        double costoOrario = costoBase;
    
        if (interno) {
            int anniTrascorsi = 2023 - getAnnoAssunzione();
            costoOrario += anniTrascorsi;
        }
    
        return costoOrario;
    }

    public double getOreAttivita() {
        return 40.0; 
    }
    public String toString() {
        return "Tecnico [areaCompetenza=" + areaCompetenza + ", interno=" + interno + ", " + super.toString() + "]";
    }   
}

