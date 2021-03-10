package project01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Scanner input = new Scanner(System.in);
		int num;
		Member m = new Member();
		while(true) {
			System.out.println("1. 모든 정보 \n2. 추가 \n3. 수정 \n4. 삭제 \n5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3:
				System.out.print("비교 아이디 입력 : ");
				m.setId(input.next());
				System.out.print("수정 이름 입력 : ");
				m.setName(input.next());
				System.out.print("수정 나이 입력 : ");
				m.setAge(input.nextInt());

				int re = db.modifyMember(m);
				if(re == 1) {
					System.out.println("성공적으로 수정했습니다");
				}else {
					System.out.println("수정 중 문제가 발생했습니다");
				}
				break;
			case 4: break;
			case 5: 
				System.out.println("프로그램 종료합니다");
				return;
			}
		}
	}
}


