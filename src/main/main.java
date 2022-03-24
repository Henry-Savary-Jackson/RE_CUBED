package main;

import com.google.gson.JsonObject;
import forms.*;
import java.awt.Point;
import util.JSONUtils;

public class main {
    public static void main(String[] args) {
	JsonObject obj  = JSONUtils.readJSON("info.json");
	frmHub main = new frmHub(new Point(200,50), obj);
    }
    
}
