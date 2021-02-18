import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{
    String name;
    String dOB;
    int age;
    char gender;

    //The constructor which makes a person using all variables in the class
    public Person(String name, String dOB, int age, char gender) throws CustomExceptionHandler {
        /*Run the parameters through methods which validate if they
        are acceptable*/
        ValidateName(name);
        ValidatedOB(dOB);
        Validateage(age);

        //Sets the class variables to be the variables passed in by the constructor
        this.name = name;
        this.dOB = dOB;
        this.age = age;
        this.gender = gender;
    }


    /*
    A series of getters and setters that for all variables in the person class:
   * Name
   * Date of birth
   * Age
   * Gender
     */
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getdOB()
    {
        return dOB;
    }
    public void setdOB(String dOB)
    {
        this.dOB = dOB;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public char getGender()
    {
        return gender;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }


    //This will print the results of calling the constructor.
    public void printResult()
    {
        throw new RuntimeException("Not implemented");
    }

    static void ValidateName(String name) throws CustomExceptionHandler
    {
            /*
            This method checks if the name is null and if it is it throws a custom error
            it also checks if the name is longer than 10 letters, if it is it throws an error
            */
            if(name == null || name.isBlank())
                throw new CustomExceptionHandler("Error: Name cannot be null");

            if(name.length() > 10)
                throw new CustomExceptionHandler("Error: Name is too long");
    }

    static void ValidatedOB(String dOB) throws CustomExceptionHandler
    {
        /*
        This Method will check if the Date of birth is blank and throw a custom error if it is.
        It will also check the format using the SimpleDateFormat and if it is incorrect it will also throw an error
        */
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        Date parsedDate;

        if(dOB == null || dOB.isBlank())
            throw new CustomExceptionHandler("Error: DOB cannot be null");

        try
        {
            parsedDate = formatter.parse(dOB);
        }
        catch (ParseException e)
        {
            throw new CustomExceptionHandler("Error: DOB format is incorrect");
        }
    }

    static void Validateage(int age) throws CustomExceptionHandler
    {
        /*
        This method simply checks if the age is below 1 and throws an error
        */
        if(age < 1)
            throw new CustomExceptionHandler("Error: Age cannot be 0 or below");
    }

}
