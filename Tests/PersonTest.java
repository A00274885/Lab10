import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    /*
        This test class is for the Person class which is the superclass to student and staff.
        It contains a test for the constructor and validation tests for variables.
    */
    @Test
    void personTest001() throws CustomExceptionHandler {
        //Test that you can create a person with all the correct details
       Person p = new Person("Caolan","04/08/2000",20, 'N');

       assertEquals("Caolan",p.getName());
       assertEquals("04/08/2000",p.getdOB());
       assertEquals(20,p.getAge());
       assertEquals('N',p.getGender());
    }

    @Test
    void validateName001()
    {
        //Validate that the name is not null or blank

        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidateName(""));
        assertEquals("Error: Name cannot be null", exception.getMessage());
    }
    @Test
    void validateName002()
    {
        //Validate that the name is not longer than 10 letters
        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidateName("ThisNameIsWayTooLongLolHa"));
        assertEquals("Error: Name is too long", exception.getMessage());
    }


    @Test
    void validatedOB001()
    {
        //Validate that the Date of birth is not null or blank

        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidatedOB(""));
        assertEquals("Error: DOB cannot be null", exception.getMessage());
    }
    @Test
    void validatedOB002()
    {
        //Validate that the format of the Date of birth is "dd/MM/yyyy"

        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidatedOB("2000/12/04"));
        assertEquals("Error: DOB format is incorrect", exception.getMessage());
    }

    @Test
    void validateAge001()
    {
        //Validate that age is not 0 or below

        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.Validateage(0));
        assertEquals("Error: Age cannot be 0 or below", exception.getMessage());
    }


}