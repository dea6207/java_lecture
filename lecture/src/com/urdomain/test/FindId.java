package com.urdomain.test;

import java.util.Scanner;

public class FindId {
	public static void main(String[] args) {
		String[] user = {"urid", "email"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String email;
		
		System.out.print("�̸����� �Է��ϼ��� : ");
		email = scanner.nextLine();
		
		if(user[1].equals(email)) {
			System.out.println("���̵�� : **" + user[0].substring(2) + "�Դϴ�.");
		} else {
			System.out.println("�̸����� Ȯ���ϼ���.");
		}
		scanner.close();
	}
}
