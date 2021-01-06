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
	
	//��1 ����
	private void OperationModel1() throws Exception {
		//���� ���� ��������
		syso("�������� " + elevator.currentFloor + "�Դϴ�.");
		syso("�ö󰡷��� 1, ���������� 0�� �Է��ϼ���");
		int keyCode = System.in.read();
		//Ű���� �� �������� ó��
		if(keyCode == 49 && elevator.currentFloor>0 && (keyCode != 12 && keyCode!=10)) {
			syso("���� �����ϴ�.");
			theradSleep(1000);
			syso("�ö󰩴ϴ�.");
			theradSleep(1000);
			syso("ž�°� ���� �Է� ���ּ���");
			inputPassengerNum = sc.nextInt();
			elevator.passenger = inputPassengerNum;
			//�����϶�
			if(elevator.passenger <= 20) {
				syso("�������� �Է��ϼ���.");
				elevator.SetFloor();
				for(int i = elevator.currentFloor; i <= elevator.selectFloor; i++) {
					if(i != elevator.selectFloor) {
						syso("��" + i + "��");
						theradSleep(1000);
						} else {
							syso(elevator.selectFloor + "���Դϴ�.");
							theradSleep(1000);
							syso("���� �����ϴ�.");
						}
					}
				} else {
					syso("������ �ʰ��Ͽ����ϴ�.");
				}
		} else if(keyCode == 48 && elevator.currentFloor<=20 && (keyCode != 12 && keyCode!=10)){ //Ű���� �� �������� ó��
			syso("���� �����ϴ�.");
			theradSleep(1000);
			syso("�������ϴ�.");
			theradSleep(1000);
			syso("ž�°� ���� �Է� ���ּ���");
			inputPassengerNum = sc.nextInt();
			elevator.passenger = inputPassengerNum;
			//�����϶�
			if(elevator.passenger <= 20) {
			 	syso("�������� �Է��ϼ���.");
				elevator.SetFloor();
				for(int i = elevator.currentFloor; i >= elevator.selectFloor; i--) {
					if(i != elevator.selectFloor) {
						syso("��" + i + "��");
						theradSleep(1000);
					} else {
						syso(elevator.selectFloor + "���Դϴ�.");
						syso("���� �����ϴ�.");
					}
				}
			} else {
				syso("������ �ʰ��Ͽ����ϴ�.");
			}
		} else {
			syso("�ö��� �������� �����ϼ���.");
		}
		
	}
	
	//��2 ����
		private void OperationModel2() throws Exception {
			//���� ���� ��������
			syso("�������� " + elevator.currentFloor + "�Դϴ�.");
			syso("�ö󰡷��� 1, ���������� 0�� �Է��ϼ���");
			int keyCode = System.in.read();
			//Ű���� �� �������� ó��
			if(keyCode == 49 && elevator.currentFloor>0 && (keyCode != 12 && keyCode!=10)) {
				syso("���� �����ϴ�.");
				theradSleep(500);
				syso("�ö󰩴ϴ�.");
				theradSleep(500);
				syso("ž�°� ���� �Է� ���ּ���");
				inputPassengerNum = sc.nextInt();
				elevator.passenger = inputPassengerNum;
				//�����϶�
				if(elevator.passenger <= 20) {
					syso("�������� �Է��ϼ���.");
					elevator.SetFloor();
					for(int i = elevator.currentFloor; i <= elevator.selectFloor; i++) {
						if(i != elevator.selectFloor) {
							syso("��" + i + "��");
							theradSleep(500);
							} else {
								syso(elevator.selectFloor + "���Դϴ�.");
								theradSleep(500);
								syso("���� �����ϴ�.");
							}
						}
					} else {
						syso("������ �ʰ��Ͽ����ϴ�.");
					}
			} else if(keyCode == 48 && elevator.currentFloor<=20 && (keyCode != 12 && keyCode!=10)){ //Ű���� �� �������� ó��
				syso("���� �����ϴ�.");
				theradSleep(500);
				syso("�������ϴ�.");
				theradSleep(500);
				syso("ž�°� ���� �Է� ���ּ���");
				inputPassengerNum = sc.nextInt();
				elevator.passenger = inputPassengerNum;
				//�����϶�
				if(elevator.passenger <= 20) {
				 	syso("�������� �Է��ϼ���.");
					elevator.SetFloor();
					for(int i = elevator.currentFloor; i >= elevator.selectFloor; i--) {
						if(i != elevator.selectFloor) {
							syso("��" + i + "��");
							theradSleep(500);
						} else {
							syso(elevator.selectFloor + "���Դϴ�.");
							theradSleep(1000);
							syso("���� �����ϴ�.");
						}
					}
				} else {
					syso("������ �ʰ��Ͽ����ϴ�.");
				}
			} else {
				syso("�ö��� �������� �����ϼ���.");
			}
			
		}
	
	
	private int menu() {
		System.out.println("���� ������ �ּ���");
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
