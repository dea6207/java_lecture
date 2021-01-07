package com.urdomain.test;

import java.util.Scanner;

public class login1 {
	public static void main(String[] args) {
		String[] user = {"urid", "urpassword"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String passwd;
		//id 입력
		System.out.print("아이디 : ");
		uid = scanner.nextLine();
		System.out.print("비밀번호 : ");
		passwd = scanner.nextLine();
		
		//id 확인
		if(user[0].equals(uid) && user[1].equals(passwd)) {
			System.out.print("비밀번호 : ");
		} else {
			
			System.out.println("아이디혹은 비밀번호를 확인하세요.");
			
		}
		scanner.close();
	}
}
