package it.itispaleocapa.brescianin;

import java.util.LinkedList;

class Progetto {
    private LinkedList<Personale> personale;
    private double tariffaTecnicoInformatica = 40.0;
    private double tariffaTecnicoElettronica = 50.0;
    private double tariffaFunzionarioJunior = 70.0;
    private double tariffaFunzionarioSenior = 80.0;
    private double tariffaDirigente = 100.0;

    public Progetto() {
        personale = new LinkedList<>();
    }

    public void aggiungiPersonale(Personale membro) {
        personale.add(membro);
    }

    public double calcolaCostoComplessivo() throws Exception {
        double costoComplessivo = 0.0;
        for (Personale membro : personale) {
            if (membro instanceof Tecnico) {
                Tecnico tecnico = (Tecnico) membro;
                if (tecnico.isInterno()) {
                    if (tecnico.getAreaDiCompetenza().equals("Informatica-Telecomunicazioni")) {
                        costoComplessivo += tariffaTecnicoInformatica + (2023 - tecnico.getAnnoAssunzione());
                    } else if (tecnico.getAreaDiCompetenza().equals("Elettronica-Automazione")) {
                        costoComplessivo += tariffaTecnicoElettronica + (2023 - tecnico.getAnnoAssunzione());
                    } else {
                        throw new Exception("Area di competenza non valida per il tecnico");
                    }
                }
            } else if (membro instanceof Funzionari) {
                Funzionari funzionario = (Funzionari) membro;
                if (funzionario.getAnniEsperienza() < 10) {
                    costoComplessivo += tariffaFunzionarioJunior;
                } else {
                    costoComplessivo += tariffaFunzionarioSenior;
                }
            } else if (membro instanceof Dirigente) {
                costoComplessivo += tariffaDirigente;
            }
        }
        return costoComplessivo;
    }
    public double getTariffaTecnicoInformatica() {
        return tariffaTecnicoInformatica;
    }
    
    public void setTariffaTecnicoInformatica(double tariffaTecnicoInformatica) {
        this.tariffaTecnicoInformatica = tariffaTecnicoInformatica;
    }
    
    public double getTariffaTecnicoElettronica() {
        return tariffaTecnicoElettronica;
    }
    
    public void setTariffaTecnicoElettronica(double tariffaTecnicoElettronica) {
        this.tariffaTecnicoElettronica = tariffaTecnicoElettronica;
    }
    
    public double getTariffaFunzionarioJunior() {
        return tariffaFunzionarioJunior;
    }
    
    public void setTariffaFunzionarioJunior(double tariffaFunzionarioJunior) {
        this.tariffaFunzionarioJunior = tariffaFunzionarioJunior;
    }
    
    public double getTariffaFunzionarioSenior() {
        return tariffaFunzionarioSenior;
    }
    
    public void setTariffaFunzionarioSenior(double tariffaFunzionarioSenior) {
        this.tariffaFunzionarioSenior = tariffaFunzionarioSenior;
    }
    
    public double getTariffaDirigente() {
        return tariffaDirigente;
    }
    
    public void setTariffaDirigente(double tariffaDirigente) {
        this.tariffaDirigente = tariffaDirigente;
    }

}