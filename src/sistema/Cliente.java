/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import clases.conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author berdo
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        user_password objusuario=new user_password();
        dbuser=objusuario.user;
        dbpassw=objusuario.password;
        System.out.println(dbuser + dbpassw);
    }

        String dbuser; //el nombre de usuario de mysql
        String dbpassw; //la contraseña de usuario de mysql
        Connection con;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDNI_C = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre_C = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido_C = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono_C = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsultaIndividual = new javax.swing.JButton();
        btnConsultaGeneral = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setText("Clientes");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeIcon.jpg"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        txtApellido_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido_CActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnConsultaIndividual.setText("Consulta individual");
        btnConsultaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaIndividualActionPerformed(evt);
            }
        });

        btnConsultaGeneral.setText("Consulta general");
        btnConsultaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaGeneralActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI_C, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnConsultaIndividual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(txtNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnModificar)
                        .addGap(17, 17, 17)
                        .addComponent(btnConsultaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellido_C, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtTelefono_C, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(btnVolver)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNI_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addComponent(btnConsultaIndividual))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificar)
                    .addComponent(btnConsultaGeneral))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtApellido_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnLimpiar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnVolver)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Main frmMain=new Main();
        frmMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        conexion conectar=new conexion();
        String sql;
        //insertar datos en la base de datos
        //se prepara la sentencia para insertar datos
        
        sql="INSERT INTO CLIENTE(DNI_C,NOMBRE_C,APELLIDO_C,TELEFONO_C)";
        sql+="VALUES(?,?,?,?)";
        int DNI_C=Integer.parseInt(txtDNI_C.getText());
        String NOMBRE_C=txtNombre_C.getText();
        String APELLIDO_C=txtApellido_C.getText();
        String TELEFONO_C=txtTelefono_C.getText();
        
            //codigo para la base de datos
        try{
                
                // se establece la conexiòn
              
                con=conectar.getConexion(dbuser, dbpassw);
                
                PreparedStatement pstm;
                pstm =(PreparedStatement)con.prepareStatement(sql);
                pstm.setInt(1,DNI_C);
                pstm.setString(2,NOMBRE_C);
                pstm.setString(3,APELLIDO_C);
                pstm.setString(4,TELEFONO_C);
                int rtdo=pstm.executeUpdate();
                if(rtdo==1)JOptionPane.showMessageDialog(this, "Registro almacenado correctamente");
                else throw new RuntimeException("no se almaceno el registro");
                
                 con.close();
        
        }catch(RuntimeException| SQLException e){
         JOptionPane.showMessageDialog(this, "Conexion fallida");
         throw new RuntimeException(e);
                 
                 
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String sql;
        conexion conectar=new conexion();

        int DNI_C=Integer.parseInt(txtDNI_C.getText());
        String NOMBRE_C=txtNombre_C.getText();
        String APELLIDO_C=txtApellido_C.getText();
        String TELEFONO_C=txtTelefono_C.getText();
        
        //Proceso

        sql="UPDATE CLIENTE SET DNI_C="+DNI_C+", NOMBRE_C='"+NOMBRE_C+"',APELLIDOS_C='"+APELLIDO_C
             +"', TELEFONO_C='"+TELEFONO_C+"' WHERE DNI_C="+DNI_C;
             
        
        System.out.println(sql);
            //codigo para la base de datos
        try{
                
                con=conectar.getConexion(dbuser, dbpassw);
                PreparedStatement pstm;
                pstm =(PreparedStatement)con.prepareStatement(sql);
                int rtdo=pstm.executeUpdate();
                if(rtdo==1)JOptionPane.showMessageDialog(this, "Registro MODIFICADO correctamente");
                else throw new RuntimeException("no se MODIFICO el registro");
                
                con.close();
                
                }catch(RuntimeException| SQLException e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(this, "Conexion fallida");
                 throw new RuntimeException(e);
            }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conexion conectar=new conexion();
  
        try {
            con=conectar.getConexion(dbuser, dbpassw);

             int id=Integer.parseInt(JOptionPane.showInputDialog
              (this,"Ingrese el DNI del cliente a ELIMINAR "));
             
            Statement statement = con.createStatement();
            String sql=("DELETE FROM CLIENTE WHERE DNI_C="+id);
            PreparedStatement pstm;
            pstm =(PreparedStatement)con.prepareStatement(sql);
            int rtdo=pstm.executeUpdate();
            if(rtdo==1)JOptionPane.showMessageDialog(this, "Registro ELIMINADO correctamente");
            else throw new RuntimeException("no se ELIMINO el registro");
             
            statement.close();
            con.close();

        }   catch(RuntimeException| SQLException e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(this, "Conexion fallida");
                 throw new RuntimeException(e);
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultaIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaIndividualActionPerformed
        String sql;
        conexion conectar=new conexion();
        int DNI_C;
        
        try {
            con=conectar.getConexion(dbuser, dbpassw);

            DNI_C=Integer.parseInt(JOptionPane.showInputDialog
              (this,"Ingrese el DNI del cliente a consultar "));

            Statement statement = con.createStatement();
            sql=("SELECT * FROM CLIENTE WHERE DNI_C="+DNI_C);
            ResultSet rs = statement.executeQuery(sql);
              //System.out.println("hola" + rs);
            int i=0;
            while (rs.next()) {   
                int DNI = rs.getInt("DNI_C");
                Tabla.setValueAt(DNI, i, 0);
                txtDNI_C.setText(DNI+"");
                String NOMBRE_C= rs.getString("NOMBRE_C");
                Tabla.setValueAt(NOMBRE_C, i, 1);
                txtNombre_C.setText(NOMBRE_C);
                String APELLIDO_C= rs.getString("APELLIDO_C");
                Tabla.setValueAt(APELLIDO_C, i, 2);
                txtApellido_C.setText(APELLIDO_C);
                String TELEFONO_C= rs.getString("TELEFONO_C");
                Tabla.setValueAt(TELEFONO_C, i, 3);
                txtTelefono_C.setText(TELEFONO_C);
                ++i;
                
            }

            rs.close();
            statement.close();
            con.close();

        }     catch(RuntimeException| SQLException e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(this, "Conexion fallida");
                 throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnConsultaIndividualActionPerformed

    private void btnConsultaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaGeneralActionPerformed
        conexion conectar=new conexion();

        try {
            con=conectar.getConexion(dbuser, dbpassw);

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM CLIENTE");
            
            int i=0;
            while (rs.next()) {
                int DNI_C = rs.getInt("DNI_C");
                Tabla.setValueAt(DNI_C, i, 0);
                
                String NOMBRE_C = rs.getString("NOMBRE_C");
                Tabla.setValueAt(NOMBRE_C, i, 1);
                
                String APELLIDO_C= rs.getString("APELLIDO_C");
                Tabla.setValueAt(APELLIDO_C, i, 2);
                
                String TELEFONO_C= rs.getString("TELEFONO_C");
                Tabla.setValueAt(TELEFONO_C, i, 3);
                
                ++i;
                
            }

            rs.close();
            statement.close();
            con.close();

            }     catch(RuntimeException| SQLException e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(this, "Conexion fallida");
                 throw new RuntimeException(e);
            }
    }//GEN-LAST:event_btnConsultaGeneralActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDNI_C.setText("");
        txtNombre_C.setText("");
        txtApellido_C.setText("");
        txtTelefono_C.setText("");
        txtDNI_C.requestFocus();   
         for(int i=0;i<=49;i++){
            for(int j=0;j<4;j++){
                Tabla.setValueAt("", i, j);
             }
         }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellido_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido_CActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnConsultaGeneral;
    private javax.swing.JButton btnConsultaIndividual;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido_C;
    private javax.swing.JTextField txtDNI_C;
    private javax.swing.JTextField txtNombre_C;
    private javax.swing.JTextField txtTelefono_C;
    // End of variables declaration//GEN-END:variables
}
