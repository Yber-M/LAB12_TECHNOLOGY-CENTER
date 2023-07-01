package app.cursos.techcenter.view;

import app.cursos.techcenter.controller.TechCenterController;
import app.cursos.techcenter.model.Alumno;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActAlumnoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActAlumnoView
     */
    public ActAlumnoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNomAlumno = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccionAlumno = new javax.swing.JTextField();
        btnConsultarAlumno = new javax.swing.JButton();
        txtIdAlumno = new javax.swing.JTextField();
        btnActAlumno = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("MODIFICAR ALUMNOS");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txtNomAlumno.setBackground(new java.awt.Color(255, 255, 255));
        txtNomAlumno.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNomAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nom. Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        txtDireccionAlumno.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionAlumno.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtDireccionAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        btnConsultarAlumno.setBackground(new java.awt.Color(153, 255, 153));
        btnConsultarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultarAlumno.setText("CONSULTAR ALUMNO");
        btnConsultarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlumnoActionPerformed(evt);
            }
        });

        txtIdAlumno.setBackground(new java.awt.Color(255, 255, 255));
        txtIdAlumno.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID de alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        btnActAlumno.setBackground(new java.awt.Color(153, 255, 153));
        btnActAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnActAlumno.setText("ACTUALIZAR ALUMNO");
        btnActAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActAlumnoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtNomAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnConsultarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlumnoActionPerformed
        try {
            TechCenterController control = new TechCenterController();

            //Seteando datos alumno
            txtEmail.setText(control.buscarAlu(Integer.parseInt(txtIdAlumno.getText())).getEmail());
            txtNomAlumno.setText(control.buscarAlu(Integer.parseInt(txtIdAlumno.getText())).getNombre());
            txtTelefono.setText(control.buscarAlu(Integer.parseInt(txtIdAlumno.getText())).getTelefono());
            txtDireccionAlumno.setText(control.buscarAlu(Integer.parseInt(txtIdAlumno.getText())).getDireccion());

        } catch (SQLException ex) {
            Logger.getLogger(RegMatriculasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarAlumnoActionPerformed

    private void btnActAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActAlumnoActionPerformed
        try {
            // Obtener los datos ingresados por el usuario
            int idAlumno = Integer.parseInt(txtIdAlumno.getText());
            String nombreAlumno = txtNomAlumno.getText();
            String direccionAlumno = txtDireccionAlumno.getText();
            String telefonoAlumno = txtTelefono.getText();
            String emailAlumno = txtEmail.getText();

            // Crear un objeto Alumno con los datos recopilados
            Alumno alumno = new Alumno(idAlumno, nombreAlumno, direccionAlumno, telefonoAlumno, emailAlumno);

            // Llamar al método ActAlumno para actualizar los datos del alumno
            TechCenterController control = new TechCenterController();
            Alumno alumnoActualizado = control.ActAlumno(alumno);

            // Verificar si la actualización fue exitosa y mostrar un mensaje
            if (alumnoActualizado != null) {
                JOptionPane.showMessageDialog(this, "Datos del alumno actualizados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el alumno.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el formato de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ActAlumnoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActAlumnoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActAlumno;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarAlumno;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JTextField txtDireccionAlumno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNomAlumno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
