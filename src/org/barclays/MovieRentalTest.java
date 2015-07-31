package org.barclays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieRentalTest {

    Movie newlyReleasedMovie;
    Movie normalMovie;
    Movie classicReleasedMovie;
    MarketingExecutive marketingExecutive;
    MovieCart movieCart;
    Customer customer;

    @Before
    public void setUp()
    {
        newlyReleasedMovie = new Movie("New", new NewlyReleasedMovieRatePlanStrategy());
        normalMovie = new Movie("Normal", new NormalMovieRatePlanStrategy());
        classicReleasedMovie = new Movie("Classic", new ClassicMovieRatePlanStrategy());

        marketingExecutive = new MarketingExecutive();
    }

    @Test
    public void testMovieRateForNewlyReleasedMovie()
    {
        assertEquals(7,marketingExecutive.findRentAfterNoOfDays(newlyReleasedMovie,4),2);
    }

    @Test
    public void testMovieRateForNormalMovie()
    {
        assertEquals(8,marketingExecutive.findRentAfterNoOfDays(normalMovie,4),2);
    }

    @Test
    public void testMovieRateForClassicMovie()
    {
        assertEquals(6,marketingExecutive.findRentAfterNoOfDays(classicReleasedMovie,7),2);
    }

    @Test
    public void testRentForAllMoviesInMovieCartForParticularCustomer()
    {
        movieCart = new MovieCart();
        customer = new Customer("Ankit");
        movieCart.addMovie(newlyReleasedMovie,4);
        movieCart.addMovie(normalMovie,4);
        movieCart.addMovie(classicReleasedMovie,7);

        assertEquals(21,movieCart.findRentOfAllMovies(),2);
    }

}