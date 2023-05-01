package com.hp.musicplayerjdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Playlist {

	private Connection connection;
	private Statement statement;
	private FileReader reader;
	private Properties properties;
	private String filePath = "D:\\Project\\Java\\musicplayerjdbc\\resources\\db_info.properties";

	public void openConnection() {

		try {
			reader = new FileReader(filePath);
			properties = new Properties();
			properties.load(reader);

			Class.forName(properties.getProperty("driverPath"));

			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

			statement = connection.createStatement();

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void addSog(Songs songs) {
		try {
			String query = "insert into songs values(" + songs.getId() + ", '" + songs.getSongName() + "', '"
					+ songs.getArtist() + "', " + songs.getDuration() + ")";
			int result = statement.executeUpdate(query);
			System.out.println(result + " row(s) affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeSong(int id) {
		try {
			String query = " delete from songs " + "where id = " + id;
			int result = statement.executeUpdate(query);
			System.out.println(result + " row(s) affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void playSong(int id) {
		try {
			String query = "select * " + " from songs " + "where id = " + id;
			ResultSet set = statement.executeQuery(query);
			if (set.next())
				System.out.println("Now playing: " + set.getString("songname"));
			else
				System.out.println("Song not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		try {
			if (reader != null)
				reader.close();
			if (connection != null)
				connection.close();
			if (statement != null)
				statement.close();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

}
