package report.Bbs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Board {
	
	Scanner sc = new Scanner(System.in);
	List<Board> bbsWrite = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		Board board = new Board();
		board.run();
	}
	
	public void run() throws Exception {
        
        int key = 0;
        while ((key = menu()) != 0) {
            switch (key) {
                case 1:
                    Notice();
                    break;
                case 2:
                    Bbs();
            }
        }
    }
	
	public void Notice() {
		sc.nextLine();
		String title = getStrInput("제목 : ");
		String author = getStrInput("작성자 : ");
		String contents = getStrInput("내용 : ");
		String date = getStrInput("작성일 : ");
		System.out.println("");
	}
	
	public void Bbs() {
		System.out.println("");
	}
	
	//글 입력 함수
	private String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
	
	//메뉴 선택함수
	private int menu() {
		System.out.println("게시판을 선택해 주세요");
		return getNumInput("[1]공지사항 [2]게시판");
	}

	//메뉴번호 입력함수
	private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
	
	//출력 함수
	public void syso (String msg) {
			System.out.println(msg);
	}
}
