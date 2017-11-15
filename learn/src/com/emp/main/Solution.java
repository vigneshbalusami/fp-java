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
		System.out.print("Enter Id : ");
		int id = Integer.valueOf(bf.readLine());
		System.out.print("Enter the name : ");
		String name = bf.readLine();
		System.out.print("Enter the email : ");
		String emailId = bf.readLine();
		System.out.print("Enter phone Number : ");
		long phone = Long.valueOf(bf.readLine());
		System.out.print("Enter the Basic Salary : ");
		float basicSalary = Float.parseFloat(bf.readLine());
		System.out.print("Enter the DearnessAllowance : ");
		float dearnessAllowance = Float.parseFloat(bf.readLine());
		System.out.print("Enter the HouseRentAllownace : ");
		float houseRentAllowance = Float.parseFloat(bf.readLine());
		System.out.print("Enter the travelAllownace : ");
		float travelAllowance = Float.parseFloat(bf.readLine());
		System.out.print("Enter the ProvidentFund : ");
		float providentFund = Float.parseFloat(bf.readLine());
		System.out.print("Enter the Gender : ");
		//boolean gender = 
		Employee employee = new Employee();
		session.save(employee);

		session.getTransaction().commit();
		session.close();
	}
}
