import java.lang.reflect.Array;
import java.util.ArrayList;

public class EventDemo {
    public static void main(String[] args) {

        Event e1 = new Event("Coldplay", "Graz", 100.0);
        Event e2 = new Event("One Republic", "Wien", 85.0);
        Event e3 = new Event("Rihanna", "Wien", 90.0);
        Event e4 = new Event("Taylor Swift", "Graz", 120.0);
        Event e5 = new Event("Ed Sheeran", "München", 150.0);

        EventKalender ek = new EventKalender();
        ek.add(e1);
        ek.add(e2);
        ek.add(e3);
        ek.add(e4);
        ek.add(e5);

        Event byTitle = ek.getByTitle("Ed Sheeran");
        System.out.println(byTitle);

        ArrayList<Event> byOrt = ek.getByOrt("Graz");
        System.out.println(byOrt);

        ArrayList<Event> byPreis = ek.getEintrittsPreis(90, 100);
        System.out.println(byPreis);

        ArrayList<Event> mostExp = ek.getMostExpensiveByOrt("Graz");
        System.out.println(mostExp);

        double avgPreis = ek.getAvgPreisByOrt("Wien");
        System.out.println(avgPreis);


        //beim Schreiben der Abfragen immer auf den Typ der Methode schauen


    }

}
