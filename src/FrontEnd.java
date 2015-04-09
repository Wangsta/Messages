import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class FrontEnd 
{
	public FrontEnd()
	{
		JFrame myFrame = new JFrame("Messages");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setMinimumSize(new Dimension(900,650));
		myFrame.setLocation(300,120);
		
		Box vBox = Box.createVerticalBox();
		myFrame.add(vBox);
		
		JLabel add = new JLabel("                                                                                                                   Add New Message");
		vBox.add(add);
		
		
		Box userInput = Box.createHorizontalBox();
		JLabel user = new JLabel("Username");
		userInput.add(user);
		JTextField userField = new JTextField();
		userInput.add(userField);
		vBox.add(userInput);
		
		vBox.add(Box.createVerticalStrut(20));
		
		Box msgInput = Box.createHorizontalBox();
		JLabel msg = new JLabel("Message  ");
		msgInput.add(msg);
		JTextField msgField = new JTextField();
		msgInput.add(msgField);
		JButton addButton = new JButton("Add");
		msgInput.add(addButton);
		vBox.add(msgInput);
		
		vBox.add(Box.createVerticalStrut(40));
		JLabel div = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------");
		vBox.add(div);
		vBox.add(Box.createVerticalStrut(40));
		
		JLabel get = new JLabel("                                                                                                                  Get User Messages");
		vBox.add(get);
		
		Box usernameInput = Box.createHorizontalBox();
		JLabel username = new JLabel("Username");
		usernameInput.add(username);
		JTextField usernameField = new JTextField();
		usernameInput.add(usernameField);
		JButton getButton = new JButton ("Get Messages");
		usernameInput.add(getButton);
		vBox.add(usernameInput);
		
		vBox.add(Box.createVerticalStrut(30));
		
		Box resultBox = Box.createHorizontalBox();
		JLabel msgResult = new JLabel("Messages");
		resultBox.add(msgResult);
		JTextArea msgs = new JTextArea();
		resultBox.add(msgs);
		vBox.add(resultBox);
		
		
		
		
		
		
		
		
		
		
		
		
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new FrontEnd();
			}
		});
	}
}
