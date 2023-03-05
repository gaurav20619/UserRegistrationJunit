package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
// import javax.management.ConstructorParameters;
import java.util.*;

@RunWith(Parameterized.class)
public class EmailParameterisedTest {

    private boolean expectedResult;
    private String email;
    
    public EmailParameterisedTest(String email, boolean expectedResult)
    {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input()
    {
        return Arrays.asList(new Object[][]
                
                {{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},
                        {"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true}, {"abc+100@gmail.com",true},
                        {"abc@gmail.com.com",false},{"abc",false},{"abc@.com.my",false}, {"abc123@gmail.a",false},
                        {"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false}, {"abc()*@gmail.com",false},
                        {"abc@%*.com",false}, {"abc@%*.com",false},	{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},
                        {"abc@abc@gmail.com",false}, {"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}});
    }

    @Test
    public void check_given_emails()
    {
        EmailPatternValidation emailPatternValidation = new EmailPatternValidation();
        expectedResult =  emailPatternValidation.isValidEmail(this.email);
        Assert.assertTrue(expectedResult);
    }
}
