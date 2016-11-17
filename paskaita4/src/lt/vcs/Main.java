package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import static lt.vcs.VcsUtils.*;
import lt.vcs.klases.Enumas;
import lt.vcs.klases.Person;

/**
 *
 * @author Cukrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            println(""+i);
        }
        println("-----");
        int[] mass = {1,2,3};
        for (int i : mass) {
            println(""+i);
        }
        println("-----");
        int whileKint = 0;
        while (whileKint < 3) {
            if (whileKint == 2) {
                break;
            }
            println(""+whileKint);
            whileKint++;
        }
        println("-----");
        int doWhile = 0;
        do {
            println(String.format("kasd %d sdfg %s", doWhile, "kazkas"));
            doWhile++;
        } while(false);
        println("-----");
        println( (new Date()).toString() );
        SimpleDateFormat sdf = new SimpleDateFormat("'data: ' yyyy-MM-dd ' laikas: ' HH:mm:ss");
        String data = sdf.format(new Date());
        println(data);
        println("" + System.currentTimeMillis());
        println("" + new Date(System.currentTimeMillis()));
        println("-----");
        println("metam kauliuka, ir rezultatas - " + rand(1, 6));
        println("-----");
        for (int i=0; i<5; i++) {
            println("metam kauliuka, ir rezultatas - " + rand(1, 6));
        }
        println("-----");
        SuKonstruktorium obj = new SuKonstruktorium("vardenis");
        println(obj.getVardas());
        obj.setVardas("pavardenis");
        println(obj.getVardas());
        println("-----");
        Person person = new Person("vardenis", "pavardenis", "abc123", new Date());
        println(person.toString());
        println("-----");
        println(Enumas.REIKSME2.getEn());
    }
    
}
