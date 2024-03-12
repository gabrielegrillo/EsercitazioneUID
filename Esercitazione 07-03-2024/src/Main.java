import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Veicolo[] mioArray = new Veicolo[3];
        Scanner mioScanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            boolean sceltaConforme = false;
            while (!sceltaConforme) {
                System.out.println("Veicolo " + i);
                System.out.println("Selezionare\n1) Veicolo\n2) Auto\n3) Moto");
                int scelta = mioScanner.nextInt();
                if (scelta > 0 && scelta < 4) {
                    System.out.println("Marca: ");
                    String marca = mioScanner.nextLine();
                    mioScanner.nextLine();
                    System.out.println("Modello: ");
                    String modello = mioScanner.next();
                    mioScanner.nextLine();
                    System.out.println("Anno di produzione: ");
                    int anno = mioScanner.nextInt();
                    switch (scelta)  {
                        case 1:
                            mioArray[i] = new Veicolo(marca,modello,anno);
                            sceltaConforme = true;
                            break;
                        case 2:
                            System.out.println("Numero di porte: ");
                            int numPorte = mioScanner.nextInt();
                            mioArray[i] = new Auto(numPorte);
                            mioArray[i].setMarca(marca);
                            mioArray[i].setModello(modello);
                            mioArray[i].setAnnoDiProduzione(anno);
                            sceltaConforme = true;
                            break;
                        case 3:
                            System.out.println("Ha la sidecar? ");
                            boolean valore = mioScanner.nextBoolean();
                            mioArray[i] = new Moto(valore);
                            mioArray[i].setMarca(marca);
                            mioArray[i].setModello(modello);
                            mioArray[i].setAnnoDiProduzione(anno);
                            sceltaConforme = true;
                            break;
                    }
                }

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Veicolo " + i);
            System.out.println(mioArray[i].toString());

        }
    }
}