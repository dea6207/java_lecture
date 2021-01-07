package com.urdomain.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
//		Car myCar = new Car();
//		
//		//필드값 읽기
//		System.out.println("제작회사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색깔 : " + myCar.color);
//		System.out.println("최고속도 : " + myCar.maxSpeed);
//		System.out.println("현재속도 : " + myCar.speed);
//
//		//필드값 변경
//		myCar.speed = 60;
//		System.out.println("수정된 속도 : " + myCar.speed);
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("자가용");
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		Car car3 = new Car("자가용", "빨강");
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		Car car4 = new Car("택시,", "검정", 200);
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car.maxSpeed);
//	}

		Car myCar = new Car();
		
		myCar.setGas(5); //Car의 setGas() 메서드 호출
		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas() 메서드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //Car의 run() 메서드 호출
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
