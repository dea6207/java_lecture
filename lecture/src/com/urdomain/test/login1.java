package com.urdomain.test;

import java.util.Scanner;

public class login1 {
	public static void main(String[] args) {
		String[] user = {"urid", "urpassword"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String passwd;
		//id �Է�
		System.out.print("���̵� : ");
		uid = scanner.nextLine();
		System.out.print("��й�ȣ : ");
		passwd = scanner.nextLine();
		
		//id Ȯ��
		if(user[0].equals(uid) && user[1].equals(passwd)) {
			System.out.print("��й�ȣ : ");
		} else {
			
			System.out.println("���̵�Ȥ�� ��й�ȣ�� Ȯ���ϼ���.");
			
		}
		scanner.close();
	}
}
