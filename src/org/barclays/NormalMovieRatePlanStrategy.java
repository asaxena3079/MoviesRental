package org.barclays;

public class NormalMovieRatePlanStrategy implements RatePlanStrategy {

    @Override
    public double calculateRent(double days)
    {
        return days*2;
    }
}
