package Persoane;

import Adrese.Adresa;

public class PersoanaJuridica extends Persoana implements PersJurInt {

    private String CUI;
    private String tip;

    public PersoanaJuridica(String cui, String tip, Nume nume, Telefon telefon, Adresa adresa){
        super(nume, telefon, adresa);
        if (check_cui(cui)){
            this.CUI = cui;
            this.tip = tip;
        }
    }


    @Override
    public boolean check_cui(String CUI) {
        if (CUI.length() > 10){
            return false;
        }
        return true;
    }

    @Override
    public void tip(){
        System.out.println("Persoana juridica.");
    }

    public String getCUI() {
        return CUI;
    }

    public String getTip() {
        return tip;
    }
}
