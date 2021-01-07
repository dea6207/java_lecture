package com.urdomain.test;

public class testFor {
	public static void main(String[] args) {
			for(int i=0; i<60; i++) {
				System.out.print("ก่");
				syso(i);
				theradsleep(1000);
		}
	}
	
	public static void syso (int msg) {
			System.out.println(msg);
	}
	
	public static void theradsleep (int sec) {
		try {
			Thread.sleep(sec);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
