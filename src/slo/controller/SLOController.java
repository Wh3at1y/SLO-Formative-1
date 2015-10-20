package slo.controller;

import slo.view.SLODisplay;

import java.util.ArrayList;

public class SLOController
{

	// Declaration
	private SLODisplay popUp;
	private boolean addCounter;
	private int counter = 0;
	private boolean playGame;
	private int userNumber;
	private int selectedNumber;
	private int randomNumber;

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
		popUp.showSomething("How to Play: \nType in exactly what you see above the textbox. \nYou have to get a score of 5 to move on!");

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

				else if(userName.equalsIgnoreCase("byPass"))
				{
					randomIntegers();
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
					counter = 0;
					randomIntegers();
				}
			
		}
	}

	
	
	public void randomIntegers()
	{
		while(playGame == true)
		{
			catchRandomNumbers();

			if(userNumber == selectedNumber)
				{
					addCounter = true;
					scoreCounter();
					popUp.showSomething("You typed it correct. Score : " + counter);
				}
			
			else if(userNumber != selectedNumber)
			{
				addCounter = false;
				scoreCounter();
				popUp.showSomething("You typed it incorrect. Score : " + counter);
			}
			
			if(counter == 5)
			{
				counter = 0;
				pieEnding();
			}
		}
	}

	public void pieEnding()
	{
		while(playGame == true)
		{
			double userDouble = 3.14;
			
			if(userDouble == 3.14)
			{
				popUp.showSomething("Thank you for playing!! GoodBye.");
				playGame = false;
				System.exit(0);
			}
			else
			{
				popUp.showSomething("Welp.. No Its not?");
			}
		}
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
	
	public void catchRandomNumbers()
	{
		randomNumber = (int) (Math.random() * 10000);
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
				popUp.showSomething("Something went wrong.");
			}
	}
}
