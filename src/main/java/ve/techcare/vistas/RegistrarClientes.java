package ve.techcare.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import ve.techcare.servicios.utilidades.ConexionBaseDatos;

/**
 *
 * @author Carlos Hernandez
 */
public class RegistrarClientes extends javax.swing.JFrame {

    private String usuario;

    public RegistrarClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        usuario = Login.usuario;
        setIcon();
        fechaFooter();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        titulo_lb = new javax.swing.JLabel();
        nombreCompleto_lb = new javax.swing.JLabel();
        dni_lb = new javax.swing.JLabel();
        correo_lb = new javax.swing.JLabel();
        telefono_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JTextField();
        dni_txt = new javax.swing.JTextField();
        correo_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        registrar_btt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 665));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Registro Nuevo Cliente");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 290, 40));

        nombreCompleto_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreCompleto_lb.setForeground(new java.awt.Color(0, 0, 0));
        nombreCompleto_lb.setText("Nombre Completo");
        panelFondo.add(nombreCompleto_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        dni_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dni_lb.setForeground(new java.awt.Color(0, 0, 0));
        dni_lb.setText("DNI (Cedula, Identificacion Nacional)");
        panelFondo.add(dni_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        correo_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correo_lb.setForeground(new java.awt.Color(0, 0, 0));
        correo_lb.setText("Correo Electronico");
        panelFondo.add(correo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        telefono_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefono_lb.setForeground(new java.awt.Color(0, 0, 0));
        telefono_lb.setText("Número de Telefono");
        panelFondo.add(telefono_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 240, 20));

        nombreCompleto_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(nombreCompleto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 370, 60));

        dni_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(dni_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 370, 60));

        correo_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(correo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 370, 60));

        telefono_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(telefono_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 370, 60));

        registrar_btt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        registrar_btt.setForeground(new java.awt.Color(0, 0, 0));
        registrar_btt.setText("Registrar");
        registrar_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_bttActionPerformed(evt);
            }
        });
        panelFondo.add(registrar_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 240, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_bttActionPerformed
        registrarClientes();
    }//GEN-LAST:event_registrar_bttActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correo_lb;
    private javax.swing.JTextField correo_txt;
    private javax.swing.JLabel dni_lb;
    private javax.swing.JTextField dni_txt;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JLabel nombreCompleto_lb;
    private javax.swing.JTextField nombreCompleto_txt;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton registrar_btt;
    private javax.swing.JLabel telefono_lb;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        try {
            BufferedImage originalImage = ImageIO.read(getClass().getResource("/imagenes/icono.png"));
            Image scaledImage = originalImage.getScaledInstance(27, 27, Image.SCALE_SMOOTH); // Cambia el tamaño según tus necesidades
            this.setIconImage(scaledImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fechaFooter() {
        LocalDateTime fechaHora = LocalDateTime.now();
        int year = fechaHora.getYear();
        String fechaFormateada = String.valueOf(year);

        footer_lb.setText("TechCare® System " + fechaFormateada);
    }

    private void registrarClientes() {
        String nombre = nombreCompleto_txt.getText().trim(),
                dni = dni_txt.getText().trim(),
                correo = correo_txt.getText().trim(),
                telefono = telefono_txt.getText().trim();

        String sql1 = "SELECT id FROM users WHERE username=?",
                sql2 = "INSERT INTO clients (full_name, dni, email, phone, modified)VALUES(?,?,?,?,?)";

        int idUsuario = 0;

        if (!nombre.isEmpty() && !dni.isEmpty() && !correo.isEmpty() && !telefono.isEmpty() && usuario != null) {

            try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps1 = con.prepareStatement(sql1); PreparedStatement ps2 = con.prepareStatement(sql2)) {

                ps1.setString(1, usuario);

                ResultSet rs1 = ps1.executeQuery();

                if (rs1.next()) {
                    idUsuario = rs1.getInt("id");
                }

                ps2.setString(1, nombre);
                ps2.setString(2, dni);
                ps2.setString(3, correo);
                ps2.setString(4, telefono);
                ps2.setInt(5, idUsuario);

                int respuesta = ps2.executeUpdate();

                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Registrado exitosamente");
                    
                    nombreCompleto_txt.setText("");
                    dni_txt.setText("");
                    correo_txt.setText("");
                    telefono_txt.setText("");
                    
                    nombreCompleto_lb.setForeground(new Color(0,0,0));
                    dni_lb.setForeground(new Color(0,0,0));
                    correo_lb.setForeground(new Color(0,0,0));
                    telefono_lb.setForeground(new Color(0,0,0));
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en registrar Cliente");
            }

        } else {
            nombreCompleto_lb.setForeground(new Color(148, 23, 25));
            dni_lb.setForeground(new Color(148, 23, 25));
            correo_lb.setForeground(new Color(148, 23, 25));
            telefono_lb.setForeground(new Color(148, 23, 25));

            JOptionPane.showMessageDialog(null, "Ingrese todos los datos requeridos");
        }
    }
}
