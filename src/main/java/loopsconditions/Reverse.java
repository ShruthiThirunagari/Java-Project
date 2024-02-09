package loopsconditions;

public class Reverse {
        public static void main(String[] args) {

            int number = 12345;
            int answer =0;
            while (number > 0) {
                int lastdigit = number % 10;
                answer =answer * 10 + lastdigit;
                number = number/10;

            }
            System.out.println(" Reverse: " + answer );
        }
}
