/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import com.google.gson.JsonObject;
import java.awt.Point;

/**
 *
 * @author hsavaryjackson
 */
public class frmInfo extends AppForm {

    /**
     * Creates new form frmInfo
     */
    public frmInfo(Point location ,JsonObject _data) {
	super(_data);
	initComponents();
	setLocation(location);
	setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHub = new javax.swing.JButton();
        btnHub1 = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        btnHub.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnHub.setText("back");
        btnHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHubActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Information");
        setPreferredSize(new java.awt.Dimension(421, 750));
        getContentPane().setLayout(null);

        btnHub1.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnHub1.setText("back");
        btnHub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHub1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnHub1);
        btnHub1.setBounds(22, 17, 72, 24);
        getContentPane().add(lblInfo);
        lblInfo.setBounds(10, 60, 400, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHubActionPerformed

    }//GEN-LAST:event_btnHubActionPerformed

    private void btnHub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHub1ActionPerformed
        // TODO add your handling code here:
        frmWaste hub = new frmWaste(getLocation(), data);

        dispose();;
    }//GEN-LAST:event_btnHub1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHub;
    private javax.swing.JButton btnHub1;
    private javax.swing.JLabel lblInfo;
    // End of variables declaration//GEN-END:variables
}