/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classPkg_AC;

/**
 *
 * @author iftekharulalam
 */
public abstract class  Employee extends User implements Trainable{
    abstract public void applyForTrainingProgram();
     abstract public boolean validateTrainable(String id);

    
   abstract public boolean askAndCheckUsernameAndPassword(String id, String password, String position);
        
   
   }
