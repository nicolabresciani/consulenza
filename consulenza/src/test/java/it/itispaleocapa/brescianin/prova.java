package it.itispaleocapa.brescianin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

class prova {
    private Progetto progetto = new Progetto();

    @Test
    public void testGetCostoComplessivo() {
        Tecnico tecnico = new Tecnico("T001", "Rossi", "Mario", 2015, true, "informatica-telecomunicazioni");
        Funzionario funzionario = new Funzionario("F001", "Bianchi", "Laura", 2010, 8);
        double oreAttivitaTecnico = 20.0;
        double oreAttivitaFunzionario = 30.0;
    
        progetto.aggiungiPersonale(tecnico);
        progetto.aggiungiPersonale(funzionario);
    
        double costoComplessivoTotale = (oreAttivitaTecnico * tecnico.getCostoOrario()) + (oreAttivitaFunzionario * funzionario.getCostoOrario());
    
        progetto.getCostoComplessivo(); // Aggiunta del costo complessivo al progetto
    
        Assertions.assertEquals(costoComplessivoTotale, progetto.getCostoComplessivo());
    }
    
    
}
