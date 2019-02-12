/*
 *  Joshua Lawson, Student and Pursuer of knowledge
 */
package passwordtaker;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Josh
 */
public class PasswordTaker {

    private JFrame frame;
    private JLabel AddressLabel;
    private JLabel PasswordLabel;
    private JPanel container;
    private JTextField username;
    private JTextField password;

    
    public PasswordTaker(){
        prepareGUI();
    }
    
    
    public static void main(String[] args) {
        
        PasswordTaker passwordTaker = new PasswordTaker();
        passwordTaker.displayEvents();
    }
    
    private void prepareGUI(){
        frame = new JFrame("PasswordTaker");
        frame.setSize(375,150);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        container = new JPanel();
        frame.setLayout(new GridLayout(5, 1));
        
        AddressLabel = new JLabel();
        AddressLabel.setText("Username:"); 
        PasswordLabel = new JLabel();   
        PasswordLabel.setText("Password:"); 
        
        
        username = new JTextField();
        password = new JTextField();


        //close on close button
        frame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
              System.exit(0);
           }        
        });    
        
        frame.add(AddressLabel);
        frame.add(username);
        frame.add(PasswordLabel);
        frame.add(password);
        frame.add(container);
        frame.setVisible(true);  
   }
    
    
    private void displayEvents(){

        JButton submitButton = new JButton("Submit");
        submitButton.setActionCommand("Submit");
        submitButton.addActionListener(new ButtonClickListener()); 
        container.add(submitButton);      

        frame.setVisible(true);  
   }
    
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();  
         
         if( command.equals( "Submit" ))  {
            //send text via email
         }  	
        }
              
    }
    
}
