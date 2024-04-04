package Problems;

import java.util.Arrays;

public class StrongPasswordChecker {

    public static void main(String[] args) {
        String password = "0IloveLe3tcode!";
        boolean output = strongPasswordCheckerII(password);
        System.out.println("Is strong password : " + output);
    }

    public static boolean strongPasswordCheckerII(String password) {

        if (password.length() < 8) {
            return false;
        }

        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isSpecialChar = false;
        boolean isDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char passwordChar = password.charAt(i);

            if (passwordChar >= 'a' && passwordChar <= 'z') {
                isLowercase = true;
            }

            if (passwordChar >= 'A' && passwordChar <= 'Z') {
                isUppercase = true;
            }

            if (Arrays.asList(specialCharacters).contains(passwordChar)) {
                isSpecialChar = true;
            }


            if (Arrays.asList(digits).contains(passwordChar)) {
                isDigit = true;
            }

            if (i > 0 && passwordChar == password.charAt(i - 1)) {
                return false;
            }

        }

        if (!isUppercase || !isLowercase || !isSpecialChar || !isDigit) {
            return false;
        }

        return true;
    }

}
