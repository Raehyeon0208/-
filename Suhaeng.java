import java.util.Scanner;
public class Suhaeng {

	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임입니다. 가위,바위,보 중 하나를 입력하세요!"); //0 = 가위 1 = 바위 2 = 보
		while(true) {
		int com = (int)(Math.random()*3);
		Scanner scv = new Scanner(System.in);
		String me = scv.next();
		int men = 0;
		String Scom = "";
		if(com == 0) {
			Scom = "가위";
		}
		if(com == 1) {
			Scom = "바위";
		}
		if(com == 2) {
			Scom = "보";
		}
		if(me.equals("가위")) {
			men = 0;
		}
		else if(me.equals("바위")){
			men = 1;
		}
		else {
			men = 2;
		}
		if(men==0) {
			if(com == 0) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("비김");
			}
			if(com == 1) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("컴퓨터가 이김");
			}
			if(com == 2) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("사용자가 이김");
			}
		}
		if(men==1) {
			if(com == 0) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("사용자가 이김");
			}
			if(com == 1) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("비김");
			}
			if(com == 2) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("컴퓨터가 이김");
			}
		}
		if(men==2) {
			if(com == 0) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("컴퓨터가 이김");
			}
			if(com == 1) {
				System.out.println("나는" + me + " 컴퓨터는" + Scom);
				System.out.println("사용자가 이김");
			}
			if(com == 2) {
				System.out.println("나는 " + me + " 컴퓨터는 " + Scom);
				System.out.println("비김");
			}
		}
	  }
	}
}
