//https://www.acmicpc.net/problem/2438
//�����-1
import java.util.Scanner;

public class Q_0511_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		if(!(num>=1 && num<=100)){
			System.out.print("��ȿ���� ���� �����Դϴ�.");
			System.exit(0);
		}
		for(int i=0; i<num; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
