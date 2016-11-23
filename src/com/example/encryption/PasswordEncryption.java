package com.example.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryption {

	public static void main(String[] args)throws Exception
    {
		String password="password";
		passwordEncryption(password);
    }
	public static void passwordEncryption(String password){
	MessageDigest messageDigest;
	String encryptedPassword = "";
	try {
		messageDigest = MessageDigest.getInstance("MD5");
		synchronized (messageDigest) {
			messageDigest.update(password.getBytes(), 0,password.length());
			System.out.println("messageDigest.digest() :: "+messageDigest.digest());
			encryptedPassword = new BigInteger(1,messageDigest.digest()).toString(16);
			System.out.println("encryptedPassword :: "+encryptedPassword);
		}
	} catch (NoSuchAlgorithmException e) {
	}
	}
}
