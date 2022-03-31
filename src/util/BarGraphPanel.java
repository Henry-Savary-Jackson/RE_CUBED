package util;

import org.jfree.chart.ChartPanel;

public class BarGraphPanel extends ChartPanel{
    
    public BarGraphPanel(BarGraphInfo graphInfo){
	super(graphInfo.chart);
    }
}
