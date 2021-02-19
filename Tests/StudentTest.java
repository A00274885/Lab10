import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{
    @Test
    void studentTest001() throws CustomExceptionHandler
    {
        Student s = new Student("Caolan","04/08/2000",20,'N',"Software Design",2);
        assertEquals("Caolan",s.getName());
        assertEquals("04/08/2000",s.getdOB());
        assertEquals(20,s.getAge());
        assertEquals('N',s.getGender());
        assertEquals("Software Design", s.getModule());
        assertEquals(2, s.getYear());

    }

    @Test
    void validateModule001()
    {
        Exception exception = assertThrows(CustomExceptionHandler.class,
                ()-> Student.ValidateModule(""));
        assertEquals("Error: module cannot be null", exception.getMessage());
    }

    @Test
    void validateModule002()
    {
        Exception exception = assertThrows(CustomExceptionHandler.class,
                ()-> Student.ValidateModule("sof"));
        assertEquals("Error: module cannot be shorter than 4 letters", exception.getMessage());
    }

    @Test
    void validateYear001()
    {
        Exception exception = assertThrows(CustomExceptionHandler.class,
                ()-> Student.ValidateYear(0));
        assertEquals("Error: year must stay within 1 to 5", exception.getMessage());
    }

}