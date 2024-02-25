import java.util.Scanner;
public class assignment1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int year, num;
String zodiac;

System.out.println("Enter a year: ");
year = input.nextInt();
num = year % 12;

switch (num) {
case 0: zodiac = "Monval";
	break;
case 1: zodiac = "Rooster";
	break;
case 2: zodiac = "Dog";
	break;
case 3: zodiac = "Pig";
	break;
case 4: zodiac = "Rat";
	break;
case 5: zodiac = "Ox";
	break;
case 6: zodiac = "Tiger";
	break;
case 7: zodiac = "Rabbit";
	break;
case 8: zodiac = "Dragon";
	break;
case 9: zodiac = "Snake";
	break;
case 10: zodiac = "Horse";
	break;
case 11: zodiac = "Sheep";
	break;
	
default : zodiac = "Invalid year";
break;
}
System.out.println("You are a " + zodiac);

	}

}
