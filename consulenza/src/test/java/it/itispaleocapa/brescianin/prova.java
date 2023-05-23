package it.itispaleocapa.brescianin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class prova {
    @Test
    public void testGetCostoComplessivo() {
        Progetto progetto = new Progetto();
        progetto.aggiungiPersonale(new Tecnico("T100", "LUCCA", "CIAO", 2005, true, "informatica-telecomunicazioni"));
        progetto.aggiungiPersonale(new Funzionario("F108", "TASCA", "aura", 2019, 0));
        assertEquals(progetto.getCostoComplessivo(), 4770);
    }

    // scrivi la funzione per verificare l'aggiunta di un membro del personale
    @Test
    public void testVerificaAggiuntaPersonale() {
        Progetto progetto = new Progetto();

        Personale personale = new Tecnico("T100", "LUCCA", "CIAO", 2005, true, "informatica-telecomunicazioni");
        progetto.aggiungiPersonale(personale);
        assertEquals(personale, progetto.getPersonale(personale.getCodice()));
        assertEquals(personale, progetto.contienePersonale(personale));
    }
    
}
