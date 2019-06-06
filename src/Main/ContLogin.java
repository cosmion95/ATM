package Main;

public class ContLogin {

    private static ContLogin contLogin = null;
    private BankAccount bankAccount;

    public ContLogin(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    private ContLogin(){
        contLogin = null;
    }

    public static ContLogin login(BankAccount bankAccount){
        if (contLogin != null){
            contLogin = new ContLogin(bankAccount);
        }
        return contLogin;
    }

    public static void logout(){
        if (contLogin != null){
            contLogin = null;
        }
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
