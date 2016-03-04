package java.collections;

import java.io.*;
import java.util.*;

class Checker {

	public Comparator<Player> desc = null;

	public Checker() {
		desc = new Comparator<Player>() {

			public int compare(Player p1, Player p2) {
				if ( p1.score > p2.score ) return -1;
				else if ( p1.score < p2.score ) return 1;
				else {
					if ( p1.name.compareTo(p2.name) > 0 ) {
						return -1;
					} else return 1;
				}
			}
		};
	}    
}

class Player
{
	String name;
	int score;
}

public class JavaComparator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		Player Player[]=new Player[N];
		Checker check=new Checker();
		for(int i=0;i<N;i++)
		{
			s=br.readLine().trim();
			st=new StringTokenizer(s);
			Player[i]=new Player();
			Player[i].name=st.nextToken();
			Player[i].score=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(Player,check.desc);
		for(int i=0;i<Player.length;i++)
		{
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		}
	}
}
