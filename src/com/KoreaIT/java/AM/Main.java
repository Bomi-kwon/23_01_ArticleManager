package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int article_number = 0;
		
		while(true) {
			System.out.printf("명령어 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("System exit")) {
				break;
			}
			else if(cmd.length() == 0) {
				System.out.println("명령어를 입력하세요.");
				continue;
			}
			else if(cmd.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			}
			else if(cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				article_number++;
				System.out.printf("%d번글이 생성되었습니다.\n",article_number);
			}
			else {
				System.out.println("존재하지 않는 명령어입니다.");
			}
		}
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
	}
}
