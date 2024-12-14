package Week6.JUnitExamples;
// Testing the password property checks for errors

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidatePasswordTest {
    @Test
    void testPasswordLength() {
        assertEquals(true, ValidatePassword.isValidLength("helloworss"));
    }

    @Test
    void testPasswordLowercase() {
        assertEquals(true, ValidatePassword.isValidLowercase("HATTEr"));
    }

    @Test
    void testPasswordUppercase() {
        assertEquals(true, ValidatePassword.isValidUppercase("abletoN"));
    }

    @Test
    void testPasswordDigit() {
        assertEquals(true, ValidatePassword.isValidDigit("password12334"));
    }

    @Test
    void testPasswordSpecial() {
        assertEquals(true, ValidatePassword.isValidSpecial("pass?"));
    }
}
