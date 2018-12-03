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
import java.util.ArrayList;
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

public class UpdateEmployeeInfoFrame12 extends javax.swing.JFrame {
     
//String male_female = null;
FileReader fr=null;
BufferedReader br = null;
FileReader fr_s=null;
BufferedReader br_s = null;
String s = null;
ArrayList<String> id_staff = new ArrayList();
ArrayList<String> id_superviser = new ArrayList();

ArrayList<String> line_staff = new ArrayList();
ArrayList<String> line_superviser = new ArrayList();




    /**
     * Creates new form AddEmployeeFrame
     */
    public UpdateEmployeeInfoFrame12() {
        initComponents();
        load();
    }
   
    private void load(){
     File f = new File("Staff.txt");
     File fs = new File("Superviser.txt");
        if(f.exists() && fs.exists()){             
            try {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                fr_s = new FileReader(fs);
                br_s = new BufferedReader(fr_s);
                
                
                while((s=br.readLine())!=null){
                    //if(s.contains("Staff")){                      
                    //String n = s;
                    line_staff.add(s);
                    String words[] = s.split(",");
                   employeeIDCombo.addItem(words[0]);
                    id_staff.add(words[0]);
                    //name.add(words[1]);
                    //position.add(words[11]);                   
                    //}                    
                                                                      
                }
                   while((s=br_s.readLine())!=null){
                      line_superviser.add(s);                
                    //if(s.contains("Superviser")){                      
                    String n = s;
                    String words[] = n.split(",");
                    employeeIDCombo.addItem(words[0]);
                     id_superviser.add(words[0]);
                    //name.add(words[1]);
                   // position.add(words[11]);                    
                    //}                                                      
                }
                
          

            } catch (FileNotFoundException ex) {
                Logger.getLogger(EmployeeInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EmployeeInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
            }                      
        }
        
    
    
    
    };
    public void work(){
    if(id_staff.contains(employeeIDCombo.getSelectedItem().toString())){
    int index = id_staff.indexOf(employeeIDCombo.getSelectedItem().toString());
    String s = line_staff.get(index);
    String words[] = s.split(",");
   
    idTxtField.setText(words[0]);
     nameTxtFIeld.setText(words[1]);
    //passwordTxtField.setText(words[2]);
    emailTxt.setText(words[3]); 
    phoneTxt.setText(words[4]); 
    AddressTxt.setText(words[5]); 
    educationTxt.setText(words[7]); 
    AgeTxt.setText(words[6]); 
    salaryTxtField.setText(words[8]);
    joiningDateTxtField.setText(words[9]);
    memberGrpCombo.setText(words[11]);

    
    
     
    }
      if(id_superviser.contains(employeeIDCombo.getSelectedItem().toString())){
    int index = id_superviser.indexOf(employeeIDCombo.getSelectedItem().toString());
    String s = line_superviser.get(index);
    String words[] = s.split(",");
    nameTxtFIeld.setText(words[1]);
    idTxtField.setText(words[0]);
    //passwordTxtField.setText(words[2]);
    emailTxt.setText(words[3]); 
    phoneTxt.setText(words[4]); 
    AddressTxt.setText(words[5]); 
    AgeTxt.setText(words[6]); 
    educationTxt.setText(words[7]); 
    salaryTxtField.setText(words[8]);
    joiningDateTxtField.setText(words[9]);
    memberGrpCombo.setText(words[11]);
   // memberGrpCombo.getSelectedItem().toString());
 
    }
    
    
    
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
        nameTxtFIeld = new javax.swing.JTextField();
        createNewAccountBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        employeeIDCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();
        memberGrpCombo = new javax.swing.JLabel();
        idTxtField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Employee Frame");

        jLabel1.setText("Name:");

        jLabel3.setText("Member Group:");

        createNewAccountBtn.setText("Save Edited File");
        createNewAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccountBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel10.setText("Email");

        jLabel11.setText("Phone");

        jLabel12.setText("Address");

        jLabel13.setText("Age");

        jLabel14.setText("Education");

        jLabel15.setText("Salary");

        jLabel5.setText("Update Employee Info");

        jLabel6.setText("Joining Date");

        jLabel7.setText("------------------------");

        jLabel8.setText("Employee Information to Edit");

        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        memberGrpCombo.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(salaryTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(educationTxt)
                                        .addComponent(AddressTxt)
                                        .addComponent(phoneTxt)
                                        .addComponent(emailTxt)
                                        .addComponent(AgeTxt))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTxtFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idTxtField))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memberGrpCombo)
                                    .addComponent(joiningDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(employeeIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel5)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBtn)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameTxtFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addComponent(idTxtField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(educationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(memberGrpCombo))
                .addGap(43, 43, 43)
                .addComponent(createNewAccountBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createNewAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAccountBtnActionPerformed
 
       if(!name_check(nameTxtFIeld.getText())){
        JOptionPane.showMessageDialog(null,"Name cannot be blank or uncorrect");
        }
        
         else if(!joiningDate(joiningDateTxtField.getText())){
        JOptionPane.showMessageDialog(null,"Joining Date cannot be blank or incorrect ");
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
   
        else{
if(memberGrpCombo.getText().equals("Staff")){
      FileWriter fw_staff=null;
       BufferedWriter bw_staff=null;
       
    int find_index_id = id_staff.indexOf(employeeIDCombo.getSelectedItem().toString());
    //line_staff.remove(find_index_id);
    String s = line_staff.get(find_index_id);
        String words[] = s.split(",");
        String password = words[2];
        String male_female = words[10];
     String id= idTxtField.getText();
    String name= nameTxtFIeld.getText();
    String email=emailTxt.getText(); 
    String phone=phoneTxt.getText(); 
    String address=AddressTxt.getText(); 
    String education=educationTxt.getText(); 
    String age=AgeTxt.getText(); 
    String salary=salaryTxtField.getText();
    String joining_date=joiningDateTxtField.getText();
    //String position=memberGrpCombo.getText();
line_staff.remove(find_index_id);
   String l = id+","+name+","+password+","+ email+","+phone+","+address+","+age+","+ education+","+salary+","+joining_date+","+ male_female+","+"Staff";
    System.out.println(l);
   line_staff.add(l);
    try {
        fw_staff=new FileWriter("Staff.txt");
    } catch (IOException ex) {
        Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(Level.SEVERE, null, ex);
    }
       bw_staff=new BufferedWriter(fw_staff);
try{
       for(String arr:line_staff){
bw_staff.write(arr+"\n");


}
}
catch(Exception e){}
finally{
          try {
              bw_staff.close();
          } catch (IOException ex) {
              Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(Level.SEVERE, null, ex);
          }


}

}

 if(memberGrpCombo.getText().equals("Superviser")){
      FileWriter fw_staff=null;
       BufferedWriter bw_staff=null;
       
    int find_index_id = id_superviser.indexOf(employeeIDCombo.getSelectedItem().toString());
    //line_staff.remove(find_index_id);
    String s = line_superviser.get(find_index_id);
        String words[] = s.split(",");
        String password = words[2];
        String male_female = words[10];
     String id= idTxtField.getText();
    String name= nameTxtFIeld.getText();
    String email=emailTxt.getText(); 
    String phone=phoneTxt.getText(); 
    String address=AddressTxt.getText(); 
    String education=educationTxt.getText(); 
    String age=AgeTxt.getText(); 
    String salary=salaryTxtField.getText();
    String joining_date=joiningDateTxtField.getText();

line_superviser.remove(find_index_id);
   String l = id+","+name+","+password+","+ email+","+phone+","+address+","+age+","+ education+","+salary+","+joining_date+","+ male_female+","+"Superviser";
 System.out.println(l);
   line_superviser.add(l);
    try {
        fw_staff=new FileWriter("Superviser.txt");
    } catch (IOException ex) {
        Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(Level.SEVERE, null, ex);
    }
       bw_staff=new BufferedWriter(fw_staff);
try{
       for(String arr:line_superviser){
bw_staff.write(arr+"\n");


}
}
catch(Exception e){}
finally{
          try {
              bw_staff.close();
          } catch (IOException ex) {
              Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(Level.SEVERE, null, ex);
          }


}

}


 nameTxtFIeld.setText("");
idTxtField.setText("");
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

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
//         nameTxtFIeld.setText("");
//idTxtField.setText("");
////passwordTxtField.setText("");
//emailTxt.setText("");
//phoneTxt.setText("");
//AddressTxt.setText("");
//AgeTxt.setText("");
//educationTxt.setText("");
//salaryTxtField.setText("");
//joiningDateTxtField.setText("");
//buttonGroup1.clearSelection();
// 
        work();
    }//GEN-LAST:event_selectBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeInfoFrame12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeInfoFrame12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JTextField AgeTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createNewAccountBtn;
    private javax.swing.JTextField educationTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> employeeIDCombo;
    private javax.swing.JLabel idTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField joiningDateTxtField;
    private javax.swing.JLabel memberGrpCombo;
    private javax.swing.JTextField nameTxtFIeld;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField salaryTxtField;
    private javax.swing.JButton selectBtn;
    // End of variables declaration//GEN-END:variables
}
