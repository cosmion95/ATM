package Persoane;

import Adrese.Adresa;

public abstract class Persoana {

    private Nume nume;
    private Telefon telefon;
    private Adresa adresa;

    public Persoana(Nume nume, Telefon telefon, Adresa adresa){
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    abstract void tip();

    public Nume getNume() {
        return nume;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setNume(Nume nume) {
        this.nume = nume;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }
}
