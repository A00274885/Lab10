import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{
    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
    void validateModule001()
    {

    }

    @org.junit.jupiter.api.Test
    void validateYear001()
    {

    }

}