/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_CC;

import classPkg_AC.Employee;
import framePkg.LoginFrame;
import framePkg.TrainingProgramFrame;
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

/**
 *
 * @author iftekharulalam
 */
public class Staff extends Employee{
   
    @Override
    public void applyForTrainingProgram() {
    TrainingProgramFrame F= new TrainingProgramFrame();
        F.setVisible(true);
    
    
    }

    @Override
    public void isTrainable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // validateTrainable();
    
    }
    @Override
    public boolean validateTrainable(String id) {
        FileReader fr =null;
        BufferedReader br = null;
                    String n="";

        
        try {
            fr = new FileReader("Trinable.txt");
                    br = new BufferedReader(fr);

            String s = "";
                    while(( s = br.readLine())!=null){ 
                    if(s.contains(id)){
                    n=s;
                    }
                    
                    }

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      if(!n.equals("")){
      return true;
         }
           else{
            return false;
                    }
    }


    @Override
    public boolean askAndCheckUsernameAndPassword(String id, String password, String position) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           String ido=null;
        String pass=null;
        String posit=null;
        File f = new File("login.bin");
        DataInputStream in =null; 
String s =null;
       //String password = new String(passwordTxtField.getPassword());
        if(f.exists()){
           try {
               // fr = new FileReader("login.txt");
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
