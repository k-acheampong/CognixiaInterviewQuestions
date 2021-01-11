package com.cognixia.java.jump.questions;

public class ReturnCharacterCount {
	
	static int numberOfCharacters(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        
        //check for lowercase
        if(!password.matches(".*[a-z].*")){
            count++;
        }
        
        //check for uppercase
        if(!password.matches(".*[A-Z].*")){
            count++;
        }
        
        //check for number
        if(!password.matches(".*[0-9].*")){
            count++;
        }
        
        //check for special character
        if(password.matches(".[a-zA-Z0-9]*")){
            count++;
        }
        
        int length = 6 - password.length();
        if(password.length() < 6 && count <= length){
            return length;
        };
        
        return count;
        
    }

}
