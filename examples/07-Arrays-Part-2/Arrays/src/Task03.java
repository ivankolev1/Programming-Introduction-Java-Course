import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = input.nextInt();
		int sum = 0;
		int[][] array = new int[n][n];
		System.out.println("Enter the numbers");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Number: ");
				array[i][j] = input.nextInt();
			}
		}
		
		//Print array
		for	(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					sum = sum + array[i][j];
				}
				
			}
			System.out.println();
		}
		
		System.out.println("The sum in main diagonal: " + sum);

		input.close();

	}

}