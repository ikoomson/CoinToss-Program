package coinFlip;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CoinToss 
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Coin Flip"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(); 
		
		ImageIcon imageIcon = new ImageIcon("images/heads.png");
		ImageIcon imageIcon2 = new ImageIcon("images/tails.png");
		ImageIcon frameIcon = new ImageIcon("images/coinflipIcon.png");
		JLabel label = new JLabel(); 
		
		Random randGenerator = new Random();
		
		JButton flipCoin = new JButton("Flip coin"); 
		flipCoin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent v)
      	  	{
				int randomNum = randGenerator.nextInt(2)+1;
								
				System.out.println(randomNum);
				
				if(randomNum == 1)
				{
					label.setIcon(imageIcon);
					frame.getContentPane().add(label, BorderLayout.CENTER);
				}
				else if (randomNum == 2)
				{
					
					label.setIcon(imageIcon2);
					frame.getContentPane().add(label, BorderLayout.CENTER);
				}
				frame.validate();
      	  	}
      	  });
	
		frame.getContentPane().add(flipCoin, BorderLayout.SOUTH);
		frame.setIconImage(frameIcon.getImage());
		frame.pack();
		frame.setSize(350, 350);
		frame.setVisible(true);
		
	}
}
