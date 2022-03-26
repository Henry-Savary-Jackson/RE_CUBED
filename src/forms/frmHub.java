package forms;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class frmHub extends AppForm {

    /**
     * Creates new form hubForm
     */
    public frmHub(Point location, JsonObject _data) {
	super(_data);
	initComponents();
	try {
	    Image logo= ImageIO.read(new File("src/images/re_cubed_logo_bg.png")).getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
	    lblLogo.setIcon(new ImageIcon(logo));
	} catch (MalformedURLException ex) {
	    Logger.getLogger(frmHub.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(frmHub.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	setLocation(location);
	
	JsonObject waste = data.getAsJsonObject("WASTE");
	
	dTotalRecycle = waste.getAsJsonPrimitive("total_recyclable").getAsDouble();
	lblTotalRecyclable.setText(String.format("RECYCLABLE: %.2f KG", dTotalRecycle));
	dTotalNonRecycle = waste.getAsJsonPrimitive("total_non_recyclable").getAsDouble();
	lblTotalNonRecyclable.setText(String.format("NON-RECYCLABLE: %.2f KG",dTotalNonRecycle));
	dTotal = dTotalNonRecycle + dTotalRecycle;
	lblTotal.setText(String.format("TOTAL WASTE: %.2f KG" , dTotal));
	
	pnlChart.set(dTotal, new double[]{dTotalRecycle,dTotalNonRecycle}, new Color[]{pnlRecycleColour.getBackground(), pnlNonRecycleColour.getBackground()});
	
	dTotalReuse = data.getAsJsonObject("REUSE").getAsJsonPrimitive("total").getAsDouble();
	lblTotalReuse.setText(String.format("TOTAL SAVED: %.2f KG", dTotalReuse));  
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

        pieChart1 = new util.PieChart();
        pnlStats = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnProgress = new javax.swing.JButton();
        lblTotalReuse = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTotalRecyclable = new javax.swing.JLabel();
        lblTotalNonRecyclable = new javax.swing.JLabel();
        pnlRecycleColour = new javax.swing.JPanel();
        pnlNonRecycleColour = new javax.swing.JPanel();
        pnlChart = new util.PieChart();
        btnReduce = new javax.swing.JButton();
        btnWaste = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        javax.swing.GroupLayout pieChart1Layout = new javax.swing.GroupLayout(pieChart1);
        pieChart1.setLayout(pieChart1Layout);
        pieChart1Layout.setHorizontalGroup(
            pieChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pieChart1Layout.setVerticalGroup(
            pieChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN");
        setBounds(new java.awt.Rectangle(0, 0, 421, 750));
        setPreferredSize(new java.awt.Dimension(421, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(421, 750));
        getContentPane().setLayout(null);

        pnlStats.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlStats.setPreferredSize(new java.awt.Dimension(563, 1000));

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setText("STATISTICS:");

        btnProgress.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        btnProgress.setText("See progress");
        btnProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgressActionPerformed(evt);
            }
        });

        lblTotalReuse.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        lblTotalReuse.setText("TOTAL SAVED: KG");

        lblTotal.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        lblTotal.setText("TOTAL WASTE: KG");

        lblTotalRecyclable.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        lblTotalRecyclable.setText("RECYCLABLE: KG");

        lblTotalNonRecyclable.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        lblTotalNonRecyclable.setText("NON-RECYCLABLE: KG");

        pnlRecycleColour.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout pnlRecycleColourLayout = new javax.swing.GroupLayout(pnlRecycleColour);
        pnlRecycleColour.setLayout(pnlRecycleColourLayout);
        pnlRecycleColourLayout.setHorizontalGroup(
            pnlRecycleColourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnlRecycleColourLayout.setVerticalGroup(
            pnlRecycleColourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlNonRecycleColour.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlNonRecycleColourLayout = new javax.swing.GroupLayout(pnlNonRecycleColour);
        pnlNonRecycleColour.setLayout(pnlNonRecycleColourLayout);
        pnlNonRecycleColourLayout.setHorizontalGroup(
            pnlNonRecycleColourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnlNonRecycleColourLayout.setVerticalGroup(
            pnlNonRecycleColourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnlChart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlChartLayout = new javax.swing.GroupLayout(pnlChart);
        pnlChart.setLayout(pnlChartLayout);
        pnlChartLayout.setHorizontalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        pnlChartLayout.setVerticalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlStatsLayout = new javax.swing.GroupLayout(pnlStats);
        pnlStats.setLayout(pnlStatsLayout);
        pnlStatsLayout.setHorizontalGroup(
            pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatsLayout.createSequentialGroup()
                .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStatsLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(pnlStatsLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStatsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalReuse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlStatsLayout.createSequentialGroup()
                                .addComponent(pnlRecycleColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblTotalRecyclable))
                            .addComponent(lblTotal)
                            .addGroup(pnlStatsLayout.createSequentialGroup()
                                .addComponent(pnlNonRecycleColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(lblTotalNonRecyclable)))))
                .addContainerGap())
        );
        pnlStatsLayout.setVerticalGroup(
            pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatsLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlStatsLayout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(16, 16, 16)
                        .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlStatsLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(pnlRecycleColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTotalRecyclable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlStatsLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(pnlNonRecycleColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTotalNonRecyclable))
                        .addGap(25, 25, 25)
                        .addComponent(lblTotalReuse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(pnlStats);
        pnlStats.setBounds(10, 210, 400, 310);

        btnReduce.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        btnReduce.setText("Enter reductions");
        btnReduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReduceActionPerformed(evt);
            }
        });
        getContentPane().add(btnReduce);
        btnReduce.setBounds(40, 630, 340, 70);

        btnWaste.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        btnWaste.setText("Enter waste");
        btnWaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWasteActionPerformed(evt);
            }
        });
        getContentPane().add(btnWaste);
        btnWaste.setBounds(40, 540, 340, 70);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("(RE)^3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 30, 70, 40);

        lblLogo.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 0, 0));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setAlignmentY(0.0F);
        lblLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setIconTextGap(0);
        lblLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblLogo);
        lblLogo.setBounds(150, 30, 140, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgressActionPerformed
        // TODO add your handling code here:
	new frmStats(getLocation(),data);
	
	dispose();
    }//GEN-LAST:event_btnProgressActionPerformed

    private void btnWasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWasteActionPerformed
        // TODO add your handling code here:
	new frmWaste(getLocation(),data);
	
	dispose();
    }//GEN-LAST:event_btnWasteActionPerformed

    private void btnReduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReduceActionPerformed
        // TODO add your handling code here:
	new frmReduce(getLocation(),data);
	
	dispose();
    }//GEN-LAST:event_btnReduceActionPerformed

    double dTotalRecycle;
    double dTotalNonRecycle;
    double dTotalReuse;
    double dTotal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProgress;
    private javax.swing.JButton btnReduce;
    private javax.swing.JButton btnWaste;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalNonRecyclable;
    private javax.swing.JLabel lblTotalRecyclable;
    private javax.swing.JLabel lblTotalReuse;
    private util.PieChart pieChart1;
    private util.PieChart pnlChart;
    private javax.swing.JPanel pnlNonRecycleColour;
    private javax.swing.JPanel pnlRecycleColour;
    private javax.swing.JPanel pnlStats;
    // End of variables declaration//GEN-END:variables
}
