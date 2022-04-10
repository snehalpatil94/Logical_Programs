package com.bridgelabz.logicalprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Program to check number is prime number
 * 
 * @author : Snehal Patil
 *
 */
public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it is it prime :");
		int num = sc.nextInt();

		Util.primeNo(num);
	}
}
