package project01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DBClass db = new DBClass();
<<<<<<< HEAD
		Scanner input = new Scanner(System.in);
		int num;
		Member m = new Member();
=======
		Member m = new Member();
		Scanner input = new Scanner(System.in);
		int num;
>>>>>>> 09d316f09a18e57a751b2af7b9977f1e10dcce36
		while(true) {
			System.out.println("1. ��� ���� \n2. �߰� \n3. ���� \n4. ���� \n5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
<<<<<<< HEAD
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
=======
			case 3: break;
>>>>>>> 09d316f09a18e57a751b2af7b9977f1e10dcce36
			case 4: break;
			case 5: 
				System.out.println("���α׷� �����մϴ�");
				return;
			}
		}
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 09d316f09a18e57a751b2af7b9977f1e10dcce36
