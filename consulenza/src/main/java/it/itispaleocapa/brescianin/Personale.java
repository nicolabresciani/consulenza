package it.itispaleocapa.brescianin;

public class Personale {
    private String codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;

    public Personale(String codice, String cognome, String nome, int annoAssunzione) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.annoAssunzione = annoAssunzione;
    }

    public String getCodice() {
        return codice;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public String toString() {
        return "Personale [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", annoAssunzione=" + annoAssunzione + "]";
    }
}
