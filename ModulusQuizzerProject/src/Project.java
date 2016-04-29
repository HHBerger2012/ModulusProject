import java.util.Scanner;

public class Project
	{
		static int numberOfQuestions;
		static int score = 0;
		static int counter = 0;
		static int numberOfQuestions1 = 0;
		public static void main(String[] args)
			{
				doGreeting();
				doChallenge();
			}
		public static void doGreeting()
		{
			System.out.println("How many questions do you want to answer?");
			Scanner userInput = new Scanner(System.in);
			numberOfQuestions = userInput.nextInt();
			doChallenge();
		}
		public static void doChallenge()
		{
			for (int i = 0; i<numberOfQuestions;i++)
				{
					if ((i+1) % 5 == 0)
						{
							int firstNumber = (int)(Math.random()*9)+1;
							int secondNumber = (int)(Math.random()*9)+1;
							firstNumber = secondNumber;
							System.out.println(firstNumber + " % " + secondNumber + " = ");
							Scanner userInput1 = new Scanner(System.in);
							int userAnswer = userInput1.nextInt();
							if (userAnswer == firstNumber % secondNumber)
								{
									System.out.println("Well done");
									counter++;
									score++;
									numberOfQuestions1 ++;
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered " + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
							else
								{
									numberOfQuestions1 ++;
									counter++;
									System.out.println("Sorry but not quite");
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered "  + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
						}	
					else if ((i+1) % 4 == 0)
						{
							int firstNumber = (int)(Math.random()*3)+1;
							int secondNumber = (int)(Math.random()*9)+5;
							System.out.println(firstNumber + " % " + secondNumber + " = ");
							Scanner userInput1 = new Scanner(System.in);
							int userAnswer = userInput1.nextInt();
							if (userAnswer == firstNumber % secondNumber)
								{
									System.out.println("Well done");
									counter++;
									score++;
									numberOfQuestions1 ++;
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered " + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
							else
								{
									numberOfQuestions1 ++;
									counter++;
									System.out.println("Sorry but not quite");
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered "  + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
						}
					else 
						{
							int firstNumber = (int)(Math.random()*9)+5;
							int secondNumber = (int)(Math.random()*3)+1;
							System.out.println(firstNumber + " % " + secondNumber + " = ");
							Scanner userInput1 = new Scanner(System.in);
							int userAnswer = userInput1.nextInt();
							if (userAnswer == firstNumber % secondNumber)
								{
									System.out.println("Well done");
									counter++;
									score++;
									numberOfQuestions1 ++;
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered " + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
							else
								{
									numberOfQuestions1 ++;
									counter++;
									System.out.println("Sorry but not quite");
									if (numberOfQuestions1 == numberOfQuestions)
										{
											System.out.println("All done! You answered "  + score + " questions correctly out of " + counter + " total questions");
											System.exit(0);
										}
								}
						}
				}
	}
}