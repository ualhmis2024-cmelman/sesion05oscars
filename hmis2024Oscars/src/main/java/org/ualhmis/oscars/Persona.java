package org.ualhmis.oscars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase Persona para actores, actrices y directores
class Persona {
    private String nombre;
    private String sexo;
    private String fechaNacimiento;

    public Persona(String nombre, String sexo, String fechaNacimiento) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}

