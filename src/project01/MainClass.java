package project01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Member m = new Member();
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. ��� ���� \n2. �߰� \n3. ���� \n4. ���� \n5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: 
				System.out.println("���α׷� �����մϴ�");
				return;
			}
		}
	}

}
