package it.itispaleocapa.brescianin;

public class Main {
    public static void main(String[] args) throws Exception {
        Progetto progetto = new Progetto();

        Tecnico tecnico1 = new Tecnico("T1", "Rossi", "Mario", 2015, "Informatica-Telecomunicazioni", true);
        Tecnico tecnico2 = new Tecnico("T2", "Verdi", "Giuseppe", 2010, "Elettronica-Automazione", true);
        Funzionari funzionario1 = new Funzionari("F1", "Gialli", "Anna", 2019, 5);
        Funzionari funzionario2 = new Funzionari("F2", "Neri", "Carlo", 2005, 15);
        Dirigente dirigente1 = new Dirigente("D1", "Bianchi", "Luca", 0);

        progetto.aggiungiPersonale(tecnico1);
        progetto.aggiungiPersonale(tecnico2);
        progetto.aggiungiPersonale(funzionario1);
        progetto.aggiungiPersonale(funzionario2);
        progetto.aggiungiPersonale(dirigente1);

        double costoComplessivo = progetto.calcolaCostoComplessivo();
        System.out.println("Costo complessivo del progetto: " + costoComplessivo);
    }
}