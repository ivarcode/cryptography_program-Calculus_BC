package main;

import java.util.Scanner;

public class Encrypter {
	
	public static String encrypt(String message, int cipherType) {
		String codedMessage = null; // TODO SET
		
		if (cipherType == 1) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.print("Shift number\n  :: ");
			int i = scanner.nextInt();
			codedMessage = e_shiftCipher(message, i);
		}
		
		return codedMessage;
	}
	
	
	
	public static String e_shiftCipher(String message, int i) {
		String encryption = "";
		int[] bytes = new int[message.length()];
		for (int j = 0; j < message.length(); j++) {
			bytes[j] = ((int)message.charAt(j))+i;
		}
		for (int k = 0; k < message.length(); k++) {
			encryption += (char)bytes[k];
		}
		
		return encryption;
	}

}
