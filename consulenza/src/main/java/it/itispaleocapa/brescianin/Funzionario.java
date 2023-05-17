package it.itispaleocapa.brescianin;

class Funzionario extends Personale {
    private int anniEsperienza;

    public Funzionario(String codice, String cognome, String nome, int annoAssunzione, int anniEsperienza) {
        super(codice, cognome, nome, annoAssunzione);
        this.anniEsperienza = anniEsperienza;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }
    public String toString() {
        return "Funzionario: " + "Codice: " + getCodice() + ", Cognome: " + getCognome() + ", Nome: " + getNome() +
                ", Anno Assunzione: " + getAnnoAssunzione() + ", Anni Esperienza: " + anniEsperienza;
    }  
}