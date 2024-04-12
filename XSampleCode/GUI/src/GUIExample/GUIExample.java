package GUIExample;

import javax.swing.*;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AI Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String name = JOptionPane.showInputDialog(frame, "Hi! What's your name?"); // Prompt for user's name
        
        String[] options = {"About love", "About life"};
        int choice = JOptionPane.showOptionDialog(frame, "Hello " + name + "! How can I help you?", "AI Chat", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); // Prompt for user's choice
        
        if (choice == 0) { // If user chooses "About love"
            String[] loveOptions = {"Yes", "No"};
            int loveChoice = JOptionPane.showOptionDialog(frame, "Do you want a date this coming weekend?", "AI Chat", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, loveOptions, loveOptions[0]); // Prompt for love-related choice
            
            if (loveChoice == 0) { // If user chooses to have a date
                String[] dateOptions = {"Flower", "Ice Cream"};
                int dateChoice = JOptionPane.showOptionDialog(frame, "Would you give her a Flower or Ice Cream?", "AI Chat", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dateOptions, dateOptions[0]); // Prompt for date-related choice
                
                if (dateChoice >= 0) { // If user makes a choice for the date
                    JOptionPane.showMessageDialog(frame, "You are really a nice guy charot"); // Display message
                }
            }
         // If user chooses "About life"    
        } else if (choice == 1) { 
            String[] tiredOptions = {"Yes", "No"};
            int tiredChoice = JOptionPane.showOptionDialog(frame, "Are you ok? Tired?", "AI Chat", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tiredOptions, tiredOptions[0]); // Prompt for tired-related choice
            
            if (tiredChoice == 0) { // If user is tired
                JOptionPane.showMessageDialog(frame, "I'm sorry about that"); // Display message
                
                // Prompt for user response
                String response; 
                // Use the 'response' variable as needed
				response = JOptionPane.showInputDialog(frame, "Please type your response:");
            }
         // Display message prompt for Advice about life
            JOptionPane.showMessageDialog(frame, "I know you're tired"); 
            JOptionPane.showMessageDialog(frame, "Learn to rest and not to quit"); 
            JOptionPane.showMessageDialog(frame, "Life is cruel"); 
            JOptionPane.showMessageDialog(frame, "Trust me, everything will be alright"); 
            JOptionPane.showMessageDialog(frame, "Always pray to God"); 
            JOptionPane.showMessageDialog(frame, "He will help you everyday"); 
            JOptionPane.showMessageDialog(frame, "CHEER UP ^_^"); 
        }
    }
}