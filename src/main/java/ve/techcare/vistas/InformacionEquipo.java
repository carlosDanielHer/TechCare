package ve.techcare.vistas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import ve.techcare.servicios.utilidades.ConexionBaseDatos;

/**
 *
 * @author Carlos Hernandez
 */
public class InformacionEquipo extends javax.swing.JFrame {

    /**
     * Creates new form InformacionEquipo
     */
    private int id;
    private String username;
    private Subject subject;

    public InformacionEquipo() {
        initComponents();

        username = Login.usuario;
        this.id = GestionEquipos.id;
        dañosReportados_txa.setLineWrap(true);
        comentariosTecnicos_txa.setLineWrap(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        setIcon();
        fechaFooter();
        llenarCombobox();
        llenarInformacion();
    }

    public InformacionEquipo(Subject subject) {
        initComponents();

        username = Login.usuario;
        this.id = GestionEquipos.id;
        dañosReportados_txa.setLineWrap(true);
        comentariosTecnicos_txa.setLineWrap(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.subject = subject;

        setIcon();
        fechaFooter();
        llenarCombobox();
        llenarInformacion();
    }

    /**
     * Constructor que inicializa con el id del equipo.
     *
     * @param id El id del equipo seleccionado en la tabla.
     * @param subject
     *
     */
    public InformacionEquipo(int id, Subject subject) {
        initComponents();
        username = Login.usuario;

        this.id = id;
        dañosReportados_txa.setLineWrap(true);
        comentariosTecnicos_txa.setLineWrap(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.subject = subject;

        setIcon();
        fechaFooter();
        llenarCombobox();
        llenarInformacion();
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
        cliente_lb = new javax.swing.JLabel();
        cliente_txt = new javax.swing.JTextField();
        marcas_cbx = new javax.swing.JComboBox<>();
        marca_lb = new javax.swing.JLabel();
        tipoEquipos_cbx = new javax.swing.JComboBox<>();
        tipoEquipos_lb = new javax.swing.JLabel();
        modelo_lb = new javax.swing.JLabel();
        modelo_txt = new javax.swing.JTextField();
        numeroSerie_lb = new javax.swing.JLabel();
        numeroSerie_txt = new javax.swing.JTextField();
        ultimoModificar_lb = new javax.swing.JLabel();
        ultimoModificar_txt = new javax.swing.JTextField();
        fechaIngreso_lb = new javax.swing.JLabel();
        fechaIngreso_txt = new javax.swing.JTextField();
        ultimaModificacion_lb = new javax.swing.JLabel();
        ultimaModification_txt = new javax.swing.JTextField();
        estatus_lb = new javax.swing.JLabel();
        estatus_cbx = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentariosTecnicos_txa = new javax.swing.JTextArea();
        dañosReportados_lb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dañosReportados_txa = new javax.swing.JTextArea();
        comentariosTecnicos_lb = new javax.swing.JLabel();
        actualizar_btt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 665));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Informacion del Equipo");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 280, 40));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 240, 20));

        cliente_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cliente_lb.setForeground(new java.awt.Color(0, 0, 0));
        cliente_lb.setText("Cliente");
        panelFondo.add(cliente_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        cliente_txt.setEditable(false);
        cliente_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(cliente_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 370, 60));

        marcas_cbx.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marcas_cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        panelFondo.add(marcas_cbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 370, 60));

        marca_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marca_lb.setForeground(new java.awt.Color(0, 0, 0));
        marca_lb.setText("Marcas");
        panelFondo.add(marca_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        tipoEquipos_cbx.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tipoEquipos_cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        panelFondo.add(tipoEquipos_cbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 370, 60));

        tipoEquipos_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipoEquipos_lb.setForeground(new java.awt.Color(0, 0, 0));
        tipoEquipos_lb.setText("Tipo de Equipos");
        panelFondo.add(tipoEquipos_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        modelo_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modelo_lb.setForeground(new java.awt.Color(0, 0, 0));
        modelo_lb.setText("Modelo");
        panelFondo.add(modelo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        modelo_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(modelo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 370, 60));

        numeroSerie_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroSerie_lb.setForeground(new java.awt.Color(0, 0, 0));
        numeroSerie_lb.setText("Numero de Serie");
        panelFondo.add(numeroSerie_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        numeroSerie_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(numeroSerie_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 370, 60));

        ultimoModificar_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ultimoModificar_lb.setForeground(new java.awt.Color(0, 0, 0));
        ultimoModificar_lb.setText("Ultimo en modificar");
        panelFondo.add(ultimoModificar_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        ultimoModificar_txt.setEditable(false);
        ultimoModificar_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(ultimoModificar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 370, 60));

        fechaIngreso_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaIngreso_lb.setForeground(new java.awt.Color(0, 0, 0));
        fechaIngreso_lb.setText("Fecha de Ingreso");
        panelFondo.add(fechaIngreso_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        fechaIngreso_txt.setEditable(false);
        fechaIngreso_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(fechaIngreso_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 370, 40));

        ultimaModificacion_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ultimaModificacion_lb.setForeground(new java.awt.Color(0, 0, 0));
        ultimaModificacion_lb.setText("Ultima Modificacion");
        panelFondo.add(ultimaModificacion_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        ultimaModification_txt.setEditable(false);
        ultimaModification_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(ultimaModification_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 370, 40));

        estatus_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estatus_lb.setForeground(new java.awt.Color(0, 0, 0));
        estatus_lb.setText("Estatus");
        panelFondo.add(estatus_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        estatus_cbx.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        estatus_cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Nuevo Ingreso", "En Revision", "Reparado", "No Reparado", "Entregado" }));
        panelFondo.add(estatus_cbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 370, 40));

        comentariosTecnicos_txa.setColumns(20);
        comentariosTecnicos_txa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        comentariosTecnicos_txa.setRows(5);
        jScrollPane1.setViewportView(comentariosTecnicos_txa);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 370, 110));

        dañosReportados_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dañosReportados_lb.setForeground(new java.awt.Color(0, 0, 0));
        dañosReportados_lb.setText("Daños Reportados");
        panelFondo.add(dañosReportados_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        dañosReportados_txa.setEditable(false);
        dañosReportados_txa.setColumns(20);
        dañosReportados_txa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        dañosReportados_txa.setRows(5);
        jScrollPane2.setViewportView(dañosReportados_txa);

        panelFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 370, 100));

        comentariosTecnicos_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comentariosTecnicos_lb.setForeground(new java.awt.Color(0, 0, 0));
        comentariosTecnicos_lb.setText("Comentarios Tecnicos");
        panelFondo.add(comentariosTecnicos_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        actualizar_btt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actualizar_btt.setForeground(new java.awt.Color(0, 0, 0));
        actualizar_btt.setText("ACTUALIZAR");
        actualizar_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_bttActionPerformed(evt);
            }
        });
        panelFondo.add(actualizar_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 170, 70));

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

    private void actualizar_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_bttActionPerformed
        actualizarEquipo();
    }//GEN-LAST:event_actualizar_bttActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btt;
    private javax.swing.JLabel cliente_lb;
    private javax.swing.JTextField cliente_txt;
    private javax.swing.JLabel comentariosTecnicos_lb;
    private javax.swing.JTextArea comentariosTecnicos_txa;
    private javax.swing.JLabel dañosReportados_lb;
    private javax.swing.JTextArea dañosReportados_txa;
    private javax.swing.JComboBox<String> estatus_cbx;
    private javax.swing.JLabel estatus_lb;
    private javax.swing.JLabel fechaIngreso_lb;
    private javax.swing.JTextField fechaIngreso_txt;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel marca_lb;
    private javax.swing.JComboBox<String> marcas_cbx;
    private javax.swing.JLabel modelo_lb;
    private javax.swing.JTextField modelo_txt;
    private javax.swing.JLabel numeroSerie_lb;
    private javax.swing.JTextField numeroSerie_txt;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JComboBox<String> tipoEquipos_cbx;
    private javax.swing.JLabel tipoEquipos_lb;
    private javax.swing.JLabel titulo_lb;
    private javax.swing.JLabel ultimaModificacion_lb;
    private javax.swing.JTextField ultimaModification_txt;
    private javax.swing.JLabel ultimoModificar_lb;
    private javax.swing.JTextField ultimoModificar_txt;
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

    private void llenarInformacion() {

        String sql = "SELECT e.id, "
                + "c.full_name, "
                + "t.name AS type_nane, "
                + "b.name AS brand_name, "
                + "e.model, "
                + "e.serial, "
                + "e.date_entry, "
                + "e.observations, "
                + "e.tecnical_observations, "
                + "e.status, "
                + "u.full_name AS user_name, "
                + "e.last_date_modified "
                + "FROM equipments e "
                + "INNER JOIN types t ON e.type = t.id "
                + "INNER JOIN clients c ON c.id = e.id_client "
                + "INNER JOIN brands b ON b.id = e.brand "
                + "INNER JOIN users u ON u.id = e.person_modified "
                + " WHERE e.id= ?";

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente_txt.setText(rs.getString("full_name"));
                tipoEquipos_cbx.setSelectedItem(rs.getString("type_nane"));
                marcas_cbx.setSelectedItem(rs.getString("brand_name"));
                modelo_txt.setText(rs.getString("model"));
                numeroSerie_txt.setText(rs.getString("serial"));
                ultimoModificar_txt.setText(rs.getString("user_name"));
                fechaIngreso_txt.setText(rs.getString("date_entry"));
                ultimaModification_txt.setText(rs.getString("last_date_modified"));
                estatus_cbx.setSelectedItem(rs.getString("status"));
                dañosReportados_txa.setText(rs.getString("observations"));
                comentariosTecnicos_txa.setText(rs.getString("tecnical_observations"));

            } else {
                JOptionPane.showMessageDialog(null, "Sin registros, Agregue al menos un equipo");
                this.dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en llenar informacion de los equipos, contacte el desarrolador");
        }
    }

    private void llenarCombobox() {
        String sql1 = "SELECT name FROM types";
        String sql2 = "SELECT name FROM brands";

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps1 = con.prepareStatement(
                sql1); PreparedStatement ps2 = con.prepareStatement(sql2)) {

            ResultSet rs1 = ps1.executeQuery();
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                marcas_cbx.addItem(rs2.getString("name"));

            }

            while (rs1.next()) {
                tipoEquipos_cbx.addItem(rs1.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("Error en llenar ComboBox (Panel ResgistroDeEquipos): " + e);
        }

    }

    private void actualizarEquipo() {
        int tipo = tipoEquipos_cbx.getSelectedIndex(),
                marca = marcas_cbx.getSelectedIndex();

        String modelo = modelo_txt.getText().trim(),
                serie = numeroSerie_txt.getText().trim(),
                ultimaModificacion = getFechaYHora(),
                estatus = (String) estatus_cbx.getSelectedItem(),
                comentariosTecnicos = comentariosTecnicos_txa.getText().trim();

        if (tipo != 0 && marca != 0 && !estatus.equals("Selecciona")) {

            try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps1 = con.prepareStatement("SELECT id FROM users WHERE username= ?"); PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE equipments SET type= ?, brand= ?, model=?, serial =?, tecnical_observations =?, status = ?,"
                    + " person_modified= ?, last_date_modified= ? WHERE id=?");) {

                ps1.setString(1, username);

                ResultSet rs = ps1.executeQuery();

                if (rs.next()) {

                    int idUsuario = rs.getInt("id");

                    ps2.setInt(1, tipo);
                    ps2.setInt(2, marca);
                    ps2.setString(3, modelo);
                    ps2.setString(4, serie);
                    ps2.setString(5, comentariosTecnicos);
                    ps2.setString(6, estatus);
                    ps2.setInt(7, idUsuario);
                    ps2.setString(8, ultimaModificacion);
                    ps2.setInt(9, id);

                    int respuesta = ps2.executeUpdate();

                    if (respuesta > 0) {
                        JOptionPane.showMessageDialog(null, "Actualizado exitosamente");
                        subject.notifyObservers();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ningun Usuario con este Nombre de Usuario");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar equipo, contacte al desarrollador");
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos requeridos");
        }
    }

    private String getFechaYHora() {
        String fechaHoraString = "";
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        fechaHoraString = fechaHora.format(formato);
        return fechaHoraString;
    }
}
