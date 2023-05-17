package it.itispaleocapa.brescianin;

class Dirigente extends Personale {

    public Dirigente(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }
    public String toString() {
        return "Dirigente: " + "Codice: " + getCodice() + ", Cognome: " + getCognome() +", Nome: " + getNome() + ", Anno Assunzione: " + getAnnoAssunzione();
    }
    
}
