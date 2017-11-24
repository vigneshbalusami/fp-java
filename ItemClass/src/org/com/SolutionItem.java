package org.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SolutionItem {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//insert the values intoo database
		/*int id, price;
		String name;
		while (true) {
			int ch;
			System.out.println("Enter the choice\n\t1.save\n\t2.total no.of.items");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				session.beginTransaction();
				System.out.println("Enter id");
				id = Integer.valueOf(bf.readLine());
				System.out.println("Enter name");
				name = bf.readLine();
				System.out.println("Enter price");
				price = Integer.valueOf(bf.readLine());
				Item it = new Item(id, name, price);
				session.save(it);
				session.getTransaction().commit();
				break;
			case 2:
				System.out.println("Total count of selected item "+Item.productcount);
				break;
			default:
				break;
			}
		}*/
		
		//retrieving the values in databases
		
		Item it=session.get(Item.class, 1);
		System.out.println(it.getId());
		System.out.println(it.getName());
		System.out.println(it.getQty());
		
		//updating the values in databases
		
		/*Item it=session.get(Item.class, 1);
		session.beginTransaction();
		it.setId(1);
		it.setName("kaviyarrasu");
		it.setQty(5);
		session.update(it);
		session.getTransaction().commit();
		System.out.println("Updated");*/
		
		//deleting the values in databases
		
		session.delete(it);
		System.out.println("deleted");
		session.close();
	}

}
