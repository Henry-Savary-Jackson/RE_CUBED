/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONUtils {
    public static JSONObject readJSON(String filePath){
	try {
	    Scanner scanner = new Scanner(new File(filePath));
	    String JSONString = scanner.useDelimiter("\\\\Z").next();
	    scanner.close();
	    JSONParser parser = new JSONParser();
	    return (JSONObject) parser.parse(JSONString);
	} catch (FileNotFoundException ex) {
	    Logger.getLogger(JSONUtils.class.getName()).log(Level.SEVERE, null, ex);
	} catch (ParseException ex) {
	    Logger.getLogger(JSONUtils.class.getName()).log(Level.SEVERE, null, ex);
	}
	return null;
    }
    
    public static void writeJSON(String filePath, JSONObject obj) {
	try (FileWriter fw = new FileWriter(filePath)){
	    fw.write(obj.toJSONString());
	    fw.flush();
	} catch (IOException ioe){}
	    
    }
}
