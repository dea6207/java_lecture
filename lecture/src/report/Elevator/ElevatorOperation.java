package report.Elevator;

import java.util.Scanner;

public class ElevatorOperation {

	Scanner sc = new Scanner(System.in);
	Elevator elevator = new Elevator();
	int inputPassengerNum;
	
	public static void main(String[] args) throws Exception {
		ElevatorOperation elevatortest = new ElevatorOperation();
		elevatortest.run();
	}
	
	public void run() throws Exception {
        
        int key = 0;
        while ((key = menu()) != 0) {
            switch (key) {
                case 1:
                    OperationModel1();
                    break;
                case 2:
                    OperationModel2();
            }
        }
    }
	
	//모델1 동작
	private void OperationModel1() throws Exception {
		//현재 층수 가져오기
		syso("현재층은 " + elevator.currentFloor + "입니다.");
		syso("올라가려면 1, 내려가려면 0을 입력하세요");
		int keyCode = System.in.read();
		//키보드 ↑ 눌렀을때 처리
		if(keyCode == 49 && elevator.currentFloor>0 && (keyCode != 12 && keyCode!=10)) {
			syso("문이 열립니다.");
			theradSleep(1000);
			syso("올라갑니다.");
			theradSleep(1000);
			syso("탑승객 수를 입력 해주세요");
			inputPassengerNum = sc.nextInt();
			elevator.passenger = inputPassengerNum;
			//정원일때
			if(elevator.passenger <= 20) {
				syso("목적층을 입력하세요.");
				elevator.SetFloor();
				for(int i = elevator.currentFloor; i <= elevator.selectFloor; i++) {
					if(i != elevator.selectFloor) {
						syso("↑" + i + "층");
						theradSleep(1000);
						} else {
							syso(elevator.selectFloor + "층입니다.");
							theradSleep(1000);
							syso("문이 열립니다.");
						}
					}
				} else {
					syso("정원이 초과하였습니다.");
				}
		} else if(keyCode == 48 && elevator.currentFloor<=20 && (keyCode != 12 && keyCode!=10)){ //키보드 ↓ 눌렀을때 처리
			syso("문이 열립니다.");
			theradSleep(1000);
			syso("내려갑니다.");
			theradSleep(1000);
			syso("탑승객 수를 입력 해주세요");
			inputPassengerNum = sc.nextInt();
			elevator.passenger = inputPassengerNum;
			//정원일때
			if(elevator.passenger <= 20) {
			 	syso("목적층을 입력하세요.");
				elevator.SetFloor();
				for(int i = elevator.currentFloor; i >= elevator.selectFloor; i--) {
					if(i != elevator.selectFloor) {
						syso("↓" + i + "층");
						theradSleep(1000);
					} else {
						syso(elevator.selectFloor + "층입니다.");
						syso("문이 열립니다.");
					}
				}
			} else {
				syso("정원이 초과하였습니다.");
			}
		} else {
			syso("올라갈지 내려갈지 선택하세요.");
		}
		
	}
	
	//모델2 동작
		private void OperationModel2() throws Exception {
			//현재 층수 가져오기
			syso("현재층은 " + elevator.currentFloor + "입니다.");
			syso("올라가려면 1, 내려가려면 0을 입력하세요");
			int keyCode = System.in.read();
			//키보드 ↑ 눌렀을때 처리
			if(keyCode == 49 && elevator.currentFloor>0 && (keyCode != 12 && keyCode!=10)) {
				syso("문이 열립니다.");
				theradSleep(500);
				syso("올라갑니다.");
				theradSleep(500);
				syso("탑승객 수를 입력 해주세요");
				inputPassengerNum = sc.nextInt();
				elevator.passenger = inputPassengerNum;
				//정원일때
				if(elevator.passenger <= 20) {
					syso("목적층을 입력하세요.");
					elevator.SetFloor();
					for(int i = elevator.currentFloor; i <= elevator.selectFloor; i++) {
						if(i != elevator.selectFloor) {
							syso("↑" + i + "층");
							theradSleep(500);
							} else {
								syso(elevator.selectFloor + "층입니다.");
								theradSleep(500);
								syso("문이 열립니다.");
							}
						}
					} else {
						syso("정원이 초과하였습니다.");
					}
			} else if(keyCode == 48 && elevator.currentFloor<=20 && (keyCode != 12 && keyCode!=10)){ //키보드 ↓ 눌렀을때 처리
				syso("문이 열립니다.");
				theradSleep(500);
				syso("내려갑니다.");
				theradSleep(500);
				syso("탑승객 수를 입력 해주세요");
				inputPassengerNum = sc.nextInt();
				elevator.passenger = inputPassengerNum;
				//정원일때
				if(elevator.passenger <= 20) {
				 	syso("목적층을 입력하세요.");
					elevator.SetFloor();
					for(int i = elevator.currentFloor; i >= elevator.selectFloor; i--) {
						if(i != elevator.selectFloor) {
							syso("↓" + i + "층");
							theradSleep(500);
						} else {
							syso(elevator.selectFloor + "층입니다.");
							theradSleep(1000);
							syso("문이 열립니다.");
						}
					}
				} else {
					syso("정원이 초과하였습니다.");
				}
			} else {
				syso("올라갈지 내려갈지 선택하세요.");
			}
			
		}
	
	
	private int menu() {
		System.out.println("모델을 선택해 주세요");
		return getNumInput("[1]OTIS [2]hyndai");
	}

	private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
	
	public void syso (String msg) {
			System.out.println(msg);
	}
	
	public static void theradSleep (int sec) {
		try {
			Thread.sleep(sec);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
