package Quiz;
import java.util.*;
public class QuizProgram 
{
	public static void main (String args[])
	{
		//Rohit Kumar Jha
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
					System.out.println("\t\t!!!!!Correct!!!!!!");
					break;
				}
			else if (Ans==5 || Ans>5 || Ans<1)
				{
					System.out.println("\t\tOpps!! Invalid Input! "+"!!Thanks For Playing !!");
					break;
				}
			else
				{
					System.out.println("\t\t!!Wrong!!");
				}
		}
//		X.close();
	}
}
