package com.baby.javaStudy.tij4.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

class Data implements Serializable {
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private int n;

	public Data(int n) {
		super();
		this.n = n;
	}

	@Override
	public String toString() {
		return "Data [n=" + n + "]";
	}

}

public class Worm implements Serializable {
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private static Random rand = new Random(47);
	private Data[] d = { new Data(rand.nextInt(10)), new Data(rand.nextInt(10)), new Data(rand.nextInt(10)) };
	private Worm next;
	private char c;

	public Worm(int i, char x) {
		System.out.println("Wom constructor " + i);
		c = x;
		if (--i > 0) {
			next = new Worm(i, (char) (x + 1));
		}
	}

	public Worm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		StringBuilder result = new StringBuilder(":");
		result.append(c);
		result.append("(");
		for (Data data : d) {
			result.append(data);
		}
		result.append(")");

		if (next != null) {
			result.append(next);
		}

		return result.toString();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Worm w = new Worm(2, 'x');
		System.out.println("W = \t" + w);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
		out.writeObject("worm storage:\n");
		out.writeObject(w);
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
		String s = (String) in.readObject();
		Worm w2 = (Worm) in.readObject();
		System.out.println("W2 = \t" + w2);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream out2 = new ObjectOutputStream(bout);
		out2.writeObject("worm storage:\n");
		out2.writeObject(w);
		out2.flush();

		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
		s = (String) in2.readObject();
		Worm w3 = (Worm) in2.readObject();
		System.out.print("W3 = \t" + w3);

	}

}
