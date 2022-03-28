/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import org.jfree.chart.ChartPanel;


public class BarGraphPanel extends ChartPanel{
    
    public BarGraphPanel(BarGraphInfo graphInfo){
	super(graphInfo.chart);
    }
}
