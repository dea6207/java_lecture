package com.urdomain.test;

import java.util.Scanner;
import java.util.Arrays.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String search;
		
		System.out.print("�˻� : ");
		search = scanner.next();
		System.out.println("-------------------------------------------------------");
		
		String header[] = {"����", "�ۼ���", "�ۼ���", "��ȸ"};
		System.out.println(header[0] + "\t" + header[1] + "\t" + header[2] + "\t" + header[3]);		
		
//		for(int i=0; i<=9; i++) {
//
//			String[][] contents = {
//					 {"��� ���� ü���� �̷��� ����ϼ���~", "��� ����", "2020.09.02.", "258"},
//					 {"�Ͽ��� ���� 9�� ��� �����մϴ�.", "���α�", "2020.12.27.", "34"},
//					 {"2020�� 12�� �ű� Ž��븦 �����մϴ�.", "��� ����", "2020.12.03.", "54"},
//					 {"���α� ���� 15���� �絵�մϴ�.", "���α�", "2020.10.27.", "6"},
//					 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
//					 {"���� ȸ�� �ʵ������Դϴ�.", "��� ����,", "2020.09.30.", "262"},
//					 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
//					 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
//					 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
//			};
//				
//			System.out.println(contents[i]);
//				
//		}
		
		String[][] contents = {
				 {"��� ���� ü���� �̷��� ����ϼ���~", "��� ����", "2020.09.02.", "258"},
				 {"�Ͽ��� ���� 9�� ��� �����մϴ�.", "���α�", "2020.12.27.", "34"},
				 {"2020�� 12�� �ű� Ž��븦 �����մϴ�.", "��� ����", "2020.12.03.", "54"},
				 {"���α� ���� 15���� �絵�մϴ�.", "���α�", "2020.10.27.", "6"},
				 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
				 {"���� ȸ�� �ʵ������Դϴ�.", "��� ����,", "2020.09.30.", "262"},
				 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
				 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
				 {"���α� ��Ʈ Ư�� ����� �����Ǿ����ϴ�.", "���α�,", "2020.09.30.", "262"},
		};
//		
//		functionName();
//		function searchfnc(element) {
//			
//		}
//		
//		if(search = contents.filter(searchfnc)) {
//			
//		}
		//�˻� ���
		for(int i=0; i<contents.length; i++) {
			for(int k=0; k<contents[i].length; k++) {
					if(contents[i][k] == search) {
						System.out.println(contents[i][k]);
						break;
					} else {
						System.out.println("ã�� ������ �����ϴ�.");
					}
					System.out.print(contents[i][k] + "\t");
			}
			System.out.println();
		}
		
//		//��ü �Խù� ǥ�� ���
//		for(int i=0; i<contents.length; i++) {
//			for(int k=0; k<contents[i].length; k++) {
//					System.out.print(contents[i][k] + "\t");
//			}
//			System.out.println();
//		}
	}
}
