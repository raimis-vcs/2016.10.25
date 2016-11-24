package lt.vcs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Cukrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        println("programa prasidejo ir esam main metode");
        Person petras = new Person("petras");
        Person antanas = new Person("antanas");
        println(antanas.getName());
        println("grizom i main metoda ir programa pasibaigia");
        
        File tekstinis = new File("C:\\tmp\\testas.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(tekstinis), "utf-8"));
            String nl = System.lineSeparator();
            bw.write("write metodas" + nl + "sdfsd" + nl);
            bw.append("pakeitem failo turini");
            bw.newLine();
            bw.append("antra eilute");
            bw.flush();
        } catch (IOException ex) {
            println("nepavyko sukurti isvedimo srauto");
            throw new RuntimeException(ex);
        } finally {
            try {
              bw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(tekstinis), "utf-8"));
        String line = null;
        while ( (line = br.readLine()) != null ) {
        println(line);
//        (br.readLine() == null – end of file)
        }
        br.close();
        
    }
    
}