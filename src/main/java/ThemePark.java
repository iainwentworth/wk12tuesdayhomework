import Attractions.Attraction;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

//    public void addAttraction(Attraction attraction) {
//        this.attractions.add(attraction);
//    }

    public int attractionCount(){
        return attractions.size();
    }

//    public void visit(Visitor visitor, Attraction attraction){
//
//    }
}


