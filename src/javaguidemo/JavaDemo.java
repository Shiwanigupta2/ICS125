package javaguidemo;//if using cmd, comment out this package

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author C0499933
 */
public class JavaDemo {

    JPanel p; //had to be initialized out of the main method so that other classes can use it too. 
// was initialized in the mehtod as JPanel p = new JPanel;
    JFrame f;
    JButton b;
    JLabel label;
    JTextField text1;
    JTextField text2;
    
    public JavaDemo() {
        f = new JFrame("Basic Test!");

        p = new JPanel();
         f.getContentPane().add(p); //add panel to the frame // to add panel to the frame, use getContentPane. it is different from adding other stuff
         
        //b = new JButton("Click me"); //commented out to add image effect as shown in code below.
        //created images folder and add images to it. make sure the image path is right
        b = new JButton("New Document", new ImageIcon("images/g.png")); // code was pasted from slides
        b.setRolloverEnabled(true);// code was pasted from slides
        b.setRolloverIcon(new ImageIcon("images/r.png"));// code was pasted from slides
        p.add(b); //add button to panel
       
       
        // you can add buttons and sliders directly to the frame but add it to the panel first so that it is organize later on. 

        label = new JLabel("Hello world");
        p.add(label); //add label to the panel

        b.addActionListener(new ButtonListener()); //this will need an argument so create a listener object which is class ButtonListener
        
        text1 = new JTextField("444");
        p.add(text1);
        text2 = new JTextField("444");
        p.add(text2);

        //quit Java after closing the window. This code needs to be at the end of the constructor
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200); //set size in pixels
        f.setVisible(true); //show the window // end of creating a new JFrame

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[0]); // right click on package under projects > properties > run > add arguments
        //System.out.println(args[1]);
        new JavaDemo();
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { //this method came from 'implement abstract methods'
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. //comment out to add desired code
           String text11 = text1.getText();
            label.setText("Click"); //i dont think there is any point of this statement
            //int i = Integer.parseInt(text11) + 1;
            //label.setText("Click" + i);
            
            String text22 = text2.getText();
            int add = Integer.parseInt(text11) + Integer.parseInt(text22);
            label.setText("The sum is: " + add);
                    
        }

    }

}
