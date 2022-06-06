package pkg;

public class Gizmo {

    private String mkr;
    private Boolean isElectronic;


    public Gizmo(String a, Boolean b) {
        mkr = a;
        isElectronic = b;
    }

    public String getMaker() {
        return mkr;
    }

    public Boolean isElectronic() {
        return isElectronic;
    }

}