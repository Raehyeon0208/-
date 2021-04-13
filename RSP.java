import java.util.Scanner;
import java.util.Random;
public class RSP{
	public static void main(String[] args) {
		Scanner scv = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("가위바위보 게임입니다.");
		int com;
		String user;
		int user1 = 0;
		while(true) {
			com=rd.nextInt(3); //가위 : 0 바위 : 1 보 :2
			System.out.println("가위, 바위, 보 중에서 입력하세요");
			user = scv.next();
			if(user.equals("가위")) {
				user1 = 0;
			}
			if(user.equals("바위")) {
				user1 = 1;
			}
			if(user.equals("보")) {
				user1 = 2;
			}
			
			if(user1 == com)
			{
				printResult(user1,com);
				System.out.println("비겼습니다.");
			}
			else {
				if((user1 == 0 && com == 2) || (user1 == 1 && com == 0) || (user1 == 2 && com == 1)) {
					printResult(user1,com);
					System.out.println("이겼습니다.");
				}
				else {
					printResult(user1,com);
					System.out.println("졌습니다.");
				}
			}
		}
	}
	
	private static String valueToString(int value) {
		if(value == 0) {
			return "가위";			
		}else if(value == 1) {
			return "바위";
		}
		else {
			return "보";

		}
	}
	private static void printResult(int myValue, int comValue) {
		String str = "나는" + valueToString(myValue) + "컴퓨터는" + 
					valueToString(comValue) + "를 냈습니다.";
		System.out.println(str);
	}
}