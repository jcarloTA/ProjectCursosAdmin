package CursosAdmin;

import java.util.ArrayList;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jancarloticun
 */
public class Main {
    
    static ArrayList<Alumno> alumnos = new ArrayList<>();
    static ArrayList<Profesor> profesores = new ArrayList<>();
    static ArrayList<Curso> cursos = new ArrayList<>();
    
    public static void main(String[] args) {
        tests();
        Login login = new Login(alumnos, profesores, cursos);
        login.setVisible(true);
    }
    
    public static void tests() {
       Profesor prof = new Profesor(1,"Jan","Ticun", "123");
       Alumno alum = new Alumno(2,"Dante","Areano", "321");
       Curso curso = new Curso(UUID.randomUUID().toString(), "Progra","B","10/08/18", "08/04/19","00:00:00", "00:00:00", prof);
       prof.cursosProfesor.add(curso);
       alum.cursosAsignados.add(curso);
       curso.agregarAlumno(alum);
       profesores.add(prof);
       alumnos.add(alum);
       cursos.add(curso);
    }
}
