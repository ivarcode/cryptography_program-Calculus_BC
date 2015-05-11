/*
 * Camden Wagner and David Silverstein
 * Cryptography Program
 * BC Calculus - Spring 2015
 */

package main;

public class Cryptography {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Cryptography program!"
				+ "\nPlease select whether you would like to encrypt or decrypt."
				+ "\n  Encrypt (1)\n  Decrypt (2)\n  :: ");
		
		//ADD SCANNER
		
		System.out.println("Encrypting string " + message + " with a shift of 3...");
		System.out.println(e_shiftCipher(message, 3));
		
		System.out.println("Decrypting string " + encryption + " from a shift of 3...");
		System.out.println(d_shiftCipher(encryption, 3));

	}

}
