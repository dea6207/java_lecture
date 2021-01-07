package com.urdomain.test;

public class TitleTest {
	
	public static void main(String[] args) {
		
		TitleTest contents = new TitleTest("����", "��� ���� ü���� �̷��� ����ϼ���~", "��� ����", "2020.09.02.", 255);
		System.out.println(contents.toString());
		
		
	}
	
	private String notice;
	private String title;
	private String author;
	private String date;
	private int hits;
	
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
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
	public  String getDate() {
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
	@Override
	public String toString() {
		return "|" + notice + "|" + title + "|" + author + "|" + date + hits;
	}
	public TitleTest(String notice, String title, String author, String date, int hits) {
		this.notice = notice;
		this.title = title;
		this.author = author;
		this.date = date;
		this.hits = hits;
	}
}
