package main;

import com.google.gson.JsonObject;
import forms.*;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import util.JSONUtils;

public class main {
    public static void main(String[] args) throws IOException, URISyntaxException {
	JsonObject obj;
	String path = main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath().toString();

	File infoFile = new File(path.substring(0,path.lastIndexOf('/')+1) +"info.json");
	System.out.println(infoFile.getAbsolutePath());
	if (!infoFile.exists()){
	    obj  = JSONUtils.readJSON(main.class.getResourceAsStream("/info/info.json"));
	    JSONUtils.writeJSON(infoFile.getAbsolutePath(), obj);
	} 

	obj  = JSONUtils.readJSON(infoFile.getAbsolutePath());
	
	frmHub main = new frmHub(new Point(200,50), obj, infoFile.getAbsolutePath());
    }
    
}
