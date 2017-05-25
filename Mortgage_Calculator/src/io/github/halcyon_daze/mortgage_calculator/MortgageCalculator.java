/**
 * 
 */
package io.github.halcyon_daze.mortgage_calculator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


/**
 * @author Christopher Chin
 * @date May 24
 *
 */
public class MortgageCalculator implements ActionListener{

    JFrame MainGUI;
    private JTextField mortgageTextField;
    private JTextField interestTextField;
    private JTextField nTermsTextField;
    private JButton findMonthlyPaymentButton;
    
    private JLabel MonthlyPayment;
    
    private JLabel mortgageText;
    private JLabel interestText;
    private JLabel ntermsText;
    
    MortgageCalculator() {
        MainGUI = new JFrame("Cost Of Floor");
        
        MainGUI.setLayout(new FlowLayout());
     
        MainGUI.setSize(300, 200);
        MainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mortgageText = new JLabel("Initial Mortgage Amount: $");
        mortgageTextField = new JTextField(10);
        mortgageTextField.setText("1000");
        
        interestText = new JLabel("Monthly Interest Rate: %");
        interestTextField = new JTextField(10);
        interestTextField.setText("5");
        
        ntermsText = new JLabel("Number of Terms: ");
        nTermsTextField = new JTextField(10);
        nTermsTextField.setText("12");
        
        MonthlyPayment = new JLabel("$___ Per Month", FlowLayout.RIGHT);
        MonthlyPayment.setVerticalAlignment(SwingConstants.BOTTOM);
        
        findMonthlyPaymentButton = new JButton("Find Monthly Payment");
        findMonthlyPaymentButton.setPreferredSize(new Dimension(200,30));
        findMonthlyPaymentButton.addActionListener(this);
        
        MainGUI.add(mortgageText);
        MainGUI.add(mortgageTextField);
        
        MainGUI.add(interestText);
        MainGUI.add(interestTextField);
        
        MainGUI.add(ntermsText);
        MainGUI.add(nTermsTextField);
        
        MainGUI.add(findMonthlyPaymentButton);
        MainGUI.add(MonthlyPayment);
        
        MainGUI.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        float mortgage = Float.valueOf(mortgageTextField.getText());
        float interestRate = Float.valueOf(interestTextField.getText());
        float nTerms = Float.valueOf(nTermsTextField.getText());
        
        MonthlyPayment.setText("$" + String.valueOf(calculateMonthlyPayment(nTerms, interestRate, mortgage)) + " Per Month");
        findMonthlyPaymentButton.setText("Update Payment Amount");
    }
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater ( new Runnable(){
            public void run() {
                new MortgageCalculator();
            }
        });

    }

    /*
     * @param nTerms total number of payments, one payment per month
     * @param monthlyInterestRate monthly interest rate on mortgage
     * @param mortage initial amount borrowed
     * @return Monthly payment on mortgage
     */
    public static float calculateMonthlyPayment(float nTerms, float monthlyInterestRate, float mortgage){
         double monthlyPayment = mortgage * ((monthlyInterestRate/100) * Math.pow(1 + monthlyInterestRate/100, nTerms)) 
                / (Math.pow(1 + monthlyInterestRate/100, nTerms) - 1) ;
         
         return (float) Math.round(monthlyPayment * 100) / 100;
    }
}
