package Main;

import Adrese.Adresa;
import Adrese.AdresaFizica;
import Adrese.AdresaOnline;
import Cash.Euro;
import Cash.Lei;
import Conturi.ContBancar;
import Conturi.ContBancarEuro;
import Conturi.ContBancarLei;
import Persoane.*;
import GUI.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main {

    public static BankAccount currentBankAccount;
    public static ContLogin contLogin;

    public static void main(String[] args) {

        //lista cu conturi
        //EURO
        ContBancarEuro cbE1 = new ContBancarEuro("IBAN00000000000000000001", "BRD", new Euro(10));
        ContBancarEuro cbE2 = new ContBancarEuro("IBAN00000000000000000002", "BCR", new Euro(20));
        ContBancarEuro cbE3 = new ContBancarEuro("IBAN00000000000000000003", "ING", new Euro(30));
        ContBancarEuro cbE4 = new ContBancarEuro("IBAN00000000000000000004", "RZBR", new Euro(40));

        //LEi
        ContBancarLei cbL1 = new ContBancarLei("IBAN00000000000000000005", "BRD", new Lei(10));
        ContBancarLei cbL2 = new ContBancarLei("IBAN00000000000000000006", "BCR", new Lei(20));
        ContBancarLei cbL3 = new ContBancarLei("IBAN00000000000000000007", "ING", new Lei(30));
        ContBancarLei cbL4 = new ContBancarLei("IBAN00000000000000000008", "RZBR", new Lei(40));

        //Adrese
        Adresa adr01 = new Adresa(new AdresaFizica("Romania", "Cluj", "Cluj-Napoca", "000001"), new AdresaOnline("adresa1@email.com"));
        Adresa adr02 = new Adresa(new AdresaFizica("Romania", "Mures", "Targu-Mures", "000002"), new AdresaOnline("adresa2@email.com"));
        Adresa adr03 = new Adresa(new AdresaFizica("Romania", "Mures", "Reghin", "000003"), new AdresaOnline("adresa3@email.com"));
        Adresa adr04 = new Adresa(new AdresaFizica("Romania", "Harghita", "Toplita", "000004"), new AdresaOnline("adresa4@email.com"));
        Adresa adr05 = new Adresa(new AdresaFizica("Romania", "Bucuresti", "Bucuresti", "000005"), new AdresaOnline("adresa1@email.com", "www.website1.com"));
        Adresa adr06 = new Adresa(new AdresaFizica("Romania", "Cluj", "Turda", "000006"), new AdresaOnline("adresa1@email.com", "www.website2.com"));
        Adresa adr07 = new Adresa(new AdresaFizica("Romania", "Alba", "Alba-Iulia", "000007"), new AdresaOnline("adresa1@email.com", "www.website3.com"));
        Adresa adr08 = new Adresa(new AdresaFizica("Germania", "Berlin", "Berlin", "000008"), new AdresaOnline("adresa1@email.com", "www.website4.com"));


        //lista cu persoane
        ArrayList<PersoanaFizica> persoaneFizice = new ArrayList<>();
        PersoanaFizica pf1 = new PersoanaFizica("0000000000001", 'M', new Nume("Popescu", "Ion"), new Telefon("0700000001", "Orange", "Mobil"), adr01);
        PersoanaFizica pf2 = new PersoanaFizica("0000000000002", 'M', new Nume("Radu", "Petre"), new Telefon("0700000002", "Digi", "Mobil"), adr02);
        PersoanaFizica pf3 = new PersoanaFizica("0000000000003", 'M', new Nume("Eliade", "Mircea"), new Telefon("0700000003", "Telekom", "Mobil"), adr03);
        PersoanaFizica pf4 = new PersoanaFizica("0000000000004", 'M', new Nume("Eminescu", "Mihai"), new Telefon("0700000004", "Vodafone", "Mobil"), adr04);

        ArrayList<PersoanaJuridica> persoaneJuridice = new ArrayList<>();
        PersoanaJuridica pj1 = new PersoanaJuridica("0000000001", "SRL", new Nume("Creanga", "Ion", "SC AMINTIRI DIN COPILARIE SRL"), new Telefon("0700000005", "Orange", "Mobil"), adr05);
        PersoanaJuridica pj2 = new PersoanaJuridica("0000000002", "SA", new Nume("Sadoveanu", "Mihail", "SC BALTAGUL LA BAC SA"), new Telefon("0700000006", "Vodafone", "Mobil"), adr06);
        PersoanaJuridica pj3 = new PersoanaJuridica("0000000003", "PFA", new Nume("Cartarescu", "Mircea", "CIOCNIREA"), new Telefon("0700000007", "Telekom", "Mobil"), adr06);
        PersoanaJuridica pj4 = new PersoanaJuridica("0000000004", "SRL", new Nume("Rebreanu", "Liviu", "SC PADUREA SPANZURATILOR SRL"), new Telefon("0700000008", "Digi", "Mobil"), adr07);


        //conturile bancare  -- persoane cu conturi asociate
        BankAccount bankAccount1 = new BankAccount(pf1, cbL1, 1);
        BankAccount bankAccount2 = new BankAccount(pf2, cbE1, 2);
        BankAccount bankAccount3 = new BankAccount(pf3, cbL2, 3);
        BankAccount bankAccount4 = new BankAccount(pf4, cbL3, 4);

        BankAccount bankAccount5 = new BankAccount(pj1, cbL4, 5);
        BankAccount bankAccount6 = new BankAccount(pj2, cbE2, 6);
        BankAccount bankAccount7 = new BankAccount(pj3, cbE3, 7);
        BankAccount bankAccount8 = new BankAccount(pj4, cbE4, 8);

        //lista de useri
        //lista cu useri
        LSI listaUseri = new LSI();

        LSI.adaugareInceput(listaUseri, "user01", "pass01", bankAccount1);
        LSI.adaugareInceput(listaUseri, "user02", "pass02", bankAccount2);
        LSI.adaugareInceput(listaUseri, "user03", "pass03", bankAccount3);
        LSI.adaugareInceput(listaUseri, "user04", "pass04", bankAccount4);
        LSI.adaugareInceput(listaUseri, "user05", "pass05", bankAccount5);
        LSI.adaugareInceput(listaUseri, "user06", "pass06", bankAccount6);
        LSI.adaugareInceput(listaUseri, "user07", "pass07", bankAccount7);
        LSI.adaugareInceput(listaUseri, "user08", "pass08", bankAccount8);

        String username;
        String password;

        //screen-ul de login
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginScreen.createAndShowGUI();
            }
        });

        //screenul cu operatii posibile dupa login / main screen
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainScreen.createAndShowGUI();
            }
        });

        //screenul cu info despre persoana
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InfoPersoana.createAndShowGUI();
            }
        });


        LoginScreen.getLoginButton().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //a fost apasat butonul de login
                        currentBankAccount = LSI.cautaUserPass(listaUseri, LoginScreen.getUsernameTextField().getText(), LoginScreen.getPasswordTextField().getText());
                        if (currentBankAccount != null) {
                            LoginScreen.getErrorLabel().setVisible(false);
                            contLogin = new ContLogin(currentBankAccount);
                            if (MainScreen.getBankAccount() == null) {
                                MainScreen.setBankAccount(currentBankAccount);
                            } else if (MainScreen.getBankAccount().getId() != currentBankAccount.getId()) {
                                MainScreen.createAndShowGUI();
                                MainScreen.setBankAccount(currentBankAccount);
                            }
                            LoginScreen.setVisibility(false);
                            LoginScreen.getFrame().dispose();
                            MainScreen.setVisibility(true);
                        } else {
                            LoginScreen.getErrorLabel().setVisible(true);
                        }
                    }
                });


        MainScreen.getInfoPersoana().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //apasare buton vezi info persoana
                        //afisez frame cu info persoana
                        MainScreen.setVisibility(false);
                        if (InfoPersoana.getCurrentBankAccount() == null) {
                            InfoPersoana.setCurrentBankAccount(currentBankAccount);
                        } else if (InfoPersoana.getCurrentBankAccount().getId() != currentBankAccount.getId()) {
                            InfoPersoana.setCurrentBankAccount(currentBankAccount);
                            InfoPersoana.getFrame().getContentPane().revalidate();

                        }
                        InfoPersoana.setVisibility(true);
                    }
                }
        );

        MainScreen.getLogout().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //currentBankAccount = null;
                        //contLogin = null;
                        MainScreen.setVisibility(false);
                        MainScreen.getFrame().dispose();
                        LoginScreen.setVisibility(true);
                    }
                }
        );

        MainScreen.getWithdrawCash().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //screenul pentru retragere numerar
                        String input = JOptionPane.showInputDialog(null, "Introduceti valoarea:", "Retragere numerar",
                                JOptionPane.OK_CANCEL_OPTION);
                        Double valoare = 0.0;
                        boolean checkNumber = true;
                        if (input != null) {
                            try {
                                valoare = Double.valueOf(input);
                            } catch (NumberFormatException nfe) {
                                checkNumber = false;
                            }
                            if (checkNumber) {
                                //numarul introdus este valid
                                //verific daca are destui bani in cont, dupa ce aflu daca e de euro sau lei
                                if (currentBankAccount.getContBancarEuro() == null) {
                                    //cont in lei
                                    if (currentBankAccount.getContBancarLei().getLei().getValoare() < valoare) {
                                        //nu exista destui bani in cont
                                        JOptionPane.showMessageDialog(null, "Nu aveti destul disponibil in cont");
                                    } else {
                                        //mai intreb o data, pentru siguranta
                                        JDialog.setDefaultLookAndFeelDecorated(true);
                                        int response = JOptionPane.showConfirmDialog(null, "Esti sigur ca doresti sa retragi " + valoare + " RON?", "Confirmare",
                                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if (response == JOptionPane.YES_OPTION) {
                                            //retrag banii
                                            currentBankAccount.getContBancarLei().getLei().setValoare((currentBankAccount.getContBancarLei().getLei().getValoare() - valoare));
                                            MainScreen.setBankAccount(currentBankAccount);
                                            MainScreen.getFrame().getContentPane().revalidate();
                                        }
                                    }
                                } else {
                                    //cont in euro
                                    if (currentBankAccount.getContBancarEuro().getEuro().getValoare() < valoare) {
                                        //nu exista destui bani in cont
                                        JOptionPane.showMessageDialog(null, "Nu aveti destul disponibil in cont");
                                    } else {
                                        JDialog.setDefaultLookAndFeelDecorated(true);
                                        int response = JOptionPane.showConfirmDialog(null, "Esti sigur ca doresti sa retragi " + valoare + " RON?", "Confirmare",
                                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if (response == JOptionPane.YES_OPTION) {
                                            //retrag banii
                                            currentBankAccount.getContBancarEuro().getEuro().setValoare((currentBankAccount.getContBancarEuro().getEuro().getValoare() - valoare));
                                            MainScreen.setBankAccount(currentBankAccount);
                                            MainScreen.getFrame().getContentPane().revalidate();
                                        }
                                    }
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Ati introdus o valoare gresita.");
                            }
                        }
                    }
                }
        );

        MainScreen.getAddCash().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //screen-ul pentru adaugare numerar
                        String input = JOptionPane.showInputDialog(null, "Introduceti valoarea:", "Retragere numerar",
                                JOptionPane.OK_CANCEL_OPTION);
                        Double valoare = 0.0;
                        boolean checkNumber = true;
                        if (input != null) {
                            try {
                                valoare = Double.valueOf(input);
                            } catch (NumberFormatException nfe) {
                                checkNumber = false;
                            }
                            if (checkNumber) {
                                //numarul introdus este valid
                                //verific daca are destui bani in cont, dupa ce aflu daca e de euro sau lei
                                if (currentBankAccount.getContBancarEuro() == null) {
                                    //cont in lei
                                    currentBankAccount.getContBancarLei().getLei().setValoare((currentBankAccount.getContBancarLei().getLei().getValoare() + valoare));
                                    MainScreen.setBankAccount(currentBankAccount);
                                    MainScreen.getFrame().getContentPane().revalidate();
                                } else {
                                    //cont in euro
                                    currentBankAccount.getContBancarEuro().getEuro().setValoare((currentBankAccount.getContBancarEuro().getEuro().getValoare() + valoare));
                                    MainScreen.setBankAccount(currentBankAccount);
                                    MainScreen.getFrame().getContentPane().revalidate();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Ati introdus o valoare gresita.");
                            }
                        }
                    }
                }
        );

        InfoPersoana.getBack().
                addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                //apasare buton inapoi
                                InfoPersoana.setVisibility(false);
                                MainScreen.setVisibility(true);
                            }
                        }
                );


        MainScreen.getTransferCash().addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //afisez dialog box cu contul in care trebuie facut transferul
                        JTextField ibanTextField = new JTextField(24);
                        JTextField valoareTextField = new JTextField(5);

                        JPanel myPanel = new JPanel();
                        myPanel.add(new JLabel("IBAN:"));
                        myPanel.add(ibanTextField);
                        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
                        myPanel.add(new JLabel("Valoare:"));
                        myPanel.add(valoareTextField);

                        int result = JOptionPane.showConfirmDialog(null, myPanel,
                                "Introduceti contul si valoare de transferat", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            String iban = ibanTextField.getText();
                            String valoareText = valoareTextField.getText();

                            //verific daca iban-ul este valid
                            if (iban.length() == 24){
                                //verific daca exista in baza/lista

                            }
                        }
                    }
                }
        );

    }


}
