package lt.vcs.domain;

import lt.vcs.VcsUtils;
import lt.vcs.interfaces.PetLover;

/**
 *
 * @author Cukrus
 */
public class PetLovingPerson extends Person implements PetLover {
    
    private Pet pet;
    
    public PetLovingPerson(String name, String lastName, String id) {
        super(name, lastName, id);
    }
    
    protected void talk() {
        VcsUtils.println("PetLovingPerson is talking");
    }

    public Pet getPet() {
        VcsUtils.println("I have pet");
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
}
