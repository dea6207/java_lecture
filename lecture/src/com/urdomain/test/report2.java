package com.urdomain.test;

import java.util.Scanner;

public class Report2 {
	//Scanner ��ü ����
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Report2 report2 = new Report2();
		
		//�Լ� ����
		report2.inputNum1(0);
		System.out.println("");
		report2.inputNum2(0);
	}
	
	//����1 �Է� �� ��� �Լ�
	public void inputNum1(int inputNum1) {
		System.out.print("num1 : ");
		inputNum1 = scanner.nextInt();
		System.out.println("-----------");
		for (int i=1; i<=9; i++) {
			System.out.println(inputNum1 + " X " + i + " = " + (inputNum1*i));
		}
	}

	//����1 �Է� �� ��� �Լ�
	public void inputNum2(int inputNum2) {
		System.out.print("num2 : ");
		inputNum2 = scanner.nextInt();
		System.out.println("-----------");
		for (int i=1; i<=9; i++) {
			System.out.println(inputNum2 + " X " + i + " = " + (inputNum2*i));
		}
	}
}


//// TODO Auto-generated method stub
////Scanner ��ü ����
//Scanner scanner = new Scanner(System.in);
//int inputnum1;
//int inputnum2;		
//
//System.out.println("------------------");
//System.out.println("num1");
//inputnum1 = scanner.nextInt();
//System.out.println("num2");
//inputnum2 = scanner.nextInt();
//System.out.println("------------------");
//
//int[] multiTbl = new int[9];
//for (int i=1; i<=9; i++) {
//	System.out.println(inputnum1 + " X " + i + " = " + (inputnum1*i));
//}
//
////������ �迭 ����
//int[][] multiTbl1 = new int[9][9];
//for(int i=0; i<multiTbl1.length; i++) {
//	for(int j=0; j<i; j++) {
//		System.out.println(multiTbl1[inputnum1]);
//		System.out.println(multiTbl1[inputnum2]);
//	}
//}