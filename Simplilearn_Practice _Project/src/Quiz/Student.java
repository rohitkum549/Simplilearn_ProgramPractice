package Quiz;
class studentAll
{
	int regNumber;
	String studentName;
	studentAll(int reg_no,String name)
	{
		this.regNumber=reg_no;
		this.studentName=name;
	}
}

public class Student 
{
	public static void main (String args[])
	{
		studentAll arr[];
		arr =new studentAll[5];
		arr[0]=new studentAll(9999,"Rahul Kumar");
		arr[1]=new studentAll(8888,"Rohit Kumar");
		arr[2]=new studentAll(3333,"Anjali Shaw");
		arr[3]=new studentAll(5555,"Anju sharma");
		arr[4]=new studentAll(3636,"Jugnu Roy");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student Reg_no"+arr[i].regNumber+" and "+arr[i].studentName);
		}
	}
}
