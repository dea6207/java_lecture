package com.urdomain.test;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		String[] user = {"urid", "urpassword"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String passwd;
		//id 입력
		System.out.print("아이디 : ");
		uid = scanner.nextLine();
		//id 확인
		if(user[0].equals(uid)) {
			//true면 passwd 입력
			System.out.print("비밀번호 : ");
			passwd = scanner.nextLine();
			//passwd 확인
			if(user[1].equals(passwd)) {
				//true면 text 출력
				System.out.println("로그인 되었습니다.");
				
			} else {
				//false면 text 출력
				System.out.println("비밀번호를 확인하세요.");
				
			}
		} else {
			
			System.out.println("아이디를 확인하세요.");
			
		}
	}
}
