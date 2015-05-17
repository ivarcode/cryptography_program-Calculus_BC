package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {

	public static ArrayList<String> dictionary = new ArrayList<String>();
	
	public static void load() throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("C:\\Users\\Camden\\Documents\\GitHub\\cryptography_program-Calculus_BC\\Cryptography_Project\\src\\main\\dictionary.txt"));
		String currentLine;
		while ((currentLine = br.readLine()) != null) {
			dictionary.add(currentLine);
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean searchDictionary(String word) {
		boolean wordExists = false;
		for (int i = 0; i < dictionary.size(); i++) {
			if (dictionary.get(i).equals(word)) {
				wordExists = true;
				break;
			}
		}
		
		return wordExists;
	}
	
}