public class Moto extends Veicolo {
    private boolean haSideCar;

    public Moto() {
        super();
    }
    public Moto(boolean sideCar) {
        super();
        this.haSideCar = sideCar;
    }

    public boolean haSideCar() {
        return haSideCar;
    }

    public void setSideCar(boolean haSideCar) {
        this.haSideCar = haSideCar;
    }
    public String toString() {
        return super.toString() + " Ha sidecar: " + this.haSideCar;
    }
}
