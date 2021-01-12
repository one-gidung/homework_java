import java.util.InputMismatchException;
import java.util.Scanner;

// ī�� ���� �ֹ� ����
// �������̵� -> ��޺�
// �߻�Ŭ����, �޼ҵ�� �������̵� ��ӱ��� �� ����
// ����ó�� -> hot, ice
abstract class Calculator {
	public abstract int add(int a, int b);
}

public class DeliverySystem extends Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menu;
		int charge, extraCharge = 0;

		System.out.println("<�޴���>");
		System.out.println("[1��] �Ƹ޸�ī��: 3000��");
		System.out.println("[2��] ��: 4000��");
		System.out.println("[3��] ���ν����: 5000��");
		System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ���.");
		
		int m;
		while (true) {
			System.out.print(">>");
			try {
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next();
				continue;
			}
		}
		if(m == 1) {
			menu = "�Ƹ޸�ī��";
			charge = 3000;
		} else if(m == 2) {
			menu = "��";
			charge = 4000;
		} else {
			menu = "���ν����";
			charge = 5000;
		}
		
		System.out.println("������ ����� 0, ������ ����� 1�� �Է��ϼ���");
		int n;
		String HotIce;
		
		while (true) {
			System.out.print(">>");
			try {
				n = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next();
				continue;
			}
		}
		
		if (n == 0) HotIce = "Hot";
		else {
			HotIce = "Ice";
			extraCharge = 500;
		}
		DeliverySystem d = new DeliverySystem();
		
		System.out.print("�ֹ���: " + menu + "(" + HotIce + "): " + d.add(charge, extraCharge));
		
		scanner.close();
	}
}
