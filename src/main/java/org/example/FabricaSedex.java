package org.example;

public class FabricaSedex implements FabricaAbstrata {

    @Override
    public Entrega createEntrega() {
        return new EntregaSedex();
    }

    @Override
    public Valor createValor() {
        return new ValorSedex();
    }
}