package com.javaex.ex07;

public class SongApp {
	public static void main(String[] args) {

/*		Song iu = new Song();
		Song bigbang = new Song();
		Song busker = new Song();


		iu.setArtist("아이유여신");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이만수");

		/*
		 * Song test = new Song(); test.artist = "테스트"; test.year = 1234567890;
		 * System.out.println(test.artist + test.year);
		 /

		bigbang.setArtist("BigBang");
		bigbang.setTitle("고짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-Dragon");

		busker.setArtist("해체된 버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
*/		
		Song iu = new Song("좋은날", " artist", "album", "composer", 2002, 244);
		Song bigbang = new Song("거짓말", "bigbang", "always", "G-dragon", 2007, 2);
		Song busker = new Song("벚꽃엔딩", " artist", "album", "composer", 2000, 244);
		Song test = new Song("타이틀", " artist", "album", "composer", 2000, 244);
		
		
		
		iu.showInfo();
		/*bigbang.showInfo();
		busker.showInfo();
		test.showInfo();
		
		iu.setYear(2020);
		iu.showInfo();
		
		Song song2 = new Song("title", 123);
		
		song2.showInfo();*/
		
	}
}
