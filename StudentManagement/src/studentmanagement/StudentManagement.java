/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author sajid
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Startpage1 ob1 = new Startpage1();
        ob1.setVisible(true);
        ob1.setBounds(0, 0, 770, 545);
        ob1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}
