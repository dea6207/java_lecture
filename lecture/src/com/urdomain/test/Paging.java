package com.urdomain.test;

public class Paging {
public static void main(String[] args) {
		
		//화면에 표시할 페이지 수
		final int PAGEBLOCK = 5;
		//현재 페이지
		int iPage = 20;
		//총 페이지 수
		int iTotalPages = 20;
		//페이지 시작, 끝
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
