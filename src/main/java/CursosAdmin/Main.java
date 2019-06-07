package CursosAdmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    static RootSerializable rootSer = new RootSerializable(cursos, profesores, alumnos);
    static String routeSer = "serealizacion.admin";
    
    public static void main(String[] args) {
//        tests();
        loadRootSer();
        Login login = new Login(rootSer.alumnos, rootSer.profesores, rootSer.cursos);
        login.setVisible(true);
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                SerealizacionUtils.guardarObjeto(rootSer, routeSer);
            }
        });
    }
    
    public static void loadRootSer() {
        RootSerializable newSerial = (RootSerializable) SerealizacionUtils.leerObjeto(routeSer);
        System.out.println(newSerial);
        if(newSerial != null) {
            rootSer = newSerial;
        }
    }
    
    public static void tests() {
       Profesor prof = new Profesor(1,"Jan","Ticun", "123");
       Alumno alum = new Alumno(2,"Dante","Areano", "321", "3241234");
//       Curso curso = new Curso(UUID.randomUUID().toString(), "Progra","B","10/08/18", "08/04/19","00:00:00", "00:00:00", prof);
//       prof.cursosProfesor.add(curso);
//       alum.cursosAsignados.a+dd(curso);
//       curso.agregarAlumno(alum);
       profesores.add(prof);
       alumnos.add(alum);
//       cursos.add(curso);
    }
    

}
