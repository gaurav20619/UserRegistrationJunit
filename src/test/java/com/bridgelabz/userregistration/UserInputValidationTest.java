package com.bridgelabz.userregistration;
import org.junit.*;
import org.junit.Test;
import exceptions.InvalidEmailException;
import exceptions.InvalidFirstNameException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;

public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
        result = userInputValidation.isValidFirstName("Gaurav");
        Assert.assertEquals(true, result);
        } catch (InvalidFirstNameException e) {
        }
    }
	 @Test
	    public void givenFirstName_WhenShort_ShouldThrowException() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	        result = userInputValidation.isValidFirstName("Ga");
	        } catch (InvalidFirstNameException e) {
	        	Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
		 UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("Singh");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenLastName_WhenShort_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("Si");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenLastName_WithSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("K@sthuri");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenLastName_WithNumber_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("K23thu6i");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenEmail_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidEmail("gaurav.25@gmail.com");
	        } catch (InvalidEmailException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenEmail_WhenNotValid_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidEmail("gaurav..675.gmail.com");
	        } catch (InvalidEmailException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("9087654321");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("908765-4321908");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("P@ssw0rd");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("hgsuyds5ndj@");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("bsdj@HhcsBB");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WithoutSplChar_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("Pvhs5665vhj");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
        }
}
