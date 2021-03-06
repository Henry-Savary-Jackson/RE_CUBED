package forms;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.text.DefaultFormatter;
import util.ReuseSwap;

public class frmReduce extends AppForm {

    /**
     * Creates new form inpForm
     */
    public frmReduce(Point location, JsonObject _data, String infoPath) {
	super(_data, infoPath);
	initComponents();
	try {
	    Image logo= ImageIO.read(getClass().getResourceAsStream("/images/add_image.png")).getScaledInstance(btnNew.getWidth()-10, btnNew.getHeight()-10, Image.SCALE_SMOOTH);
	    btnNew.setIcon(new ImageIcon(logo));
	} catch (MalformedURLException ex) {
	    Logger.getLogger(frmHub.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(frmHub.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	lblSaved.setVisible(false);
	
	((DefaultFormatter)((JFormattedTextField)spinAmount.getEditor().getComponent(0)).getFormatter()).setCommitsOnValidEdit(true);
	spinAmount.addChangeListener((ChangeEvent e) -> {
	    if (e.getSource() == spinAmount){
		int index = cmbItems.getSelectedIndex() ;
		updateLabel(index);
	    }
	});
	
	setLocation(location);
	
	dTotalReuse = data.getAsJsonObject("REUSE").getAsJsonPrimitive("total").getAsDouble();
	dReuse = data.getAsJsonObject("REUSE").getAsJsonObject("2022 APR").getAsJsonPrimitive("total").getAsDouble();

	setCmbItems();
	
	setVisible(true);
    }
    
    private void setCmbItems(){
	JsonArray jsonArr = data.getAsJsonArray("SWAPS");
	cmbItems.removeAllItems();
	for (JsonElement e : jsonArr){
	    swaps.add(new GsonBuilder().create().fromJson(e, ReuseSwap.class));
	    cmbItems.addItem(e.getAsJsonObject().getAsJsonPrimitive("nameRecyclable").getAsString());	    
	}
    }
    
    public void updateCmbItems(){
	cmbItems.removeAllItems();
	for (ReuseSwap e : swaps ){
	    cmbItems.addItem(e.nameRecyclable);	    
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

        jComboBox1 = new javax.swing.JComboBox<>();
        btnHub = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbItems = new javax.swing.JComboBox<>();
        spinAmount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        lblNonRecycle = new javax.swing.JLabel();
        lblSaved = new javax.swing.JLabel();
        btnRecord = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your reductions");
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

        jLabel1.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel1.setText("Used ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(104, 93, 62, 38);

        cmbItems.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        cmbItems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemsItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbItems);
        cmbItems.setBounds(47, 145, 330, 29);

        spinAmount.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        spinAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(spinAmount);
        spinAmount.setBounds(184, 93, 85, 31);

        jLabel2.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel2.setText("Instead of ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 190, 134, 32);

        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew);
        btnNew.setBounds(150, 530, 117, 114);

        lblNonRecycle.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        lblNonRecycle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNonRecycle.setText("(AMOUNT) (ITEM)");
        getContentPane().add(lblNonRecycle);
        lblNonRecycle.setBounds(1, 242, 420, 32);

        lblSaved.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        lblSaved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaved.setText("You saved () Kg!");
        lblSaved.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSaved);
        lblSaved.setBounds(10, 450, 410, 32);

        btnRecord.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        btnRecord.setText("RECORD");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecord);
        btnRecord.setBounds(120, 320, 187, 43);

        btnRemove.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove);
        btnRemove.setBounds(120, 390, 187, 43);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHubActionPerformed
        // TODO add your handling code here:
	save();
	frmHub hub = new frmHub(getLocation(),data, infoPath);
	
	dispose();
    }//GEN-LAST:event_btnHubActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
	new dlgSwap( new Point(  getLocation().x,  getLocation().y + (getWidth()/2) ), this ).setVisible(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void cmbItemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemsItemStateChanged
        // TODO add your handling code here:
	if (evt.getStateChange() == ItemEvent.SELECTED){ 
	    int index = cmbItems.getSelectedIndex();
	    updateLabel(index);
	}
    }//GEN-LAST:event_cmbItemsItemStateChanged

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        // TODO add your handling code here:
        int index = cmbItems.getSelectedIndex();
        ReuseSwap currSwap = swaps.get(index);
        amount = (Integer)spinAmount.getValue();
        double dAmount = amount * currSwap.dRatio;
        double savedWeight = dAmount * currSwap.dWeight;
        dReuse += savedWeight;
        dTotalReuse += savedWeight;
        lblSaved.setText(String.format("You saved %.2f Kg!", savedWeight));
	if (!lblSaved.isVisible())
	    lblSaved.setVisible(true);
    }//GEN-LAST:event_btnRecordActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
	int index = cmbItems.getSelectedIndex();
        ReuseSwap currSwap = swaps.get(index);
        amount = (Integer)spinAmount.getValue();
        double dAmount = amount * currSwap.dRatio;
        double savedWeight = dAmount * currSwap.dWeight;
        dReuse -= savedWeight;
	if (dReuse < 0){
	    dReuse = 0;
	}else {
	    dTotalReuse -= savedWeight;
	    lblSaved.setText(String.format("You removed %.2f Kg!", savedWeight));
	    if (!lblSaved.isVisible())
		lblSaved.setVisible(true);
	}
	
    }//GEN-LAST:event_btnRemoveActionPerformed

    @Override
    public void save(){
	JsonObject reuse = data.getAsJsonObject("REUSE");
	JsonObject month = reuse.getAsJsonObject("2022 APR");
	JsonArray jsonSwaps = data.getAsJsonArray("SWAPS");
	reuse.addProperty("total", dTotalReuse);
	month.addProperty("total", dReuse);
	for (ReuseSwap re : swaps){
	    Gson gson = new GsonBuilder().create();
	    JsonElement e = gson.toJsonTree(re) ;
	    if (!jsonSwaps.contains(e)){
		jsonSwaps.add(e);
	    }
	}
    }
    
    private void updateLabel(int index){
	ReuseSwap currSwap = swaps.get(index);
	amount = (Integer)spinAmount.getValue();
	double dAmount = amount * currSwap.dRatio;
	lblNonRecycle.setText(String.format("%.2f %s", dAmount, currSwap.nameNonRecyclable));
    }
    
    public double dReuse;
    public double dTotalReuse;
    int amount ;
    
    ArrayList<ReuseSwap> swaps = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHub;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbItems;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNonRecycle;
    private javax.swing.JLabel lblSaved;
    private javax.swing.JSpinner spinAmount;
    // End of variables declaration//GEN-END:variables
    
}
