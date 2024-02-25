import java.util.Scanner;
public class Assignment2_1 {

	
	public static boolean checkHex(String s, int n) {
		
		for(int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			
		if((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') || n > 8) {				                
			return false;
			}
		}		
		return true;
	}
	
	public static int convertToDecimal(String s) {
		String hex = s;  
		int decimal = Integer.parseInt(hex,16);  
		System.out.println(decimal);
		return decimal;
	}
	
	public static void solution(String s, int n) {
		int counter = 0;
		while(counter < 3) {
			
			if(checkHex(s, n)) {
				convertToDecimal(s);
				break;
			}
			else {
				System.out.println("Invalid input, try again: ");
				Scanner input = new Scanner(System.in);
				s = input.nextLine();
				n = s.length();
				counter++;
			}
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a hexadecimal: ");
		Scanner input = new Scanner(System.in);
		String s;
		int n;
		s = input.nextLine();
		n = s.length();
	solution(s, n);
		
	}

}
