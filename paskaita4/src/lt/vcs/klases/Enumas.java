package lt.vcs.klases;

/**
 *
 * @author Cukrus
 */
public enum Enumas {
    
    REIKSME1("lietuviskai1", "angliskai1"),
    REIKSME2("lietuviskai2", "angliskai2"),
    REIKSME3("lietuviskai2", "angliskai2");
    
    private final String lt;
    private final String en;
    
    private Enumas(String lt, String en) {
        this.lt = lt;
        this.en = en;
    }

    public String getLt() {
        return lt;
    }

    public String getEn() {
        return en;
    }
    
    public String getDescription(String kalba) {
        String result = null;
        if ("lt".equals(kalba)) {
            result = this.lt;
        } else if ("en".equals(kalba)) {
            result = this.en;
        }
        return result;
    }
    
}
