package com.urdomain.ch04;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
//		String s = e.getKeyText(e.getKeyCode());
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("-----------------------");
				System.out.println("����: ");
			}
			
			keyCode = System.in.read();
			keyPressed = System.in.();
			if (keyCode == 38) { //1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 40) { //2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 51) { //3�� �о��� ���
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
