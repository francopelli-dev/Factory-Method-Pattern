package org.example;

public class FabricaFord implements Fabrica{
    @Override
    public Auto crearAuto() {
        return new AutoFord();
    }
}
