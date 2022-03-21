/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author hsavaryjackson
 */
public class frmStats extends javax.swing.JFrame {

    /**
     * Creates new form inpForm
     */
    public frmStats(Point location) {
	initComponents();
	setLocation(location);
	JPanel pnlWaste = new JPanel();
	JPanel pnlReuse = new JPanel();
	tabStats.addTab("Waste", pnlWaste );
	tabStats.addTab("Reuse", pnlReuse);
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
        tabStats = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your statistics");
        setPreferredSize(new java.awt.Dimension(421, 750));
        getContentPane().setLayout(null);

        btnHub.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnHub.setText("back");
        btnHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHubActionPerformed(evt);
            }
        });
        getContentPane().add(btnHub);
        btnHub.setBounds(22, 17, 72, 24);

        tabStats.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        getContentPane().add(tabStats);
        tabStats.setBounds(0, 47, 415, 699);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHubActionPerformed
        // TODO add your handling code here:
	frmHub hub = new frmHub(getLocation());
	
	dispose();
    }//GEN-LAST:event_btnHubActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHub;
    private javax.swing.JTabbedPane tabStats;
    // End of variables declaration//GEN-END:variables
}
