package com.KoreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		List<Article> articles = new ArrayList<>();
		
		while(true) {
			System.out.printf("명령어 : ");
			String cmd = sc.nextLine().trim();
			
			if(cmd.equals("System exit")) {
				break;
			}
			else if(cmd.length() == 0) {
				System.out.println("명령어를 입력하세요.");
				continue;
			}
			else if(cmd.equals("article list")) {
				if(articles.size() == 0) {
					System.out.println("게시글이 없습니다.");
				}
				else {
					System.out.printf("게시글이 %d개 있습니다.\n",lastArticleId);
				}
			}
			else if(cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				int id = lastArticleId+1;
				lastArticleId = id;
				Article article = new Article(id, title, body);
				articles.add(article);
				System.out.printf("%d번글이 생성되었습니다.\n",id);
			}
			else {
				System.out.println("존재하지 않는 명령어입니다.");
			}
		}
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
	}
}
class Article {
	int id;
	String title;
	String body;
	
	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}
