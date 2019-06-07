/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursosAdmin;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jancarloticun
 */
public class AdminPanel extends javax.swing.JFrame {
    
    public ArrayList<Alumno> alumnos;
    public ArrayList<Profesor> profesores;
    public ArrayList<Curso> cursos;
    public ArrayList<Nota> notas;
    
    /**
     * Creates new form AdminPanel
     */
    public AdminPanel(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores, ArrayList<Curso> cursos) {
        initComponents();
        this.alumnos = alumnos;
        this.profesores = profesores;
        this.cursos = cursos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonShowProfesores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddProfesor = new javax.swing.JButton();
        jButtonShowProfesores1 = new javax.swing.JButton();
        jButtonShowProfesores2 = new javax.swing.JButton();
        jButtonShowProfesores3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonShowAlumnos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAddAlumno = new javax.swing.JButton();
        jButtonShowAlumnos1 = new javax.swing.JButton();
        jButtonShowAlumnos2 = new javax.swing.JButton();
        jButtonShowAlumnos3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonShowCursos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonAddCurso = new javax.swing.JButton();
        jButtonShowCursos1 = new javax.swing.JButton();
        jButtonShowCursos2 = new javax.swing.JButton();
        jButtonShowCursos3 = new javax.swing.JButton();
        jButtonShowCursos4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jButtonShowProfesores.setText("Ver Profesores");
        jButtonShowProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowProfesoresActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profesores");

        jButtonAddProfesor.setText("Agregar profesor");
        jButtonAddProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProfesorActionPerformed(evt);
            }
        });

        jButtonShowProfesores1.setText("Cargar CSV");
        jButtonShowProfesores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowProfesores1ActionPerformed(evt);
            }
        });

        jButtonShowProfesores2.setText("Generar XML");
        jButtonShowProfesores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowProfesores2ActionPerformed(evt);
            }
        });

        jButtonShowProfesores3.setText("Generar CSV");
        jButtonShowProfesores3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowProfesores3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonShowProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowProfesores1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowProfesores2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowProfesores3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonShowProfesores1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonShowProfesores2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonShowProfesores3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Administrador");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jButtonShowAlumnos.setText("Ver alumnos");
        jButtonShowAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alumnos");

        jButtonAddAlumno.setText("Agregar alumno");
        jButtonAddAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAlumnoActionPerformed(evt);
            }
        });

        jButtonShowAlumnos1.setText("Cargar XML");
        jButtonShowAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAlumnos1ActionPerformed(evt);
            }
        });

        jButtonShowAlumnos2.setText("Generar XML");
        jButtonShowAlumnos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAlumnos2ActionPerformed(evt);
            }
        });

        jButtonShowAlumnos3.setText("Generar CSV");
        jButtonShowAlumnos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAlumnos3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonShowAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonShowAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonShowAlumnos3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jButtonShowCursos.setText("Ver cursos");
        jButtonShowCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCursosActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cursos");

        jButtonAddCurso.setText("Agregar curso");
        jButtonAddCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCursoActionPerformed(evt);
            }
        });

        jButtonShowCursos1.setText("Asignar Curso");
        jButtonShowCursos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCursos1ActionPerformed(evt);
            }
        });

        jButtonShowCursos2.setText("Cargar JSON");
        jButtonShowCursos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCursos2ActionPerformed(evt);
            }
        });

        jButtonShowCursos3.setText("generar JSON");
        jButtonShowCursos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCursos3ActionPerformed(evt);
            }
        });

        jButtonShowCursos4.setText("Asignacion Masiva");
        jButtonShowCursos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCursos4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonShowCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowCursos2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowCursos3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowCursos4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowCursos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowCursos2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowCursos3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowCursos4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton2.setText("Perfil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(423, 423, 423)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProfesorActionPerformed
        CrearProfesorForm cr = new CrearProfesorForm(this.profesores);
        cr.setVisible(true);
       
    }//GEN-LAST:event_jButtonAddProfesorActionPerformed

    private void jButtonShowProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowProfesoresActionPerformed
        // TODO add your handling code here:
        ProfesorListForm profesorList = new ProfesorListForm(this.profesores);
        profesorList.setVisible(true);
    }//GEN-LAST:event_jButtonShowProfesoresActionPerformed

    private void jButtonShowAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAlumnosActionPerformed
        AlumnoListForm alumList = new AlumnoListForm(this.alumnos);
        alumList.setVisible(true);
    }//GEN-LAST:event_jButtonShowAlumnosActionPerformed

    private void jButtonAddAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAlumnoActionPerformed
        CrearAlumnoForm crearAl = new CrearAlumnoForm(this.alumnos);
        crearAl.setVisible(true);
    }//GEN-LAST:event_jButtonAddAlumnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonShowCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCursosActionPerformed
        CursosListForm clForm = new CursosListForm(this.cursos,this.profesores);
        clForm.setVisible(true);
    }//GEN-LAST:event_jButtonShowCursosActionPerformed

    private void jButtonAddCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCursoActionPerformed
        CrearCursoForm cc = new CrearCursoForm(this.profesores, this.cursos);
        cc.setVisible(true);
    }//GEN-LAST:event_jButtonAddCursoActionPerformed

    private void jButtonShowCursos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCursos1ActionPerformed
        AsignarCurso asC = new AsignarCurso(this.alumnos, this.cursos);
        asC.setVisible(true);
    }//GEN-LAST:event_jButtonShowCursos1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MiPerfil miP = new MiPerfil();
        miP.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonShowProfesores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowProfesores1ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        ArchivoUtils.leerCsvProfesor(route, profesores, rootPane);
    }//GEN-LAST:event_jButtonShowProfesores1ActionPerformed

    private void jButtonShowProfesores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowProfesores2ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        String contenido = ArchivoUtils.generarXmlProfesor(route, profesores);
        ArchivoUtils.escribir(route,contenido, rootPane);
    }//GEN-LAST:event_jButtonShowProfesores2ActionPerformed

    private void jButtonShowProfesores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowProfesores3ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        String contenido = ArchivoUtils.generarCsvProfesor(route, profesores);
        ArchivoUtils.escribir(route, contenido, rootPane);
    }//GEN-LAST:event_jButtonShowProfesores3ActionPerformed

    private void jButtonShowAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAlumnos1ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        ArchivoUtils.leerXMLAlumno(route, alumnos, rootPane);
    }//GEN-LAST:event_jButtonShowAlumnos1ActionPerformed

    private void jButtonShowAlumnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAlumnos2ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        String contenido = ArchivoUtils.generarXmlAlumno(route, alumnos);
        ArchivoUtils.escribir(route, contenido, rootPane);
    }//GEN-LAST:event_jButtonShowAlumnos2ActionPerformed

    private void jButtonShowAlumnos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAlumnos3ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        String contenido = ArchivoUtils.generarCsvAlumnos(route, alumnos);
        ArchivoUtils.escribir(route, contenido, rootPane);
    }//GEN-LAST:event_jButtonShowAlumnos3ActionPerformed

    private void jButtonShowCursos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCursos2ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        ArchivoUtils.leerJsonCurso(route, cursos, profesores);
        JOptionPane.showMessageDialog(this, "Archivo cargado exitosamente.");
    }//GEN-LAST:event_jButtonShowCursos2ActionPerformed

    private void jButtonShowCursos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCursos3ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        ArchivoUtils.escribirJsonCursos(route, cursos, rootPane);
    }//GEN-LAST:event_jButtonShowCursos3ActionPerformed

    private void jButtonShowCursos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCursos4ActionPerformed
        String route = ArchivoUtils.getDirectorio();
        ArchivoUtils.leerAsignacionMasivaCursos(route, alumnos, cursos, rootPane);
    }//GEN-LAST:event_jButtonShowCursos4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddAlumno;
    private javax.swing.JButton jButtonAddCurso;
    private javax.swing.JButton jButtonAddProfesor;
    private javax.swing.JButton jButtonShowAlumnos;
    private javax.swing.JButton jButtonShowAlumnos1;
    private javax.swing.JButton jButtonShowAlumnos2;
    private javax.swing.JButton jButtonShowAlumnos3;
    private javax.swing.JButton jButtonShowCursos;
    private javax.swing.JButton jButtonShowCursos1;
    private javax.swing.JButton jButtonShowCursos2;
    private javax.swing.JButton jButtonShowCursos3;
    private javax.swing.JButton jButtonShowCursos4;
    private javax.swing.JButton jButtonShowProfesores;
    private javax.swing.JButton jButtonShowProfesores1;
    private javax.swing.JButton jButtonShowProfesores2;
    private javax.swing.JButton jButtonShowProfesores3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
