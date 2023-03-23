package cycle2;
import java.util.*;

class StringManipulation {
	String text;

	StringManipulation(String get_text) {
		this.text = get_text;
	}

	void manipulations() {
		Scanner sc =new Scanner(System.in);
		String value = this.text;
		
		System.out.println("String Length is : " + value.length());
		
		System.out.println("Enter text to concatenate");
		String x = sc.nextLine();
		System.out.println("String concatination : " + value.concat(x));
		
		System.out.println("Find index of:");
		String m = sc.nextLine();
		System.out.println("Index of character "+m+": " + value.indexOf(m));
		
		
		System.out.println("Enter text to compare:");
		String r = sc.nextLine();
		System.out.println("Compare To "+r+": " + value.compareTo(r));
		
		System.out.println("Enter string to replace:");
		String f = sc.nextLine();
		System.out.println("Replace  with "+f+": " + value.replace(value, f));
		
		System.out.println("Enter string to check if equal:");
		String e = sc.nextLine();
		System.out.println("Equal? "+value.equals(e));
		
		System.out.println("Convert to LowerCase: " + value.toLowerCase());
		
		System.out.println("Convert to UpperCase: " + value.toUpperCase());
		
		System.out.println("Find character at position:");
		int a = sc.nextInt();
		System.out.println("Character at position "+a+": " + value.charAt(a));
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String : ");
		//String inp= sc.nextLine();
		StringManipulation object = new StringManipulation(sc.nextLine());
		object.manipulations();
	}
}