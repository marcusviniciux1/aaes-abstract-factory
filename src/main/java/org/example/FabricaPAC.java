package org.example;

public class FabricaPAC implements FabricaAbstrata {

    @Override
    public Entrega createEntrega() {
        return new EntregaPAC();
    }

    @Override
    public Valor createValor() {
        return new ValorPAC();
    }
}