/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author HP Omen
 */
public class TipSobe extends javax.swing.JFrame {

    /**
     * Creates new form TipSobe
     */
    public TipSobe() {
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

        jLabel1 = new javax.swing.JLabel();
        dodajTipSobe = new javax.swing.JButton();
        obrisiTipSobe = new javax.swing.JButton();
        prikaziTipoveSoba1 = new javax.swing.JButton();
        izmeniTipoveSoba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Tip Sobe");

        dodajTipSobe.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dodajTipSobe.setText("Dodaj novi tip");
        dodajTipSobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajTipSobeActionPerformed(evt);
            }
        });

        obrisiTipSobe.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        obrisiTipSobe.setText("Obrisi tip sobe");
        obrisiTipSobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiTipSobeActionPerformed(evt);
            }
        });

        prikaziTipoveSoba1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prikaziTipoveSoba1.setText("Prikazi tipove soba");
        prikaziTipoveSoba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziTipoveSoba1ActionPerformed(evt);
            }
        });

        izmeniTipoveSoba.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        izmeniTipoveSoba.setText("Izmeni Tip Sobe");
        izmeniTipoveSoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeniTipoveSobaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dodajTipSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(izmeniTipoveSoba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obrisiTipSobe, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(prikaziTipoveSoba1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajTipSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obrisiTipSobe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prikaziTipoveSoba1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(izmeniTipoveSoba, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajTipSobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajTipSobeActionPerformed
        DodajNoviTipSobe dt=new DodajNoviTipSobe();
        dt.setVisible(true);
    }//GEN-LAST:event_dodajTipSobeActionPerformed

    private void obrisiTipSobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiTipSobeActionPerformed
        ObrisiTipSobe ots1=new ObrisiTipSobe();
        ots1.setVisible(true);
    }//GEN-LAST:event_obrisiTipSobeActionPerformed

    private void prikaziTipoveSoba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziTipoveSoba1ActionPerformed
        PrikaziTipoveSoba pt=new PrikaziTipoveSoba();
        pt.setVisible(true);
    }//GEN-LAST:event_prikaziTipoveSoba1ActionPerformed

    private void izmeniTipoveSobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeniTipoveSobaActionPerformed
        IzmeniTipSobe it=new IzmeniTipSobe();
        it.setVisible(true);
    }//GEN-LAST:event_izmeniTipoveSobaActionPerformed

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
            java.util.logging.Logger.getLogger(TipSobe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipSobe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipSobe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipSobe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipSobe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodajTipSobe;
    private javax.swing.JButton izmeniTipoveSoba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton obrisiTipSobe;
    private javax.swing.JButton prikaziTipoveSoba1;
    // End of variables declaration//GEN-END:variables
}