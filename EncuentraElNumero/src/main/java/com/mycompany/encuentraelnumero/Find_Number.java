package com.mycompany.encuentraelnumero;

import java.util.*;

public class Find_Number {
	public static void main(String[] args) {
		int randNo, inputNo, userAttempt = 1;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		randNo = rand.nextInt(101);
		System.out.println("Adivina el numero entre 1 y 100\n");
		do {
			inputNo = scan.nextInt();
			if (inputNo > randNo) {
				System.out.println("El numero es mas bajo!!");
			}
			if (inputNo < randNo) {
				System.out.println("El numero es mas alto!!");
			}
			if (inputNo == randNo) {
				System.out.println("Correcto!!");
				System.out.println("Lo acertaste en " + userAttempt + "  intentos.");
			}
			userAttempt++;
		} while (inputNo != randNo);
	}
}
