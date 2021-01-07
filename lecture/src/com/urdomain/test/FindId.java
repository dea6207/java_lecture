package com.urdomain.test;

import java.util.Scanner;

public class FindId {
	public static void main(String[] args) {
		String[] user = {"urid", "email"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String email;
		
		System.out.print("이메일을 입력하세요 : ");
		email = scanner.nextLine();
		
		if(user[1].equals(email)) {
			System.out.println("아이디는 : **" + user[0].substring(2) + "입니다.");
		} else {
			System.out.println("이메일을 확인하세요.");
		}
		scanner.close();
	}
}
