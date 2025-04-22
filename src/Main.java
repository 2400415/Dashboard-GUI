import javax.swing.*;
import java.awt.Color;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame homeFrame=new JFrame("Home");

        homeFrame.setSize(400,500);

        homeFrame.setVisible(true);

        homeFrame.setLayout(null);

        // Making the panels for the dashboard.
        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.ORANGE);
        bluePanel.setBounds(0,8,200,700);
        homeFrame.add(bluePanel);

        JLabel welcome=new JLabel("WELCOME");
        Font welcomeFont=new Font("Elephant",Font.BOLD,50);
        welcome.setForeground(Color.BLACK);
        welcome.setFont(welcomeFont);
        welcome.setBounds(10,30,500,150);

        //2nd panel ( this the one at the top )

        JPanel blackPanel=new JPanel();
        blackPanel.setBackground(Color. BLUE);
        blackPanel.setBounds(200,8,1500,150);
        homeFrame.add(blackPanel);
        blackPanel.add(welcome);
        blackPanel.setLayout(null);

        JPanel thirdPanel=new JPanel();
        thirdPanel.setBackground(Color.BLACK);
        thirdPanel.setBounds(200,50,1500,600);
        homeFrame.add(thirdPanel);

        //ADD features from productivity+ to the dashboard

        //home page icon:

        ImageIcon HomeIcon ;

        try {



            HomeIcon = new ImageIcon("C:\\Users\\Regoe\\OneDrive\\Pictures\\HomepageIcon.jpg");
            JLabel HL=new JLabel(HomeIcon);
            HL.setBounds(10,200,300,350);
            thirdPanel.add(HL);


        }catch(Exception e) {

            // for the case where the image is not found

            JOptionPane.showMessageDialog(null,"There was an image here");

        }





        JButton cs=new JButton("CREATE A NEW SCHEDULE ");
        cs.setBounds(350,120,650,70);
        cs.setBackground(Color.CYAN);


        JButton vs=new JButton("VIEW OR UPDATE SCHEDULE ");
        vs.setBounds(350,210,650,70);
        vs.setBackground(Color.CYAN);

        JButton tm=new JButton("TIME MANAGEMENT TIPS ");
        tm.setBounds(350,300,650,80);
        tm.setBackground(Color.CYAN);

        JButton tt=new JButton("TASK TRACKER !! ");
        tt.setBounds(350,400,650,80);
        tt .setBackground(Color.CYAN);

        JButton E=new JButton(" EXIT   !! ");
        E.setBounds(350,500,650,80);
        E.setBackground(Color.ORANGE);

        thirdPanel.add(tm);

        thirdPanel.add(vs);

        thirdPanel.add(cs);

        thirdPanel.add(tt);

        thirdPanel.add(E);

       // thirdPanel.add(HL);

        thirdPanel.setLayout(null);




    }
}