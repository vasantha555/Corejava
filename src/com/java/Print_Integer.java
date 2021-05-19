package com.java;

import java.util.Scanner;

public class Print_Integer {
	
public static void main(String[] args)
{
	Scanner read=new Scanner(System.in);
	
	System.out.println("Entered num"+read.nextInt());
	
	int a,b;
	a=3;
	b=4;
	System.out.println(a*b);
	
	char c='A';
	int ascival=c;
	System.out.println(ascival);
	int ascival2=(int)c;
	System.out.println(ascival2);
}

}
