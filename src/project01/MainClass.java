package project01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Member m = new Member();
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 모든 정보 \n2. 추가 \n3. 수정 \n4. 삭제 \n5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: break;
			case 2: 
				System.out.print("아이디 입력: ");
				m.setId(input.next());
				System.out.print("이름 입력: ");
				m.setName(input.next());
				System.out.print("나이 입력: ");
				m.setAge(input.nextInt());
				db.saveMember(m);
				break;
			case 3: break;
			case 4: break;
			case 5: 
				System.out.println("프로그램 종료합니다");
				return;
			}
		}
	}

}
