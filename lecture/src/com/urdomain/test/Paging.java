package com.urdomain.test;

public class Paging {
public static void main(String[] args) {
		
		//ȭ�鿡 ǥ���� ������ ��
		final int PAGEBLOCK = 5;
		//���� ������
		int iPage = 20;
		//�� ������ ��
		int iTotalPages = 20;
		//������ ����, ��
		int iStartPage = (iPage-2 < 1) ? 1 : iPage-2;
		int iEndPage = (iPage+2 > iTotalPages) ? iTotalPages : iPage+2;
		
		if(iStartPage > 1) {
			System.out.print("<<" + " <");
		}
		for(int i=iStartPage; i<=iEndPage; i++) {
			if(i == iPage) {
				System.out.print(" " + i);
			} else {
				System.out.print(" " + i);
			}
		}
		if ( iEndPage < iTotalPages) {
			System.out.print(" >" + " >>");
		}
	}
}
