package it.itispaleocapa.brescianin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;


class prova {
    private Progetto progetto = new Progetto();

    @Test
    public void testGetCostoComplessivo() {
        Tecnico tecnico = new Tecnico("T100", "LUCCA", "CIAO", 2005, true, "informatica-telecomunicazioni");
        Funzionario funzionario = new Funzionario("F108", "TASCA", "aura", 2019, 0);
        double oreAttivitaTecnico = 10.0;
        double oreAttivitaFunzionario = 20.0;

        progetto.aggiungiPersonale(tecnico);
        progetto.aggiungiPersonale(funzionario);

        double costoComplessivoTotale = (oreAttivitaTecnico * tecnico.getCostoOrario()) + (oreAttivitaFunzionario * funzionario.getCostoOrario());
        assertEquals(costoComplessivoTotale, progetto.getCostoComplessivo());
    }
    
    
}
