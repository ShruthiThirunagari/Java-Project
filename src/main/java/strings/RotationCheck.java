package strings;

public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (isRotation(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        // Check if the lengths of the strings are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        // Concatenate str2 with itself to create a new string
        String concatenatedStr = str2 + str2;

        // Check if str1 is a substring of the concatenated string
        return concatenatedStr.contains(str1);
    }
}

