package Adrese;

public class AdresaOnline implements AdresaOnInt{

    private String email;
    private String website;

    public AdresaOnline(String email, String website){
        if (checkEmail(email) && checkWebsite(website)){
            this.email = email;
            this.website = website;
        }
        else {
            System.out.println("Email-ul sau adresa web nu este valida");
            return;
        }
    }

    public AdresaOnline(String email){
        if (checkEmail(email)){
            this.email = email;
        }
        else {
            System.out.println("Email-ul sau adresa web nu este valida");
            return;
        }
    }

    @Override
    public boolean checkEmail(String email){
        //verifica daca email-ul este valid
        if (email.contains("@")){
            return true;
        }
        System.out.println("Email=ul nu este valid");
        return false;
    }

    @Override
    public boolean checkWebsite(String website) {
        if (website.contains("www.")){
            return true;
        }
        System.out.println("Website-ul nu este valid");
        return false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (checkEmail(email))
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        if (checkWebsite(website))
        this.website = website;
    }
}
