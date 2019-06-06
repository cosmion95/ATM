package GUI;


import Main.BankAccount;
import Persoane.PersoanaFizica;

import java.awt.*;
import javax.swing.*;

public class InfoPersoana {


    private static JButton back = new JButton("Inapoi");
    private static BankAccount currentBankAccount;

    public static JFrame getFrame() {
        return frame;
    }

    private static JFrame frame;


    public static void addComponentsToPane(Container pane) {

        JLabel numePrenume;
        JLabel nrTelefon;
        JLabel retea;
        JLabel tipTelefon;
        JLabel tara;
        JLabel judet;
        JLabel localitate;
        JLabel codPostal;
        JLabel email;
        JLabel website;
        JLabel cnpOrCui;

        int row = 0;
        pane.removeAll();

        if (currentBankAccount.getPersoanaFizica() != null){
            //persoana fizica
            numePrenume = new JLabel(currentBankAccount.getPersoanaFizica().getNume().getNume() + " " + currentBankAccount.getPersoanaFizica().getNume().getPrenume());
            nrTelefon = new JLabel(currentBankAccount.getPersoanaFizica().getTelefon().numar);
            retea = new JLabel(currentBankAccount.getPersoanaFizica().getTelefon().retea);
            tipTelefon = new JLabel(currentBankAccount.getPersoanaFizica().getTelefon().tip);
            tara = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaFizica().getTara());
            judet = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaFizica().getJudet());
            localitate = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaFizica().getLocalitate());
            codPostal = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaFizica().getCodPostal());
            email = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaOnline().getEmail());
            website = new JLabel(currentBankAccount.getPersoanaFizica().getAdresa().getAdresaOnline().getWebsite());
            cnpOrCui = new JLabel(currentBankAccount.getPersoanaFizica().getCNP());
        }
        else {
            //persoana juridica
            numePrenume = new JLabel(currentBankAccount.getPersoanaJuridica().getNume().getNume() + " " + currentBankAccount.getPersoanaJuridica().getNume().getPrenume());
            nrTelefon = new JLabel(currentBankAccount.getPersoanaJuridica().getTelefon().numar);
            retea = new JLabel(currentBankAccount.getPersoanaJuridica().getTelefon().retea);
            tipTelefon = new JLabel(currentBankAccount.getPersoanaJuridica().getTelefon().tip);
            tara = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaFizica().getTara());
            judet = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaFizica().getJudet());
            localitate = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaFizica().getLocalitate());
            codPostal = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaFizica().getCodPostal());
            email = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaOnline().getEmail());
            website = new JLabel(currentBankAccount.getPersoanaJuridica().getAdresa().getAdresaOnline().getWebsite());
            cnpOrCui = new JLabel(currentBankAccount.getPersoanaJuridica().getCUI());
        }

        JLabel label;
        pane.removeAll();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //pentru persoanele juridice prima data apare numele companiei
        if (currentBankAccount.getPersoanaJuridica() != null){
            label = new JLabel("Denumire societate: ");
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = row;
            pane.add(label, c);

            label = new JLabel(currentBankAccount.getPersoanaJuridica().getNume().getNumeCompanie());
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 1;
            c.gridy = row;
            pane.add(label, c);
            row++;
        }

        label = new JLabel("Nume si prenume: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(numePrenume, c);
        row++;

        label = new JLabel("Nr. telefon: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(nrTelefon, c);
        row++;

        label = new JLabel("Retea: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(retea, c);
        row++;

        label = new JLabel("Tip: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(tipTelefon, c);
        row++;

        label = new JLabel("Tara: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(tara, c);
        row++;

        label = new JLabel("Judet: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(judet, c);
        row++;

        label = new JLabel("Localitate: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(localitate, c);
        row++;

        label = new JLabel("Cod postal: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(codPostal, c);
        row++;

        label = new JLabel("Email: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(email, c);
        row++;

        label = new JLabel("Website: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(website, c);
        row++;

        label = new JLabel("CNP/CUI: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = row;
        pane.add(label, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = row;
        pane.add(cnpOrCui, c);
        row++;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 12;
        pane.add(back, c);

    }

    public static void createAndShowGUI() {
        frame = new JFrame("LOGIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(false);
    }

    public static void setVisibility(boolean visibility) {
        frame.setVisible(visibility);
    }

    public static JButton getBack() {
        return back;
    }

    public static BankAccount getCurrentBankAccount() {
        return currentBankAccount;
    }

    public static void setCurrentBankAccount(BankAccount currentBankAccount) {
        InfoPersoana.currentBankAccount = currentBankAccount;
        addComponentsToPane(frame.getContentPane());
    }
}

