package org.barclays;

public class NewlyReleasedMovieRatePlanStrategy implements RatePlanStrategy {
    
    public double calculateRent(double days)
    {
        return 3 + 2*(days-2);
    }

}
