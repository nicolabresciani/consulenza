package it.itispaleocapa.brescianin;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creazione di un nuovo progetto
        Progetto progetto = new Progetto();

        // Creazione di alcuni membri del personale
        Tecnico tecnico1 = new Tecnico("t000", "luchini", "luca", 2011, "Informatica", true);
        Tecnico tecnico2 = new Tecnico("t001", "tremore", "matteo", 2015, "Elettronica", false);
        Funzionario funzionario1 = new Funzionario("f000", "colombi", "giulio", 2002, 9);
        Funzionario funzionario2 = new Funzionario("f001", "gatto", "roby", 2000, 10);
        Dirigente dirigente = new Dirigente("d000", "blu", "tommaso", 1999);

        // Aggiunta dei membri al progetto
        progetto.aggiungiPersonale(tecnico1);
        progetto.aggiungiPersonale(tecnico2);
        progetto.aggiungiPersonale(funzionario1);
        progetto.aggiungiPersonale(funzionario2);
        progetto.aggiungiPersonale(dirigente);
        System.out.println(progetto.toString());

        // Ottenimento delle tariffe per i diversi ruoli
        double tariffaTecnicoInformatica = progetto.getTariffa(Ruolo.TECNICO_INFORMATICA);
        double tariffaTecnicoElettronica = progetto.getTariffa(Ruolo.TECNICO_ELETTRONICA);
        double tariffaFunzionarioJunior = progetto.getTariffa(Ruolo.FUNZIONARIO_JUNIOR);
        double tariffaFunzionarioSenior = progetto.getTariffa(Ruolo.FUNZIONARIO_SENIOR);
        double tariffaDirigente = progetto.getTariffa(Ruolo.DIRIGENTE);

        // Stampa delle tariffe
        System.out.println("Tariffa Tecnico Informatica: " + tariffaTecnicoInformatica);
        System.out.println("Tariffa Tecnico Elettronica: " + tariffaTecnicoElettronica);
        System.out.println("Tariffa Funzionario Junior: " + tariffaFunzionarioJunior);
        System.out.println("Tariffa Funzionario Senior: " + tariffaFunzionarioSenior);
        System.out.println("Tariffa Dirigente: " + tariffaDirigente);

        // Impostazione di una nuova tariffa per il Tecnico Informatica
        progetto.setTariffa(Ruolo.TECNICO_INFORMATICA,45.0);

        // Ottenimento della nuova tariffa per il Tecnico Informatica
        tariffaTecnicoInformatica = progetto.getTariffa(Ruolo.TECNICO_INFORMATICA);
        System.out.println("Nuova Tariffa Tecnico Informatica: " + tariffaTecnicoInformatica);
    }
}
