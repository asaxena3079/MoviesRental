package org.barclays;

import java.util.HashMap;
import java.util.Map;

public class MovieCart {

    private Map<Movie,Integer> movieMap = new HashMap<>();

    public void addMovie(Movie movie,int days)
    {
        movieMap.put(movie,days);
    }

    public double findRentOfAllMovies()
    {
        double rent=0;
        MarketingExecutive marketingExecutive = new MarketingExecutive();

        for (Map.Entry<Movie,Integer> entry : movieMap.entrySet())
        {
            rent += marketingExecutive.findRentAfterNoOfDays(entry.getKey(),entry.getValue());
        }

        return rent;
    }

}
