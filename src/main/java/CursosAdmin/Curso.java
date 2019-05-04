/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jancarloticun
 */
public class Curso {
    
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

}
