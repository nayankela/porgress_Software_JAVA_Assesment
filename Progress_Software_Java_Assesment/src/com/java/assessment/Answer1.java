package com.java.assessment;

import java.util.Scanner;

public class Answer1 {

	String Decryption(String cipherText, int depth) throws Exception {
		int r = depth, len = cipherText.length();
		int c = len / depth;
		char mat[][] = new char[r][c];
		int k = 0;
		String plainText = "";
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = cipherText.charAt(k++);
			}
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				plainText += mat[j][i];
			}
		}
		return plainText;
	}

	public static void main(String args[]) throws Exception {
		Answer1 rf = new Answer1();
		Scanner scn = new Scanner(System.in);
		int depth;
		String cipherText, decryptedText;
		depth = scn.nextInt();
		scn.nextLine();
		cipherText = scn.nextLine();
		decryptedText = rf.Decryption(cipherText, depth);
		System.out.println(decryptedText);
		scn.close();
	}
}
