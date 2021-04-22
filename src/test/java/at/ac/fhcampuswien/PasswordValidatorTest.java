package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setup(){

    }

    @Test
    @DisplayName("Has password valid length")
    public void testIsValid_Scenario1(){
        PasswordValidator pw = new PasswordValidator();
        assertTrue(pw.isValid("pw1234"));
    }

    @Test
    @DisplayName("Test password value null")
    public void testIsValid_Scenario2(){
        PasswordValidator pw = new PasswordValidator();
        assertThrows(IllegalArgumentException.class, () -> pw.isValid(null));
    }

    @Test
    public void testShowMessage_Scenario1(){
        PasswordValidator pw = new PasswordValidator();
        String actual = pw.showMessage(false);
        String expected = "Login failed. Password not valid.";
        assertEquals(expected, actual);
    }

    @Test
    public void testShowMessage_Scenario2(){
        PasswordValidator pw = new PasswordValidator();
        String actual = pw.showMessage(true);
        String expected = "Login successful!";
        assertEquals(expected, actual);
    }

}



