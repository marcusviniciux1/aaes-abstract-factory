package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorreioTest {

    @Test
    void deveEmitirEntregaPAC() {
        FabricaAbstrata fabrica = new FabricaPAC();
        Correio correio = new Correio(fabrica);
        assertEquals("Prazo de entrega de até 10 dias úteis", correio.emitirEntrega());
    }

    @Test
    void deveEmitirEntregaSedex() {
        FabricaAbstrata fabrica = new FabricaSedex();
        Correio correio = new Correio(fabrica);
        assertEquals("Prazo de entrega de até 3 dias úteis", correio.emitirEntrega());
    }

    @Test
    void deveEmitirValorPAC() {
        FabricaAbstrata fabrica = new FabricaPAC();
        Correio correio = new Correio(fabrica);
        assertEquals("Valor do PAC é R$ 37,45", correio.emitirValor());
    }

    @Test
    void deveEmitirValorSedex() {
        FabricaAbstrata fabrica = new FabricaSedex();
        Correio correio = new Correio(fabrica);
        assertEquals("Valor do PAC é R$ 66,45", correio.emitirValor());
    }

}