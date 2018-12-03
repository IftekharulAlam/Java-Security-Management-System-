/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framePkg;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iftekharulalam
 */
public class Create_Contract_Form extends javax.swing.JFrame {
  
    String staff="";
    String superviser ="";
    int superviser_count = 0;
    int staff_count = 0;
int total_count = 0;
  
  
    /**
     * Creates new form Create_Contract_Form
     */
    public Create_Contract_Form() {
        initComponents();
        populateStaffCombo();
        //c.populateSuperViserCombo();
        
    }

  
       private void populateStaffCombo(){
            String s = null;
     FileReader fr=null;
BufferedReader br = null;
FileReader fr_s=null;
BufferedReader br_s = null;
     File f = new File("Staff.txt");
     File fs = new File("Superviser.txt");
        if(f.exists() && fs.exists()){             
            try {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                fr_s = new FileReader(fs);
                br_s = new BufferedReader(fr_s);
                
                
                while((s=br.readLine())!=null){
                    if(s.contains("Staff")){                      
                    String n = s;                    
                    String words[] = n.split(",");
                    StaffCombo.addItem(words[0]);
                                    
                    }                    
                                                                      
                }
                   while((s=br_s.readLine())!=null){
                                      
                    if(s.contains("Superviser")){                      
                    String n = s;
                    String words[] = n.split(",");
                      superViserCombo.addItem(words[0]);                
                    }                                                      
                }


            } catch (FileNotFoundException ex) {
                Logger.getLogger(EmployeeInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EmployeeInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
            }                      
        }
        
    
    
    
    };
    
        
    private boolean name_check(String name){
       if(name.equals("") || name.contains(",")){
        return false;
        }
       return true;
    
    
    };
    private boolean id_check(String id){
     if(id.equals("") || id.contains(",")){
        return false;
        }
       return true;
    
    
    
    
    };
    private boolean password_check(String password){
     if(password.equals("") || password.contains(",")){
        return false;
        }
       return true;
    
    
    
    
    };
    private boolean email_check(String email){
     if(email.equals("") || email.contains(",")){
        return false;
        }
       return true;
    
    
    
    
    };
    private boolean phone_check(String phone){
     if(phone.equals("") || phone.contains(",")){
        return false;
        }
       return true;
    
    
    
    
    };
    private boolean Address_check(String address){
     if(address.equals("") || address.contains(",")){
        return false;
        }
       return true;
    
    
    
    };
    private boolean Contract_check(String contract){
     if(contract.equals("") || contract.contains(",")){
        return false;
        }
       return true;
    
    
    
    };
    private boolean StartDate_check(String startDate){
    
     if(startDate.equals("") || startDate.contains(",")){
        return false;
        }
       return true;
    
    
    };
    private boolean EndDate_check(String EndDate){
     if(EndDate.equals("") || EndDate.contains(",")){
        return false;
        }
       return true;
    
    
    
    
    };
    
     private boolean id_is_present(String id){
 DataInputStream in =null; 
      File f = new File("login.bin");         
      String s = null;
      String n="";
      if(f.exists()){
      
          try {            
              in =  new DataInputStream(new BufferedInputStream(new FileInputStream(f)));      
                while (true){  
                  s = in.readUTF();
                    if(s.equals(id)){
                //String words[] = s.split(",");
                    n=s;
                  }  
              }
          } catch (Exception ex) {
              //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
         if(n.equals(id)){
            
             return false;
             
        }
         
         else{
  
       return true;
         }
         }
   
private void id_password_position(String id, String name, String password, String email, String phone, String Address, String contract, String startDate,String endDate, String superviser, String staff, int num){
   FileWriter fw=null;
    BufferedWriter bw =null;
    DataOutputStream out=null;
    try {
              // TODO add your handling code here:
              fw = new FileWriter("Contract.txt",true);
             out= new DataOutputStream(new BufferedOutputStream(new FileOutputStream ("login.bin",true)));

          } catch (Exception ex) {
            //Logger.getLogger(Create_Contract_Form.class.getName()).log(Level.SEVERE, null, ex);
          }
        bw = new BufferedWriter(fw);

    String l = null;
   // String i = null;
   l = id +","+name+","+password+","+email+","+phone+","+Address+","+contract+","+startDate+","+endDate+","+superviser+","+staff+","+num+","+"Client";
    // i = id +","+password+","+"Client";
        try {
            out.writeUTF(id);
            out.writeUTF(password);
            out.writeUTF("Client");
            bw.write(l);
            bw.write("\n");
        } catch (IOException ex) {
          // Logger.getLogger(CreateContractClass.class.getName()).log(Level.SEVERE, null, ex);
        }
finally{
                try {
                    bw.close();
                    out.close();
                  
                } catch (IOException ex) {
                    Logger.getLogger(Create_Contract_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
        
        
        
        
        
        

}
       
       
  


    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameTxtField = new javax.swing.JTextField();
        idTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contractTxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        startDateTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        endDateTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        superViserCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        StaffCombo = new javax.swing.JComboBox<>();
        assingSuperBtn = new javax.swing.JButton();
        assingStaffBtn = new javax.swing.JButton();
        CreateNewContractBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        superViserCountLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        staffCountLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jLabel3.setText("Password");

        jLabel4.setText("Email");

        jLabel5.setText("Phone");

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        jLabel8.setText("Contract");

        contractTxt.setColumns(20);
        contractTxt.setRows(5);
        jScrollPane1.setViewportView(contractTxt);

        jLabel9.setText("Start Date");

        jLabel11.setText("End Date");

        jLabel12.setText("No. of SuperViser Assinged: ");

        jLabel13.setText("No. of Staff Assinged:");

        assingSuperBtn.setText("Assing");
        assingSuperBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assingSuperBtnActionPerformed(evt);
            }
        });

        assingStaffBtn.setText("Assing");
        assingStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assingStaffBtnActionPerformed(evt);
            }
        });

        CreateNewContractBtn.setText("Create New Contract");
        CreateNewContractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewContractBtnActionPerformed(evt);
            }
        });

        jLabel14.setText("Assinged :");

        jLabel16.setText("Assinged: ");

        jLabel15.setText("Create New Contract");

        jLabel17.setText("---------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(endDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTxtField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(emailTxt))))
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StaffCombo, 0, 115, Short.MAX_VALUE)
                            .addComponent(superViserCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assingStaffBtn)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel16)
                                .addGap(21, 21, 21)
                                .addComponent(staffCountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assingSuperBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(superViserCountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(CreateNewContractBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(endDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(superViserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assingSuperBtn)
                    .addComponent(jLabel14)
                    .addComponent(superViserCountLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(StaffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assingStaffBtn)
                    .addComponent(jLabel16)
                    .addComponent(staffCountLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(CreateNewContractBtn)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void CreateNewContractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewContractBtnActionPerformed

         //for chechking 
         if(!id_is_present(idTxtField.getText())){
        JOptionPane.showMessageDialog(null,"id is already used plz change");
        }
         else if(!name_check(NameTxtField.getText())){
           JOptionPane.showMessageDialog(null,"Name cannot be blank");
           }
           else if(!id_check(idTxtField.getText())){
           JOptionPane.showMessageDialog(null,"ID cannot be blank");
           }
           else if(!password_check(passwordTxtField.getText())){
           JOptionPane.showMessageDialog(null,"password cannot be blank");
           }
           else if(!email_check(emailTxt.getText())){
           JOptionPane.showMessageDialog(null,"email cannot be blank");
           }
           else if(!phone_check(phoneTxt.getText())){
           JOptionPane.showMessageDialog(null,"phone cannot be blank");
           }
           else if(!Contract_check(contractTxt.getText())){
           JOptionPane.showMessageDialog(null,"Contract cannot be blank");
           }
           else if(!StartDate_check(startDateTxt.getText())){
           JOptionPane.showMessageDialog(null,"StartDate cannot be blank");
           }
           else if(!EndDate_check(endDateTxt.getText())){
           JOptionPane.showMessageDialog(null,"EndDate cannot be blank");
           }
           else if(!Address_check(AddressTxt.getText())){
           JOptionPane.showMessageDialog(null,"Address cannot be blank");
           }
          else if(!id_is_present(idTxtField.getText())){
        JOptionPane.showMessageDialog(null,"id is already used plz change");
        }
  
          else{
              
              
             total_count=superviser_count+staff_count;
              id_password_position(idTxtField.getText(),NameTxtField.getText(),passwordTxtField.getText(),emailTxt.getText(),phoneTxt.getText(),AddressTxt.getText(),contractTxt.getText(),startDateTxt.getText(),endDateTxt.getText(),superviser,staff,total_count);
                          
                   
               idTxtField.setText("");
               NameTxtField.setText("");
               passwordTxtField.setText("");
               emailTxt.setText("");
               phoneTxt.setText("");
               AddressTxt.setText("");
           contractTxt.setText("");
           startDateTxt.setText("");
           endDateTxt.setText("");
              populateStaffCombo();
             total_count=superviser_count=staff_count=0;

              
           }
          
          
          

        
        
        
    }//GEN-LAST:event_CreateNewContractBtnActionPerformed

    private void assingSuperBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assingSuperBtnActionPerformed
        // TODO add your handling code here:
        superviser_count += 1;
        superViserCountLbl.setText(String.valueOf(superviser_count));
        superviser += (String)superViserCombo.getSelectedItem()+"--";
        superViserCombo.removeItem(superViserCombo.getSelectedItem());
        
        
    }//GEN-LAST:event_assingSuperBtnActionPerformed

    private void assingStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assingStaffBtnActionPerformed
        // TODO add your handling code here:
        staff_count +=1;
        staffCountLbl.setText(String.valueOf(staff_count));
        staff +=(String)StaffCombo.getSelectedItem()+"--";
        StaffCombo.removeItem(StaffCombo.getSelectedItem());
        
        
    }//GEN-LAST:event_assingStaffBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create_Contract_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Contract_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Contract_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Contract_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new Create_Contract_Form().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JButton CreateNewContractBtn;
    private javax.swing.JTextField NameTxtField;
    private javax.swing.JComboBox<String> StaffCombo;
    private javax.swing.JButton assingStaffBtn;
    private javax.swing.JButton assingSuperBtn;
    private javax.swing.JTextArea contractTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField endDateTxt;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel staffCountLbl;
    private javax.swing.JTextField startDateTxt;
    private javax.swing.JComboBox<String> superViserCombo;
    private javax.swing.JLabel superViserCountLbl;
    // End of variables declaration//GEN-END:variables
}
