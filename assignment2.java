import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
String s;
int n;
int counter = 0;
int j = 2;
System.out.println("Enter a hexadecimal: ");
s = input.nextLine();
n = s.length();


for(int i = 0; i < n; i++) {
	char ch = s.charAt(i);
	
	while((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') || n > 8) {
		System.out.println("Not a valid hexadecimal. Try again. You have " + j + " attempts leftChild.");
		s = input.nextLine();		
		n = s.length();
		if((ch >= '0' || ch <= '9') && (ch >= 'A' || ch <= 'F') || n <= 8) {
			break;
		}
		else if(counter == 2) {
			break;
		}	

			}
	
	}
System.out.println("Valid input");
}


	
	
	
	}
	


