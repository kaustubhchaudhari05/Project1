package com.hp.musicplayer;

public class Songs {

	private int id;
	private String songName;
	private String artist;
	private double duration;

	public Songs(int id, String songName, String artist, double duration) {
		super();
		this.id = id;
		this.songName = songName;
		this.artist = artist;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", songName=" + songName + ", artist=" + artist + ", duration=" + duration
				+ "]";
	}

	

}
