package com.baby.javaStudy.tij4.socket;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HttpClient {
	
	public static void doGet(String host,int port,String uri){
		Socket socket = null;
		
		try {
			socket = new Socket(host, port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			StringBuffer stringBuffer = new StringBuffer("GET "+uri+" HTTP/1.1\r\n");
			stringBuffer.append("Accept */*\r\n");
			stringBuffer.append("Accept-Language: zh-cn\r\n");
			stringBuffer.append("Accept-Encoding: gzip, deflate\r\n");
			stringBuffer.append("User-Agent: HttpClient\r\n");
			stringBuffer.append("Host: localhost:8080\r\n");
			stringBuffer.append("Connection: Keep-Alive\r\n\r\n");
			
			OutputStream socketOut = socket.getOutputStream();
			socketOut.write(stringBuffer.toString().getBytes());
			
			Thread.sleep(2000);
			
			InputStream socketIn = socket.getInputStream();
			int size = socketIn.available();
			byte[] buffer = new byte[size];
			socketIn.read(buffer);
			System.out.println(new String(buffer));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String uri = "index.htm";
		if (args.length != 0) {
			uri = args[0];
		}
		
		doGet("localhost",8080,uri);
	}
	
	

}