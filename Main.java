package org.example;
/**
 * Clase main.
 * @autor Héctor Fernández Méndez
 * @version 1.0
 */
public class Main {
    /**
     * @param args
     * Método crear y almacenar autos.
     * Crea dos objetos Auto
     * Crea un objeto concesionario1.
     * Agrega los dos autos al concesionario1.
     * Imprime por pantalla los autos almacenados en concesionario1.
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        Concesionario concesionario1 = new Concesionario();

        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        concesionario1.imprimirAutos();
    }
}