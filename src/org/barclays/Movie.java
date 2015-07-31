package org.barclays;

public class Movie {

    private String movieName;
    private RatePlanStrategy ratePlanStrategy;

    public RatePlanStrategy getRatePlanStrategy()
    {
        return ratePlanStrategy;
    }

    public Movie(String movieName, RatePlanStrategy ratePlanStrategy)
    {
        this.movieName = movieName;
        this.ratePlanStrategy = ratePlanStrategy;
    }


}
