package com.urdomain.test;

public class report {
	
	//�ζ� ��ȣ ������ (�ߺ���ȣ X)
	
	////�ζ� ��ȣ�� ���� �� �迭 ����
	////�� �迭�� ��ȣ �Է�(for�� �ʼ� ���)
	////�迭���� ��� (for�� �ʼ� ���)
	
	//�α��� �Լ�ȭ(id, pw -> success / fail)
	
	//���̵� ã�� �Լ�ȭ : (name, email -> id ) id�� *
	
	//Ÿ��Ʋ ����Ʈ���� �ؽ�Ʈ �˻� (option)
	
	//����¡ 
	public static void main(String[] args) {
		
		//ȭ�鿡 ǥ���� ������ ��
		final int PAGEBLOCK = 5;
		//���� ������
		int iPage = 3;
		//�� ������ ��
		int iTotalPages = 20;
		//������ ����, ��
		int iStartPage = (iPage-2 < 1) ? 1 : iPage-2;
		int iEndPage = (iPage+2 > iTotalPages) ? iTotalPages : iPage+2;
//		System.out.println("iPage : " + iPage);
//		System.out.println("iTotalPages : " + iTotalPages);
//		System.out.println("iStartPage : " + iStartPage);
//		System.out.println("iEndPage : " + iEndPage);
//		
		if(iStartPage > 1) {
			System.out.print(iPage-1);
		}
		for(int i=iStartPage; i<=iEndPage; i++) {
			if(i == iPage) {
				System.out.print(i);
			} else {
				
			}
		}
		if ( iEndPage < iTotalPages) {
			System.out.print(iPage+1);
			System.out.print(iTotalPages);
		}
	}
}
