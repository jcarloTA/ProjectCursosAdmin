/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jancarloticun
 */
public class SerealizacionUtils {
    
    public static void guardarObjeto(Object o, String ruta){
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            //Se crea el fichero
            fos = new FileOutputStream(ruta);
            salida = new ObjectOutputStream(fos);
            //Se escribe el objeto en el fichero
            salida.writeObject(o);
            
           System.out.println("serializable guardado!");
        } catch (FileNotFoundException e) {
            System.out.println("11" + e.getMessage());
        } catch (IOException e) {
            System.out.println("22" + e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println("33" +e.getMessage());
            }
        }

    }
        
    
    
    public static Object leerObjeto(String ruta){
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Object o = null;

        try {

            fis = new FileInputStream(ruta);
            entrada = new ObjectInputStream(fis);
            o = entrada.readObject(); //es necesario el casting al salir del metodo
            
        } catch (FileNotFoundException e) {
            System.out.println("1 " +e.getMessage());
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("2 " +e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("3 " +e.getMessage());
            }
        }
        return o;

    }
}
