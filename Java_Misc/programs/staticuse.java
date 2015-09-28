package com.practice.vivek;
									// Program without static variable
public class staticuse {  
		  
/*		int count=0;								//will get memory when instance is created  
	
		staticuse(){  								
			count++;  
			System.out.println(count);  
			}
*/													//Since instance variable gets the memory
													//at the time of object creation, each object
													//will have the copy of the instance variable,
													//if it is incremented, it won't reflect to
													//other objects. So each objects will have the
													//value 1 in the count variable.
		public static void main(String args[]){  
		
		staticuse c1=new staticuse();  
		staticuse c2=new staticuse();  
		staticuse c3=new staticuse();  

									// In Java, a static member is a member of a class that isn’t
									//associated with an instance of a class. Instead, the member
									//belongs to the class itself. As a result, you can access the
									//static member without first creating a class instance.
		
	System.out.println(staticuse.test());	// static method can be called directly by classname
											// classname.methodname()
		} 
									// here make the instance variable static so all the objects
									//share the same variable thus works on the same variable and		
									// increments the same.
	static int count1=0;
	
	staticuse(){  								
		count1++;  
		System.out.println(count1);  
		}
											// static method		 
	public static int test(){
		return count1;
	}

}
