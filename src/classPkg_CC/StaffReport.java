/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_CC;

import classPkg_AC.Report;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author User
 */
public class StaffReport extends Report{
    @Override
    public JFreeChart generateChart(ArrayList<String> arr){
        DefaultPieDataset piedataset = new DefaultPieDataset();
        for(String s:arr)
        {
            String [] k;
            k=s.split(",");
            int n=Integer.parseInt(k[3]);
            piedataset.setValue(k[0]+" ("+k[1]+")", n);
        }
        
        JFreeChart piechart = ChartFactory.createPieChart(  
            "Pie Chart of Salary",   // Title  
            piedataset,  //dataset           
            true,    //legends              
            true,    //tools               
            true    //urls                
        );  
       
        piechart.getTitle().setPaint(Color.BLACK); // Set the colour of the title  
        piechart.setBackgroundPaint(Color.WHITE);
      
        PiePlot p=(PiePlot)piechart.getPlot();
        p.setBackgroundPaint(Color.WHITE);        
      
        return piechart;
    }
   
    public void generatePDF(JFreeChart jf)
    {
         Document doc = new Document();
         
         
         JFileChooser fc = new JFileChooser();       
        fc.setCurrentDirectory(new File("C:\\COURSES\\CSC305 or CSE213\\Java Programs\\JFileChooser"));
        if (fc.showSaveDialog(null) == fc.APPROVE_OPTION) {
            try{
                File file = fc.getSelectedFile();
                FileOutputStream fo=new FileOutputStream(file+"pdf");
                
            }
            catch(Exception e){}
        }                                        
        else{
            //JOptionPane.showMessageDialog(null,"Operation Denied");
        }
         
         
        try {
            
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
            doc.open();
            

            //PDF table
            
            doc.add(new Paragraph("Staff Report on Salary Count ",FontFactory.getFont(FontFactory.TIMES_BOLD, 20, 20, BaseColor.BLACK)));                  
            doc.add(new Paragraph("\n\n"));
            //PDF table
            PdfPTable p = new PdfPTable(4);          
            p.addCell("Employee Name");   
            p.addCell("Employee ID");     
            p.addCell("Group Type");
            p.addCell("Salary");
                       
             File f= new File("Staff.txt");

             try 
        {
            Scanner s = new Scanner(f);
            String input;
            String [] staffDetails;
            String input2;
            String [] superviserDetails;
   
            while(s.hasNextLine()){
                input = s.nextLine();
                staffDetails= input.split(",");
                p.addCell(staffDetails[1]);
                p.addCell(staffDetails[0]);
                p.addCell(staffDetails[11]);
                p.addCell(staffDetails[8]);
                
            }
            f=new File("Superviser.txt");
            Scanner s2= new Scanner(f);
            while(s2.hasNextLine()){
                input2 = s2.nextLine();
                superviserDetails= input2.split(",");
                   // model.addRow(new Object[]{superviserDetails[1],superviserDetails[0],superviserDetails[11],superviserDetails[8]});
                p.addCell(superviserDetails[1]);
                p.addCell(superviserDetails[0]);
                p.addCell(superviserDetails[11]);
                p.addCell(superviserDetails[8]);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Operation Denied", " Confiration Message", JOptionPane.WARNING_MESSAGE);
        }
            

            doc.add(p);
            doc.add(new Paragraph("\n\n"));

            //add chart to PDF
            BufferedImage bufImg = jf.createBufferedImage(400,300);
            Image chartImage = Image.getInstance(writer,bufImg,1.0f);
            doc.add(chartImage);
            doc.close();//close doc file
            JOptionPane.showMessageDialog(null,"Report Saved");
        } 
        catch (FileNotFoundException ex){} 
        catch (DocumentException ex){} 
        catch (IOException ex){}
    
}
    }
    

