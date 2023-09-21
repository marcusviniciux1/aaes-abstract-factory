package org.example;

public class Correio {
    private Entrega entrega;
    private Valor valor;

    public Correio(FabricaAbstrata fabrica) {
        this.entrega = fabrica.createEntrega();
        this.valor = fabrica.createValor();
    }

    public String emitirEntrega() {
        return this.entrega.emitir();
    }

    public String emitirValor() {
        return this.valor.emitir();
    }
}