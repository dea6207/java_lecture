package com.urdomain.test;

public class report {
	
	//로또 번호 생성기 (중복번호 X)
	
	////로또 번호가 저장 될 배열 선언
	////그 배열에 번호 입력(for문 필수 사용)
	////배열내용 출력 (for문 필수 사용)
	
	//로그인 함수화(id, pw -> success / fail)
	
	//아이디 찾기 함수화 : (name, email -> id ) id에 *
	
	//타이틀 리스트에서 텍스트 검색 (option)
	
	//페이징 
	public static void main(String[] args) {
		
		//화면에 표시할 페이지 수
		final int PAGEBLOCK = 5;
		//현재 페이지
		int iPage = 3;
		//총 페이지 수
		int iTotalPages = 20;
		//페이지 시작, 끝
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
