import java.util.InputMismatchException;
import java.util.Scanner;

// 카페 음료 주문 접수
// 오버라이딩 -> 배달비
// 예외처리 -> hot, ice

public class DeliverySystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("따뜻한 음료는 0, 차가운 음료는 1을 입력하세요");
		int n;
		String HotIce;
		
		while (true) {
			System.out.print(">>");
			try {
				n = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
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
