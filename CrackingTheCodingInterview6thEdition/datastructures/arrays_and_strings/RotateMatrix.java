package datastructures.arrays_and_strings;

/* Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?	*/

public class RotateMatrix {

	static void rotate(int[][] matrix, int n){

		for(int layer=0;layer<n/2;layer++){
			int first = layer;
			int last = n-1-layer;

			for(int i=first;i<last;i++){
				int offset = i - first;

				//save top
				int top = matrix[first][i];

				// left --> top
				matrix[first][i] = matrix[last-offset][first];

				// bottom --> left
				matrix[last-offset][first] = matrix[last][last-offset];

				//right --> bottom
				matrix[last][last-offset] = matrix[i][last];

				// top --> right
				matrix[i][last] = top;
			}		
		}
	}
	
	public static void main(String a[]){		
		int[][] matrix = {{1,2,3},{4,0,6},{0,8,9}};
		rotate(matrix,3);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}	
}
