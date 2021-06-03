package com.javaex.ex07;

public class Song {

	// field
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//constructor
	//public Song() {}
	public Song(String title, int track) {
		//Song heap 영역 에 올림
		this.title = title;
		if(track<0) {
			this.track = 0;
		} else {
			this.track = track;
		}
		System.out.println("Song2");
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//Song heap 영역에 올림
		this(title, track); // constructor(title, track) 다른 생성자 호출
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("song5");
		
	}
	
	//getter, setter
	//no setters - > only using memory 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	//method - general
	
	public void showInfo() {
		System.out.println(getArtist()+", " + getTitle() + "( " + getAlbum() +", " + getYear() +", "+ getTrack()
		+"번 track"+", "+getComposer()+ " 작곡 )");
	}
}
