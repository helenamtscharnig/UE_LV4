import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> events;

    public EventKalender() {
        this.events = new ArrayList<>();
    }

    public void add(Event event){
        events.add(event);
    }

    public Event getByTitle(String title){
        for (Event event : events){
            if(event.getTitle().equals(title)){
                return event;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> found = new ArrayList<>();
        for(Event event : events){
            if(event.getOrt().equals(ort)){
                found.add(event);
            }
        }
        return found;
    }

    public ArrayList<Event> getEintrittsPreis(double min, double max){
        ArrayList<Event> preis = new ArrayList<>();
        for(Event event : events){
            if(event.getEintrittspreis() <= max && event.getEintrittspreis() >= min){
                preis.add(event);
            }
        }
        return preis;
    }

    public ArrayList<Event> getMostExpensiveByOrt(String ort){
        double maxPreis = 0.0;
        Event mostExpensive = null;

        for(Event event : events){
            if(event.getOrt().equals(ort)){
                if(event.getEintrittspreis() > maxPreis){
                    maxPreis = event.getEintrittspreis();
                    mostExpensive = event;
                }
            }
        }
        return mostExpensive;
    }

    public double getAvgPreisByOrt(String ort){
        double sum = 0.0;
        int count = 0;
        for(Event event : events) {
            if (event.getOrt().equals(ort)) {
                sum += event.getEintrittspreis();
                count++;
            }
        }
        if(count > 0){
            return sum / count;
        }
        return 0.0;
    }

}
