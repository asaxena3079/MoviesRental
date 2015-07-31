package org.barclays;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String customerName;
    private MovieCart movieCart;

    public Customer(String customerName)
    {
        this.customerName = customerName;
    }

    public void addMovie(Movie movie, int days)
    {
        this.movieCart.addMovie(movie, days);
    }
}
