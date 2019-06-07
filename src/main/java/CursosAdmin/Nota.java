/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

/**
 *
 * @author jancarloticun
 */
public class Nota {
    public String nota;
    public Curso curso;
    public Profesor profesor;
    public Alumno alumno;
    public Nota(String nota, Curso curso, Profesor profesor){
           this.nota = nota;
           this.curso = curso;
           this.profesor = profesor;
    }
}
