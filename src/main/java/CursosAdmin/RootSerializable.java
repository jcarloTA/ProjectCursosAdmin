/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jancarloticun
 */
public class RootSerializable implements Serializable {
    
    public ArrayList<Curso> cursos;
    public  ArrayList<Profesor> profesores;
    public ArrayList<Alumno> alumnos;
    
    public RootSerializable(ArrayList<Curso> cursos, ArrayList<Profesor> profesores, ArrayList<Alumno> alumnos) {
        this.cursos = cursos;
        this.profesores = profesores;
        this.alumnos = alumnos;
    }
    public void setCursos( ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    public void setProfesores( ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    public void setAlumnos( ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Curso> getCursos() {
        return this.cursos;
    }
    public ArrayList<Profesor> getProfesores() {
        return this.profesores;
    }
    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }
}
