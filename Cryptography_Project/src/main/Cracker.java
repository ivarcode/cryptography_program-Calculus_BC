package main;

public class Cracker {

	public static void crack(String codedMessage, int cipherType) {
		if (cipherType == 1) {
			// SHIFT CIPHER
			c_shiftCipher(codedMessage);
		} else if (cipherType == 2) {
			//TODO
			System.out.print("Currently not in function.");
		} else if (cipherType == 3) {
			c_vigen�re(codedMessage);
		} else {
			System.out.print("Invalid choice.");
		}
	}
	
	public static void c_shiftCipher(String codedMessage) {
		System.out.println();
		int bestMatch = 0;
		int x = 0;
		String bestDecryption = "";
		for (int i = 1; i < 26; i++) {
			String next = Decrypter.d_shiftCipher(codedMessage, i);
			System.out.println("Shift " + i + ": " + next);
			x = scanForWords(Decrypter.d_shiftCipher(codedMessage, i));
			if (x > bestMatch) {
				bestMatch = x;
				bestDecryption = next;
			}
		}
		System.out.println("\nBest Decryption with " + bestMatch + " matching words:\n  :: " + bestDecryption);
	}
	
	public static void c_vigen�re(String codedMessage) {
		System.out.println();
		String currWord = "a";
		String bestMatch = "";
		int x = 0;
		int bestNum = 0;
		for (int i = 0; i < Dictionary.dictionary.size(); i++) {
			x = scanForWords(Decrypter.d_vigen�re(codedMessage, Dictionary.dictionary.get(i)));
			if (x > bestNum) {
				bestMatch = Decrypter.d_vigen�re(codedMessage, Dictionary.dictionary.get(i));
			}
		}
		System.out.println("Best decryption from dictionary:  " + bestMatch + "\nTesting all non-existent 3 letter words.");
		while (true) {
			x = scanForWords(Decrypter.d_vigen�re(codedMessage, currWord));
			if (x > bestNum) {
				bestMatch = Decrypter.d_vigen�re(codedMessage, currWord);
			}
			
			if (currWord.charAt(currWord.length()-1) == 'z') {
				currWord += "a";
			} else {
				@SuppressWarnings("unused")
				String newWord = "";
				for (int i = 0; i < currWord.length()-1; i++) {
					newWord += currWord.charAt(i);
					newWord += (char)((int)currWord.charAt(currWord.length())+1);
				}
			}
			if (currWord.length() == 4) {
				System.out.println("More than 3 characters");
				break;
			}
		}
	}
	
	public static int scanForWords(String message) {
		message += " ";
		int numWords = 0;
		String word = "";
		for (int i = 0; i < message.length(); i++) {
			if ((int)message.charAt(i) == 32) {
				if (Dictionary.searchDictionary(word)) {
					numWords++;
				}
				word = "";
			} else {
				word += (char)((int)message.charAt(i)+32);
			}
		}
		
		return numWords;
	}
	
}
