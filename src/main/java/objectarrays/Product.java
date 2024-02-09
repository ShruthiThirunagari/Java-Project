package objectarrays;
    public class Product implements Comparable<Product> {
        private double weight;
        private double price;
        private int id;

        public Product(double weight, double price, int id) {
            this.weight = weight;
            this.price = price;
            this.id = id;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }

        public int getId() {
            return id;
        }

        @Override
        public int compareTo(Product otherProduct) {
            // Compare products based on their price
            return Double.compare(this.price, otherProduct.price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "weight=" + weight +
                    ", price=" + price +
                    ", id=" + id +
                    '}';
        }
    }
