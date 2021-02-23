public class Staff extends Person
{
    String department;


    public Staff(String name, String dOB,int age,char gender, String department) throws CustomExceptionHandler {
        super(name,dOB,age,gender);

        ValidateDepartment(department);

        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String printResult() {
        String text = super.printResult() + "Department: " + department + "\n";

        return text;
    }

    static void ValidateDepartment(String department) throws CustomExceptionHandler
    {
        if(department.isBlank() || department.isEmpty())
            throw new CustomExceptionHandler("Error: Department cannot be empty");
    }
}
