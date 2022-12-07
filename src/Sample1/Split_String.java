package Sample1;



public class Split_String
{
	public static void main(String[] args) 
	{
		String sentence="I am a good Tester";
		
		String[] s1=sentence.split(" ");
		
		String New_String = "";
		
		for(int i=0;i<=s1.length-1;i++)
		{
			New_String=New_String+s1[i]+" ";
			
		}
		System.out.println(New_String);
		System.out.println(s1[3]);
		
	}
}