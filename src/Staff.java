public class Staff extends Person
{
    String Department;


    public Staff(String name, String dOB,int age,char gender, String department) throws CustomExceptionHandler {
        super(name,dOB,age,gender);
        throw new RuntimeException("Not yet implemented");
    }

    public String getDepartment() {
        throw new RuntimeException("Not implemented");
    }
    public void setDepartment(String department) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String printResult() {
        throw new RuntimeException("Not implemented");
    }

    static void ValidateDepartment(String department)
    {
        throw new RuntimeException("Not implemented");
    }
}
