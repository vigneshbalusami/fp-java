package com;

import org.hibernate.boot.archive.spi.ArchiveException;

import com.first.Users;

public class Solution {
	
	private static final long serialVersionUID = 1L;
	public void function(int a,int b) throws Users{
		if(a>b){
			throw new ArchiveException("firt must be less than second");
		}
	}
	public static void main(String args[]) throws Users  {
		Solution obj = new Solution();
		obj.function(5, 3);
	}
}
