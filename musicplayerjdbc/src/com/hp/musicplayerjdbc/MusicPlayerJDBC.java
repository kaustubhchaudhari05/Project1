package com.hp.musicplayerjdbc;

public class MusicPlayerJDBC {
	public static void main(String[] args) {
		
		Playlist playlist = new Playlist();
		
//		Songs song1 = new Songs(3, "Unforgetable", "French Montana", 4.20);
		playlist.openConnection();
//		playlist.addSog(song1);
//		Songs song2 = new Songs(4, "Highest in the Room", "Travis Scott", 2.56);
//		playlist.addSog(song2);
//		playlist.removeSong(3);
//	    Songs songs = new Songs(3, "Mask off", "Future", 4.18);
//	    playlist.addSog(songs);
	    playlist.playSong(3);
	    playlist.closeConnection();
	    
	}
}
