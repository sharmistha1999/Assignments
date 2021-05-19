package Assignment2;

public class Stringeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello have a good day";  
        System.out.println(charRemoveAt(str, 14));  
     }  
     public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
	}
}
