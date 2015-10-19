package slo.view;

import javax.swing.JOptionPane;

public class SLODisplay {

	public String getUserInput(String print)
	{
		String answer;
			answer = JOptionPane.showInputDialog(print);
		return answer;
	}
	
	public String getUserInputNumber(int print)
	{
		String answer;
			answer = JOptionPane.showInputDialog(print);
		return answer;
	}
	
	public void showSomething(String selectedNumber)
	{
		JOptionPane.showMessageDialog(null, selectedNumber);
	}
	
	public int getUserConfirm(String print)
	{
		int answer;
			answer = JOptionPane.showConfirmDialog(null, print);
		return answer;
	}
	
	public int yesOption()
	{
		int answer;
			answer = JOptionPane.YES_OPTION;
		return answer;
	}
	
	public boolean isInteger(String print)
	{
		boolean isInt = true;
			
			try
			{
				int validInt = Integer.parseInt(print);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				showSomething("Please enter the correct number, and not a string.");
			}
		return isInt;
	}
}
