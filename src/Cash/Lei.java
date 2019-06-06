package Cash;

public class Lei implements Bani {

    public double valoare;

    public Lei(){
        valoare = 0;
    }

    public Lei(double valoare){
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

    public void setValoare(double valoare) {
        this.valoare = valoare;
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

    public double getValoare() {
        return valoare;
    }


}
