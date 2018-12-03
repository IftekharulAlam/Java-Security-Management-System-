/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_CC;

import classPkg_AC.Report;
import java.awt.Color;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author User
 */
public class ClientReport extends Report{
    @Override
   public JFreeChart generateChart(ArrayList<String> arr)
    {
         DefaultCategoryDataset bardataset = new DefaultCategoryDataset();  

        for(String s:arr)
        {
            String [] k;
            k=s.split(",");
            int n=Integer.parseInt(k[2]);
            bardataset.setValue(n,k[2] ,k[0]+" ("+k[1]+")");
        }
    
       
        JFreeChart barchart = ChartFactory.createBarChart3D(  
            "Visualise Priority of Client Data ",  //Title      
            "Clients",         // X axis 
            "No. of Employee Assigned",       //y
            bardataset,             
            PlotOrientation.VERTICAL,      
            true,                
            true,                
            false               
        ); 
        
           barchart.getTitle().setPaint(Color.black);  
        barchart.setBackgroundPaint(Color.WHITE);
     
        
        
       CategoryPlot cp = barchart.getCategoryPlot(); 
        cp.setBackgroundPaint(Color.white);       
        cp.setRangeGridlinePaint(Color.blue); // Set the colour of the plot gridlines  
        

        BarRenderer r = (BarRenderer)barchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);
     
        
        
        return barchart;
        
    }
}
