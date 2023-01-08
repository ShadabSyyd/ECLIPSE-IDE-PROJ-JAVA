package com.greatlearning.service;

public class OTPGenerator {
	public int generateOTP(){
		int randomOTP=(int)(Math.random()*10000);
		if(randomOTP<=1000) {
			generateOTP();
		}
		return randomOTP;
	}
}
