import java.util.Scanner;

public class Test562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[11];
		int odd = 0;
		int even = 0;
		double avg = 0;
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			
			int num = sc.nextInt();
			arr[i] = num;

			if (i % 2 == 0) {
				odd += arr[i];
			} else {
				even += arr[i];
				count++;
			}
		}
		
		sc.close();

		avg = (double) even / count;
		System.out.println("sum : " + odd);
		System.out.printf("avg : %.1f ", avg);
	}

}
