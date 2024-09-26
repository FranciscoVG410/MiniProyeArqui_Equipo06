/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author PERSONAL
 */
public class Cuenta {

    /*
    Atributos de clase.
     */
    private String nombre;

    /**
     * Constructor por defecto.
     */
    public Cuenta() {
    }

    /**
     * Construye una instancia de la clase e inicializa los valores de los
     * atributos con los dados en los parámétros.
     *
     * @param nombre
     */
    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Pendiente
     */
    public boolean validador() {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
}
