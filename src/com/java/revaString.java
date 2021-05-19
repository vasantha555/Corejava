package com.java;

public class revaString {

	public static void main(String[] args) {
		String sampleString="Madam Hi Madam";
		
		String[] splittedString=sampleString.split(" ");

		for(String sim:splittedString)
		{
			System.out.println(sim);
		
			String b="";
			for(int i=sim.length()-1;i>=0;i--)
			{
				b=b+sim.charAt(i);
				
			}
			System.out.println(b);
			
			if(sim.equalsIgnoreCase(b))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
		}
		
		
	}

}
