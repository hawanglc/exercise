package com.baby.javaStudy.tij4.socket;


import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {

	private static Scanner scanner;

	public static void main(String[] args) throws UnknownHostException, IOException {
		try(Socket socket = new Socket("bbs.newsmth.net",23)){
			System.out.println(socket.getSoTimeout());
			InetAddress address = InetAddress.getByName("bbs.newsmth.net");
			System.out.println(address);
			System.out.println(address.getHostAddress());
			
			InetAddress[] baiduAddresses = InetAddress.getAllByName("www.baidu.com");
			for (InetAddress inetAddress : baiduAddresses) {
				System.out.println("baidu "+inetAddress.getHostAddress());
			}
			System.out.println("===================");
			InputStream inputStream = socket.getInputStream();
			scanner = new Scanner(inputStream);
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}