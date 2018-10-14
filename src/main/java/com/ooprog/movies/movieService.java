package com.ooprog.movies;

import java.util.ArrayList;
import java.util.List;


public class movieService {
	private static List<ToWatch> ToWatchs = new ArrayList<ToWatch>();

    static {
        ToWatchs.add(new ToWatch("Sample To-Watch List"));
        ToWatchs.add(new ToWatch("Captain Marvel"));
        ToWatchs.add(new ToWatch("Avengers: Annihilation"));
    }
    public List<ToWatch> retrieveToWatchs() {
        return ToWatchs;
    }
    
    public void add(ToWatch toWatch) {
        ToWatchs.add(toWatch);
    }
}
