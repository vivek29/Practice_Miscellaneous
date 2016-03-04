package practice_misc;

public class FrogAndPond {

	public static int solution(int[] A, int X, int D) {
    	
		int sec=0;
		
		if(D>=X) {					// if frog can cross the pond in one jump
			return sec;
		}
		else {
			int pos=0;					// current position of frog

			for(int i=0;i<A.length;i++)	{
				if(pos+D>=X) {			// if any time the frog can jump across the pond
					return sec;
				}
				if ((A[i] > pos) || (A[i] <= (pos + D))) {
					pos = A[i];
				}	
				sec++;
				}
			}
			return -1;					// frog cannot jump the pond
		}
		
	
	public static void main(String a[]){
		System.out.println(solution(new int[]{ 1, 3, 1, 4, 2, 5}, 7, 2));
		System.out.println("Actual solution: " + getSolution(new int[]{ 1, 3, 1, 4, 2, 5}, 7, 2));
	}
	
	public static int getSolution(int[] A, int X, int D) {
		int sec = 0; 

		if (D >= X) { 							// if frog can cross the pond in one jump
			return sec;
		} 
		else { 
			int pos = 0; 				// current position of frog
			for (int i=0; i<A.length; i++) {

				if ((A[i] <= D && A[i] > pos)							// get frog's next jump/pos
						|| (A[i] > D && (A[i] <= (pos + D)))) {
					pos = A[i];
				}

				if (pos + D >= X) {
					return sec;							// if any time the frog can jump across the pond
				}

				sec++;
			}
		}
		return -1;			// frog cannot jump the pond
	}
	
}