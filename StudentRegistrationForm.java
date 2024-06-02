
import javax.swing.*;
public class StudentRegistrationForm extends JFrame{
    JLabel labelname, labelemail, labelgender, labelFaculty;
    JTextField fieldname, fieldemail, fielggender, fieldfaculty;
    JButton binclose, bindisplay;
    JRadioButton r1, r2;
    ButtonGroup bg;
    JComboBox jc;
    public StudentRegistrationForm(){

        //name
        labelname=new JLabel("Name");
        labelname.setBounds(50 ,50,100,30);
        fieldname=new JTextField();
        fieldname.setBounds(170,50,150,30);

        //email
        labelemail=new JLabel("Email");
        labelemail.setBounds(50,100,100,30);
        fieldemail=new JTextField();
        fieldemail.setBounds(170,100,150,30);


        //gender
        labelgender=new JLabel("Gender");
        labelgender.setBounds(50,150,100,30);
        r1=new JRadioButton("A. Male");
        r2=new JRadioButton("B. Female");
        r1.setBounds(170,150,100,30);
        r2.setBounds(270,150,100,30);
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //faculty
        labelFaculty= new JLabel("Faculty");
        labelFaculty.setBounds(50,200,100,30);
        String facultydetails[]={"BCA", "BBM", "BIT", "BSC.CS"};
        jc= new JComboBox(facultydetails);
        jc.setBounds(170,200,150,30);
        bindisplay= new JButton("Display");
        bindisplay.setBounds(170,250,100,30);
        binclose= new JButton("Close");
        binclose.setBounds(270,250,100,30);

        //binclose
        binclose.addActionListener(e->{
            System.exit(0);
        });

        //btndisplay
        bindisplay.addActionListener(e->{
            String name=fieldname.getText();
            String email=fieldemail.getText();
            String gender= r1.isSelected()?"Male":"Female";
            String faculty= (String) jc.getSelectedItem();
            System.out.println("Student Details");
            System.out.println("Name=" +name);
            System.out.println("Email="+email);
            System.out.println("Gender="+gender);
            System.out.println("Faculty="+faculty);
            JOptionPane.showMessageDialog(bindisplay,"Display Succesfully");
        });

        //add Frame
        add(labelname);
        add(labelemail);
        add(labelgender);
        add(labelFaculty);
        add(fieldname);
        add(fieldemail);
        add(fielggender);
        add(fieldfaculty);


    }


}
