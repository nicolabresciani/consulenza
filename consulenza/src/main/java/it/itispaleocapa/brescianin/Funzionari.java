package it.itispaleocapa.brescianin;

public class Funzionari extends Personale {
    private int anniEsperienza;

    public Funzionari(String codice, String cognome, String nome, int annoAssunzione, int anniEsperienza) {
        super(codice, cognome, nome, annoAssunzione);
        this.anniEsperienza = anniEsperienza;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }
    
}