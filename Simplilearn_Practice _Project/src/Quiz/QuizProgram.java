package Quiz;
import java.util.*;
public class QuizProgram 
{
	public static void main (String args[])
	{
		System.out.println("!!Welcome to Quiz!!");
		Scanner X=new Scanner (System.in);
		while(true)
		{
			System.out.println("From what location are the 1st computer instructions available on boot up?");
			System.out.print("\r 1.CONFIG.SYS\n"+"\r 2.CPU\n"+"\r 3.ROM BIOS\n"+"\r 4.None of the above\n"+"\r "
					+ "5.Exit from Quiz\n");
			System.out.println("\t\tChoose the ANS:- 1,2,3,4,5");
			int Ans=X.nextInt();
			if(Ans==3)
				{
					System.out.println("!!Correct!!");
					break;
				}
			else if (Ans==5 || Ans>5 || Ans<1)
				{
					System.out.println("Opps!! Invalid Input! "+"!!Thanks For Playing !!");
					break;
				}
			else
				{
					System.out.println("!!Wrong!!");
				}
		}
//		X.close();
	}
}
