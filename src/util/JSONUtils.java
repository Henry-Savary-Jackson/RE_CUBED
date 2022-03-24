/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class JSONUtils {
    
    private static GsonBuilder builder = new GsonBuilder();
    
    public static JsonObject readJSON(String filePath){
	try (BufferedReader bfr = new BufferedReader(new FileReader(new File(filePath)))){
	    JsonObject obj = builder.create().fromJson(bfr, JsonObject.class);
	    bfr.close();
	    return obj;
	} catch (FileNotFoundException ex) {
	    Logger.getLogger(JSONUtils.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(JSONUtils.class.getName()).log(Level.SEVERE, null, ex);
	}
	return null;
    }
    
    public static void writeJSON(String filePath, JsonObject obj) {
	try (BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(filePath)))){
	    Gson gson = builder.setPrettyPrinting().create();
	    bfw.write(gson.toJson(obj));
	    
	    bfw.close();
	} catch (IOException ioe){}
	    
    }
}
