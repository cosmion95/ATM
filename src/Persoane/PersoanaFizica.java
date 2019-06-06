package Persoane;

import Adrese.Adresa;

public class PersoanaFizica extends Persoana implements PersFizInt{

    private String CNP;
    private char gen;

    public PersoanaFizica(String CNP, char gen, Nume nume, Telefon telefon, Adresa adresa){
        super(nume, telefon, adresa);
        if (check_cnp(CNP) && check_gen(gen)){
            this.CNP = CNP;
            this.gen = gen;
        }
        else {
            System.out.println("CNP-ul sau genul nu sunt valide");
            return;
        }
    }

    @Override
    public void tip(){
        System.out.println("Persoana fizica!");
    }

    @Override
    public boolean check_cnp(String cnp) {
        //verifica daca cnp-ul are un format valid
        if (cnp.length() == 13) return true;
        return false;
    }

    @Override
    public boolean check_gen(char gen) {
        //verifica ca gen-ul sa fie M sau F
        if (gen == 'M' || gen == 'F') return true;
        return false;
    }

    public String getCNP() {
        return CNP;
    }

    public char getGen() {
        return gen;
    }
}
