import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileHandler {

    private final Random r = new Random();

    private String generateRandomString(int maxLength) {
        if(maxLength <= 0)
            maxLength = 1;
        int length = r.nextInt(1, maxLength+1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c;
            if(r.nextInt() % 3 == 0) // generate numbers with a greater probability
                c = (char)(r.nextInt(26) + 'a');
            else
                c = (char)(r.nextInt(10) + '0');
            builder.append(c);
        }
        return builder.toString();
    }

    public void generaFile(String nomeFile) throws IOException {
        int numLines = r.nextInt(10,50);
        BufferedWriter w = new BufferedWriter(new FileWriter(nomeFile));
        for (int i = 0; i < numLines; i++) {
            w.append(generateRandomString(7));
            if (i != numLines-1) {
                w.newLine();
            }
        }
        w.close();
    }
    public List<String> leggiFile(String nomeFile) {
        BufferedReader 
    }
}
