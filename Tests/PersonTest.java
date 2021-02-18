import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void personTest001() throws CustomExceptionHandler {
       Person p = new Person("Caolan","04/08/2000",20, 'N');

       assertEquals("Caolan",p.getName());
       assertEquals("04/08/2000",p.getdOB());
       assertEquals(20,p.getAge());
       assertEquals('N',p.getGender());
    }

    @org.junit.jupiter.api.Test
    void validateName001()
    {

        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidateName(""));
        assertEquals("Error: Name cannot be null", exception.getMessage());
    }
    @org.junit.jupiter.api.Test
    void validateName002()
    {
        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidateName("ThisNameIsWayTooLongLolHa"));
        assertEquals("Error: Name is too long", exception.getMessage());
    }


    @org.junit.jupiter.api.Test
    void validatedOB001()
    {
        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidatedOB(""));
        assertEquals("Error: DOB cannot be null", exception.getMessage());
    }
    @org.junit.jupiter.api.Test
    void validatedOB002()
    {
        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.ValidatedOB("2000/12/04"));
        assertEquals("Error: DOB format is incorrect", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void validateage001()
    {
        Exception exception = Assertions.assertThrows(CustomExceptionHandler.class,
                ()-> Person.Validateage(0));
        assertEquals("Error: Age cannot be 0 or below", exception.getMessage());
    }


}