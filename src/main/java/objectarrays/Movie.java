package objectarrays;
import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "yearReleased=" + yearReleased +
                ", rating=" + rating +
                ", budget=" + budget +
                ", collectionAmount=" + collectionAmount +
                '}';
    }

    // Comparator to sort movies by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // First compare by rating
            int ratingComparison = Double.compare(movie1.rating, movie2.rating);
            if (ratingComparison != 0) {
                return ratingComparison;
            }
            // If rating is the same, compare by profit (collection amount - budget)
            double profit1 = movie1.collectionAmount - movie1.budget;
            double profit2 = movie2.collectionAmount - movie2.budget;
            return Double.compare(profit1, profit2);
        }
    };

    // Comparator to sort movies by year released and rating
    public static Comparator<Movie> yearReleasedAndRatingComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // First compare by year released
            int yearComparison = Integer.compare(movie1.yearReleased, movie2.yearReleased);
            if (yearComparison != 0) {
                return yearComparison;
            }
            // If year released is the same, compare by rating
            return Double.compare(movie1.rating, movie2.rating);
        }
    };
}
