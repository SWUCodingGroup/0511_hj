//https://www.acmicpc.net/problem/1316
//그룹단어 체커
import java.util.Scanner;

public class Q_0511_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//처음사용되었거나 or 연속이면 pass / 아니면 flag표시
		
		
		
		//단어개수와 스트링 입력받기
		Scanner stdin = new Scanner(System.in);
		Scanner stdin2 = new Scanner(System.in);
		int num = stdin.nextInt();
		String arrStr[] = new String[num];
		
		int result[] = new int[num]; //결과
		
		for(int i=0; i<num; i++){
			arrStr[i] = stdin2.nextLine();
			result[i] = checkif(arrStr[i]);
		}
		
	}
	
	public static int checkif(String str){
		//사용된 문자인지 체크
		boolean check[] = new boolean[26];
		check[0] = true; //첫번째 문자는 무조건 사용됨.
		
		for(int i=0; i<str.length(); i++){
			//처음사용된건지
			//연속해있는건지
			str.charAt(i);
		}
		
		
		return 1;
	}

}
