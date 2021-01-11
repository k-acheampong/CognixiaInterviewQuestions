package com.cognixia.java.jump.questions;

public class LastWordLength {
	
	public int lengthOfLastWord(final String word) {
		int length = 0;
		String newWord = word.trim();
		for (int i = 0; i < newWord.length(); i++) {
			if (newWord.charAt(i) == ' ')
				length = 0;
			else
				length++;
		}
		return length;
	}

	public static void main(String[] args) {
		String phrase = "I work for Cognixia";
		LastWordLength lastWord = new LastWordLength();
		System.out.println("Your phrase is: " + phrase);
		System.out.println("The length of the last word in your phrase is " + lastWord.lengthOfLastWord(phrase));
	}

}
