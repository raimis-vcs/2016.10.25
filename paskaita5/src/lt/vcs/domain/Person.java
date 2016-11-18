package lt.vcs.domain;

import lt.vcs.interfaces.Identified;
import lt.vcs.interfaces.Named;

/**
 *
 * @author Cukrus
 */
public abstract class Person implements Named, Identified {
    
    private String name;
    private String lastName;
    private String id;
    
    public Person(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        talk();
    }
    
    protected abstract void talk();
    
    @Override
    public String toString() {
        return String.format(
                "Person(name=%s, lastName=%s) object=%s",
                name, lastName, super.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
