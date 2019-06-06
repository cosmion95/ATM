package Persoane;

public class Nume {

    private String nume;
    private String prenume;
    private String numeCompanie;

    public Nume(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    public Nume(String nume, String prenume, String numeCompanie){
        this.nume = nume;
        this.prenume = prenume;
        this.numeCompanie = numeCompanie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }
}
