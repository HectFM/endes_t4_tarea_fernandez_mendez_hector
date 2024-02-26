package org.example;

import java.util.ArrayList;

/**
 * La clase Auto representa un automóvil con unos parámetros marca y modelo
 * @author Héctor Fernández Méndez
 * @version 1.0 18/02/2024

 */
public class Auto {

    /**
     * La marca del auto.
     * Almacena la marca del coche en una variable String.
     */
    private String marca;

    /**
     * El modelo del auto.
     * Almacena el modelo de coche en una variable String
     */
    private String modelo;

    /**
     * Crea un objeto Auto
     * Crea un objeto Auto con los parámetros marca y modelo.
     * @param marca   La marca del automóvil.
     * @param modelo  El modelo del automóvil.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Devuelve la marca del automóvil.
     * Método que devuelve el valor almacenado en la variable marca.
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Cambia marca del automóvil.
     * Método que cambia el valor de la variable Marca al nuevo valor introducido en el parametro.
     * @param marca La nueva marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del automóvil.
     * Método que devuelve el valor almacenado en la variable marca.
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Cambia modelo del automóvil.
     * Método que cambia el valor de la variable Modelo al nuevo valor introducido en el parametro.
     * @param modelo El nuevo modelo del automóvil.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve la variable Auto.
     * Método que muestra por pantalla una cadena con la información de la marca y el modelo.
     * @return Una cadena que representa  Auto.
     * @param marca.
     * @param modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
