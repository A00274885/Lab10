public class Student extends Person
{
    String module;
    //Creates a constructor for a student which is based on the Person superclass
    public Student(String name, String dOB, int age, char gender, String module) throws CustomExceptionHandler {
        super(name, dOB, age, gender);
        throw new RuntimeException("Not yet implemented");
    }

    //Getters and setters for the student class
    // * Module
    public String getModule() {
        throw new RuntimeException("Not implemented");
    }
    public void setModule(String module) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void printResult() {
        throw new RuntimeException("Not implemented");
    }
}
