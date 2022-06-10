import java.util.Scanner;

public class Test562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int odd = 0;
		int even = 0;
		double avg = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			int num = sc.nextInt();
			arr[i] = num;

			if (i % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
				count++;
			}
		}
		
		sc.close();

		avg = (double) even / count;
		System.out.println("sum : " + odd);
		System.out.printf("avg : %.1f ", avg);
	}

}
