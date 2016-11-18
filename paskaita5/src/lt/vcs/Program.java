package lt.vcs;

import static lt.vcs.VcsUtils.println;
import lt.vcs.domain.Person;
import lt.vcs.domain.PetHatingPerson;
import lt.vcs.domain.PetLovingPerson;

/**
 *
 * @author Cukrus
 */
public class Program {
    
    public void start(){
        PetLovingPerson antanas = new PetLovingPerson("antanas", "antanauskas", "ak-antanas");
        println("" + antanas);
        PetHatingPerson petras = new PetHatingPerson("antanas", "antanauskas", "ak-petras");
        println("" + petras);
        nothing(antanas);
        nothing(petras);
        Person[] mass = {antanas, petras};
    }
    
    private void nothing(Person person) {
        println(person.toString());
        if (person instanceof PetLovingPerson) {
            PetLovingPerson tikrasisAntanas = (PetLovingPerson) person;
            tikrasisAntanas.getPet();
        }
    }
    
}
