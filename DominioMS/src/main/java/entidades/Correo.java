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
public class Correo {

    /*
    Atributos de clase.
    */
    private Cuenta emisor;
    private String asunto;
    private String body;
    private Configuracion configuracion;

    /**
     * COnstructor por defecto de la clase.
     */
    public Correo() {
    }

    /**
     * Construye una instancia de la clase e inicializa los valores de los
     * atributos con los dados en los parámétros.
     *
     * @param emisor
     * @param asunto
     * @param body
     * @param configuracion
     */
    public Correo(Cuenta emisor, String asunto, String body, Configuracion configuracion) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.body = body;
        this.configuracion = configuracion;
    }
    
    /**
     * Pendiente
     */
    public boolean validador() {
        return false;
    }

    public Cuenta getEmisor() {
        return emisor;
    }

    public void setEmisor(Cuenta emisor) {
        this.emisor = emisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    @Override
    public String toString() {
        return "Correo{" + "emisor=" + emisor + ", asunto=" + asunto + ", body=" + body + ", configuracion=" + configuracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.emisor);
        hash = 53 * hash + Objects.hashCode(this.asunto);
        hash = 53 * hash + Objects.hashCode(this.body);
        hash = 53 * hash + Objects.hashCode(this.configuracion);
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
        final Correo other = (Correo) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        if (!Objects.equals(this.body, other.body)) {
            return false;
        }
        if (!Objects.equals(this.emisor, other.emisor)) {
            return false;
        }
        return Objects.equals(this.configuracion, other.configuracion);
    }

}
