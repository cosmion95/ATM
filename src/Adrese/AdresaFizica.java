package Adrese;

public class AdresaFizica implements AdresaFizInt {

    private String tara;
    private String judet;
    private String localitate;
    private String codPostal;

    public AdresaFizica(String tara, String judet, String localitate, String codPostal){
        if (checkCodPostal(codPostal)) {
            this.codPostal = codPostal;
            this.judet = judet;
            this.localitate = localitate;
            this.tara = tara;
        }
        else {
            System.out.println("Cod postal invalid");
            return;
        }
    }

    @Override
    public boolean checkCodPostal(String cod) {
        if (cod.length() == 6) return true;
        return false;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        if (checkCodPostal(codPostal))
        this.codPostal = codPostal;
    }
}
