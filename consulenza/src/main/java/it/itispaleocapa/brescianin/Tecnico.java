package it.itispaleocapa.brescianin;

class Tecnico extends Personale {
    private String areaDiCompetenza;
    private boolean interno;

    public Tecnico(String codice, String cognome, String nome, int annoAssunzione, String areaDiCompetenza, boolean interno) {
        super(codice, cognome, nome, annoAssunzione);
        this.areaDiCompetenza = areaDiCompetenza;
        this.interno = interno;
    }

    public String getAreaDiCompetenza() {
        return areaDiCompetenza;
    }

    public void setAreaDiCompetenza(String areaDiCompetenza) {
        this.areaDiCompetenza = areaDiCompetenza;
    }

    public boolean isInterno() {
        return interno;
    }

    public void setInterno(boolean interno) {
        this.interno = interno;
    }
    public String toString() {
        return "Tecnico: " + "Codice: " + getCodice() + ", Cognome: " + getCognome() + ", Nome: " + getNome() + ", Anno Assunzione: " + getAnnoAssunzione() +
                ", Area di Competenza: " + areaDiCompetenza + ", Interno: " + interno;
    }
}

