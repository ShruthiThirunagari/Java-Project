package objectarrays;

import java.util.Arrays;
import java.util.List;

    public class Main2 {
        public static void main(String[] args) {
            Movie movie1 = new Movie(2000, 8.5, 1000000, 5000000);
            Movie movie2 = new Movie(2010, 7.9, 2000000, 8000000);
            Movie movie3 = new Movie(2000, 8.3, 1500000, 6000000);

            List<Movie> movieList = Arrays.asList(movie1, movie2, movie3);

            // Sort movies by rating and profit
            movieList.sort(Movie.ratingAndProfitComparator);
            System.out.println("Movies sorted by rating and profit:");
            for (Movie movie : movieList) {
                System.out.println(movie);
            }

            System.out.println();

            // Sort movies by year released and rating
            movieList.sort(Movie.yearReleasedAndRatingComparator);
            System.out.println("Movies sorted by year released and rating:");
            for (Movie movie : movieList) {
                System.out.println(movie);
            }
        }
    }
