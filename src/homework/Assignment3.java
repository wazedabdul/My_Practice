package homework;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		//num:1
		System.out.println(74+36);
		
		//num:2
		System.out.println(50/3);
		
		//num:3
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println( 20 + -3*5 / 8);
		System.out.println( 5 + 15 / 3 * 2 - 8 % 3);

		//variables
		//num:1
		int number1 = 25;
		int number2 = 5;
		System.out.println(number1*number2);
		
		//num:2
		int a = 10;
		int b = 15;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
		//if statement
		//num:1
		
		System.out.println(125+24);
		System.out.println(125-24);
		System.out.println(125*24);
		System.out.println(125/24);
		System.out.println(125%24);
		
		//num:2
		
		
		//forloop
		//num:1
		
		for (int i=1; i<=99; i+=2) {
			System.out.println(i);
		}
		
		//num:2
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int others = 0;
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (Character.isLetter(ch)) {
		letters++;
		} else if (Character.isWhitespace(ch)) {
		spaces++;
		} else if (Character.isDigit(ch)) {
		numbers++;
		} else {
		others++;
		}
		}
		System.out.println("The string is: " + str);
		System.out.println("letter: " + letters);
		System.out.println("space: " + spaces);
		System.out.println("number: " + numbers);
		System.out.println("other: " + others);
		
		
        
		
	}

}
