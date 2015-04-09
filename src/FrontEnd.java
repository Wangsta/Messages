import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class FrontEnd 
{
	public FrontEnd()
	{
		JFrame myFrame = new JFrame("Messages");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setMinimumSize(new Dimension(900,650));
		myFrame.setLocation(300,120);
		
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
