package Assignment2;

public class Stringthirteen {
	static public String move(String s)
    {
        return s.replaceAll("[A-Z]+", "") + s.replaceAll("[^A-Z]+", "");
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        String str = "hello have a good day!!";
	        
	        System.out.println("Befour Operation:   " + str);
	        System.out.println("After Operation:    " + move(str));
	}

}
