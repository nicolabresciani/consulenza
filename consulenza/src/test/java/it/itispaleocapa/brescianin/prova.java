package it.itispaleocapa.brescianin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;;


class prova {
    private Progetto progetto = new Progetto();

    @Test
    public void testGetCostoComplessivo() {
        Progetto progetto = new Progetto();
        progetto.aggiungiPersonale(new Tecnico("T100", "LUCCA", "CIAO", 2005, true, "informatica-telecomunicazioni"));
        progetto.aggiungiPersonale(new Funzionario("F108", "TASCA", "aura", 2019, 0));
        assertEquals(progetto.getCostoComplessivo(), 4770);
    }

    
}
