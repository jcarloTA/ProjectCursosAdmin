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
public class Alumno implements Serializable {
  
    public int carnet;
    public String nombre;
    public String apellido;
    public String password;
    public String telefono;
    public ArrayList<Curso> cursosAsignados = new ArrayList<>();
    public ArrayList<Nota> notas = new ArrayList<>();
    
    public Alumno(int carnet, String nombre, String apellido, String password, String telefono) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.telefono = telefono;
    }
    
    public void agregarCurso( Curso curso){
        cursosAsignados.add(curso);
    }
    
    public String getPropertyByIndex(int index) {
        if(index == 0) {
            return Integer.toString(this.carnet);
        } else if(index == 1) {
            return this.nombre;
        } else if( index == 2) {
            return this.apellido;
        } else if( index == 3) {
            return this.password;
        } else if( index == 4) {
            return this.telefono;
        } else {
            return "";
        }
    }
  
}
