package report.Elevator;

import java.util.Scanner;

public class Elevator {
	String model;	//모델명
//	int capacity;	//탑승정원
//	int speed;		//속도
	int passenger;	//탑승인원
	int currentFloor = (int)(Math.random()*20) + 1;	//현재 층
	int selectFloor;	//목적층
	
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
//	//모델명 입력받는 생성자
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
