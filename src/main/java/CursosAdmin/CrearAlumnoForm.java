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
public class CrearAlumnoForm extends javax.swing.JFrame {
    public ArrayList<Alumno> alumnos = new ArrayList<>();
    public Alumno editarAlumno;
    public Integer index = null;
    /**
     * Creates new form CrearAlumnoForm
     */
    public CrearAlumnoForm(ArrayList<Alumno> alumnos) {
        initComponents();
        this.alumnos = alumnos;
    }

    public CrearAlumnoForm(ArrayList<Alumno> alumnos, int index) {
        initComponents();
        this.alumnos = alumnos;
        this.index = index;
        this.jButtonCrear.setText("editar");
        this.jLabel1.setText("Editar alumno");
        this.alumnos = alumnos;
        this.jTextUsuario.setEditable(false);
        this.index = index;
        this.editarAlumno = this.alumnos.get(this.index);
        jTextNombre.setText(this.editarAlumno.nombre);
        jTextApellido.setText(this.editarAlumno.apellido);
        jTextPassword.setText(this.editarAlumno.password);
        jTextUsuario.setText(Integer.toString(this.editarAlumno.carnet));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPassword = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });

        jButtonCrear.setText("Crear ");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Crear Alumno");

        jLabel2.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Carnet");

        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido");

        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefono");

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String password = jTextPassword.getText();
        String telefono = jTextTelefono.getText();
        int carnet = Integer.parseInt(jTextUsuario.getText());
        System.out.println(this.index);
        if(this.index != null) {
            this.editarAlumno.nombre = nombre;
            this.editarAlumno.apellido = apellido;
            this.editarAlumno.password = password;
            this.editarAlumno.telefono = telefono;
            JOptionPane.showMessageDialog(this, "Alumno editado correctamente");
        } else {
            Alumno nuevoAlumno = new Alumno(carnet, nombre, apellido, password,telefono);
            this.alumnos.add(nuevoAlumno);
            jTextNombre.setText("");
            jTextApellido.setText("");
            jTextPassword.setText("");
            jTextUsuario.setText("");
            JOptionPane.showMessageDialog(this, "Alumno agregado correctamente");
        }
        this.dispose();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
