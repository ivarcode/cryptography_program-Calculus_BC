package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {

	private static String currentDirectory = new File("").getAbsolutePath();
	public static ArrayList<String> dictionary = new ArrayList<String>();
	
	public static void load() throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(currentDirectory + "\\src\\main\\resources\\dictionary.txt"));
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
