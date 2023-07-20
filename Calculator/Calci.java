import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


class Calci extends JFrame
{
    Container c;
    JLabel calnameLabel;
    JTextField inputTextF, ansTextF;
    JButton allclearButton, ansButton, backButton, negButton, sqrtButton, sqButton, decimalButton;
    JButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9; 
    JButton sumButton, subtractButton, divisionButton, multiButton, modButton, equalsButton;
    String inpuString = "";
    double firstNumber, lastNumber, ans, sqroot, sq;
    boolean sumBool = false;
    boolean subtractBool = false;
    boolean multiBool = false;
    boolean divisionBool = false;
    boolean modBool = false;



    Calci()
    {
        c = getContentPane();
        c.setLayout(null);

        //Initialize
        calnameLabel = new JLabel("Calci");
        inputTextF = new JTextField(20); 
        ansTextF = new JTextField();
     
        allclearButton = new JButton("AC");
        ansButton = new JButton("Ans");
        backButton = new JButton("Back");
        negButton = new JButton("±");
        sqrtButton = new JButton("√");
        sqButton = new JButton("x²");
        decimalButton = new JButton(".");
        Button0 = new JButton("0");
        Button1 = new JButton("1");
        Button2 = new JButton("2");
        Button3 = new JButton("3");
        Button4 = new JButton("4");
        Button5 = new JButton("5");
        Button6 = new JButton("6");
        Button7 = new JButton("7");
        Button8 = new JButton("8");
        Button9 = new JButton("9");
        sumButton = new JButton("+");
        subtractButton = new JButton("-");
        divisionButton = new JButton("/");
        multiButton = new JButton("*");
        modButton = new JButton("%");
        equalsButton = new JButton("=");
     
     
     
     
     
        //Fonts
        Font heading = new Font("Agency FB", Font.BOLD, 55);
        Font inpu = new Font("Cambria Math", Font.PLAIN, 17);
        Font numbers = new Font("Rockwell", Font.BOLD, 17);
        Font chotuNumbers = new Font("Rockwell", Font.PLAIN, 12);

        //Set Fonts
        calnameLabel.setFont(heading);
        inputTextF.setFont(inpu);
        ansTextF.setFont(inpu);

        allclearButton.setFont(numbers);
        ansButton.setFont(chotuNumbers);
        backButton.setFont(chotuNumbers);
        negButton.setFont(numbers);
        sqrtButton.setFont(numbers);
        sqButton.setFont(numbers);
        decimalButton.setFont(numbers);
        Button0.setFont(numbers);
        Button1.setFont(numbers);
        Button2.setFont(numbers);
        Button3.setFont(numbers);
        Button4.setFont(numbers);
        Button5.setFont(numbers);
        Button6.setFont(numbers); 
        Button7.setFont(numbers);
        Button8.setFont(numbers);
        Button9.setFont(numbers);
        sumButton.setFont(numbers);
        subtractButton.setFont(numbers);
        divisionButton.setFont(numbers);
        multiButton.setFont(numbers);
        modButton.setFont(numbers);
        equalsButton.setFont(numbers);



        //setBounds
        calnameLabel.setBounds(160, 5, 200, 60);
        inputTextF.setBounds(35, 75, 340, 40);
        ansTextF.setBounds(35, 125, 340, 40);


        allclearButton.setBounds(35, 200, 60, 40);
        ansButton.setBounds(105, 200, 60, 40);
        backButton.setBounds(175, 200, 60, 40);
        negButton.setBounds(245, 200, 60, 40);
        sqrtButton.setBounds(315, 200, 60, 40);

        Button7.setBounds(35, 250, 60, 40);
        Button8.setBounds(105, 250, 60, 40);
        Button9.setBounds(175, 250, 60, 40);
        divisionButton.setBounds(245, 250, 60, 40);
        modButton.setBounds(315, 250, 60, 40);
        
        Button4.setBounds(35, 300, 60, 40);
        Button5.setBounds(105, 300, 60, 40);
        Button6.setBounds(175, 300, 60, 40);
        multiButton.setBounds(245, 300, 60, 40);
        sqButton.setBounds(315, 300, 60, 40);

        Button1.setBounds(35, 350, 60, 40);
        Button2.setBounds(105, 350, 60, 40);
        Button3.setBounds(175, 350, 60, 40);
        subtractButton.setBounds(245, 350, 60, 40);
        equalsButton.setBounds(315, 350, 60, 90);

        Button0.setBounds(35, 400, 130, 40);
        decimalButton.setBounds(175, 400, 60, 40);
        sumButton.setBounds(245, 400, 60, 40);


        //Border
        Border tfBorder = BorderFactory.createLineBorder(Color.black, 2);
        inputTextF.setBorder(tfBorder);
        ansTextF.setBorder(tfBorder);


        //Propertries
        ansTextF.setEditable(false);
        ansTextF.setBackground(Color.WHITE);
        c.setBackground(new Color(152, 168, 108));


        //Actions

        ActionListener a = (ae) -> {
            if(ae.getSource() == allclearButton)
            {
                inputTextF.setText("");
                ansTextF.setText("");
                sumBool = false;
                subtractBool = false;
                multiBool = false;
                divisionBool = false;
                modBool = false;

                firstNumber = 0;
                lastNumber = 0;
                inputTextF.requestFocus();
            }
            if(ae.getSource() == backButton)
            {
                inpuString = inputTextF.getText();
                if(!inpuString.isEmpty())
                {
                    inpuString = inpuString.substring(0, inpuString.length() - 1);
                    inputTextF.setText(inpuString);
                    ansTextF.setText(inpuString);
                    inputTextF.requestFocus();
                }   
            }
            if(ae.getSource() == Button0)
            {
                inpuString = inputTextF.getText() + "0";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "0");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button1)
            {
                inpuString = inputTextF.getText() + "1";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "1");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button2)
            {
                inpuString = inputTextF.getText() + "2";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "2");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button3)
            {
                inpuString = inputTextF.getText() + "3";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "3");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button4)
            {
                inpuString = inputTextF.getText() + "4";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "4");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button5)
            {
                inpuString = inputTextF.getText() + "5";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "5");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button6)
            {
                inpuString = inputTextF.getText() + "6";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "6");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button7)
            {
                inpuString = inputTextF.getText() + "7";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "7");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button8)
            {
                inpuString = inputTextF.getText() + "8";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "8");
                inputTextF.requestFocus();
            }
            if(ae.getSource() == Button9)
            {
                inpuString = inputTextF.getText() + "9";
                inputTextF.setText(inpuString);
                ansTextF.setText(ansTextF.getText() + "9");
                inputTextF.requestFocus();
            }

            
            if(ae.getSource() == decimalButton)
            {
                if(inpuString.isEmpty() || inpuString.charAt(inpuString.length() - 1) == '-' || inpuString.charAt(inpuString.length() - 1) == '+' || inpuString.charAt(inpuString.length() - 1) == '*' || inpuString.charAt(inpuString.length() - 1) == '/' || inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.')
                {
                    JOptionPane.showMessageDialog(c, "Check Input");
                }
                else {
                    inpuString = inputTextF.getText() + ".";
                    inputTextF.setText(inpuString);
                    ansTextF.setText(ansTextF.getText() + ".");
                    inputTextF.requestFocus();
                }
            }
            if(ae.getSource() == negButton)
            {
                if(inputTextF.getText().isEmpty())
                {
                    inpuString = inputTextF.getText() + "-";
                    inputTextF.setText(inpuString);
                    inputTextF.requestFocus();
                }
                else {

                    if(inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.' || inpuString.charAt(inpuString.length() - 2) == '-')
                    {
                        JOptionPane.showMessageDialog(c, "Check Input");
                    } else {
                        inpuString = inputTextF.getText() + "-";
                        inputTextF.setText(inpuString);
                        inputTextF.requestFocus();
                    }
                }
            }
            if(ae.getSource() == divisionButton)
            {
                if(inpuString.isEmpty() || inpuString.charAt(inpuString.length() - 1) == '-' || inpuString.charAt(inpuString.length() - 1) == '+' || inpuString.charAt(inpuString.length() - 1) == '*' || inpuString.charAt(inpuString.length() - 1) == '/' || inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.')
                {
                    JOptionPane.showMessageDialog(c, "Check Input");
                }
                else {
                    divisionAdjustement();
                }
            }
            if(ae.getSource() == multiButton)
            {
                if(inpuString.isEmpty() || inpuString.charAt(inpuString.length() - 1) == '-' || inpuString.charAt(inpuString.length() - 1) == '+' || inpuString.charAt(inpuString.length() - 1) == '*' || inpuString.charAt(inpuString.length() - 1) == '/' || inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.')
                {
                    JOptionPane.showMessageDialog(c, "Check Input");
                }
                else {
                    multiAdjustement();
                }
            }
            if(ae.getSource() == subtractButton)
            {
                if(inputTextF.getText().isEmpty())
                {
                    inpuString = inputTextF.getText() + "-";
                    inputTextF.setText(inpuString);
                    inputTextF.requestFocus();
                }
                else {
                    subtractAdjustement();
                }
            }
            if(ae.getSource() == sumButton)
            {
                inpuString = inputTextF.getText();
                if(inpuString.isEmpty() || inpuString.charAt(inpuString.length() - 1) == '-' || inpuString.charAt(inpuString.length() - 1) == '+' || inpuString.charAt(inpuString.length() - 1) == '*' || inpuString.charAt(inpuString.length() - 1) == '/' || inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.')
                {
                    JOptionPane.showMessageDialog(c, "Check Input");
                }
                else {
                    sumAdjustement();
                }
            }
            if(ae.getSource() == modButton)
            {
                inpuString = inputTextF.getText();
                if(inpuString.isEmpty() || inpuString.charAt(inpuString.length() - 1) == '-' || inpuString.charAt(inpuString.length() - 1) == '+' || inpuString.charAt(inpuString.length() - 1) == '*' || inpuString.charAt(inpuString.length() - 1) == '/' || inpuString.charAt(inpuString.length() - 1) == '%' || inpuString.charAt(inpuString.length() - 1) == '.')
                {
                    JOptionPane.showMessageDialog(c, "Check Input");
                }
                else {
                    modAdjustement();
                }
            }
            if(ae.getSource() == equalsButton)
            {
                inpuString = inputTextF.getText();
                if(inpuString.contains("+"))
                {
                    try{
                        lastNumber = Double.parseDouble(ansTextF.getText());
                        sumBool = true;
                        if (sumBool) 
                        { 
                            lastNumber = firstNumber + lastNumber;
                        }
                        ansTextF.setText(Double.toString(lastNumber));
                        inputTextF.setText(Double.toString(lastNumber));
                        sumBool = false;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(c, "INVALID INPUT", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                }
                else if(inpuString.contains("-"))
                {
                    try{
                        lastNumber = Double.parseDouble(ansTextF.getText());
                        subtractBool = true;
                        if (subtractBool) 
                        { 
                            lastNumber = firstNumber - lastNumber;
                        }
                        ansTextF.setText(Double.toString(lastNumber));
                        inputTextF.setText(Double.toString(lastNumber));
                        subtractBool = false;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(c, "INVALID INPUT", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                }
                else if(inpuString.contains("*"))
                {
                    try{
                        lastNumber = Double.parseDouble(ansTextF.getText());
                        multiBool = true;
                        if (multiBool) 
                        { 
                            lastNumber = firstNumber * lastNumber;
                        }
                        ansTextF.setText(Double.toString(lastNumber));
                        inputTextF.setText(Double.toString(lastNumber));
                        multiBool = false;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(c, "INVALID INPUT", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                }
                else if(inpuString.contains("/"))
                {
                    try{
                        lastNumber = Double.parseDouble(ansTextF.getText());
                        divisionBool = true;
                        if (divisionBool) 
                        { 
                        	if(lastNumber == 0)
				            {
					            JOptionPane.showMessageDialog(c, "0 cannot be a denominator", "Error", JOptionPane.ERROR_MESSAGE);
                                inputTextF.setText("");
                                ansTextF.setText("");
                		    }
                            else {
                                lastNumber = firstNumber / lastNumber;
                            }
                        }
                        ansTextF.setText(Double.toString(lastNumber));
                        inputTextF.setText(Double.toString(lastNumber));
                        divisionBool = false;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(c, "INVALID INPUT", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                }
                else if(inpuString.contains("%"))
                {
                    try{
                        lastNumber = Double.parseDouble(ansTextF.getText());
                        modBool = true;
                        if (modBool) 
                        { 
                            lastNumber = firstNumber % lastNumber;
                        }
                        ansTextF.setText(Double.toString(lastNumber));
                        inputTextF.setText(Double.toString(lastNumber));
                        modBool = false;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(c, "INVALID INPUT", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                } else {
                    //inputTextF.setText("");
                    //inputTextF.requestFocus();
                }
                
            }
            if(ae.getSource() == sqrtButton)
            {
                inpuString = inputTextF.getText();
                if(inpuString.isEmpty())
                {
                    JOptionPane.showMessageDialog(c, "Invalid Operation");
                }
                else {
                    
                    if(inpuString.contains("-") || inpuString.contains("+") || inpuString.contains("*") || inpuString.contains("/") || inpuString.contains("%"))
                    {
                        JOptionPane.showMessageDialog(c, "MATH ERROR", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        sqroot = Double.parseDouble(inpuString);
                        sqroot = Math.sqrt(sqroot);
                        inputTextF.setText("");
                        ansTextF.setText(String.valueOf(sqroot));
                        inputTextF.requestFocus();
                    }
                }
            }
            if(ae.getSource() == sqButton)
            {
                inpuString = inputTextF.getText();
                if(inpuString.isEmpty())
                {
                    JOptionPane.showMessageDialog(c, "Invalid Operation");
                }
                else {
                    
                    if(inpuString.contains("+") || inpuString.contains("*") || inpuString.contains("/") || inpuString.contains("%"))
                    {
                        JOptionPane.showMessageDialog(c, "MATH ERROR", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        sq = Double.parseDouble(inpuString);
                        sq = sq * sq;
                        inputTextF.setText("");
                        ansTextF.setText(String.valueOf(sq));
                        inputTextF.requestFocus();
                    }
                }
            }
            if(ae.getSource() == ansButton)
            {
                inputTextF.setText(ansTextF.getText());
                inputTextF.requestFocus();
            }
            
        };

        allclearButton.addActionListener(a);
        backButton.addActionListener(a);
        negButton.addActionListener(a);
        Button0.addActionListener(a);
        Button1.addActionListener(a);
        Button2.addActionListener(a);
        Button3.addActionListener(a);
        Button4.addActionListener(a);
        Button5.addActionListener(a);
        Button6.addActionListener(a);
        Button7.addActionListener(a);
        Button8.addActionListener(a);
        Button9.addActionListener(a);
        sumButton.addActionListener(a);
        divisionButton.addActionListener(a);
        decimalButton.addActionListener(a);
        subtractButton.addActionListener(a);
        multiButton.addActionListener(a);
        modButton.addActionListener(a);
        equalsButton.addActionListener(a);
        sqrtButton.addActionListener(a);
        sqButton.addActionListener(a);
        ansButton.addActionListener(a);

        //add to pane
        c.add(calnameLabel);
        c.add(inputTextF);
        c.add(ansTextF);

        c.add(allclearButton); 
        c.add(ansButton);
        c.add(backButton); 
        c.add(negButton); 
        c.add(sqrtButton); 
        c.add(sqButton);
        c.add(decimalButton); 
        c.add(Button0); 
        c.add(Button1); 
        c.add(Button2); 
        c.add(Button3); 
        c.add(Button4); 
        c.add(Button5); 
        c.add(Button6);
        c.add(Button7);
        c.add(Button8); 
        c.add(Button9);
        c.add(sumButton);
        c.add(subtractButton); 
        c.add(divisionButton); 
        c.add(multiButton);
        c.add(modButton);
        c.add(equalsButton);
        


        setTitle("Calculator by Vishnu");
        setSize(420, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void sumAdjustement()
    {
        inpuString = inputTextF.getText();
        try {

            if(inpuString.contains("+"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber + lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("-"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber - lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("*"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber * lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("/"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber / lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("%"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber % lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else {
                try {
                    firstNumber = Double.parseDouble(ansTextF.getText());
                    inpuString = inputTextF.getText() + "+";
                    inputTextF.setText(inpuString);
                    ansTextF.setText("");
                    inputTextF.requestFocus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(c, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(c, e);
        }
        
    }

    public void subtractAdjustement()
    {
        inpuString = inputTextF.getText();
        try {

            if(inpuString.contains("+"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber + lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("-"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber - lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("*"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber * lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("/"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber / lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("%"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber % lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else {
                try {
                    firstNumber = Double.parseDouble(ansTextF.getText());
                    inpuString = inputTextF.getText() + "-";
                    inputTextF.setText(inpuString);
                    ansTextF.setText("");
                    inputTextF.requestFocus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(c, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(c, e);
        }
        
    }

    public void multiAdjustement()
    {
        inpuString = inputTextF.getText();
        try {

            if(inpuString.contains("+"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber + lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("-"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber - lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("*"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber * lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("/"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber / lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("%"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber % lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else {
                try {
                    firstNumber = Double.parseDouble(ansTextF.getText());
                    inpuString = inputTextF.getText() + "*";
                    inputTextF.setText(inpuString);
                    ansTextF.setText("");
                    inputTextF.requestFocus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(c, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(c, e);
        }
        
    }

    public void divisionAdjustement()
    {
        inpuString = inputTextF.getText();
        try {

            if(inpuString.contains("+"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber + lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("-"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber - lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("*"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber * lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("/"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                if(lastNumber == 0)
                {
                    JOptionPane.showMessageDialog(c, "0 cannot be a denominator", "Error", JOptionPane.ERROR_MESSAGE);
                    inputTextF.setText("");
                    ansTextF.setText("");
                }
                else {
                    lastNumber = firstNumber / lastNumber;
                            ansTextF.setText(String.valueOf(lastNumber));
                            inputTextF.setText(String.valueOf(lastNumber));
                }
            }
            else if(inpuString.contains("%"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber % lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else {
                try {
                    firstNumber = Double.parseDouble(ansTextF.getText());
                    inpuString = inputTextF.getText() + "/";
                    inputTextF.setText(inpuString);
                    ansTextF.setText("");
                    inputTextF.requestFocus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(c, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(c, e);
        }
        
    }

    public void modAdjustement()
    {
        inpuString = inputTextF.getText();
        try {

            if(inpuString.contains("+"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber + lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("-"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber - lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("*"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber * lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("/"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber / lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else if(inpuString.contains("%"))
            {
                lastNumber = Double.parseDouble(ansTextF.getText());
                lastNumber = firstNumber % lastNumber;
                ansTextF.setText(String.valueOf(lastNumber));
                inputTextF.setText(String.valueOf(lastNumber));
            }
            else {
                try {
                    firstNumber = Double.parseDouble(ansTextF.getText());
                    inpuString = inputTextF.getText() + "%";
                    inputTextF.setText(inpuString);
                    ansTextF.setText("");
                    inputTextF.requestFocus();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(c, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(c, e);
        }
        
    }

    public static void main(String[] args) {
        new Calci();
    }
}
