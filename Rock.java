// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
    	boolean stillPlaying = true;
    	while(stillPlaying){
		String personPlay = "";    //User's play -- "R", "P", or "S"
		String computerPlay = "";  //Computer's play -- "R", "P", or "S"
		int computerInt =0;      //Randomly generated number used to determine
		boolean youWon = false, tie = false;

		computerInt = GetInfo.getOption("Choose Option", new String[]{"Rock", "Paper", "Scissor"});
		
		Random generator = new Random();
		int rand = generator.nextInt(3);
		
		switch (rand){
			case 0: computerPlay = "Rock"; break;
			case 1: computerPlay = "Paper"; break;
			case 2: computerPlay = "Scissor"; break;
		}
		switch (computerInt){
			case 0: personPlay = "Rock"; break;
			case 1: personPlay = "Paper"; break;
			case 2: personPlay = "Scissor"; break;
		}
		
		GetInfo.showMessage("The computer chose " + computerPlay);

		if (personPlay.equals(computerPlay))  
	    	tie = true;
		else if (personPlay.equals("Rock") && computerPlay.equals("Scissor"))
			youWon = true;
		else if(personPlay.equals("Paper") && computerPlay.equals("Rock"))
			youWon = true;
		else if(personPlay.equals("Scissor") && computerPlay.equals("Paper"))
			youWon = true;
			
				
		if(youWon)
			GetInfo.showMessage("You won");
		else if(!tie) GetInfo.showMessage("You lost");
	    
	    if(tie)
	    	GetInfo.showMessage("It was a tie");

		//...  Fill in rest of code
		stillPlaying = GetInfo.getYesNo("Wanna play again?");
    }
    }
}

		

	
		



