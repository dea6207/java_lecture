package com.urdomain.test;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		String[] user = {"urid", "urpassword"};
		Scanner scanner = new Scanner(System.in);
		String uid;
		String passwd;
		//id �Է�
		System.out.print("���̵� : ");
		uid = scanner.nextLine();
		//id Ȯ��
		if(user[0].equals(uid)) {
			//true�� passwd �Է�
			System.out.print("��й�ȣ : ");
			passwd = scanner.nextLine();
			//passwd Ȯ��
			if(user[1].equals(passwd)) {
				//true�� text ���
				System.out.println("�α��� �Ǿ����ϴ�.");
				
			} else {
				//false�� text ���
				System.out.println("��й�ȣ�� Ȯ���ϼ���.");
				
			}
		} else {
			
			System.out.println("���̵� Ȯ���ϼ���.");
			
		}
	}
}
