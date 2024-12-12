package Week6.JUnitExamples;
// Password property checks

public class ValidatePassword {
    public static boolean isValidLength(String password) {
        if (password.length() >= 5 && password.length() <= 10)
            return true ;
        else
            return false ;
    }

    public static boolean isValidLowercase(String password) {
        for (int i = 0; i <= password.length(); i++) {
            System.out.println(password.codePointAt(i));
            // Lowercase letter test
            if (password.codePointAt(i) >= 97 && password.codePointAt(i) <= 122) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidUppercase(String password) {
        for (int i = 0; i <= password.length(); i++) {
            System.out.println(password.codePointAt(i));
            // Lowercase letter test
            if (password.codePointAt(i) >= 65 && password.codePointAt(i) <= 90) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidDigit(String password) {
        for (int i = 0; i <= password.length(); i++) {
            System.out.println(password.codePointAt(i));
            // Lowercase letter test
            if (password.codePointAt(i) >= 48 && password.codePointAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidSpecial(String password) {
        for (int i = 0; i <= password.length(); i++) {
            System.out.println(password.codePointAt(i));
            // Lowercase letter test
            if (password.codePointAt(i) >= 33 && password.codePointAt(i) <= 47) {
                return true;
            } else if (password.codePointAt(i) >= 58 && password.codePointAt(i) <= 64) {
                return true;
            } else if (password.codePointAt(i) >= 91 && password.codePointAt(i) <= 96) {
                return true;
            } else if (password.codePointAt(i) >= 123 && password.codePointAt(i) <= 126) {
                return true;
            }
        }
        return false;
    }

}
