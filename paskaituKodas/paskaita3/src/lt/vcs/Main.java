package lt.vcs;

import java.util.Scanner;

/**
 *
 * @author Cukrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int skaicius = 8;
        int antras = 1;
        System.out.println(antras);
        antras += skaicius;
        System.out.println(antras);
        int trecias = antras % 2;
        System.out.println(trecias);
        System.out.println(antras);
        
        boolean boolas = false;
        System.out.println(!boolas);
        System.out.println((5+3)*2);
        System.out.println((false || true) && true );
        
        Main betkas = new Main();
        String st = "antras " + boolas + " " + betkas;
        
        String rezultatas = siaip2(5);
        System.out.println(rezultatas);
        
        int[] intai2 = {5, 5, 5, 5, 5, 5};
        System.out.println(intai2.length);
        
        String masyvas = "masyvas";
        char[] mass = masyvas.toCharArray();
        
        Object sdf = null;
        
        if (true) {
        } else if(true) {
        } else if (false) {
        } else {
        }
        
        System.out.println("Ivesta " + VcsUtils.inputInt("ivesk bokalu skaiciu"));
        
        
    }
    
    private static String siaip2(int sk) {
        return "" + sk;
    }
    
}
