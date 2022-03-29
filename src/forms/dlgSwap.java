package forms;

import java.awt.Point;
import javax.swing.JOptionPane;
import util.ReuseSwap;

public class dlgSwap extends javax.swing.JDialog {

    /**
     * Creates new form dlgSwap
     */
    public dlgSwap(Point location, frmReduce _form) {
	initComponents();
	form = _form;
	setLocation(location);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtReusable = new javax.swing.JTextField();
        txtAmntNonReusable = new javax.swing.JTextField();
        txtAmntReusable = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtNonReusable = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create custom swap");
        setPreferredSize(new java.awt.Dimension(421, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel1.setText("Reusable item name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 37, 187, 25);

        jLabel2.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel2.setText("Amount:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 76, 76, 27);

        jLabel3.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel3.setText("Instead of");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 130, 89, 27);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel4.setText("Non-reusable item name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 180, 226, 27);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel5.setText("Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 220, 76, 27);

        jLabel6.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel6.setText("which weighs:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 260, 126, 27);

        jLabel7.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel7.setText("Kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 260, 25, 27);
        getContentPane().add(txtReusable);
        txtReusable.setBounds(235, 41, 180, 23);
        getContentPane().add(txtAmntNonReusable);
        txtAmntNonReusable.setBounds(140, 220, 106, 23);
        getContentPane().add(txtAmntReusable);
        txtAmntReusable.setBounds(149, 81, 106, 23);
        getContentPane().add(txtWeight);
        txtWeight.setBounds(180, 260, 114, 23);
        getContentPane().add(txtNonReusable);
        txtNonReusable.setBounds(240, 180, 177, 23);

        btnDone.setFont(new java.awt.Font("Futura", 0, 21)); // NOI18N
        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnDone);
        btnDone.setBounds(140, 300, 117, 52);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
	sReusableName =  txtReusable.getText();
	sNonReusableName = txtNonReusable.getText();
	
	if (sReusableName.isEmpty() || sNonReusableName.isEmpty()){
	    JOptionPane.showMessageDialog(this, "Please provide names for both items");
	    return;
	}
	
	try{
	    dReusableAmount = Double.parseDouble(txtAmntReusable.getText());
	    dNonReusableAmount = Double.parseDouble(txtAmntNonReusable.getText());
	    dNonReusableWeight = Double.parseDouble(txtWeight.getText());
	    
	} catch (NumberFormatException nfe) {
	    System.out.println(nfe.getMessage());
	    JOptionPane.showMessageDialog(this, "Please enter a valid decimal number");
	    return;
	}
	form.swaps.add(new ReuseSwap(sReusableName,sNonReusableName,(dNonReusableAmount/dReusableAmount), dNonReusableWeight/dNonReusableAmount));
	
	dispose();
    }//GEN-LAST:event_btnDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtAmntNonReusable;
    private javax.swing.JTextField txtAmntReusable;
    private javax.swing.JTextField txtNonReusable;
    private javax.swing.JTextField txtReusable;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
    String sReusableName;
    String sNonReusableName;
    double dReusableAmount;
    double dNonReusableAmount;
    double dNonReusableWeight;
    frmReduce form;
}
