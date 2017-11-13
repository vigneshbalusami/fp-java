package com.emp.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.emp.sample.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.valueOf(bf.readLine());
		String name = bf.readLine();
		String emailId = bf.readLine();
		long phone = Long.valueOf(bf.readLine());
		String gender = bf.readLine();
		Employee employee = new Employee(id, name, emailId, phone, gender);
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getEmailId() + " "
				+ employee.getPhone() + " " + employee.getGender());

	}

}
