/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP Omen
 */
public class ObrisiKlijenta extends javax.swing.JFrame {

    /**
     * Creates new form ObrisiKlijenta
     */
    public ObrisiKlijenta() {
        try {
            initComponents();
            popuniMeni();
        } catch (SQLException ex) {
            Logger.getLogger(ObrisiKlijenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void popuniMeni() throws SQLException{
        jmeni.removeAllItems();
     try {  
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DodajKlijenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = null;  
        con = (Connection) DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/hotel_niksic","root","");
    
        String upit="Select klijentiID, ime, prezime from klijenti";
        Statement st=(Statement) con.createStatement();
        ResultSet rs= st.executeQuery(upit);
        
        while(rs.next()){
            jmeni.addItem(rs.getString(1)+ " "+ rs.getString(2)+" "+ rs.getString(3));
        }
        con.close();
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
        jmeni = new javax.swing.JComboBox();
        jizbrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Obrisi Klijenta");

        jmeni.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jmeni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jizbrisi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jizbrisi.setText("Izbrisi");
        jizbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jizbrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jizbrisi)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jizbrisi)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jizbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jizbrisiActionPerformed
        
        String [] niz=jmeni.getSelectedItem().toString().split(" ");
        int id= Integer.parseInt(niz[0]);
         try {  
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObrisiKlijenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    Connection con = null;  
    
        try {  
            con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hotel_niksic","root","");
            String upit="Delete From klijenti where klijentiID=?";
            PreparedStatement st;
            st = con.prepareStatement(upit);
            st.setInt(1, id);
            st.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Uspesno ste izbrisali klijenta");
        } catch (SQLException ex) {
            Logger.getLogger(ObrisiKlijenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            popuniMeni();
        } catch (SQLException ex) {
            Logger.getLogger(ObrisiKlijenta.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jizbrisiActionPerformed

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
            java.util.logging.Logger.getLogger(ObrisiKlijenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObrisiKlijenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObrisiKlijenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObrisiKlijenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObrisiKlijenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jizbrisi;
    private javax.swing.JComboBox jmeni;
    // End of variables declaration//GEN-END:variables
}
