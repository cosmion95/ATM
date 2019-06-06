package Main;

import Conturi.ContBancarEuro;
import Conturi.ContBancarLei;
import Persoane.PersoanaFizica;
import Persoane.PersoanaJuridica;

public class BankAccount {

    private int id;
    private ContBancarLei contBancarLei;
    private ContBancarEuro contBancarEuro;
    private PersoanaFizica persoanaFizica;
    private PersoanaJuridica persoanaJuridica;

    public BankAccount(PersoanaFizica persoanaFizica, ContBancarLei contBancarLei, ContBancarEuro contBancarEuro, int id) {
        this.contBancarLei = contBancarLei;
        this.contBancarEuro = contBancarEuro;
        this.persoanaFizica = persoanaFizica;
        this.id = id;
    }

    public BankAccount(PersoanaJuridica persoanaJuridica, ContBancarLei contBancarLei, ContBancarEuro contBancarEuro, int id) {
        this.contBancarLei = contBancarLei;
        this.contBancarEuro = contBancarEuro;
        this.persoanaJuridica = persoanaJuridica;
        this.id = id;
    }

    public BankAccount(PersoanaFizica persoanaFizica, ContBancarLei contBancarLei, int id) {
        this.contBancarLei = contBancarLei;
        this.persoanaFizica = persoanaFizica;
        this.id = id;
    }

    public BankAccount(PersoanaFizica persoanaFizica ,ContBancarEuro contBancarEuro, int id) {
        this.contBancarEuro = contBancarEuro;
        this.persoanaFizica = persoanaFizica;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public BankAccount(PersoanaJuridica persoanaJuridica, ContBancarLei contBancarLei, int id) {
        this.contBancarLei = contBancarLei;
        this.persoanaJuridica = persoanaJuridica;
        this.id = id;
    }

    public BankAccount(PersoanaJuridica persoanaJuridica, ContBancarEuro contBancarEuro, int id) {
        this.contBancarEuro = contBancarEuro;
        this.persoanaJuridica = persoanaJuridica;
        this.id = id;
    }

    public ContBancarLei getContBancarLei() {
        return contBancarLei;
    }

    public void setContBancarLei(ContBancarLei contBancarLei) {
        this.contBancarLei = contBancarLei;
    }

    public ContBancarEuro getContBancarEuro() {
        return contBancarEuro;
    }

    public void setContBancarEuro(ContBancarEuro contBancarEuro) {
        this.contBancarEuro = contBancarEuro;
    }

    public PersoanaFizica getPersoanaFizica() {
        return persoanaFizica;
    }

    public PersoanaJuridica getPersoanaJuridica() {
        return persoanaJuridica;
    }
}
