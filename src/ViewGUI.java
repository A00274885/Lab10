import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class ViewGUI extends JFrame
{

    /*
        This class will be used for the gui and all user interaction, it will also take in some
        raw inputs from the user which will be passed on and handled by the controller class
     */

    private JButton add = new JButton("Add");
    private JButton remove = new JButton("Remove");
    private JButton print = new JButton("Print");

    private JButton student = new JButton("Student");
    private JButton staff = new JButton("Staff");

    private JLabel nameLab = new JLabel("Name: ");
    private JLabel dobLab = new JLabel("Date of birth: ");
    private JLabel ageLab = new JLabel("Age: ");
    private JLabel genderLab = new JLabel("Gender: ");

    private JLabel moduleLab = new JLabel("Module: ");
    private JLabel yearLab = new JLabel("Year: ");

    private JLabel departmentLab = new JLabel("Department: ");

    private JTextField nameField = new JTextField();
    private JTextField dobField = new JTextField();
    private JTextField ageField = new JTextField();
    private JTextField genderField = new JTextField();

    private JTextField moduleField = new JTextField();
    private JTextField yearField = new JTextField();

    private JTextField departmentField = new JTextField();

    private JLabel printLab = new JLabel("Print Area: ");

    private JTextArea printArea = new JTextArea();

    private JPanel menuPanel = new JPanel();
    private JPanel superPanel = new JPanel();
    private JPanel studentPanel = new JPanel();
    private JPanel staffPanel = new JPanel();
    private JPanel printPanel = new JPanel();

    private Container contentPane = this.getContentPane();
    public ViewGUI()
    {
        this.setLayout(new BoxLayout(contentPane,BoxLayout.PAGE_AXIS));
        this.setSize(750,750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void init()
    {
        menuPanel.add(add);
        menuPanel.add(remove);
        menuPanel.add(print);
        menuPanel.add(student);
        menuPanel.add(staff);

        superPanel.setLayout(new BoxLayout(superPanel,BoxLayout.PAGE_AXIS));
        superPanel.add(nameLab);
        superPanel.add(nameField);
        superPanel.add(dobLab);
        superPanel.add(dobField);
        superPanel.add(ageLab);
        superPanel.add(ageField);
        superPanel.add(genderLab);
        superPanel.add(genderField);

        studentPanel.setLayout(new BoxLayout(studentPanel, BoxLayout.PAGE_AXIS));
        studentPanel.add(moduleLab);
        studentPanel.add(moduleField);
        studentPanel.add(yearLab);
        studentPanel.add(yearField);

        staffPanel.setLayout(new BoxLayout(staffPanel,BoxLayout.PAGE_AXIS));
        staffPanel.add(departmentLab);
        staffPanel.add(departmentField);

        printPanel.setLayout(new BorderLayout());

        JScrollPane scroll = new JScrollPane(printArea);

        printPanel.add(printLab,BorderLayout.NORTH);
        printPanel.add(scroll,BorderLayout.CENTER);

        contentPane.add(menuPanel);
        contentPane.add(superPanel);
        contentPane.add(printPanel);

        this.setVisible(true);
    }

    public void setWindowsListener(WindowListener w)
    {
        this.addWindowListener(w);
    }

    public JButton getAdd()
    {
        return add;
    }

    public JButton getRemove()
    {
        return remove;
    }

    public JButton getPrint()
    {
        return print;
    }

    public JButton getStudent()
    {
        return student;
    }

    public JButton getStaff()
    {
        return staff;
    }

    public JTextField getNameField()
    {
        return nameField;
    }

    public JTextField getDobField()
    {
        return dobField;
    }

    public JTextField getAgeField()
    {
        return ageField;
    }

    public JTextField getGenderField()
    {
        return genderField;
    }

    public JTextField getModuleField()
    {
        return moduleField;
    }

    public JTextField getYearField()
    {
        return yearField;
    }

    public JTextField getDepartmentField()
    {
        return yearField;
    }

    public JTextArea getPrintArea()
    {
        return printArea;
    }

    void checkLayout(Controller.PersonState state)
    {
        switch (state)
        {
            case STUDENT:
                try
                {
                    contentPane.remove(staffPanel);
                    contentPane.add(studentPanel,2);
                    break;
                }
                catch (NullPointerException e)
                {
                    JOptionPane.showMessageDialog(this,"You already have student selected");
                }

            case STAFF:
                try
                {
                    contentPane.remove(studentPanel);
                    contentPane.add(staffPanel,2);
                    break;
                }
                catch (NullPointerException e)
                {
                    JOptionPane.showMessageDialog(this,"You already have staff selected");
                }
        }
        repaint();
    }

}
