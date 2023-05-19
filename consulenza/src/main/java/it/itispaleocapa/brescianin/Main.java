package it.itispaleocapa.brescianin;

public class Main {
    public static void main(String[] args) {
        Progetto progetto = new Progetto();

        // Aggiunta membri del personale
        progetto.aggiungiPersonale(new Tecnico("T001", "Rossi", "Mario", 2015, true, "informatica-telecomunicazioni"));
        progetto.aggiungiPersonale(new Funzionario("F001", "Bianchi", "Laura", 2010, 8));
        progetto.aggiungiPersonale(new Dirigente("D001", "Verdi", "Luigi", 2008));

        // Calcolo costo complessivo
        double costoComplessivo = progetto.getCostoComplessivo();
        System.out.println("Costo complessivo del progetto: " + costoComplessivo + " €");
    }
}