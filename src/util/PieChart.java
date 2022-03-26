/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PieChart extends JPanel{
    
    double dTotal = -1 ;
    double[] values;
    Color[] colours;
    
    public PieChart(){
	super();
    }
    
    public void set(double total, double[] vals, Color[] _colours){
	dTotal = total;
	values = vals;
	colours = _colours;
    }
    
    public void paintSlice(Graphics g2d, double start, double extent, Color color){
	g2d.setColor(color);
	g2d.fillArc(0, 0, getWidth()-10, getHeight()-10, (int)start,(int)Math.ceil(extent));
    }
    
    @Override 
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	if (values != null && colours != null && dTotal != -1 ){
	    double start = 0;
	    for( int i = 0; i <values.length; i++ ){
		double extent = (values[i]/dTotal)*360;
		paintSlice(g,start, extent, colours[i]);
		start += extent;
	    }
	    g.dispose();
	}
    }
}
