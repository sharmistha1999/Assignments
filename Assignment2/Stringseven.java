package Assignment2;

public class Stringseven {
	public static int firstNonRepeating(String str) {
	    int[] fi = new int [256];
	    for(int i = 0; i<256; i++)
	        fi[i] = -1;
	    for(int i = 0; i<str.length(); i++) {
	        if(fi[str.charAt(i)] == -1) {
	            fi[str.charAt(i)] = i;
	        }else {
	            fi[str.charAt(i)] = -2;
	        }
	    }
	 
	    int res =  Integer.MAX_VALUE;
	 
	    for(int i = 0; i<256; i++) {
	        if(fi[i] >= 0)
	            res = Math.min(res, fi[i]);
	    }
	    if(res ==  Integer.MAX_VALUE) return -1;
	    else return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
	    str = "classroom";
	    int firstIndex = firstNonRepeating(str);
	    if (firstIndex == -1)
	       System.out.println("Either all characters are repeating or string is empty");
	    else
	       System.out.println("First non-repeating character is "+ str.charAt(firstIndex));
	}

}
