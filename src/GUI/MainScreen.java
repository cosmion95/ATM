package GUI;


import Main.BankAccount;

import java.awt.*;
import javax.swing.*;

public class MainScreen {

    private static JButton infoPersoana = new JButton("Vezi info persoana");
    private static JButton addCash = new JButton("Adauga numerar");
    private static JButton withdrawCash = new JButton("Retrage numerar");
    private static JButton transferCash = new JButton("Transfera in alt cont");
    private static JButton logout = new JButton("LOGOUT");


    private static JFrame frame;

    public static JFrame getFrame() {
        return frame;
    }

    private static BankAccount bankAccount;

    public static void addComponentsToPane(Container pane) {

        pane.removeAll();
        JLabel moneda;
        JLabel iban;
        JLabel banca;
        JLabel valoareText;
        double valoare;

        if (bankAccount.getContBancarLei() == null){
            //cont de euro
            moneda = new JLabel("EUR");
            iban = new JLabel(bankAccount.getContBancarEuro().getIBAN());
            banca = new JLabel(bankAccount.getContBancarEuro().getBanca());
            valoare = bankAccount.getContBancarEuro().getEuro().getValoare();
            valoareText = new JLabel(String.valueOf(valoare));
        }
        else {
            //cont in lei
            moneda = new JLabel("RON");
            iban = new JLabel(bankAccount.getContBancarLei().getIBAN());
            banca = new JLabel(bankAccount.getContBancarLei().getBanca());
            valoare = bankAccount.getContBancarLei().getLei().getValoare();
            valoareText = new JLabel(String.valueOf(valoare));
        }

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(new JLabel("Cont: "), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(iban, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JLabel("Moneda: "), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(moneda, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(new JLabel("Banca: "), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(banca, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(new JLabel("Disponibil in cont: "), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(valoareText, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(infoPersoana, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(addCash, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(withdrawCash, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(transferCash, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 6;
        pane.add(logout, c);



    }

    public static void createAndShowGUI() {
        //Create and set up the window.
        frame=null;
        frame = new JFrame("OPERATII");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //Display the window.
        frame.setVisible(false);
    }

    public static void setVisibility(boolean visibility){
        frame.setVisible(visibility);
    }

    public static JButton getInfoPersoana() {
        return infoPersoana;
    }

    public static JButton getAddCash() {
        return addCash;
    }

    public static JButton getWithdrawCash() {
        return withdrawCash;
    }

    public static JButton getTransferCash() {
        return transferCash;
    }

    public static JButton getLogout() {
        return logout;
    }

    public static BankAccount getBankAccount() {
        return bankAccount;
    }

    public static void setBankAccount(BankAccount bankAccount) {
        MainScreen.bankAccount = bankAccount;
        addComponentsToPane(frame.getContentPane());
    }
}

