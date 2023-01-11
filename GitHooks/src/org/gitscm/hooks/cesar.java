package org.gitscm.hooks;

public class cesar {
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypt(String message, int key) {
	    String encrypted = "";
	    for (int i = 0; i < message.length(); i++) {
	        char ch = message.charAt(i);
	        int index = alphabet.indexOf(ch);
	        if (index != -1) {
	            int newIndex = (index + key) % 26;
	            char newChar = alphabet.charAt(newIndex);
	            encrypted += newChar;
	        } else {
	            encrypted += ch;
	        }
	    }
	    return encrypted;
	}
	static String decrypt(String message, int key) {
	    String decrypted = "";
	    for (int i = 0; i < message.length(); i++) {
	        char ch = message.charAt(i);
	        int index = alphabet.indexOf(ch);
	        if (index != -1) {
	            int newIndex = (index - key) % 26;
	            if (newIndex < 0) {
	                newIndex = alphabet.length() + newIndex;
	            }
	            char newChar = alphabet.charAt(newIndex);
	            decrypted += newChar;
	        } else {
	            decrypted += ch;
	        }
	    }
	    return decrypted;
	}
	static void testCaesar() {
	    //try for all 100 first keys
	    for (int i = 0; i < 10000000; i++) {
	        String encrypted = "Sld wrw gsvb tvg lfg";
	        String decrypted = decrypt(encrypted, i);
	        System.out.println("Key: " + i + " " + encrypted + " " + decrypted);
	    }
	}
	public static void main(String[] args) {
		testCaesar();
	}

}
