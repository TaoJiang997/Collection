
public class Collection {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int count = 1;
		for(int x = 0; x < matrix.length; x++) {
			System.out.println();
			for(int y = 0; y <matrix[x].length; y++) {
				
				matrix[x][y] = count;
				count++;
				System.out.print(matrix[x][y] + " ");
			}
		}
	}
}
