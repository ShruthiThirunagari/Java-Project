package functionalinterfaces;

public class StringRotationChecker {
        public static boolean isRotation(String s1, String s2) {
            // Check if lengths are equal and not empty
            if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
                return false;
            }

            // Concatenate s1 with itself
            String concatenated = s1 + s1;

            // Check if s2 is a substring of the concatenated string
            return concatenated.contains(s2);
        }
}

