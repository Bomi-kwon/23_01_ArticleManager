package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		System.out.printf("명령어를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String command = sc.nextLine();
		System.out.printf("명령어 : %s\n",command);
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
	}
}
