import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements ActionListener, WindowListener
{

    private ArrayList<Student> studentArrayList;
    private ArrayList<Staff> staffArrayList;

    enum PersonState{STUDENT,STAFF};
    PersonState state = PersonState.STUDENT;

    private ViewGUI view;

    public Controller()
    {
        studentArrayList = new ArrayList<>();
        staffArrayList = new ArrayList<>();

        view = new ViewGUI();
        view.init();

        view.setWindowsListener(this);
        view.getAdd().addActionListener(this);
        view.getRemove().addActionListener(this);
        view.getPrint().addActionListener(this);
        view.getStaff().addActionListener(this);
        view.getStudent().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {


        if(e.getSource() == view.getStudent())
        {
            state = PersonState.STUDENT;
            view.checkLayout(state);
        }
        else if(e.getSource() == view.getStaff())
        {
            state = PersonState.STAFF;
            view.checkLayout(state);
        }

        if(state == PersonState.STUDENT)
        {
            if (e.getSource() == view.getAdd())
            {
                addToStudent();
            }
            else if (e.getSource() == view.getRemove())
            {
                removeFromStudent();
            }
            else if(e.getSource() == view.getPrint())
            {
                printStudent();
            }
        }
        else
        {
            if(e.getSource() == view.getAdd())
            {
                addToStaff();
            }
            else if (e.getSource() == view.getRemove())
            {
                removeFromStaff();
            }
            else if (e.getSource() == view.getPrint())
            {
                printStaff();
            }
        }

    }

    private void addToStudent()
    {
        try
        {
            studentArrayList.add(
                    new Student(view.getNameField().getText(),
                            view.getDobField().getText(),
                            Integer.parseInt(view.getAgeField().getText()),
                            view.getGenderField().getText().charAt(0),
                            view.getModuleField().getText(),
                            Integer.parseInt(view.getYearField().getText())));
        }
        catch (CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
        }

    }
    private void removeFromStudent()
    {
        for(Student student : studentArrayList)
        {
            if(student.getName().equals(view.getNameField().getText()))
                studentArrayList.remove(student);
        }
    }

    private void addToStaff()
    {
        try
        {
            staffArrayList.add(new Staff(view.getNameField().getText(),
                                    view.getDobField().getText(),
                                    Integer.parseInt(view.getAgeField().getText()),
                                    view.getGenderField().getText().charAt(0),
                                    view.getDepartmentField().getText()));
        }
        catch(CustomExceptionHandler e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void removeFromStaff()
    {

        for(Staff staff : staffArrayList)
        {
            if(staff.getName().equals(view.getNameField()))
                staffArrayList.remove(staff);
        }
    }

    void printStaff()
    {
        String text = "";
        for(Staff staff : staffArrayList)
        {
            text = text + staff.printResult() + "\n";
        }
        view.getPrintArea().setText(text);
        System.out.println(text);
    }

    void addToStudent(Student s)
    {
        studentArrayList.add(s);
    }

    void removeFromStudent(String name)
    {
        for(Student student : studentArrayList)
        {
            if(student.name.equals(name))
                studentArrayList.remove(student);
        }
    }

    void printStudent()
    {
        String text = "";
        for(Student student : studentArrayList)
        {
            text = text + student.printResult() + "\n";
        }
        view.getPrintArea().setText(text);
        System.out.println(text);
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    void addToStaff(Staff s)
    {
        staffArrayList.add(s);
    }
    void removeFromStaff(String name)
    {
        for(Staff staff : staffArrayList)
        {
            if(staff.name.equals(name))
                studentArrayList.remove(staff);
        }
    }
}
