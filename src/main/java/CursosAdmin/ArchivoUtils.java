/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;
import java.awt.Component;
import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author jancarloticun
 */
public class ArchivoUtils {
    
    
    public static String getDirectorio() {
        JFileChooser chooser = new JFileChooser();

        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Seleccionar archivo");
        
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile().getAbsolutePath());
            return chooser.getSelectedFile().getAbsolutePath();
        } else {
            System.out.println("No Selection ");
            return null;
        }
    }
    
    public static void escribir(String ruta, String contenido, Component parentComponent){
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            pw.write(contenido);
            pw.close();
            fichero.close();
            JOptionPane.showMessageDialog(parentComponent, "Archivo guardado exitosamente.");
        }catch(Exception e){
            System.out.println("Error al tratar de escribir el archivo: " + e.getMessage());
        }finally{
            try {
                pw.close();
                fichero.close();
            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: "+ e.getMessage());
            }
        }
    }
    
        
    public static void leerXMLAlumno(String ruta, ArrayList<Alumno> alumnos, Component parentComponent) {
        try {

            File fXmlFile = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("alumno");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nElemento actual :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    Alumno al = new Alumno(
                        Integer.parseInt(eElement.getElementsByTagName("usuario").item(0).getTextContent()),
                        eElement.getElementsByTagName("nombre").item(0).getTextContent(),
                        eElement.getElementsByTagName("apellido").item(0).getTextContent(),
                        eElement.getElementsByTagName("password").item(0).getTextContent(),
                        eElement.getElementsByTagName("telefono").item(0).getTextContent()
                    );
                    alumnos.add(al);   
                }
                
            } 
            JOptionPane.showMessageDialog(parentComponent, "Archivo cargado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static String generarXmlProfesor(String ruta, ArrayList<Profesor> profesores){
        String cadena = "<profesores>\n";
        for(Profesor p: profesores){
            cadena += "<profesor>\n";
            cadena += "<nombre>"+p.nombre+"</nombre>\n";
            cadena += "<apellido>"+p.apellido+"</apellido>\n";
            cadena += "<usuario>"+p.usuario+"</usuario>\n";
            cadena += "<password>"+p.password+"</password>\n";
            cadena += "</profesor>\n";
        }
        cadena+="</profesores>";
                
        return cadena;
    }
    
    public static String generarCsvProfesor(String ruta, ArrayList<Profesor> profesores) {
        String cadena = "";
        for(Profesor p: profesores){
            cadena += p.usuario+"," + p.nombre +"," + p.apellido+"," + p.password+",\n";
        }
        return cadena;
    }
    
    public static String generarCsvAlumnos(String ruta, ArrayList<Alumno> alumnos) {
        String cadena = "";
        for(Alumno p: alumnos){
            cadena += p.carnet+",";
            cadena += p.nombre +",";
            cadena += p.apellido+",";
            cadena += p.password+",";
            cadena += p.telefono+"\n";            
        }
        return cadena;
    }
    
    public static String generarCsvAlumnosConNota(String ruta, Curso curso) {
        String cadena = "";
        for(Alumno p: curso.alumnosCurso){
            cadena += p.carnet+",";
            cadena += p.nombre +",";
            cadena += p.apellido+",";
            cadena += p.password+",";
            for(Nota c: p.notas) {
                if(c.curso.id.equals(curso.id)) {
                    cadena  += c.nota + ",";
                }
            }
            cadena += p.telefono+",\n";
        }
        return cadena;
    }
    
    public static String generarCsvCursos(String ruta, ArrayList<Curso> cursos) {
        String cadena = "";
        for(Curso c: cursos){
            cadena += c.id+",";
            cadena += c.nombre +",";
            cadena += c.seccion+",";
            cadena += c.fechaInicio+",";
            cadena += c.fechaFin+",";
            cadena += c.horaInicio+",";
            cadena += c.horaFin+",";
            cadena += c.profasignado.usuario+",\n";
        }
        return cadena;
    }
    
    public static String generarCsvCursosConNota(String ruta, Alumno alumno) {
        String cadena = "";
        for(Curso c: alumno.cursosAsignados){
            cadena += c.id+",";
            cadena += c.nombre +",";
            cadena += c.seccion+",";
            cadena += c.fechaInicio+",";
            cadena += c.fechaFin+",";
            cadena += c.horaInicio+",";
            cadena += c.horaFin+",";
            for(int e =0; e< alumno.notas.size(); e++) {
                if(c.id.equals(alumno.notas.get(e).curso.id)) {
                    cadena += alumno.notas.get(e).nota + ",";
                }
            }
            cadena += c.profasignado.usuario+",\n";
        }
        return cadena;
    }
    
    public static String generarXmlAlumno(String ruta, ArrayList<Alumno> alumnos){
        String cadena = "<alunmnos>\n";
            for(Alumno p: alumnos){
                cadena += "<alumno>\n";
                    cadena += "<nombre>"+p.nombre+"</nombre>\n";
                    cadena += "<apellido>"+p.apellido+"</apellido>\n";
                    cadena += "<usuario>"+p.carnet+"</usuario>\n";
                    cadena += "<password>"+p.password+"</password>\n";
                    cadena += "<password>"+p.telefono+"</password>\n";
                cadena += "</alumno>\n";
            }
        cadena+="</alunmnos>";
                
        return cadena;
    }
    
    
    public static void leerXMLProfesor(String ruta, ArrayList<Profesor> profesores, Component parentComponent) {
        try {

            File fXmlFile = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento raiz :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("profesor");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nElemento actual :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    Profesor pr = new Profesor(
                       Integer.parseInt(eElement.getElementsByTagName("usuario").item(0).getTextContent()),
                       eElement.getElementsByTagName("nombre").item(0).getTextContent(),
                       eElement.getElementsByTagName("apellido").item(0).getTextContent(),
                        eElement.getElementsByTagName("password").item(0).getTextContent()
                    );
                    
                    profesores.add(pr);
                }
                
            }
            JOptionPane.showMessageDialog(parentComponent, "Archivo cargado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void leerCsvProfesor(String ruta, ArrayList<Profesor> profesores, Component parentComponent) {
        String contenido = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                contenido += linea+"\n";
                String [] data = linea.split(",");
                Profesor pr = new Profesor(Integer.parseInt(data[0]),data[1],data[2],data[3]);
                profesores.add(pr);
                
            }
            
            br.close();
            fr.close();            
            JOptionPane.showMessageDialog(parentComponent, "Archivo cargado exitosamente.");
        }catch(Exception e){
            System.out.println("Error al tratar de leer el archivo: " + e.getMessage());
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: "+ e.getMessage());
            }
        }
       
    }
    
    public static void leerAsignacionMasivaCursos(String ruta, ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, Component parentComponent) {
        String contenido = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                contenido += linea+"\n";
                String [] data = linea.split("#");
                for(Curso cr: cursos) {
                    if(data[0].equals(cr.id)) {
                        for(Alumno al: alumnos) {
                            if(data[1].equals(Integer.toString(al.carnet))) {
                                cr.alumnosCurso.add(al);
                                al.cursosAsignados.add(cr);
                            }
                        }
                    }
                }
                
            }
            
            br.close();
            fr.close();            
            JOptionPane.showMessageDialog(parentComponent, "Asignaciones cargadas exitosamente.");
        }catch(Exception e){
            System.out.println("Error al tratar de leer el archivo: " + e.getMessage());
        }finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("No se pudo cerrar el archivo: "+ e.getMessage());
            }
        }
       
    }
    
    public static void leerJsonCurso(String ruta, ArrayList<Curso> cursos, ArrayList<Profesor> profesores){ 
            JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader(ruta))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray CursosList = (JSONArray) obj;
             
            //Iterate over employee array
            CursosList.forEach(  curs -> parseCursoObject( (JSONObject) curs, cursos, profesores  ));
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public static void parseCursoObject(JSONObject curso,  ArrayList<Curso> cursos, ArrayList<Profesor> profesores) {
        String name = (String) curso.get("nombre");
        String seccion = (String) curso.get("seccion");
        String fecha_inicio = (String) curso.get("fecha_inicio");
        String fecha_fin = (String) curso.get("fecha_fin");
        String hora_inicio = (String) curso.get("hora_inicio");
        String hora_fin = (String) curso.get("hora_fin");
        String profesor_id = (String) curso.get("profesor");
        String id_curso = (String) curso.get("id").toString();
        Profesor prof_asign = searchProf(profesor_id, profesores);
        if(prof_asign != null) {
            Curso nuevo_curso = new Curso(id_curso, name, seccion, fecha_inicio, fecha_fin,hora_inicio,hora_fin, prof_asign);
            System.out.println(id_curso);
            cursos.add(nuevo_curso);        
        } else {
            System.out.println("No se encontro algun profesor " + name);
        }
    }
    
    public static Profesor searchProf(String idP, ArrayList<Profesor> profesores) {
        int id = Integer.parseInt(idP);
        for(Profesor prof: profesores) {
            if(prof.usuario == id)
                return prof;
        }
        return null;
    }
    
    public static void escribirJsonCursos(String route, ArrayList<Curso> cursos, Component parentComponent) {
              //First Employee
        JSONArray cursosList = new JSONArray();
        for(Curso curs: cursos) {
            JSONObject cursoObject = new JSONObject();
            cursoObject.put("id", curs.id);
            cursoObject.put("nombre", curs.nombre);
            cursoObject.put("seccion", curs.seccion);
            cursoObject.put("fecha_inicio", curs.fechaInicio);
            cursoObject.put("fecha_fin", curs.fechaFin);
            cursoObject.put("hora_inicio", curs.horaInicio);
            cursoObject.put("hora_fin", curs.horaFin);
            cursoObject.put("profesor", curs.profasignado.usuario);
            cursosList.add(cursoObject);
        }
        
        try (FileWriter file = new FileWriter(route)) {
 
            file.write(cursosList.toJSONString());
            file.flush();
            JOptionPane.showMessageDialog(parentComponent, "Archivo guardado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String generarCsvNotasAlumno(String ruta, ArrayList<Nota> notas) {
        String cadena = "";
        for(Nota n: notas){
            cadena += n.nota+",";
//            cadena += n.alumno.nombre +",";
//            cadena += n.alumno.nombre+",";
//            cadena += n.alumno.nombre+",";
//            cadena += n.alumno.nombre+",\n";            
        }
        return cadena;
    }
}