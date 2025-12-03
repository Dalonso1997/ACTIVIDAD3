package com.mycompany.calculadoradepropinas;

import java.util.Scanner;
public class Tip_Calculater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\tBienvenido a la calculadora de propinas!!");
		System.out.println("\nIntroduce el total a pagar :");int bill = scan.nextInt();
		System.out.println("Cuanta propina quieres dejar? ");int tip = scan.nextInt();
		System.out.println("Cuantas personas se dividen la cuenta? ");int person = scan.nextInt();
		int total = bill + tip;
		int per_person = total/person;
		System.out.println("El total de la factura es : ₹"+total);
		System.out.println("Cada uno debe pagar : ₹"+per_person);
	}
}
