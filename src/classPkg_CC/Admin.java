/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_CC;

import classPkg_AC.User;
import framePkg.AddEmlpoyeeFrame;
import framePkg.AdminPanel;
import framePkg.Create_Contract_Form;
import framePkg.EditTrainingProgramFrame;
import framePkg.EmployeeInfoFrame;
import framePkg.HomeFrame;
import framePkg.LoginFrame;
import framePkg.NotificationFrame;
import framePkg.GenerateReportFrame;
import framePkg.ShowContractsFrame;
import framePkg.UpdateEmployeeInfoFrame12;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iftekharulalam
 */
public class Admin extends User{
    String name=""; String id="";

    public void offerTrainingProgram(){
    EditTrainingProgramFrame f = new EditTrainingProgramFrame();
    f.setVisible(true);
    
    
    };
    public void viewContract(){
       ShowContractsFrame f = new ShowContractsFrame();
      f.setVisible(true);
    
    
    
    };
    public void receivingNotification(){
     NotificationFrame F = null;
        try {
            F = new NotificationFrame();
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        F.setVisible(true);
    
    
    };
    public void createEmployee(){
      AddEmlpoyeeFrame F=new AddEmlpoyeeFrame();
        F.setVisible(true);
        
    
    
    }
    public void createContract(){
    
    Create_Contract_Form f = null;
      
            f = new Create_Contract_Form();
        
        f.setVisible(true);
    
    }
    public void updateEmployeeInfor(){
       UpdateEmployeeInfoFrame12 F=new UpdateEmployeeInfoFrame12();
        F.setVisible(true);
    
    
    
    
    };
    public void viewEmployeeInfo(){
    EmployeeInfoFrame F=new EmployeeInfoFrame("Admin");
        F.setVisible(true);
    
    
    };
    public void updateContract(){};
public void generateReports(){
GenerateReportFrame f = new GenerateReportFrame();
f.setVisible(true);

};

    @Override
    public boolean askAndCheckUsernameAndPassword(String id, String password, String position) {
        String ido=null;
        String pass=null;
        String posit=null;
        File f = new File("login.bin");
        DataInputStream in =null; 
String s =null;
       
        if(f.exists()){
           try {
               in =  new DataInputStream(new BufferedInputStream(new FileInputStream("login.bin")));
           } catch (FileNotFoundException ex) {
               Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        
                
           try {
               while (true){
                    s = in.readUTF();
                   if(s.equals(id)){
                       ido = s;
                       pass =in.readUTF();
                       posit =in.readUTF();
                       
                   } 
               }
           } catch (Exception ex) {
               
            
           }

            if(ido.equals(id) && pass.equals(password) && posit.equals(position)){
           return true;
           }
           else{
           return false;
           
           }

    }
        else{
            return false;
            
            
        }
    }
    

}
