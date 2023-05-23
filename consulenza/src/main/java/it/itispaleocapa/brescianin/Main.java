package it.itispaleocapa.brescianin;

public class Main {


    public static void main(String[] args){
        Progetto progetto = new Progetto();
        progetto.aggiungiPersonale(new Tecnico("T100", "LUCCA", "CIAO", 2005, true, "informatica-telecomunicazioni"));
        progetto.aggiungiPersonale(new Funzionario("F108", "TASCA", "aura", 2019, 0));
        System.out.println(progetto.getCostoComplessivo());
        
    }
}