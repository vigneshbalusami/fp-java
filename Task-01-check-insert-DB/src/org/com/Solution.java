	package com.emp.main;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	
	import com.emp.sample.Employee;
	
	public class Solution {
	
		public static void main(String[] args) throws IOException {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Hello ");
			String[] country = { "america", "Australiya", "india" };
			System.out.println("Enter the mail ID :");
			String mail = bf.readLine();
			System.out.println("Enter the miidle name : ");
			String middleName = bf.readLine();
			System.out.println("Enter the password : ");
			String password = bf.readLine();
			System.out.println("Enter the aadhar number : ");
			long aadharNO = Long.parseLong(bf.readLine());
			System.out.println("Enter the last name");
			String lastName = bf.readLine();
			System.out.println("date of birth");
			String dob = bf.readLine();
			System.out.println("Enter the pancard number : ");
			long pan = Long.parseLong(bf.readLine());
			System.out.println("Enter the security answer : ");
			String securityAnswer = bf.readLine();
			String[] securityQuestion = { "" };
			System.out.println("Enter the first name");
			String firstName = bf.readLine();
			String[] maritalStatus = { "what is parent name?", "name of first school", "who is your childhood hero",
					"favorite past time", "what did u first meet your spouse" };
			System.out.println("UserId");
			String userId = bf.readLine();
			Employee employee = new Employee(userId, password, securityQuestion, securityAnswer, firstName, middleName,
					lastName, maritalStatus, dob, aadharNO, pan, country, mail);
			session.save(employee);
			System.out.println("exit");
			session.getTransaction().commit();
			session.close();
		}
	
	}
