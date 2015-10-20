package slo.view;

import javax.swing.JOptionPane;

public class SLODisplay {

	public String getUserInput(String print)
	{
		String answer;
			answer = JOptionPane.showInputDialog(print);
		return answer;
	}
	
	public String getUserInputNumber(int number)
	{
		String answer;
			answer = JOptionPane.showInputDialog(number);
		return answer;
	}
	
	public String getUserInputDouble(double number)
	{
		String answer;
			answer = JOptionPane.showInputDialog(number);
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
	
	public int noOption()
	{
		int answer;
			answer = JOptionPane.CANCEL_OPTION;
		return answer;
	}
	
	public boolean isInteger(String print)
	{
		boolean isInt = false;
			
			try
			{
				int validInt = Integer.parseInt(print);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
					showSomething("Exiting!");
					System.exit(0);
			}
		return isInt;
	}
	
	public boolean isDouble(String print)
	{
		boolean isDouble = false;
		
			try
			{
				double validDoub = Double.parseDouble(print);
				isDouble = true;
			}
			catch(NumberFormatException error)
			{
				showSomething("No... no, try again... *rolls eyes*");
			}
			return isDouble;
	}
}
