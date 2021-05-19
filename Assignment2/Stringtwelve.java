package Assignment2;
import java.util.Scanner;

public class Stringtwelve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		       String str, word;
		       Scanner scan = new Scanner(System.in);
		 
		       System.out.print("Enter a String : ");
		       str = scan.nextLine();
		 
		       System.out.print("Enter a Word you want to Delete from the String : ");
		       word = scan.nextLine();
		 
		       str = str.replaceAll(word, "");
		 
		       System.out.print("\nNew String is : ");
		       System.out.print(str);       
	}
	}

}
