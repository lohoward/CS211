import java.util.*;
public class lab1 {

    public static void main(String[]args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your sentence: ");
    	String s = sc.nextLine();
    	System.out.print(ascii(s));
    	System.out.println("");
    	letterFrequency(s);

    }

    public static String ascii(String s)
    {
    	String res="";
    	char[] messChar = s.toCharArray();
    	for(int i=0;i<messChar.length;i++)
    	{
    		res+= Integer.toBinaryString(messChar[i])+ " ";
    	}
    	return res;
    }


    public static void letterFrequency(String s)
    {
    	int counter[]= new int[256];
    	for(int i=0;i<s.length();i++)
    	{
    		counter[(int)s.charAt(i)]++;
    	}
    	for(int i=0;i< 256;i++)
    	{
    		if(counter[i]==1)
    		{
    			System.out.println("'"+(char)i+"'"+" appeared "+counter[i]+" time");
    		}
    		else if(counter[i]>=2)
    		{
    			System.out.println("'"+(char)i+"'"+" appeared "+counter[i]+" times");
    		}
    	}

    }





}









