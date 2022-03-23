/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import org.json.simple.JSONObject;
import util.JSONUtils;

/**
 *
 * @author hsavaryjackson
 */
public class AppForm extends JFrame  implements WindowListener{
    private JSONObject data; 
    private String infoPath = "info.json";
    
    
    public AppForm(JSONObject obj){
	super();
	data = obj;
    }
    
    private void save(){}
    
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {
	save();
	JSONUtils.writeJSON(infoPath, data);
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
