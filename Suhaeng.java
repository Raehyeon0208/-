import java.util.Scanner;
public class Suhaeng {

	public static void main(String[] args) {
		System.out.println("���� ���� �� �����Դϴ�. ����,����,�� �� �ϳ��� �Է��ϼ���!"); //0 = ���� 1 = ���� 2 = ��
		while(true) {
		int com = (int)(Math.random()*3);
		Scanner scv = new Scanner(System.in);
		String me = scv.next();
		int men = 0;
		String Scom = "";
		if(com == 0) {
			Scom = "����";
		}
		if(com == 1) {
			Scom = "����";
		}
		if(com == 2) {
			Scom = "��";
		}
		if(me.equals("����")) {
			men = 0;
		}
		else if(me.equals("����")){
			men = 1;
		}
		else {
			men = 2;
		}
		if(men==0) {
			if(com == 0) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("���");
			}
			if(com == 1) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("��ǻ�Ͱ� �̱�");
			}
			if(com == 2) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("����ڰ� �̱�");
			}
		}
		if(men==1) {
			if(com == 0) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("����ڰ� �̱�");
			}
			if(com == 1) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("���");
			}
			if(com == 2) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("��ǻ�Ͱ� �̱�");
			}
		}
		if(men==2) {
			if(com == 0) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("��ǻ�Ͱ� �̱�");
			}
			if(com == 1) {
				System.out.println("����" + me + " ��ǻ�ʹ�" + Scom);
				System.out.println("����ڰ� �̱�");
			}
			if(com == 2) {
				System.out.println("���� " + me + " ��ǻ�ʹ� " + Scom);
				System.out.println("���");
			}
		}
	  }
	}
}
