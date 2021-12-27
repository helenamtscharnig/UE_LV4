package pegelverwaltung;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> wstand;

    public WasserstandManager() {
        this.wstand = new ArrayList<>();
    }

    public void add(Wasserstand wasserst){
        wstand.add(wasserst);
    }

    public Wasserstand findById (int id){
        return null;
    }





}
