package com.urdomain.ch06;

public class Car {
//	//�ʵ�
//	String company = "�����ڵ���";
//	String model;
//	String color;
//	int maxSpeed;
//	
//	//������
//	Car() {
//		
//	}
//	
//	Car(String model) {
//		this.model = model;
//	}
//	
//	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}	
	
	//�ʵ�
	int gas;
	
	//������
	
	//�޼���
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; //true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return; //�޼��� ���� ����
			}
		}
	}
}
