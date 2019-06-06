package GUI;


import java.awt.*;
import javax.swing.*;

public class LoginScreen {

    private static JLabel errorLabel = new JLabel("User sau parola incorecte");
    private static JTextField usernameTextField = new JTextField();
    private static JTextField passwordTextField = new JTextField();
    private static JButton loginButton = new JButton("Login");

    private static JFrame frame;

    public static JFrame getFrame() {
        return frame;
    }

    public static JLabel getErrorLabel() {
        return errorLabel;
    }

    public static void addComponentsToPane(Container pane) {

        usernameTextField = new JTextField();
        passwordTextField = new JTextField();
        JLabel label;

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        label = new JLabel("Utilizator: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label, c);

        label = new JLabel("Parola: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(usernameTextField, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(passwordTextField, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(loginButton, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(errorLabel, c);
        errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false);
    }

    public static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("LOGIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.setSize(250, 250);
        //Display the window.
        frame.setVisible(true);
    }

    public static JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public static JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public static JButton getLoginButton() {
        return loginButton;
    }

    public static void setVisibility(boolean visibility){
        frame.setVisible(visibility);
    }
}

