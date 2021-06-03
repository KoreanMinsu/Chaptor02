package com.javaex.ex04;


public class SongApp {
	public static void main(String[] args) {
		
		Song iu = new Song();
		Song bigbang = new Song();
		Song busker = new Song();
	
		
		iu.setArtist("아이유여신");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이만수");
		
		/*
		Song test = new Song();
		test.artist = "테스트";
		test.year = 1234567890;
		System.out.println(test.artist + test.year);
		*/
		
		bigbang.setArtist("BigBang");
		bigbang.setTitle("고짓말");
		bigbang.setAlbum("Alwyys");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-Dragon");
		
		busker.setArtist("해체된 버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();

		
	}
}
