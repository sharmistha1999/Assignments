package Assignment2;
import java.util.Arrays;

public class Stringfour {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "borrow";
        String s1 = "narrow";
        char[] ss = s.toCharArray();
        char[] ss1 = s1.toCharArray();

        for(int i=0;i<ss.length;i++){
          for(int j=0;j<ss1.length;j++){
                if(ss1[j] == ss[i]){
                    ss1[j] = 'x'; 
                }
            }
         }
        System.out.println(Arrays.toString(ss1));
	}

}
