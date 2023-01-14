package org.example;

public class FabricaToyota implements Fabrica{
    @Override
    public Auto crearAuto() {
        return new AutoToyota();
    }
}
