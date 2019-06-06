package Adrese;

public class Adresa {

    private AdresaFizica adresaFizica;
    private AdresaOnline adresaOnline;

    public Adresa(AdresaFizica adresaFizica, AdresaOnline adresaOnline){
        this.adresaFizica = adresaFizica;
        this.adresaOnline = adresaOnline;
    }

    public AdresaFizica getAdresaFizica() {
        return adresaFizica;
    }

    public void setAdresaFizica(AdresaFizica adresaFizica) {
        this.adresaFizica = adresaFizica;
    }

    public AdresaOnline getAdresaOnline() {
        return adresaOnline;
    }

    public void setAdresaOnline(AdresaOnline adresaOnline) {
        this.adresaOnline = adresaOnline;
    }
}
