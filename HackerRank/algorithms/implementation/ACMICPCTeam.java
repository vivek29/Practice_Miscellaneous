package algorithms.implementation;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
        //Get input
        Scanner s = new Scanner(System.in);
        String[] firstLine = s.nextLine().split(" ");
        int people = Integer.parseInt(firstLine[0]);
        int topics = Integer.parseInt(firstLine[1]);

        int[][] a = new int[people][topics];   
        
        for(int i = 0; i < people; i++){
            int[] currentArray = new int[topics];
            String currentTopicList = s.nextLine();
            
            for(int j = 0; j < currentTopicList.length(); j++){
                currentArray[j] = Integer.parseInt(currentTopicList.charAt(j) + "");
            }
            
            a[i] = currentArray;
        }
        
        //Solution
        int highest = -1;					// initially lets say no one know how to solve the topics
        int bestTeams = 0;					
        
        for(int i = 0; i < a.length-1; i++){					// 1st person
            for(int j = i+1; j < a.length; j++){				// 2nd person

            	int knowledge = 0;						// If anyone of the team knows how to solve the topic
                
            	for(int x = 0; x < topics; x++){									// topics
                    knowledge = knowledge + ((a[i][x] == 1 || a[j][x] == 1) ? 1 : 0);
                }
                
            	if(knowledge > highest){				// best high until now
                    highest = knowledge;
                    bestTeams = 1;
                }
                
            	else if(knowledge == highest){			// if more than one team has that high
                    bestTeams += 1;
                }
            }
        }
        System.out.println(highest);
        System.out.println(bestTeams);	
	}
}