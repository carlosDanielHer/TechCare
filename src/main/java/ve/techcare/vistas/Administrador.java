package ve.techcare.vistas;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Carlos Hernandez
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        fechaFooter();
        fechaActal();
        horaActual();
        setIcon();
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
        bienvenido_lb = new javax.swing.JLabel();
        horaActual_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();
        fechaActual_lb = new javax.swing.JLabel();
        gestionUsuarios_btt = new javax.swing.JButton();
        registrarUsuario_btt = new javax.swing.JButton();
        capturista_btt = new javax.swing.JButton();
        tecnico_btt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 665));

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 665));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("TechCare: Panel de Administracion");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 420, 40));

        bienvenido_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bienvenido_lb.setForeground(new java.awt.Color(0, 0, 0));
        bienvenido_lb.setText("Bienvenido: ");
        panelFondo.add(bienvenido_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, -1));

        horaActual_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        horaActual_lb.setForeground(new java.awt.Color(0, 0, 0));
        horaActual_lb.setText("|");
        panelFondo.add(horaActual_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 110, -1));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 240, 20));

        fechaActual_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fechaActual_lb.setForeground(new java.awt.Color(0, 0, 0));
        fechaActual_lb.setText("Hoy es: ");
        panelFondo.add(fechaActual_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 150, -1));

        gestionUsuarios_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        gestionUsuarios_btt.setForeground(new java.awt.Color(0, 0, 0));
        gestionUsuarios_btt.setText("GESTIONAR USUARIOS");
        gestionUsuarios_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionUsuarios_bttActionPerformed(evt);
            }
        });
        panelFondo.add(gestionUsuarios_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 240, 110));

        registrarUsuario_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        registrarUsuario_btt.setForeground(new java.awt.Color(0, 0, 0));
        registrarUsuario_btt.setText("REGISTRAR USUARIOS");
        registrarUsuario_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuario_bttActionPerformed(evt);
            }
        });
        panelFondo.add(registrarUsuario_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, 110));

        capturista_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        capturista_btt.setForeground(new java.awt.Color(0, 0, 0));
        capturista_btt.setText("VISTA CAPTURISTA");
        capturista_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturista_bttActionPerformed(evt);
            }
        });
        panelFondo.add(capturista_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 240, 110));

        tecnico_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tecnico_btt.setForeground(new java.awt.Color(0, 0, 0));
        tecnico_btt.setText("VISTA TECNICO");
        tecnico_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnico_bttActionPerformed(evt);
            }
        });
        panelFondo.add(tecnico_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 240, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuario_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuario_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarUsuario_bttActionPerformed

    private void gestionUsuarios_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionUsuarios_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionUsuarios_bttActionPerformed

    private void tecnico_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnico_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tecnico_bttActionPerformed

    private void capturista_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturista_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capturista_bttActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido_lb;
    private javax.swing.JButton capturista_btt;
    private javax.swing.JLabel fechaActual_lb;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JButton gestionUsuarios_btt;
    private javax.swing.JLabel horaActual_lb;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JButton registrarUsuario_btt;
    private javax.swing.JButton tecnico_btt;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

    private void fechaFooter() {
        LocalDateTime fechaHora = LocalDateTime.now();
        int year = fechaHora.getYear();
        String fechaFormateada = String.valueOf(year);

        footer_lb.setText("TechCare® System " + fechaFormateada);
    }

    private void fechaActal() {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fechaHora.format(formato);
        fechaActual_lb.setText("Hoy es: " + fechaFormateada);
    }

    private void horaActual() {

        Timer horaActual = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horaActual_lb.setText("| " + new SimpleDateFormat("hh:mm:ss").format(new Date()));
            }
        });
        horaActual.setRepeats(true);
        horaActual.setCoalesce(true);
        horaActual.setInitialDelay(0);
        horaActual.start();

    }

    private void setIcon() {
        try {
            BufferedImage originalImage = ImageIO.read(getClass().getResource("/imagenes/icono.png"));
            Image scaledImage = originalImage.getScaledInstance(27, 27, Image.SCALE_SMOOTH); // Cambia el tamaño según tus necesidades
            this.setIconImage(scaledImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
