package Cash;

public class Euro implements Bani{

    public double valoare;

    public Euro(){
        valoare = 0;
    }

    public Euro(double valoare){
        this.valoare = valoare;
    }

    @Override
    public double toEur() {
        return valoare / 4.6;
    }

    @Override
    public double toLei() {
        return valoare;
    }

    @Override
    public void currencyInfo() {
        System.out.println("RON");
    }

    @Override
    public double depune_numerar(double valoare){
        this.valoare = this.valoare + valoare;
        return this.valoare;
    }

    @Override
    public double retrage_numerar(double valoare){
        if (this.valoare > valoare){
            this.valoare = this.valoare - valoare;
            return this.valoare;
        }
        System.out.println("Nu aveti destui bani in cont: " + valoare);
        return this.valoare;

    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public double getValoare() {
        return valoare;
    }

}
