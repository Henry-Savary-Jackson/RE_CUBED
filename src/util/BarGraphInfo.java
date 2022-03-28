package util;

import com.google.gson.JsonElement;
import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarGraphInfo {
	DefaultCategoryDataset dcd;
	JFreeChart chart;
	
	public BarGraphInfo(String title, String xAxis, String yAxis, Set<Map.Entry<String,JsonElement>> set, String[] properties, boolean Legend){
	    dcd = getDataSet(set,properties);
	    chart = ChartFactory.createBarChart(title, xAxis, yAxis, dcd);
	    chart.getCategoryPlot().setRangeGridlinePaint(Color.BLACK);
	    chart.getLegend().setVisible(Legend);
	}
	
	private DefaultCategoryDataset getDataSet(Set<Map.Entry<String,JsonElement>> set, String[] properties){
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	    Iterator it = set.iterator();
	    while(it.hasNext()){
		
		Map.Entry<String,JsonElement> entry = (Map.Entry<String,JsonElement> )it.next();
		String ekey = entry.getKey();
		
		Set<Map.Entry<String,JsonElement>> entryProperties = entry.getValue().getAsJsonObject().entrySet();
		Iterator entryIt = entryProperties.iterator();
		while (entryIt.hasNext()){
		    Map.Entry<String,JsonElement> e = (Map.Entry<String,JsonElement>)entryIt.next();
		    String name = e.getKey();
		    if (Arrays.asList(properties).contains(name)){
			double value = e.getValue().getAsDouble();
			dataset.addValue(value, name, ekey);
		    }
		    
		}
	    }
	    return dataset;
	}
    }
