package ve.techcare.vistas;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ve.techcare.servicios.utilidades.ConexionBaseDatos;

/**
 *
 * @author Carlos Hernandez
 */
public class GestionClientes extends javax.swing.JFrame implements Observador {

    public static int idCliente;

    public GestionClientes() {
        initComponents();
        this.setLocationRelativeTo(null);

        llenarTabla();
        hacerCliqueableTabla();
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
        footer_lb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 655));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Gestion de Clientes Registrados");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 370, 40));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 240, 20));

        listaClientes_tbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        listaClientes_tbl.setForeground(new java.awt.Color(0, 0, 0));
        listaClientes_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nro", "Nombre", "DNI", "Correo", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaClientes_tbl.setRowHeight(28);
        jScrollPane1.setViewportView(listaClientes_tbl);
        if (listaClientes_tbl.getColumnModel().getColumnCount() > 0) {
            listaClientes_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaClientes_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaClientes_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaClientes_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaClientes_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 940, 440));

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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel footer_lb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaClientes_tbl;
    private javax.swing.JPanel panelFondo;
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

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) listaClientes_tbl.getModel();
        modelo.setRowCount(0);

        try (Connection conexion = ConexionBaseDatos.conectar(); PreparedStatement ps = conexion.prepareStatement(
                "SELECT id, full_name, dni, email, phone FROM clients"); ResultSet rs = ps.executeQuery();) {

            ResultSetMetaData metaData = rs.getMetaData();
            int cantidadDeColumnas = metaData.getColumnCount();

            while (rs.next()) {
                Object[] filas = new Object[cantidadDeColumnas];

                for (int i = 0; i < cantidadDeColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);

                listaClientes_tbl.setModel(modelo);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar tabla: en GestionEquipos, contacte al desarrollador");

        }
    }

    private void hacerCliqueableTabla() {

        listaClientes_tbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila = listaClientes_tbl.rowAtPoint(e.getPoint());
                int columna = 0;

                if (fila > -1) {
                    idCliente = (int) listaClientes_tbl.getModel().getValueAt(fila, columna);
                    mostrarVentanaInformacionCliente();
                }
            }
        });
    }

    @Override
    public void actualizar() {
        llenarTabla();
    }

    private void mostrarVentanaInformacionCliente() {
        Subject subject = new Subject();
        subject.addObserver(this);
        InformacionCliente informacionCliente = new InformacionCliente(subject);
        informacionCliente.setVisible(true);
    }
}
