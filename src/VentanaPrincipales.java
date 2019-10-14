

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

 
public class VentanaPrincipales extends javax.swing.JFrame {
     String usuario=null;
    Administrador a=new Administrador();
    
    public VentanaPrincipales(Administrador s) {
        initComponents();
        a=s;
    }

    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        comboUsuario = new javax.swing.JComboBox();
        Usuario = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JPasswordField();
        botonCancelar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        campoMensaje= new javax.swing.JLabel() ;
        nombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccion de Usuario");

        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("TipoDeUsuario"));

        comboUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Docente", "Estudiante" }));
        comboUsuario.addActionListener(new VistaListener());
        
        Usuario.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        Usuario.setText("Usuario:");

        contrasena.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        contrasena.setText("Contraseña:");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Login:");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(botonIngresar)
                .addGap(58, 58, 58)
                .addComponent(botonCancelar)
                .addGap(72, 72, 72))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contrasena)
                    .addComponent(Usuario)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreUsuario)
                    .addComponent(campoContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(comboUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario))
                .addGap(32, 32, 32)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contrasena)
                            .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresar)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    
    class VistaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox src = (JComboBox)e.getSource();
            usuario=src.getSelectedItem().toString();
        }
    }

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                              
       // new ventanaDocente().setVisible(true);
        //this.dispose();// TODO add your handling code here:
        
        
        if (usuario.compareToIgnoreCase("Administrador") == 0 ) 
          //validar();
             new ventanaDocente().setVisible(true);
           
        if(usuario.compareToIgnoreCase("Docente") == 0 && a.validarDocente(nombreUsuario.getText(),campoContrasena.getText()))
          //if(a.validarContr(campoContrasena.getText()))
            new ventanaDocente().setVisible(true);
        if(usuario.compareToIgnoreCase("Estudiante") == 0)
           
           new panelEvaluacionEstudiante().setVisible(true);
          
    }                                             

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.dispose();        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Administrador a=new Administrador();
              a.crearDocente("david","rajem","david12");
              a.crearDocente("mija","z","mija31");
              new VentanaPrincipales(a).setVisible(true); 
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JLabel campoMensaje;
    private javax.swing.JComboBox comboUsuario;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration
}
