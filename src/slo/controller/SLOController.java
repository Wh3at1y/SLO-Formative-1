package slo.controller;

import slo.view.SLODisplay;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SLOController
{

	// Declaration
	private SLODisplay popUp;
	private boolean addCounter;
	private int counter = 0;
	private boolean playGame;
	private int userNumber;

	private ArrayList<String> nameList;

	// Initialization
	public SLOController()
	{
		popUp = new SLODisplay();
		playGame = true;

		nameList = new ArrayList<String>();
		nameList.add("Nathan");
		nameList.add("Alex");
		nameList.add("Brettly");
		nameList.add("Ryan");
	}

	// start Constructor
	public void start()
	{
		int userConfirm;

		userConfirm = popUp.getUserConfirm("Ready to start the Typing Game?");

		if (userConfirm == popUp.yesOption())
		{
			randomNames();
		}
		else
		{
			popUp.showSomething("Thank you for playing!");
			playGame = false;
			System.exit(0);
		}
	}

	public void randomNames()
	{
		popUp.showSomething("How to Play: \nType in exactly what you see above the textbox.");

		while (playGame == true)
		{
			int randomSelection = (int) (Math.random() * nameList.size());
			String selectedName = nameList.get(randomSelection);
			String userName = popUp.getUserInput(selectedName);

			if (userName != null)
			{

				if (userName.equals(selectedName))
				{
					addCounter = true;
					scoreCounter();
					popUp.showSomething("You got it! Score : " + counter);
				}

				else if (!userName.equals(selectedName))
				{
					addCounter = false;
					scoreCounter();
					popUp.showSomething("Incorrect. Score : " + counter);
				}
				
			}
			else
			{
				popUp.showSomething("Exiting.");
				playGame = false;
				System.exit(0);
			}
			
				if (counter == 5)
				{
					randomIntegers();
				}
			
		}
	}

	public void randomIntegers()
	{

		while(playGame == true)
		{
		
		//if(userNumber == catchNumbers(selectedNumber))
			{
				popUp.showSomething("OK");
			}
		}
	}

	public void randomDoubles()
	{

	}

	public int scoreCounter()
	{

		if (addCounter == true)
		{
			counter++;
		}
		else
		{
			counter = counter - 1;
		}
		return counter;
	}
	
	public void catchNumbers(int selectedNumber)
	{
		int randomNumber = (int) (Math.random() * 1000);
		userNumber=0;
		selectedNumber = randomNumber;
		
		String tempNumber = popUp.getUserInputNumber(selectedNumber);
		
			while(!popUp.isInteger(tempNumber))
			{
				tempNumber = popUp.getUserInputNumber(selectedNumber);
			}
			
			if(popUp.isInteger(tempNumber))
			{
				userNumber = Integer.parseInt(tempNumber);
			}
			else
			{
				popUp.showSomething("Something wrong here.");
			}
	}
}
