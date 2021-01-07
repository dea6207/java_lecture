package com.urdomain.test;

import java.util.Arrays;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random_num[] = new int[6];
		int rdn;
		for(int i = 0; i < random_num.length; i++) {
			rdn = (int)(Math.random()*45) + 1;
			random_num[i] = rdn;
			for (int j = 0; j<i; j++) {
				if(random_num[i] == random_num[j]) {
					i--;
					break;
				}
			}			
			int num = (int)(Math.random()*45) + 1;			
		}
		Arrays.sort(random_num);
		for (int k = 0; k < random_num.length; k++) {
			System.out.print(random_num[k]+ " ");
		}
	}

}
