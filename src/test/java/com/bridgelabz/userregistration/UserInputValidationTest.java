package com.bridgelabz.userregistration;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class UserInputValidationTest {
    @Before
    public void welcomeMsg() {
        System.out.println("Welcome to User Registration Problem");
    }
    @After
    public void afterTest() {
        System.out.println("after every test case");
    }

    @Test
    @DisplayName("FirstName Check")
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Gaurav");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidFirstName("Ga");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Singh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidLastName("Si");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("gauravsingh619@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = userInputValidation.isValidEmail("gauravsingh..675.gmail.com");
        Assert.assertEquals(false, result);
    }
    

}
