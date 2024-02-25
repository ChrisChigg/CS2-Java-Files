import java.util.Scanner;
public class assignment1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int year;


System.out.println("Enter a year: ");
year = input.nextInt();

if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
{
	System.out.println("It's a leap year!");
	}
else
{
	System.out.println("It's not a leap year!");
	}
	}

}
