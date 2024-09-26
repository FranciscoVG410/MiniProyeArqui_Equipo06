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
public class Configuracion {

    /*
    Atributos de clase.
     */
    private List<Servicio> servicios;

    /**
     * Cosntructor por defecto de la clase.
     */
    public Configuracion() {
    }

    /**
     * Construye una instancia de la clase e inicializa los valores de los
     * atributos con los dados en los parámétros.
     *
     * @param servicios
     */
    public Configuracion(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    /**
     * Pendiente
     */
    public void implementar() {

    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "servicios=" + servicios + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.servicios);
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
        final Configuracion other = (Configuracion) obj;
        return Objects.equals(this.servicios, other.servicios);
    }

}
