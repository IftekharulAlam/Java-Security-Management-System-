package framePkg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class AddEmlpoyeeFrame extends javax.swing.JFrame {
     
String male_female = null;

    /**
     * Creates new form AddEmployeeFrame
     */
    public AddEmlpoyeeFrame() {
        initComponents();
    }
    
   
   private boolean id_check(String id){
        if(id.equals("") || id.contains(",")){
        return false;
        }
       return true;
   
   }
    private boolean joiningDate(String date){
        if(date.equals("") || date.contains(",")){
     
        return false;
            }
            else{
            return true;
            }
  
    }
    
   private boolean name_check(String name){
        if(name.equals("") || name.contains(",")){
        return false;
        }
       return true;
   
   }
 private boolean password_check(String password){
        if(password.equals("") || password.contains(",")){
        return false;
        }
       return true;
   
   }
    
     private boolean email_check(String email){
        if(email.equals("") || email.contains(",")){
        return false;
        }
       return true;
   
   }
      private boolean phone_check(String phone){
        if(phone.equals("") || phone.contains(",")){
        return false;
        }
       return true;
   
   }
       private boolean address_check(String address){
        if(address.equals("") || address.contains(",")){
        return false;
        }
       return true;
   
   }
        private boolean age_check(String age){
        if(age.equals("") || age.contains(",")){
        return false;
        }
       return true;
   
   }
     private boolean education_check(String education){
        if(education.equals("") || education.contains(",")){
        return false;
        }
       return true;
   
   }
      private boolean salary_check(String salary){
        if(salary.equals("") || salary.contains(",")){
        return false;
        }
       return true;
   
   }
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
         if(n.contains(id)){
             return false;
        }
         
         else{
  
       return true;
         }
         }
      private void id_password_position(String name, String id,String password, String email, String phone, String Address, String Age,String education,String salary,String date, String male_female,String memberGrp){
DataOutputStream out=null;
     
          FileWriter fw_admin=null;
       BufferedWriter bw_admin=null;
          
       FileWriter fw_staff=null;
       BufferedWriter bw_staff=null;
       
       FileWriter fw_superViser=null;
       BufferedWriter bw_superViser=null;
       
        try {
           out= new DataOutputStream(new BufferedOutputStream(new FileOutputStream ("login.bin",true)));
              //fw_p = new FileWriter("Personal.txt",true);
                  fw_admin=new FileWriter("Admin.txt",true);;
          
       fw_staff=new FileWriter("Staff.txt",true);;
       
        fw_superViser=new FileWriter("Superviser.txt",true);;
       
          } catch (Exception ex) {
              //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
         
        
       // bw_p = new BufferedWriter(fw_p);
       
       bw_admin=new BufferedWriter(fw_admin);
          
       bw_staff=new BufferedWriter(fw_staff);
       
       bw_superViser=new BufferedWriter(fw_superViser);
 
//-----------        
if(memberGrp.equals("Admin")){
          String l = id+","+name+","+password+","+ email+","+phone+","+Address+","+Age+","+ education+","+salary+","+date+","+ male_female+","+"Admin";
    try {
        bw_admin.write(l);
        bw_admin.write("\n");
    } catch (IOException ex) {
        Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally{
                try {
                    bw_admin.close(); 
                    //out.close();
                 
                } catch (Exception ex) {
                    //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }


}
else if(memberGrp.equals("Staff")){
   String l = id+","+name+","+password+","+ email+","+phone+","+Address+","+Age+","+ education+","+salary+","+date+","+ male_female+","+"Staff";
  try {
        bw_staff.write(l);
        bw_staff.write("\n");
    } catch (IOException ex) {
        Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally{
                try {
                    bw_staff.close(); 
                    //out.close();
                 
                } catch (Exception ex) {
                    //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }


}
else if(memberGrp.equals("Superviser")){
          String l = id+","+name+","+password+","+ email+","+phone+","+Address+","+Age+","+ education+","+salary+","+date+","+ male_female+","+"Superviser";
  try {
        bw_superViser.write(l);
        bw_superViser.write("\n");
    } catch (IOException ex) {
        Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally{
                try {
                    bw_superViser.close(); 
                    //out.close();
                 
                } catch (Exception ex) {
                    //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }


}

//-----------
      String k = id+","+password+","+memberGrp;
          try {
          out.writeUTF(id);
          out.writeUTF(password);
          out.writeUTF(memberGrp);
          out.close();
        
       } catch (IOException ex) {
           //Logger.getLogger(CreateNewAccountFrameClass.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        memberGrpCombo = new javax.swing.JComboBox<>();
        maleRadioBtn = new javax.swing.JRadioButton();
        FemaleRadioBtn = new javax.swing.JRadioButton();
        nameTxtFIeld = new javax.swing.JTextField();
        createNewAccountBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AgeTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        educationTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        salaryTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        joiningDateTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Employee Frame");

        jLabel1.setText("Name:");

        jLabel3.setText("Member Group:");

        jLabel4.setText("Gender:");

        memberGrpCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Superviser", "Admin" }));

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setText("Male");

        buttonGroup1.add(FemaleRadioBtn);
        FemaleRadioBtn.setText("Female");

        createNewAccountBtn.setText("Create New Account");
        createNewAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccountBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel9.setText("Password");

        jLabel10.setText("Email");

        jLabel11.setText("Phone");

        jLabel12.setText("Address");

        jLabel13.setText("Age");

        jLabel14.setText("Education");

        jLabel15.setText("Salary");

        jLabel5.setText("Create New Account");

        jLabel6.setText("Joining Date");

        jLabel7.setText("------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(salaryTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(educationTxt)
                                    .addComponent(AddressTxt)
                                    .addComponent(phoneTxt)
                                    .addComponent(emailTxt)
                                    .addComponent(passwordTxtField)
                                    .addComponent(AgeTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(joiningDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(memberGrpCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(maleRadioBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(FemaleRadioBtn))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTxtFIeld, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(idTxtField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel7)))
                        .addContainerGap(122, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxtFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(educationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(salaryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(joiningDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadioBtn)
                    .addComponent(FemaleRadioBtn)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(memberGrpCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createNewAccountBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createNewAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAccountBtnActionPerformed
       
       //AddEmployeeFrameClassFile c = new AddEmployeeFrameClassFile();
     
         if(!id_is_present(idTxtField.getText())){
        JOptionPane.showMessageDialog(null,"id is already used plz change");
        }
       else if(!name_check(nameTxtFIeld.getText())){
        JOptionPane.showMessageDialog(null,"Name cannot be blank or uncorrect");
        }
        else if(!id_check(idTxtField.getText())){
        JOptionPane.showMessageDialog(null,"ID cannot be blank or incorrect ");
        }
         else if(!joiningDate(joiningDateTxtField.getText())){
        JOptionPane.showMessageDialog(null,"Joining Date cannot be blank or incorrect ");
        }  
        else if(!password_check(passwordTxtField.getText())){
        JOptionPane.showMessageDialog(null," password cannot be blank or incorrect");
        }
        else if(!email_check(emailTxt.getText())){
        JOptionPane.showMessageDialog(null,"Email cannot be blank or incorrect");
        }
        else if(!phone_check(phoneTxt.getText())){
        JOptionPane.showMessageDialog(null,"Phone cannot be blank or incorrect");
        }
        else if(!address_check(AddressTxt.getText())){
        JOptionPane.showMessageDialog(null,"Address cannot be blank or incorrect");
        }
       
        else if(!age_check(AgeTxt.getText())){
        JOptionPane.showMessageDialog(null,"Age cannot be blank or incorrect");
        }
        else if(!education_check(educationTxt.getText())){
        JOptionPane.showMessageDialog(null,"Education cannot be blank or incorrect");
        }
        else if(!salary_check(salaryTxtField.getText())){
        JOptionPane.showMessageDialog(null,"Salary cannot be blank or incorrect");
        }
        else if(!(maleRadioBtn.isSelected() || FemaleRadioBtn.isSelected())){
        JOptionPane.showMessageDialog(null,"plz select a gender");
        }
        
 
         
        else{
        
    
if(maleRadioBtn.isSelected()){
    male_female = "male";
}
else if(FemaleRadioBtn.isSelected()){
male_female = "Female";
}

id_password_position(nameTxtFIeld.getText(), idTxtField.getText(), passwordTxtField.getText(), emailTxt.getText(), phoneTxt.getText(), AddressTxt.getText(), AgeTxt.getText(), educationTxt.getText(), salaryTxtField.getText(),joiningDateTxtField.getText(), male_female, memberGrpCombo.getSelectedItem().toString());

 nameTxtFIeld.setText("");
idTxtField.setText("");
passwordTxtField.setText("");
emailTxt.setText("");
phoneTxt.setText("");
AddressTxt.setText("");
AgeTxt.setText("");
educationTxt.setText("");
salaryTxtField.setText("");
joiningDateTxtField.setText("");
buttonGroup1.clearSelection();
 

             
         }
    
    }//GEN-LAST:event_createNewAccountBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmlpoyeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JRadioButton FemaleRadioBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createNewAccountBtn;
    private javax.swing.JTextField educationTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField joiningDateTxtField;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JComboBox<String> memberGrpCombo;
    private javax.swing.JTextField nameTxtFIeld;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField salaryTxtField;
    // End of variables declaration//GEN-END:variables
}
