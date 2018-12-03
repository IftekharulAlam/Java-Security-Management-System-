package framePkg;

import classPkg_CC.Admin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class AdminPanel extends javax.swing.JPanel {
    FileReader fr = null;
    BufferedReader br = null;
    String s = null;
    String n = null;
String name=null;
String ido = "";
String ida = "";
Admin a = new Admin();
    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
      
      
    }

    public void setNameAndID(String id){
        File f = new File("Admin.txt");
        if(f.exists()){
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        br = new BufferedReader(fr);
        try {
            while ((s = br.readLine()) != null){
                
                if(s.contains(id)){
                    n=s;
                    String words[] = n.split(",");
                    
                    ido = words[0];
                    if(ido.equals(id)){
                        ida = words[0];
                    name = words[1];
                    }
                    }
                
                }
            idLbl.setText(ida);
        nameLbl.setText(name);
        
            }
        catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
     
        else{
        idLbl.setText("");
        nameLbl.setText("");
        
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

        ShowcontractBtn = new javax.swing.JButton();
        editTrainingProgramBtn = new javax.swing.JButton();
        NotificationBtn = new javax.swing.JButton();
        employeeInformationBtn = new javax.swing.JButton();
        AdEmployeeBtn = new javax.swing.JButton();
        generateBtn = new javax.swing.JButton();
        createNewContractBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        updateEmployeeInformation = new javax.swing.JButton();

        ShowcontractBtn.setText("Show Contracts");
        ShowcontractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowcontractBtnActionPerformed(evt);
            }
        });

        editTrainingProgramBtn.setText("Training Program");
        editTrainingProgramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTrainingProgramBtnActionPerformed(evt);
            }
        });

        NotificationBtn.setText("Notifications");
        NotificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationBtnActionPerformed(evt);
            }
        });

        employeeInformationBtn.setText("Employee Information");
        employeeInformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeInformationBtnActionPerformed(evt);
            }
        });

        AdEmployeeBtn.setText("Add Employee");
        AdEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdEmployeeBtnActionPerformed(evt);
            }
        });

        generateBtn.setText("Generate Reports");
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        createNewContractBtn.setText("Create New Contract");
        createNewContractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewContractBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        updateEmployeeInformation.setText("Update Employee Information");
        updateEmployeeInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NotificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateEmployeeInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createNewContractBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AdEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowcontractBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeeInformationBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(editTrainingProgramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NotificationBtn)
                    .addComponent(jLabel1)
                    .addComponent(nameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idLbl))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTrainingProgramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeInformationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowcontractBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewContractBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateEmployeeInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AdEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdEmployeeBtnActionPerformed
        // TODO add your handling code here:
      a.createEmployee();
    }//GEN-LAST:event_AdEmployeeBtnActionPerformed

    private void employeeInformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeInformationBtnActionPerformed
        // TODO add your handling code here:
        a.viewEmployeeInfo();
    }//GEN-LAST:event_employeeInformationBtnActionPerformed

    private void ShowcontractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowcontractBtnActionPerformed
        // TODO add your handling code here:
   a.viewContract();
    }//GEN-LAST:event_ShowcontractBtnActionPerformed

    private void editTrainingProgramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTrainingProgramBtnActionPerformed
        // TODO add your handling code here:
      
      a.offerTrainingProgram();
    }//GEN-LAST:event_editTrainingProgramBtnActionPerformed

    private void NotificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationBtnActionPerformed
        // TODO add your handling code here:
       a.receivingNotification();
    }//GEN-LAST:event_NotificationBtnActionPerformed

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        // TODO add your handling code here:
        a.generateReports();
        
    }//GEN-LAST:event_generateBtnActionPerformed

    private void createNewContractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewContractBtnActionPerformed
        // TODO add your handling code here:
        a.createContract();
    }//GEN-LAST:event_createNewContractBtnActionPerformed

    private void updateEmployeeInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeInformationActionPerformed
        // TODO add your handling code here:
        
        a.updateEmployeeInfor();
    }//GEN-LAST:event_updateEmployeeInformationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdEmployeeBtn;
    private javax.swing.JButton NotificationBtn;
    private javax.swing.JButton ShowcontractBtn;
    private javax.swing.JButton createNewContractBtn;
    private javax.swing.JButton editTrainingProgramBtn;
    private javax.swing.JButton employeeInformationBtn;
    private javax.swing.JButton generateBtn;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton updateEmployeeInformation;
    // End of variables declaration//GEN-END:variables
}