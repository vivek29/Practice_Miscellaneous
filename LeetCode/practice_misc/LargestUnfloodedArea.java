package practice_misc;

import java.util.Stack;

public class LargestUnfloodedArea {

	static int area(int width, int height, String water) {

	    
	       if(water.isEmpty())    {
	           return width*height;
	       } 
	       
	String[] str_water = water.trim().replace(" ","").split("\\|");
	int[][] mat= new int[height][width];

	// Initializing the matrix with all values as 1.
	for(int i=0;i<height;i++)	{
	for(int j=0; j<width;j++)	{
	mat[i][j] = 1;
	}
	}	

	int temp_x_cord;
	int temp_y_cord;
	String[] cord = new String[str_water[0].length()];
	for(int i=0;i<str_water.length;i++)	{
	cord = str_water[i].trim().split(",");
	temp_x_cord = Integer.parseInt(cord[0]);
	temp_y_cord = Integer.parseInt(cord[1]);
	mat[temp_y_cord][temp_x_cord] = 0;

	}

	for(int i=0;i<height;i++)	{
	for(int j=0; j<width;j++)	{
	System.out.print(mat[i][j] + " ");
	}
	System.out.println();
	}

	int row[] = new int[width];
	int maxArea = 0;
	int area = 0;
	for(int i=0; i < mat.length; i++){
	           for(int j=0; j < row.length; j++){
	               if(mat[i][j] == 0){
	                   row[j] = 0;
	               }else{
	                   row[j] += mat[i][j];
	               }
	           }
	           area = area_rect(row);
	           if(area > maxArea){
	               maxArea = area;
	           }
	       }

	return maxArea;
	}


	  // Calculate area of rectangle
	public static int area_rect(int[] row) {
	if (row.length == 0) {
	return 0;
	}

	Stack<Integer> stack = new Stack<Integer>();

	int max_area = 0;
	int i = 0;

	while (i < row.length) {

	if (stack.isEmpty() || row[i] >= row[stack.peek()]) {
	stack.push(i);
	i++;
	} else {

	int p = stack.pop();
	int h = row[p];
	              int w;
	              if(stack.isEmpty()) {
	                  w = i;
	              }   else    {
	                  w = i - stack.peek() - 1;
	              }
	max_area = Math.max(h * w, max_area);
	}

	}

	while (!stack.isEmpty()) {
	int p = stack.pop();
	int h = row[p];
	          int w;
	if(stack.isEmpty()) {
	                  w = i;
	              }   else    {
	                  w = i - stack.peek() - 1;
	              }
	max_area = Math.max(h * w, max_area);
	}

	return max_area;
	}
	public static void main(String[] args) {
	
		LargestUnfloodedArea obj = new LargestUnfloodedArea();
		System.out.println("Area is "+obj.area(3, 2, "0,0|1,0"));

	}
	
}
