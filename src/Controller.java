import java.util.ArrayList;

public class Controller
{
        //TODO Create a way to add people to the view
        //TODO Create a way to add Staff to the view
        //TODO Create a way to add Students to the view

        //TODO Create a way to add all of the above
        //TODO Create a way to edit all of the above
        //TODO Create a way to delete all of the above

    private ArrayList<Person> personArrayList;
    private ArrayList<Student> studentArrayList;
    private ArrayList<Staff> staffArrayList;

    public Controller()
    {
        personArrayList = new ArrayList<>();
        studentArrayList = new ArrayList<>();
        staffArrayList = new ArrayList<>();
    }

    void addToPerson(Person p)
    {
        personArrayList.add(p);
    }
    void removeFromPerson(String name)
    {
        for(Person person : personArrayList)
        {
            if(person.name.equals(name));
                personArrayList.remove(person);
        }
    }
    void printPerson()
    {
        String text = "";
        for(Person person : personArrayList)
        {
            text = text + person + "\n";
        }

        System.out.println(text);
    }



    void addToStudent()
    {

    }
    void removeFromStudent()
    {

    }
    void printStudent()
    {

    }



    void addToStaff()
    {

    }
    void removeFromStaff()
    {

    }
    void printStaff()
    {

    }


}
