package org.barclays;

public class MarketingExecutive {

    public double findRentAfterNoOfDays(Movie movie, int days)
    {
        return movie.getRatePlanStrategy().calculateRent(days);
    }

}
