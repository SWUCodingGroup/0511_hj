//https://www.acmicpc.net/problem/1316
//�׷�ܾ� üĿ
import java.util.Scanner;

public class Q_0511_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ó�����Ǿ��ų� or �����̸� pass / �ƴϸ� flagǥ��
		
		
		
		//�ܾ���� ��Ʈ�� �Է¹ޱ�
		Scanner stdin = new Scanner(System.in);
		Scanner stdin2 = new Scanner(System.in);
		int num = stdin.nextInt();
		String arrStr[] = new String[num];
		
		int result[] = new int[num]; //���
		
		for(int i=0; i<num; i++){
			arrStr[i] = stdin2.nextLine();
			result[i] = checkif(arrStr[i]);
		}
		
	}
	
	public static int checkif(String str){
		//���� �������� üũ
		boolean check[] = new boolean[26];
		check[0] = true; //ù��° ���ڴ� ������ ����.
		
		for(int i=0; i<str.length(); i++){
			//ó�����Ȱ���
			//�������ִ°���
			str.charAt(i);
		}
		
		
		return 1;
	}

}
