package forms;

import com.google.gson.JsonObject;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import util.JSONUtils;

public class AppForm extends JFrame  implements WindowListener{
    JsonObject data; 
    String infoPath = "info.json";
    
    
    public AppForm(JsonObject obj){
	super();
	data = obj;
	addWindowListener(this);
    }
    
    void save(){}
    
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
