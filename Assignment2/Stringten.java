package Assignment2;
import java.util.Scanner;

public class Stringten {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			  char ch;
			  Scanner p=new Scanner(System.in);
			  System.out.print("Enter any char : ");
			  ch=p.next().charAt(0);
			  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			  {
			   System.out.println(ch+" is Alphabet");
			  }
			  else if(ch>='0'&&ch<='9')
			  {
			   System.out.println(ch+" is Digit");
			  }
			  else
			  {
			   System.out.println(ch+" is symbol");
			  }
	}

}
}
