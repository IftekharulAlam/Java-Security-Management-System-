/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_CC;

import classPkg_AC.User;
import framePkg.AdditionalStaffRequestForClientFrame;
import framePkg.EmployeeInfoFrame;
import framePkg.FeedbackFrame;
import framePkg.LoginFrame;
import framePkg.ShowContractsFrame;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import classPkg_AC.Applicable;

/**
 *
 * @author iftekharulalam
 */
public class Client extends User implements Applicable{
    String ido=null;
    String data=null;
    public void getID(String id){
    ido = id;
    
    
    }
    public void clientFeedback(){
    FeedbackFrame f = new FeedbackFrame();
    f.setVisible(true);
    
    
    };
   
    public void viewEmployeeInfo(){
     EmployeeInfoFrame F=new EmployeeInfoFrame();
        F.setVisible(true);
    
    
    };
    public void askForAdditionalStaff(){
   
    
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

    @Override
    public void renewContract(String id, String name) {
         FileWriter fw = null;
    BufferedWriter bw = null;

    String l=null;

     try {
     
fw = new FileWriter("feedback.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(FeedbackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
bw = new BufferedWriter(fw);
 l = id+","+name +","+"Client Appliend for the Renewal of the contract";
            try {
                bw.write(l);
                 bw.write("\n");
            } catch (IOException ex) {
                Logger.getLogger(FeedbackFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
            try {
                 //feedbackTxtArea.setText("");
                bw.close();
                  //JOptionPane.showMessageDialog(null,"Sent!");

            } catch (IOException ex) {
                Logger.getLogger(FeedbackFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
   
        
        
        
        
    }

    @Override
    public void checkContract() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     ShowContractsFrame F=new ShowContractsFrame("Client", datao(ido));
        F.setVisible(true);
    
    };
    public String datao(String id){
        FileReader fr=null;
BufferedReader br=null;
String s = null;
String n="";
    File f = new File("Contract.txt");
  
if(f.exists()){
try{
fr = new FileReader(f);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(ShowContractsFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
br = new BufferedReader(fr);
    try {
        while ((s = br.readLine()) != null){
        if(s.contains(id)){
            n=s;
       
        }
        
        }
    } catch (IOException ex) {
        //Logger.getLogger(ShowContractsFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
     
}
else{
  

}
        return n;
    
    
    
    }
    
    
}
