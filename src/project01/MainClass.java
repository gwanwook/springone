package project01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DBClass db = new DBClass();

		Scanner input = new Scanner(System.in);
		int num;
		Member m = new Member();

		while(true) {
			System.out.println("1. ��� ���� \n2. �߰� \n3. ���� \n4. ���� \n5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: 
				db.getMember();
				break;
			case 2: 
				System.out.print("���̵� �Է�: ");
				m.setId(input.next());
				System.out.print("�̸� �Է�: ");
				m.setName(input.next());
				System.out.print("���� �Է�: ");
				m.setAge(input.nextInt());
				db.saveMember(m);
				break;
			case 3:
				System.out.print("�� ���̵� �Է� : ");
				m.setId(input.next());
				System.out.print("���� �̸� �Է� : ");
				m.setName(input.next());
				System.out.print("���� ���� �Է� : ");
				m.setAge(input.nextInt());

				int re = db.modifyMember(m);
				if(re == 1) {
					System.out.println("���������� �����߽��ϴ�");
				}else {
					System.out.println("���� �� ������ �߻��߽��ϴ�");
				}
				break;
			case 4: 
				System.out.print("���� ���̵� �Է� : ");
				String id = input.next();
				int result = db.deleteMember(id);
				if(result == 1) {
					System.out.println("���������� �����߽��ϴ�");
				}else {
					System.out.println("������ ������ �߻��߽��ϴ�");
				}
				break;
			case 5: 
				System.out.println("���α׷� �����մϴ�");
				return;
			}
		}
	}

}

