package Conturi;

import Cash.Euro;

public class ContBancarEuro implements ContBancar{

    private String IBAN;
    private String banca;
    private Euro euro;

    public ContBancarEuro(String IBAN, String banca, Euro euro){
        this.banca = banca;
        this.IBAN = IBAN;
        this.euro = euro;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getBanca() {
        return banca;
    }

    public Euro getEuro() {
        return euro;
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
