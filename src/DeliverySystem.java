import java.util.InputMismatchException;
import java.util.Scanner;

// ī�� ���� �ֹ� ����
// �������̵� -> ��޺�
// ����ó�� -> hot, ice

public class DeliverySystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
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
		else HotIce = "Ice";
		
		System.out.print(HotIce);
		
		scanner.close();
	}
}
