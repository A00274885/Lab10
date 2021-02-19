public class main
{
    public static void main(String[] args) throws CustomExceptionHandler
    {
        Controller controller = new Controller();

        Person person;
        person = new Person("Caolan", "04/08/2000", 20, 'N');

        Person person1 = new Person("John", "06/12/1992",54,'M');

        controller.addToPerson(person);
        controller.addToPerson(person1);

        controller.printPerson();

        controller.removeFromPerson("Caolan");

        controller.printPerson();

    }
}
