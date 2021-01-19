package report.Bbs;

public class Bbs {
	int no;	//글번호
	String title;	//글제목
	String author;	//작성자
	String contents;	//글내용
	String date;	//작성일
	int hits;	//조회수
	
	public Bbs(String title, String author, String contents, String date) {
		title = title;
		author = author;
		contents = contents;
		date = date;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
}
