/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyam;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class RegistroHorario extends javax.swing.JFrame {

    DefaultTableModel model;
    /**
     * Creates new form RegistroHorario
     */
    public RegistroHorario() {
        initComponents();
        //cargar("");
    }

    public void cargar(String valor){
       
    String mostrar="SELECT * FROM Horarios WHERE Num_Control='"+tf_numeroControl.getText()+"'";
    String []titulos={ "COD","Num.Control","Día","Aula","HoraInicio","HoraTérmino","Materia","Carrera"};
    String []Registros=new String[8];
    model = new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("COD");
                  Registros[1]= rs.getString("Num_Control");
                  Registros[2]= rs.getString("Día");
                  Registros[3]= rs.getString("Num_Aula");
                  Registros[4]= rs.getString("Hora_Inicio");
                  Registros[5]= rs.getString("Hora_Término");
                  Registros[6]= rs.getString("Materia");
                  Registros[7]= rs.getString("Carrera");
                  
                  model.addRow(Registros);
              }
              tb_horario.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_numeroControl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_apePat = new javax.swing.JTextField();
        tf_apeMat = new javax.swing.JTextField();
        cb_dia = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_aula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        tf_horaInicio = new javax.swing.JTextField();
        tf_horaTermino = new javax.swing.JTextField();
        tf_materia = new javax.swing.JTextField();
        tf_codigo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_carrera = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_horario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fn_blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1000, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.itescham.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 240, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG-20200507-WA0068.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fn_blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 90));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setText("REGISTRO DE HORARIOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel8.setText("Numero de control");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(tf_numeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, 30));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel9.setText("Nombre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        tf_nombre.setName(""); // NOI18N
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 30));
        getContentPane().add(tf_apePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 90, -1));
        getContentPane().add(tf_apeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 100, -1));

        cb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        getContentPane().add(cb_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 110, 30));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel10.setText("Día");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel11.setText("Hora inicial");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel16.setText("Num.Aula");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));
        getContentPane().add(tf_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, -1));

        btn_buscar.setBackground(new java.awt.Color(153, 255, 153));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 50, 30));
        getContentPane().add(tf_horaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 70, -1));
        getContentPane().add(tf_horaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 70, -1));
        getContentPane().add(tf_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 280, -1));
        getContentPane().add(tf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel13.setText("Carrera");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel12.setText("Materia");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel15.setText("Codigo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel14.setText("Hora término");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        cb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ing. Ambiental", "Ing. en Administración", "Ing. en Electromecánica", "Ing. en Gestión Empresarial", "Ing. en Logística", "Ing. en Sistemas Computacionales", "Lic. en Turismo" }));
        getContentPane().add(cb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 280, 30));

        btn_guardar.setBackground(new java.awt.Color(153, 255, 153));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 70, 50));

        btn_editar.setBackground(new java.awt.Color(153, 255, 153));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 70, 50));

        btn_actualizar.setBackground(new java.awt.Color(153, 255, 153));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar_1.png"))); // NOI18N
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 50));

        btn_eliminar.setBackground(new java.awt.Color(153, 255, 153));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar_1.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 70, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 370));

        tb_horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_horario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 560, 350));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_azul.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 540));
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String mostrar = "SELECT Nombre,Apellido_Paterno,Apellido_Materno FROM Registros WHERE Num_Control='"+tf_numeroControl.getText()+"'" ;
        try {
                  Statement st = cn.createStatement();
                  ResultSet rs = st.executeQuery(mostrar);
                  while(rs.next())
                  {
                      tf_nombre.setText(rs.getString("Nombre"));
                      tf_apePat.setText(rs.getString("Apellido_Paterno"));
                      tf_apeMat.setText(rs.getString("Apellido_Materno"));
                  }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargar("");        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String Cod,numControl,dia,aula,horaInicio,horaTermino,materia,carrera;
        String sql = "";
        
        Cod = tf_codigo.getText();
        numControl = tf_numeroControl.getText();
        dia = (String)cb_dia.getSelectedItem();
        aula = tf_aula.getText();
        horaInicio = tf_horaInicio.getText();
        horaTermino = tf_horaTermino.getText();
        materia = tf_materia.getText();
        carrera = (String)cb_carrera.getSelectedItem();
    
        sql = "INSERT INTO Horarios(COD,Num_Control,Día,Num_Aula,Hora_Inicio,Hora_Término,Materia,Carrera) VALUES (?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement pst  = cn.prepareStatement(sql);
                pst.setString(1, Cod);
                pst.setString(2, numControl);
                pst.setString(3, dia);
                pst.setString(4, aula);
                pst.setString(5, horaInicio);
                pst.setString(6, horaTermino);
                pst.setString(7, materia);
                pst.setString(8, carrera);            

                int n = pst.executeUpdate();
                if(n > 0){
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargar("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int filamodificar= tb_horario.getSelectedRow();
        if(filamodificar>=0)
        {
            //HAY QUE OBTENER LOS COMBOBOX
            cod.setText(tb_horario.getValueAt(filamodificar, 0).toString());
            tf_codigo.setText(tb_horario.getValueAt(filamodificar, 0).toString());
            //dia
            tf_aula.setText(tb_horario.getValueAt(filamodificar, 3).toString());
            tf_horaInicio.setText(tb_horario.getValueAt(filamodificar, 4).toString());
            tf_horaTermino.setText(tb_horario.getValueAt(filamodificar, 5).toString());
            tf_materia.setText(tb_horario.getValueAt(filamodificar, 6).toString());
            //carrera
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No ha seleccionado ");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Horarios SET Num_Control='"
                    +tf_numeroControl.getText()+ "',Día='"
                    +cb_dia.getSelectedItem()+ "',Num_Aula='"
                    +tf_aula.getText()+ "',Hora_Inicio='"
                    +tf_horaInicio.getText()+ "',Hora_Término='"
                    +tf_horaTermino.getText()+ "',Materia='"
                    +tf_materia.getText()+ "',Carrera='"
                    +cb_carrera.getSelectedItem()+  "' WHERE COD='"+cod.getText()+"'");
            pst.executeUpdate();
            cargar("");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tb_horario.getSelectedRow();
        String cod="";
        cod = tb_horario.getValueAt(fila, 0).toString();
        if(fila>=0)
        {
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM Horarios WHERE COD='"+cod+"'");
                pst.executeUpdate();
                cargar("");
            } catch (SQLException ex) {
                Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No ha selecionado ninguna fila");
        } 
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cb_carrera;
    private javax.swing.JComboBox<String> cb_dia;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_horario;
    private javax.swing.JTextField tf_apeMat;
    private javax.swing.JTextField tf_apePat;
    private javax.swing.JTextField tf_aula;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_horaInicio;
    private javax.swing.JTextField tf_horaTermino;
    private javax.swing.JTextField tf_materia;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_numeroControl;
    // End of variables declaration//GEN-END:variables

    Conexion cc = new Conexion();
    Connection cn= cc.getConnection();
}
