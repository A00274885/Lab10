import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest extends PersonTest {


    @Test
    void StaffTest001() throws CustomExceptionHandler
    {
        Staff s = new Staff("Caolan","04/08/2000",20,'N',"Engineering");

        assertAll("Validates the creation of a staff member",
                ()-> assertEquals("Caolan",s.getName()),
                ()-> assertEquals("04/08/2000", s.getdOB()),
                ()-> assertEquals(20, s.getAge()),
                ()-> assertEquals('N',s.getGender()),
                ()-> assertEquals("Engineering", s.getDepartment())
                );
    }

    @Test
    void validateDepartment()
    {
        //Validates that the department exists

        Exception exception = assertThrows(CustomExceptionHandler.class,
                ()-> Staff.ValidateDepartment("Gardening"));
        assertEquals("Error: this department does not exist", exception.getMessage());
    }
}