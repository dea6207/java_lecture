package com.urdomain.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
//		Car myCar = new Car();
//		
//		//�ʵ尪 �б�
//		System.out.println("����ȸ�� : " + myCar.company);
//		System.out.println("�𵨸� : " + myCar.model);
//		System.out.println("���� : " + myCar.color);
//		System.out.println("�ְ��ӵ� : " + myCar.maxSpeed);
//		System.out.println("����ӵ� : " + myCar.speed);
//
//		//�ʵ尪 ����
//		myCar.speed = 60;
//		System.out.println("������ �ӵ� : " + myCar.speed);
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("�ڰ���");
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		Car car3 = new Car("�ڰ���", "����");
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		Car car4 = new Car("�ý�,", "����", 200);
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car.maxSpeed);
//	}

		Car myCar = new Car();
		
		myCar.setGas(5); //Car�� setGas() �޼��� ȣ��
		boolean gasState = myCar.isLeftGas(); //Car�� isLeftGas() �޼��� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); //Car�� run() �޼��� ȣ��
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}