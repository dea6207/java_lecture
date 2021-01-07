package com.urdomain.ch06;

public class Car {
//	//필드
//	String company = "현대자동차";
//	String model;
//	String color;
//	int maxSpeed;
//	
//	//생성자
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
	
	//필드
	int gas;
	
	//생성자
	
	//메서드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false; //false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return; //메서드 실행 종료
			}
		}
	}
}
