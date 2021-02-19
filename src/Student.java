public class Student extends Person
{
    String module;  //What module is the student studying
    int year;       //Current year of study

    //Creates a constructor for a student which is based on the Person superclass
    public Student(String name, String dOB, int age, char gender, String module, int year) throws CustomExceptionHandler
    {
        super(name, dOB, age, gender);

        this.module = module;
        this.year = year;
    }

    //Getters and setters for the student class
    // * Module
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }

    // * Year
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String printResult()
    {
        String text;
        //Calls the superclasses method and then prints out the additional Module and year info
        super.printResult();
        System.out.println("Module: ");
        System.out.println("Year: ");
        return text = "";
    }

    static void ValidateModule(String module) throws CustomExceptionHandler
    {
        /*
            Validates that the module is not null or blank
            Validates that the module is not shorter than 4 letters
        */
        if(module == null || module.isBlank())
            throw new CustomExceptionHandler("Error: module cannot be null");

        if(module.length() < 4)
            throw new CustomExceptionHandler("Error: module cannot be shorter than 4 letters");
    }

    static void ValidateYear(int year) throws CustomExceptionHandler
    {
        //Validates that year is not less than or equal to 0
        //Validates that year is not greater than 5

        if(year <= 0 || year > 5)
            throw new CustomExceptionHandler("Error: year must stay within 1 to 5");

    }
}
