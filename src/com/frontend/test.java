package com.frontend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.dataconection.DataConnection;

public class test {

	private static DataConnection mc = new DataConnection();
	static ArrayList<String> atletas;
	
	public static void main(String[] args) {
//		System.out.println("Pon el numero de licencia:");
//		int lic=readInt();
//		
		//SELECT
//		try {
//			atletas= mc.retornaAtletes();
//			
//			for (int i = 0; i < atletas.size(); i++) {
//				System.out.println(atletas.get(i).toString());
//			}
//		} catch (SQLException e) {
//			System.out.println("error");
//		}
		
		//INSERTA
//		try {
//			System.out.println("pon el numero de licencia:");
//			int lic=readInt();
//			System.out.println("Pon el nombre:");
//			String nom=readString();
//			System.out.println("Pon el email:");
//			String email=readString();
//			System.out.println("Pon el telf:");
//			String telf=readString();
//			
//			mc.insertaAtleta(lic, nom, email, telf);
//		} catch (Exception e) {
//			System.out.println("error2");
//		}
		
		//MODIFICA
//		try {
//			System.out.println("pon el numero de licencia:");
//			int lic=readInt();
//			System.out.println("Pon el nombre:");
//			String nom=readString();
//			
//			mc.editaAtleta(lic, nom);
//		} catch (Exception e) {
//			System.out.println("error2");
//		}
		
		//DELETE
//		try {
//			System.out.println("pon el numero de licencia:");
//			int lic=readInt();
//			
//			mc.eliminaAtleta(lic);
//		} catch (Exception e) {
//			System.out.println("error2");
//		}
	}
	
	/**
	 * @return String leido por teclado
	 * @throws Exception
	 */
	private static String readString() throws Exception {
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		return br.readLine();
	}
	/**
	 * @return un entero recibido por teclado
	 */
	private static int readInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		}
	/**
	 * @return un float recibido por teclado
	 */
	private static float readFloat() {
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
		}

}
