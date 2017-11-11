package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BufferedReader bf = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		double median;
		int n = sc.nextInt(), m = sc.nextInt(), j = 0, l = 0;
		int arr[] = new int[n];
		int arr2[] = new int[m];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			arr2[i] = sc.nextInt();
		int a[] = new int[arr.length + arr2.length];
		for (int i = 0; i < a.length; i++) {
			if (j < n && l < m && arr[j] <= arr2[l])
				a[i] = arr[j++];
			else if (j < n && l < m)
				a[i] = arr2[l++];
			else if (j < n)
				a[i] = arr[j++];
			else if (l < m)
				a[i] = arr2[l++];
			System.out.print(a[i] + " ");
		}
		if (a.length % 2 == 0)
			median = ((double) a[a.length / 2] + (double) a[(a.length / 2) - 1]) / 2.0d;
		else
			median = (double) a[a.length / 2];
		System.out.println(median);
	}

}
