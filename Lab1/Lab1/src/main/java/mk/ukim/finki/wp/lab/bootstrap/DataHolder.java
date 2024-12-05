package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Event;
import mk.ukim.finki.wp.lab.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Event> eventList = new ArrayList<>();
    public static List<Location> locationList = new ArrayList<>();

    //    @PostConstruct
    public void init() {
        locationList.add(new Location("Aerodrom", "Boskovska 1, Skopje", "150", "A large sports hall for various events"));
        locationList.add(new Location("Ohrid", "Center, Ohrid", "250", "A historic city with a beautiful view of the lake"));
        locationList.add(new Location("Bitola", "11th October St, Bitola", "300", "A popular venue for festivals and concerts"));
        locationList.add(new Location("Prilep", "Goce Delchev, Prilep", "200", "Ideal for conferences and cultural events"));
        locationList.add(new Location("Tetovo", "Nikola Karev, Tetovo", "100", "Perfect for sports events and conferences"));

        eventList.add(new Event("Macedonian Festival", "The biggest cultural festival in Macedonia", 12.00, locationList.get(0)));
        eventList.add(new Event("Ohrid Summer Concerts", "Throughout the year, musical performances from local and international artists", 8.00, locationList.get(1)));
        eventList.add(new Event("Bitola Tikvesh Beer Festival", "Held annually, attracting hundreds of visitors", 18.30, locationList.get(2)));
        eventList.add(new Event("Prilep Wine Festival", "The best way to experience Macedonia's wines", 9.00, locationList.get(3)));
        eventList.add(new Event("Tetovo Sports Event", "Organized sports events and tournaments", 15.00, locationList.get(4)));
        eventList.add(new Event("Conference on Software Development", "Topic: New technologies and software solutions", 10.00, locationList.get(1)));
        eventList.add(new Event("Large Art Exhibition", "An exhibition of young Macedonian artists", 11.00, locationList.get(0)));
        eventList.add(new Event("Theatre Festival", "National theatre festival with performances from top directors", 14.30, locationList.get(2)));
        eventList.add(new Event("Folk Concert", "Macedonian folk songs and dances", 16.45, locationList.get(4)));
        eventList.add(new Event("Weekend in Nature", "Promotion of eco-tourism and Macedonia's natural resources", 17.30, locationList.get(3)));
    }
}