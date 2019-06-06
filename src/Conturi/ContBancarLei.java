package Conturi;

import Cash.Lei;

public class ContBancarLei implements ContBancar {

    private String IBAN;
    private String banca;
    private Lei lei;

    public ContBancarLei(String IBAN, String banca, Lei lei){
        this.banca = banca;
        this.IBAN = IBAN;
        this.lei = lei;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getBanca() {
        return banca;
    }

    public Lei getLei() {
        return lei;
    }

    @Override
    public boolean isValidIBAN() {
        if (IBAN.length() == 24){
            return true;
        }
        return false;
    }

    @Override
    public void accountType() {
        System.out.println("Cont la banca in LEI");
    }


}
