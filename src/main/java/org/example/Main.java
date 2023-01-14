package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desarrollo de Factory Method");
        Fabrica factory = new FabricaFord();
        Fabrica factory2 = new FabricaToyota();
        Auto auto1 = factory.crearAuto();
        Auto auto2 = factory2.crearAuto();
        auto1.arrancar();
        auto2.arrancar();
    }
}