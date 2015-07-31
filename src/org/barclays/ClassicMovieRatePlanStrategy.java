package org.barclays;

public class ClassicMovieRatePlanStrategy implements RatePlanStrategy {

    @Override
    public double calculateRent(double days)
    {
        double rent=0;

        if(days<=6)
            rent = days*0.5;
        else if(days==7)
            rent = 6;
        else if(days>7)
            rent = 6 + (days-7)*0.5;

        return rent;
    }
}
