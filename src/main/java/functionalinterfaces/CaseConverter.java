package functionalinterfaces;

public class CaseConverter {
        public static String convertCase(String input) {
            StringBuilder result = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }
}
