/*
 * Camden Wagner and David Silverstein
 * Cryptography Program
 * BC Calculus - Spring 2015
 */

package main;

import java.util.Scanner;

public class Cryptography {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean inMenu = true;

		System.out.print("Welcome to the Cryptography program!");

		while (inMenu == true) {
			System.out.print("\n\nWould like to encrypt, decrypt, or crack a message?"
					+ "\n  Encrypt (1)\n  Decrypt (2)\n  Crack a message (3)\n  Quit (4)\n  :: ");

			int mode = scanner.nextInt();

			if (mode == 1) {
				encrypt();
			} else if (mode == 2) {
				decrypt();
			} else if (mode == 3) {
				crack();
			} else if (mode == 4) {
				inMenu = false;
			} else {
				//do nothing (re-loop)
			}
		}
	}

	public static void encrypt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("What message would you like to encrypt?\n  :: ");
		String message = scanner.nextLine();
		
		System.out.print("How would you like to encrypt it?\n  Shift Cipher (1)\n  :: ");
		int cipherType = scanner.nextInt();
		
		String codedMessage = Encrypter.encrypt(message, cipherType);
		
		System.out.print("Your encrypted message is\n  :: " + codedMessage);
	}

	public static void decrypt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("What would you like to decrypt?\n  :: ");
		String codedMessage = scanner.nextLine();
		
	}

	public static void crack() {
		//nothing yet
	}

}
