package Main;

public class LSI {

    UserPass inceputLista; //inceputul listei

    static class UserPass {

        String user;
        String password;
        BankAccount bankAccount;

        UserPass nextUser;

        UserPass(String user, String password, BankAccount bankAccount) {
            this.user = user;
            this.password = password;
            this.bankAccount = bankAccount;
            nextUser = null;
        }
    }

    private static boolean verificaPersoana(LSI lista, String user, String parola){
        //verific sa nu existe persoane cu acelasi nume si prenume in lista
        UserPass persoanaCurenta = lista.inceputLista;
        while (persoanaCurenta != null){
            if (persoanaCurenta.user.equals(user) && persoanaCurenta.password.equals(parola)){
                return true;
            }
            persoanaCurenta = persoanaCurenta.nextUser;
        }
        return false;
    }

    public static LSI adaugareInceput(LSI lista, String user, String password, BankAccount bankAccount) {
        //verific daca exista persoana cu acest nume/prenume
        if (verificaPersoana(lista, user, password)){
            System.out.println("EXISTA PERSOANA CU ACEST NUME SI PRENUME");
            return lista;
        }
        //creez initial o noua persoana care nu are referinte catre persoana urmatoare
        UserPass persoana = new UserPass(user, password, bankAccount);

        //verific daca lista exista
        if (lista.inceputLista == null) {
            lista.inceputLista = persoana;
        } else {
            persoana.nextUser = lista.inceputLista;
            lista.inceputLista = persoana;
        }
        return lista;
    }

    public static LSI adaugareSfarsit(LSI lista, String user, String password, BankAccount bankAccount) {
        //verific daca exista persoana cu acest nume/prenume
        if (verificaPersoana(lista, user, password)){
            System.out.println("EXISTA PERSOANA CU ACEST NUME SI PRENUME");
            return lista;
        }
        //creez persoana
        UserPass persoana = new UserPass(user, password, bankAccount);

        //merg la finalul listei
        UserPass persoanaCurenta = lista.inceputLista;
        while (persoanaCurenta.nextUser != null) {
            persoanaCurenta = persoanaCurenta.nextUser;
        }
        persoanaCurenta.nextUser = persoana;
        return lista;
    }

    public static LSI adaugareInainteNume(LSI lista, String numeCautat, String user, String password, BankAccount bankAccount) {
        //verific daca exista persoana cu acest nume/prenume
        if (verificaPersoana(lista, user, password)){
            System.out.println("EXISTA PERSOANA CU ACEST NUME SI PRENUME");
            return lista;
        }
        //creez persoana
        UserPass persoana = new UserPass(user, password, bankAccount);

        //verific daca persoana cautata este capul de lista
        if (lista.inceputLista.user.equals(numeCautat)) {
            //adaug la inceputul listei
            return adaugareInceput(lista, user, password, bankAccount);
        }
        //iterez prin toata lista
        else {
            boolean check = false;
            UserPass persoanaCurenta = lista.inceputLista.nextUser;
            UserPass precedenta = lista.inceputLista;
            while (!check && persoanaCurenta != null) {
                //caut dupa nume
                if (persoanaCurenta.user.equals(numeCautat)) {
                    //gasit
                    check = true;
                    //adaug referinta catre persoana gasita dupa nume
                    persoana.nextUser = persoanaCurenta;
                    //schimb referinta din persoana precedenta catre noua persoana
                    precedenta.nextUser = persoana;
                }
                precedenta = persoanaCurenta;
                persoanaCurenta = persoanaCurenta.nextUser;
            }
            if (!check) {
                System.out.println("Persoana cu numele: " + numeCautat + " nu a fost gasita");
            }
        }
        return lista;
    }

    public static LSI adaugareDupaNume(LSI lista, String numeCautat, String user, String password, BankAccount bankAccount) {
        //verific daca exista persoana cu acest nume/prenume
        if (verificaPersoana(lista, user, password)){
            System.out.println("EXISTA PERSOANA CU ACEST user si parola");
            return lista;
        }
        //creez persoana
        UserPass persoana = new UserPass(user, password, bankAccount);

        boolean check = false;
        UserPass persoanaCurenta = lista.inceputLista;
        while (!check && persoanaCurenta != null) {
            //caut dupa nume
            if (persoanaCurenta.user.equals(numeCautat)) {
                //gasit
                check = true;
                //adaug referinta catre persoana urmatoare in noua persoana
                persoana.nextUser = persoanaCurenta.nextUser;
                //schimb referinta din persoana precedenta catre noua persoana
                persoanaCurenta.nextUser = persoana;
            }
            persoanaCurenta = persoanaCurenta.nextUser;
        }
        if (!check) {
            System.out.println("Persoana cu numele: " + numeCautat + " nu a fost gasita");
        }
        return lista;
    }

    public static LSI stergerePrimElement(LSI lista) {
        UserPass noulInceput = lista.inceputLista.nextUser;
        lista.inceputLista = noulInceput;
        return lista;
    }

    public static LSI stergereUltimElement(LSI lista) {
        //iterez pana la capatul listei
        UserPass persoanaCurenta = lista.inceputLista;
        UserPass precedenta = persoanaCurenta;
        do {
            precedenta = persoanaCurenta;
            persoanaCurenta = persoanaCurenta.nextUser;
        }
        while (persoanaCurenta.nextUser != null);
        persoanaCurenta = null;
        precedenta.nextUser = null;
        return lista;
    }

    public static LSI stergeDupaNumePrenume(LSI lista, String user, String password){
        //verific daca persoana cautata este cap de lista
        if (lista.inceputLista.user.equals(user) && lista.inceputLista.password.equals(password)){
            //fac stergere de prim element
            return stergerePrimElement(lista);
        }
        else {
            boolean found = false;
            UserPass persoanaCurenta = lista.inceputLista.nextUser;
            UserPass precedenta = lista.inceputLista;
            do {
                if (persoanaCurenta.user.equals(user) && persoanaCurenta.password.equals(password)) {
                    found = true;
                    //verific daca trebuie sa fac stergere de la final
                    if (persoanaCurenta.nextUser == null) {
                        return stergereUltimElement(lista);
                    } else {
                        precedenta.nextUser = persoanaCurenta.nextUser;
                        persoanaCurenta = null;
                        return lista;
                    }
                }
                precedenta = persoanaCurenta;
                persoanaCurenta = persoanaCurenta.nextUser;
            }
            while (persoanaCurenta.nextUser != null);
            if (!found) {
                System.out.println("Nu am gasit persoana cautata");
            }
        }
        return lista;
    }

    public static void cautaNume(LSI lista, String user){
        UserPass persoanaCurenta = lista.inceputLista;
        while (persoanaCurenta != null){
            if (persoanaCurenta.user.equals(user)){
                System.out.println("L-am gasit pe " + user);
            }
            persoanaCurenta = persoanaCurenta.nextUser;
        }
    }

    public static void afisare(LSI lista) {
        UserPass persoanaCurenta = lista.inceputLista;
        boolean empty = true;
        while (persoanaCurenta != null) {
            System.out.println("Nume: " + persoanaCurenta.user);
            System.out.println("Prenume: " + persoanaCurenta.password);
            persoanaCurenta = persoanaCurenta.nextUser;
            empty = false;
        }
        if (empty){
            System.out.println("Lista este goala");
        }
    }

    public static LSI distrugere(LSI lista){
        lista.inceputLista = null;
        System.out.println("Sters!");
        return lista;
    }

    public static BankAccount cautaUserPass(LSI lista, String user, String password){
        UserPass persoanaCurenta = lista.inceputLista;
        while (persoanaCurenta != null){
            if (persoanaCurenta.user.equals(user)) {
                //am gasit userul
                if (persoanaCurenta.password.equals(password)){
                    //parola se potriveste
                    return persoanaCurenta.bankAccount;
                }
                else {
                    System.out.println("User sau parola incorecte");
                    return null;
                }
            }
            persoanaCurenta = persoanaCurenta.nextUser;
        }
        System.out.println("User inexistent");
        return null;
    }
}