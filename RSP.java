import java.util.Scanner;
import java.util.Random;
public class RSP{
	public static void main(String[] args) {
		Scanner scv = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("���������� �����Դϴ�.");
		int com;
		String user;
		int user1 = 0;
		while(true) {
			com=rd.nextInt(3); //���� : 0 ���� : 1 �� :2
			System.out.println("����, ����, �� �߿��� �Է��ϼ���");
			user = scv.next();
			if(user.equals("����")) {
				user1 = 0;
			}
			if(user.equals("����")) {
				user1 = 1;
			}
			if(user.equals("��")) {
				user1 = 2;
			}
			
			if(user1 == com)
			{
				printResult(user1,com);
				System.out.println("�����ϴ�.");
			}
			else {
				if((user1 == 0 && com == 2) || (user1 == 1 && com == 0) || (user1 == 2 && com == 1)) {
					printResult(user1,com);
					System.out.println("�̰���ϴ�.");
				}
				else {
					printResult(user1,com);
					System.out.println("�����ϴ�.");
				}
			}
		}
	}
	
	private static String valueToString(int value) {
		if(value == 0) {
			return "����";			
		}else if(value == 1) {
			return "����";
		}
		else {
			return "��";

		}
	}
	private static void printResult(int myValue, int comValue) {
		String str = "����" + valueToString(myValue) + "��ǻ�ʹ�" + 
					valueToString(comValue) + "�� �½��ϴ�.";
		System.out.println(str);
	}
}