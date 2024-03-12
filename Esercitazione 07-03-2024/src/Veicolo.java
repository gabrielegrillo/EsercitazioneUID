public class Veicolo {
    private String marca;
    private String modello;
    private int annoDiProduzione;

    public Veicolo() {}

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.annoDiProduzione = anno;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String m) {
        this.modello = m;
    }
    public int getAnnoDiProduzione() {
        return this.annoDiProduzione;
    }
    public void setAnnoDiProduzione(int annoDiProduzione) {
        this.annoDiProduzione = annoDiProduzione;
    }

    public String toString() {
        return "Marca: " + this.marca + "\nModello: " + this.modello + "\nAnno di Produzione: " + this.annoDiProduzione;
    }
}
