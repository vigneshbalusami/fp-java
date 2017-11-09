import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name = bf.readLine();
		int age = Integer.valueOf(name);
		float mass = Float.valueOf(bf.readLine());
		System.out.println("String" + name);
		System.out.println("integer" + age);
		System.out.println("float" + mass);

	}

}
