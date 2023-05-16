package it.itispaleocapa.brescianin;

public class Tecnico extends Personale {
    private String areaCompetenza; 
    public Tecnico(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }
    public String getAreaCompetenza(){
        return areaCompetenza;
    }
}

