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
public class Profesor {
    
    public int usuario;
    public String nombre;
    public String apellido;
    public String password;
    
    
    public ArrayList<Curso> cursosProfesor = new ArrayList<>();
    
    public Profesor(int usuario, String nombre, String apellido, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        
    }
    public void agregarCurso( Curso curso){
        cursosProfesor.add(curso);
    }
    
}
