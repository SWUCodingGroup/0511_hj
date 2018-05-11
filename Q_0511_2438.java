//https://www.acmicpc.net/problem/2438
//별찍기-1
import java.util.Scanner;

public class Q_0511_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		if(!(num>=1 && num<=100)){
			System.out.print("유효하지 않은 범위입니다.");
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
