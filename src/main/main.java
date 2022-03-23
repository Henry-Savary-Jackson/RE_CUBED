
package main;

import forms.*;
import java.awt.Point;
import org.json.simple.JSONObject;
import util.JSONUtils;

public class main {
    public static void main(String[] args) {
	JSONObject obj  = JSONUtils.readJSON("info.json");
	frmHub main = new frmHub(new Point(200,50), obj);
    }
    
}
