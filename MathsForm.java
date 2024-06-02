package Mathematics;
import javax.swing.*;
import java.util.InputMismatchException;

public class MathsForm extends JFrame{
    JLabel labellength, labelbreadth, labelheight, labelarea, labelperimeter, labelvolume;
    JTextField fieldlength, fieldbreadth, fieldheight, fieldarea, fieldperimeter,fieldvolume;
    JButton btncalculate, btnclear;
    public MathsForm(){
        //length//
        labellength=new JLabel("length");
        labellength.setBounds(50, 50, 100, 30);
        fieldlength=new JTextField();
        fieldlength.setBounds(170, 50, 150,30);

        labelbreadth=new JLabel("breadth");
        labelbreadth.setBounds(50, 100, 100, 30);
        fieldbreadth=new JTextField();
        fieldbreadth.setBounds(170, 100, 150,30);

        labelheight=new JLabel("height");
        labelheight.setBounds(50, 150, 100, 30);
        fieldheight=new JTextField();
        fieldheight.setBounds(170, 150, 150,30);

        labelarea=new JLabel("area");
        labelarea.setBounds(50, 200, 100, 30);
        fieldarea=new JTextField();
        fieldarea.setBounds(170, 200, 150,30);

        labelperimeter=new JLabel("perimeter");
        labelperimeter.setBounds(50, 250, 100, 30);
        fieldperimeter=new JTextField();
        fieldperimeter.setBounds(170, 250, 150,30);

        labelvolume=new JLabel("volume");
        labelvolume.setBounds(50, 300, 100, 30);
        fieldvolume=new JTextField();
        fieldvolume.setBounds(170, 300, 150,30);

        btncalculate=new JButton("calculate");
        btncalculate.setBounds(170, 350, 100, 30);
        btnclear=new JButton("clear");
        btnclear.setBounds(170, 400, 100, 30);


        btnclear.addActionListener(e->{
            fieldlength.setText("");
            fieldbreadth.setText("");
            fieldheight.setText("");
            fieldarea.setText("");
            fieldperimeter.setText("");
            fieldvolume.setText("");
        });

        btncalculate.addActionListener(e->{
            double length=0, breadth=0, height=0, area=0, perimeter=0,volume=0;
            try{
                length=Double.parseDouble(fieldlength.getText());
                breadth=Double.parseDouble(fieldbreadth.getText());
                height=Double.parseDouble(fieldheight.getText());
                area= length* breadth;
                perimeter= 2*(length+breadth);
                volume=length*breadth*height;
            } catch (InputMismatchException ep){
                System.out.println(ep.getClass()+ep.getMessage());
            }
            catch (NumberFormatException ep){
                System.out.println(ep.getClass()+ep.getMessage());
            }
            catch (ArithmeticException ep){
                System.out.println(ep.getClass()+ep.getMessage());
            }
            catch (Exception ep){
                System.out.println(ep.getClass()+ep.getMessage());
            }
            fieldarea.setText(String.valueOf(area));
            fieldperimeter.setText(String.valueOf(perimeter));
            fieldvolume.setText(String.valueOf(volume));
        });

        add(labellength);
        add(fieldlength);
        add(labelbreadth);
        add(fieldbreadth);
        add(labelheight);
        add(fieldheight);
        add(labelarea);
        add(fieldarea);
        add(labelperimeter);
        add(fieldperimeter);
        add(labelvolume);
        add(fieldvolume);
        add(btncalculate);
        add(btnclear);


        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        new MathsForm();
    }
}

