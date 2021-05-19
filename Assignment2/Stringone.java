package Assignment2;

public class Stringone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello have a good day";
int [] freq = new int[str.length()];
char maxChar = str.charAt(0);
int i,j,max;
char String[]=str.toCharArray();
max=freq[0];
for(i=0;i<freq.length;i++)
{
	if(max<freq[i])
	{
		max=freq[i];
		maxChar=String[i];
	}
}
System.out.println("maximum occurring character:"+maxChar);
	}
}
