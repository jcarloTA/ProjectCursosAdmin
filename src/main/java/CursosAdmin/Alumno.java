/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.util.ArrayList;

/**
 *
 * @author jancarloticun
 */
public class Alumno {
  
    public int carnet;
    public String nombre;
    public String apellido;
    public String password;
    public ArrayList<Curso> cursosAsignados = new ArrayList<>();
    public ArrayList<Nota> notas = new ArrayList<>();
    
    public Alumno(int carnet, String nombre, String apellido, String password) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }
    
    public void agregarCurso( Curso curso){
        cursosAsignados.add(curso);
    }
  
}
