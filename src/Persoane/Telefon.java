package Persoane;

public class Telefon {

    public String numar;
    public String retea;
    public String tip;

    public Telefon(String numar, String retea, String tip){
        this.numar = numar;
        this.retea = retea;
        this.tip = tip;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getRetea() {
        return retea;
    }

    public void setRetea(String retea) {
        this.retea = retea;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
