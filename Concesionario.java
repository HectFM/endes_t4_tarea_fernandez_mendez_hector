package org.example;


import java.util.ArrayList;
/**
 * Concesionario de autos.
 * Clase Concesionario que almacena autos.
 * @author Héctor Fernández Méndez.
 * @version 1.0 18/02/2024
*/
public class Concesionario {
    /**
     * ArrayList de auto.
     * Listado de autos en el concesionario.
     */
    private ArrayList<Auto> autos;

    /**
     * Instanciacion de Concesionario.
     * Realiza una nueva instancia de Concesionario.
     */
    public Concesionario() {
        autos = new ArrayList<Auto>();
    }

    /**
     * Agregar auto
     * Método que añade un auto al concesionario
     * @param auto El auto a agregar.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * ArrayList de auto
     * Obtiene la lista de autos en el concesionario.
     * @return La lista de autos en el concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime los autos.
     * Imprime por pantalla los autos del concesionario.
     */
    public void imprimirAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
