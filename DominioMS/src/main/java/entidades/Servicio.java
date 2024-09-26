/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author PERSONAL
 */
public class Servicio {

    /*
    Atributos de clase.
     */
    private String nombre;
    private List<Cuenta> cuentas;
    private String protocolo;

    /**
     * Constructor por defecto de la clase.
     */
    public Servicio() {
    }

    /**
     * Construye una instancia de la clase e inicializa los valores de los
     * atributos con los dados en los parámétros.
     *
     * @param nombre
     * @param cuentas
     * @param protocolo
     */
    public Servicio(String nombre, List<Cuenta> cuentas, String protocolo) {
        this.nombre = nombre;
        this.cuentas = cuentas;
        this.protocolo = protocolo;
    }

    /**
     * Pendiente
     */
    public void implementar() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombre=" + nombre + ", cuentas=" + cuentas + ", protocolo=" + protocolo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.cuentas);
        hash = 41 * hash + Objects.hashCode(this.protocolo);
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
        final Servicio other = (Servicio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.protocolo, other.protocolo)) {
            return false;
        }
        return Objects.equals(this.cuentas, other.cuentas);
    }

}
