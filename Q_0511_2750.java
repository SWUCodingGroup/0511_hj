//https://www.acmicpc.net/problem/2750
//정렬
import java.util.Scanner;

public class Q_0511_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		Scanner stdin2 = new Scanner(System.in);
		int num = stdin.nextInt();
		int arr[] = new int[num];
		
		if(!(num>=1 && num<=1000)){
			System.out.print("유효하지 않은 범위입니다.");
			System.exit(0);
		}
		
		for(int i=0; i<num; i++){
			arr[i] = stdin2.nextInt();
		}
		
		//Bubble Sort
		int temp = 0;
		for(int i=0; i<num; i++){
			for(int j=1; j<num-i; j++){
				if(arr[j-1]>arr[j]){ //값 스위치
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<num; i++){
			System.out.println(arr[i]);	
		}
	}

}
