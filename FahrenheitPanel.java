import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {

    private JLabel inputLabel, outputLabel, resultLabel;
    private JButton ans;
    private JTextField fahrenheit;

    //-----------------------------------------------------------------
// Constructor: Sets up the main GUI components.
//-----------------------------------------------------------------
    public FahrenheitPanel() {
        inputLabel = new JLabel("Enter Fahrenheit temperature:");
        outputLabel = new JLabel("\n Temperature in Celsius: ");
        resultLabel = new JLabel("---");
        fahrenheit = new JTextField(5);
        fahrenheit.addActionListener(new TempListener());
        ans = new JButton("Convert");
        ans.addActionListener(new ButtonListener());
        add(inputLabel);
        add(fahrenheit);
        add(ans);
        System.out.println();
        add(outputLabel);
        add(resultLabel);
        setPreferredSize(new Dimension(200, 75));
        setBackground(Color.yellow);


    }
    //*****************************************************************
// Represents an action listener for the temperature input field.
//*****************************************************************
    private class TempListener implements ActionListener
    {
        //--------------------------------------------------------------
// Performs the conversion when the enter key is pressed in
// the text field.
//--------------------------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();
            fahrenheitTemp= Integer.parseInt(text);
            celsiusTemp= (fahrenheitTemp-32) * 5/9;
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }

    private class ButtonListener implements ActionListener
    {
        //--------------------------------------------------------------
// Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();
            fahrenheitTemp= Integer.parseInt(text);
            celsiusTemp= (fahrenheitTemp-32) * 5/9;
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}







