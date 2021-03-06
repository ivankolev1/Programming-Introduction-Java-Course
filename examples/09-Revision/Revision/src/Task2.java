
public class Task2 {
	
	public static void main(String[] arg){
		int[][] matrix = {
				{1, 3, 8},
				{6, 8, 9},
				{2, 5, 6}
		};
		
		int max = Integer.MIN_VALUE;
		int maxRow = 0;
		int maxCol = 0;
		
		int min = Integer.MAX_VALUE;
		int minRow = 0;
		int minCol = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if(matrix[row][col] > max){
					max = matrix[row][col];
					maxRow = row;
					maxCol = col;
				}
				if(matrix[row][col] < min){
					min = matrix[row][col];
					minRow = row;
					minCol = col;
				}
			}
		}
		System.out.println("The maximal number is " + max + " The position is: " + maxRow + " and "+ maxCol);
		System.out.println("The minimal number is " + min + " The position is: " + minRow + " and "+ minCol);
	}
}
