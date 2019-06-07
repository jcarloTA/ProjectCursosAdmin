/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jancarloticun
 */
public class Curso implements Serializable {
    
    public String id;
    public String nombre;
    public String seccion;
    public String fechaInicio;
    public String fechaFin;
    public String horaInicio;
    public String horaFin;
    public Profesor profasignado;
    
    public ArrayList<Alumno> alumnosCurso = new ArrayList<>();
    
    public Curso( String usuario, String nombre, String seccion, String fechaInicio, String fechaFin, String horaInicio, String horaFin, Profesor profasignado){
        this.id = usuario;
        this.nombre = nombre;
        this.seccion = seccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profasignado = profasignado;
    }

    void agregarAlumno(Alumno alumno) {
        alumnosCurso.add(alumno);
    }
            
    public String getPropertyByIndex(int index) {
        if(index == 0) {
            return this.id;
        } else if(index == 1) {
            return this.nombre;
        } else if( index == 2) {
            return this.seccion;
        } else if( index == 3) {
            return this.fechaInicio;
        } else if( index == 4) {
            return this.fechaFin;
        } else if( index == 5) {
            return this.horaInicio;
        } else if( index == 6) {
            return this.horaFin;
        } else if( index == 7) {
            return this.profasignado.nombre;
        } else {
            return "";
        }
    }

}
