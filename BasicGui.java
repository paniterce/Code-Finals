import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.io.*;

public class BasicGui {
	
	public static void main(String []args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Name:");
		JLabel label2 = new JLabel("ID:");
		JLabel label3 = new JLabel("<<<<<<<WELCOME TO OUR COMPANY!!>>>>>>>");
		label.setBounds(50,48,100,100);
		label2.setBounds(50,68,100,100);
		label3.setBounds(100,30,400,30);
		JTextField text = new JTextField();
		JTextField text2 = new JTextField();
		text.setBounds(100,90,250,20);
		text2.setBounds(100,110,250,20);
		
		//Panel settings
		JPanel panel = new JPanel();
		panel.setBounds(0,0,500,500);
		panel.setBackground(Color.GRAY);
		
		//Button settings
		JButton button = new JButton("Create");
		JButton button2 = new JButton("Read");
		JButton button3 = new JButton("Update");
		JButton button4 = new JButton("Delete");
		button.setBounds(65,135,80,20);
		button2.setBounds(165,135,80,20);
		button3.setBounds(265,135,80,20);;
		button4.setBounds(365,135,80,20);
			
			//frame settings
		frame.setSize(500,215);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("HOME PAGE");
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(text);
		frame.add(text2);
		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(panel);
		frame.setLayout(null);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		JFrame outFrame = new JFrame();
		JLabel outLabel = new JLabel("SUCCESSFULLY CREATED!!");
		//output Label
		outLabel.setBounds(100,20,300,100);
		//output frame
		outFrame.setSize(350,200);
        outFrame.setLocationRelativeTo(null);
        outFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outFrame.setTitle("Success!!");
        outFrame.setVisible(true);
        outFrame.setLayout(null);
        outFrame.add(outLabel);
        
         try {
            FileWriter writer = new FileWriter("Information.txt");
            writer.write(text.getText());
            writer.append("   "+text2.getText());
            writer.close();
        } catch (IOException a) {
            a.printStackTrace();
        }  

		   }
		});
					
        
}
}