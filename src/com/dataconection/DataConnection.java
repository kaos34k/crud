package com.dataconection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataConnection {
	
	private Connection con;
	
	public DataConnection(){
		performConnection();
	}
	
	public void performConnection() {
		String host = "127.0.0.1";
		String user = "root";
		String pass = "";
		String dtbs = "atletisme";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
					+ "?" + "user=" + user + "&password=" + pass;
					con = DriverManager.getConnection(newConnectionURL);
		}catch (Exception e) {
			System.out.println("Error en l'obertura de la connexió.");
		}
		
	}
	
	public void closeConnection() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("Error en el tancament de la connexió.");
		}
	}
	
	public ArrayList<String> retornaAtletes() throws SQLException{
		ArrayList<String> ls = new ArrayList<String>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM atleta");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			ls.add(rs.getString("nomatleta"));
		}
		rs.close();
		return ls;
	}

	public void insertaAtleta(int numlic, String nombre, String email, String telefono) throws SQLException {
		String seleccio = "INSERT INTO `atleta` (`numllicencia` ,`nomatleta` ,`email` ,`telefon`)" +
				"VALUES (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, numlic);
		ps.setString(2, nombre);
		ps.setString(3, email);
		ps.setString(4, telefono);
		ps.executeUpdate();
	}

	public void editaAtleta(int numlic, String nom) throws SQLException {
		String seleccio = "UPDATE `atleta` SET `nomatleta` = ? WHERE `numllicencia` =?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setString(1, nom); //emplenem el primer interrogant
		ps.setInt(2, numlic);
		ps.executeUpdate();
	}
	
	public void eliminaAtleta(int numlic) throws SQLException {
		String seleccio = "DELETE FROM `atleta` WHERE `numllicencia` = ?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, numlic);
		ps.executeUpdate();
	}
}
