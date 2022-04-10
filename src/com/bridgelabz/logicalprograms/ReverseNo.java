package com.bridgelabz.logicalprograms;

import java.util.Scanner;

import Utility.Util;

/**
 * Java program to reverse number.
 * 
 * @author : Snehal Patil
 *
 */
public class ReverseNo {
	public static void main(String[] args) {
		System.out.print("Enter the no : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Util.reveseNo(num);
	}
}
