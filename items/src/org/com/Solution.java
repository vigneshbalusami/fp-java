package org.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		while (true) {
			System.out.println("1. upadate value in data base \t 2. Display number of values in databases");
			int ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1: {
				session.beginTransaction();
				System.out.println("Enter the id : ");
				int id = Integer.valueOf(bf.readLine());
				System.out.println("Enter the name : ");
				String name = bf.readLine();
				System.out.println("Enter the qty : ");
				int qty = Integer.valueOf(bf.readLine());
				Item ob = new Item(id, name, qty);
				session.save(ob);
				session.getTransaction().commit();
				break;
			}
			case 2: {
				System.out.println(Item.pocductCount);
				break;
			}
			default:
				break;
			}
		}
		// session.close();
	}

}
