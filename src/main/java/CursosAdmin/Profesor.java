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
public class Profesor implements Serializable {
    
    public int usuario;
    public String nombre;
    public String apellido;
    public String password;
    
    
    public ArrayList<Curso> cursosProfesor = new ArrayList<>();
    public ArrayList<Nota> notasProfesor = new ArrayList<>();
    
    public Profesor(int usuario, String nombre, String apellido, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        
    }
    public void agregarCurso( Curso curso){
        cursosProfesor.add(curso);
    }
    
    public void agregarNota( Nota nota) {
        notasProfesor.add(nota);
    }
        
    public String getPropertyByIndex(int index) {
        if(index == 0) {
            return Integer.toString(this.usuario);
        } else if(index == 1) {
            return this.nombre;
        } else if( index == 2) {
            return this.apellido;
        } else if( index == 3) {
            return this.password;
        } else {
            return "";
        }
    }
    
}
