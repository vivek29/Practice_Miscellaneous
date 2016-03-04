package datastructures.arrays_and_strings;

/* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.	*/

public class ZeroMatrix {

	private static void setZeros(int[][] matrix) {
 // use 2 arrays to keep the track of all the rows with zeros and all the columns with zeros

		boolean[] rows = new boolean[matrix.length];		// initialized with false(default)
		boolean[] columns = new boolean[matrix[0].length];		// initialized with false(default)
		
		// store the row and column index with value 0
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){			
				if(matrix[i][j]==0){
					rows[i] = true;
					columns[j] = true;
				}					
			}
		}
		
		// Nullify rows
		for(int i=0;i<matrix.length;i++){
			if(rows[i])
				nullifyRow(matrix,i);
		}
		
		// Nullify columns
		for(int j=0;j<matrix[0].length;j++){
			if(columns[j])
				nullifyColumn(matrix,j);
		}
	}

	private static void nullifyRow(int[][] matrix, int row) {
		for(int j=0;j<matrix[0].length;j++){
			matrix[row][j] = 0;
		}		
	}
	
	private static void nullifyColumn(int[][] matrix, int col) {
		for(int i=0;i<matrix.length;i++){
			matrix[i][col] =0;
		}
	}

	public static void main(String a[]){		
		int[][] matrix = {{1,2,3,1},{4,0,6,1},{0,8,9,1}};
		setZeros(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}	
}
