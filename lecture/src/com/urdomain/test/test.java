package com.urdomain.test;

import java.util.Scanner;
import java.util.Arrays.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String search;
		
		System.out.print("검색 : ");
		search = scanner.next();
		System.out.println("-------------------------------------------------------");
		
		String header[] = {"제목", "작성자", "작성일", "조회"};
		System.out.println(header[0] + "\t" + header[1] + "\t" + header[2] + "\t" + header[3]);		
		
//		for(int i=0; i<=9; i++) {
//
//			String[][] contents = {
//					 {"띵글 스톡 체험판 이렇게 사용하세요~", "라온 정달", "2020.09.02.", "258"},
//					 {"일요일 오후 9시 방송 시작합니다.", "프로그", "2020.12.27.", "34"},
//					 {"2020년 12월 신규 탐험대를 모집합니다.", "라온 정달", "2020.12.03.", "54"},
//					 {"프로그 지분 15구좌 양도합니다.", "프로그", "2020.10.27.", "6"},
//					 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
//					 {"신입 회원 필독사항입니다.", "라온 정달,", "2020.09.30.", "262"},
//					 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
//					 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
//					 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
//			};
//				
//			System.out.println(contents[i]);
//				
//		}
		
		String[][] contents = {
				 {"띵글 스톡 체험판 이렇게 사용하세요~", "라온 정달", "2020.09.02.", "258"},
				 {"일요일 오후 9시 방송 시작합니다.", "프로그", "2020.12.27.", "34"},
				 {"2020년 12월 신규 탐험대를 모집합니다.", "라온 정달", "2020.12.03.", "54"},
				 {"프로그 지분 15구좌 양도합니다.", "프로그", "2020.10.27.", "6"},
				 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
				 {"신입 회원 필독사항입니다.", "라온 정달,", "2020.09.30.", "262"},
				 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
				 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
				 {"프로그 차트 특허 등록이 결정되었습니다.", "프로그,", "2020.09.30.", "262"},
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
		//검색 기능
		for(int i=0; i<contents.length; i++) {
			for(int k=0; k<contents[i].length; k++) {
					if(contents[i][k] == search) {
						System.out.println(contents[i][k]);
						break;
					} else {
						System.out.println("찾을 내용이 없습니다.");
					}
					System.out.print(contents[i][k] + "\t");
			}
			System.out.println();
		}
		
//		//전체 게시물 표시 기능
//		for(int i=0; i<contents.length; i++) {
//			for(int k=0; k<contents[i].length; k++) {
//					System.out.print(contents[i][k] + "\t");
//			}
//			System.out.println();
//		}
	}
}
