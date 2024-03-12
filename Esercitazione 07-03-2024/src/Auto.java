public class Auto extends Veicolo {
    private int numPorte;
    public Auto() {
        super();
    }
    public Auto(int nPorte) {
        super();
        this.numPorte = nPorte;
    }
    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }
    public String toString() {
        return super.toString() + " Numero porte: " + this.numPorte;
    }
}
