package com.hp.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class SongOperation {

	
	private List<Songs> song;
	private int currentTrack;
	
	public SongOperation() {
		song = new ArrayList<Songs>();
		currentTrack = -1;
	}
	
	public void addSong(Songs songs) {
		song.add(songs);
	}
	
	public void removeSog(Songs songs) {
		song.remove(songs);
	}
	
	public void playSong() {
		if(currentTrack < song.size()-1) {
			currentTrack++;
			Songs currentTrack1 = song.get(currentTrack);
			System.out.println("Now Playing: "+currentTrack1.getSongName());
		}
		else
			System.out.println("End of playlist");
	}
	
	public void skipToNextTrack() {
		if(currentTrack < song.size()-1) {
			currentTrack ++;
			Songs currentTrack1 = song.get(currentTrack);
			System.out.println("Skipping to next track: "+currentTrack1.getSongName());
		}
		else
			System.out.println("End of playlist");
	}
	
	public void skipToPrevioustrack() {
		if(currentTrack > 0) {
			currentTrack--;
			Songs currentTrack1 = song.get(currentTrack);
			System.out.println("Skipping to previous track:" + currentTrack1.getSongName() );
		}
		else
			System.out.println("Beginning of playlist");
	}
	
}