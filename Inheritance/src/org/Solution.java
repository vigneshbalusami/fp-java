package org;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.com.first.TwoWheeler;
import org.com.second.FourWheeler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		TwoWheeler twoWheeler = new TwoWheeler(123, "yemaha", "gir");
		FourWheeler fourWheeler = new FourWheeler(12, "bike", "fivegir");
		session.beginTransaction();
		session.save(twoWheeler);
		session.save(fourWheeler);
		session.getTransaction().commit();
		session.close();
	}

}
