package report.Elevator;

import java.util.Scanner;

public class Elevator {
	String model;	//�𵨸�
//	int capacity;	//ž������
//	int speed;		//�ӵ�
	int passenger;	//ž���ο�
	int currentFloor = (int)(Math.random()*20) + 1;	//���� ��
	int selectFloor;	//������
	
	Scanner sc = new Scanner(System.in);
	
//	public Elevator() {
//		this.model = model;
//	}
//	
//	public Elevator(String model, int capacity, int speed, int passenger, int currentFloor) {
//		this.model = model;
//		this.capacity = capacity;
//		this.speed = speed;
//		this.passenger = passenger;
//		this.currentFloor = currentFloor;
//	}
//	
//	//�𵨸� �Է¹޴� ������
//	public void ModelName(String name) {
//		this.model = name;
//	}

	
	
	public void passenger() {
		passenger = sc.nextInt();
	}
	
	public void SetFloor() {
		selectFloor = sc.nextInt();
	}
}
