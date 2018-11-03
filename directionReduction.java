/**
In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away. What a waste of time! Better to do nothing.

The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).

In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

Task
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).


Examples
dirReduc(@[@"NORTH", @"SOUTH", @"SOUTH", @"EAST", @"WEST", @"NORTH", @"WEST"]); // => @[@"WEST"]
dirReduc(@[@"NORTH", @"SOUTH", @"SOUTH", @"EAST", @"WEST", @"NORTH"]); // => @[]
Note
Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].

**/


import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
		
		if(arr.length == 0)
			return arr;
		
		List<String> results = new ArrayList<String>();
		for(int i=0; i<arr.length; i++) {
			results.add(arr[i]);
		}
		

		int reduc = 0; 
		
		reduc = checkForOpposites(results);
		
		while(reduc != 0) {
			reduc = checkForOpposites(results);
		}
		
		
		String[] arr2 = new String[results.size()];
		
		for(int i=0; i<results.size(); i++) {
			arr2[i] = results.get(i);
			System.out.println(arr2[i]);
		}
		
		return arr2;
    }
	
	public static int checkForOpposites(List<String> results) {
		int reduc = 0;
		for(int i=1; i<results.size(); i++) {
			if(i<results.size()) {
				if(results.get(i).equals("NORTH") && results.get(i-1).equals("SOUTH") 
						|| results.get(i).equals("SOUTH") && results.get(i-1).equals("NORTH")
						|| results.get(i).equals("EAST") && results.get(i-1).equals("WEST")
						|| results.get(i).equals("WEST") && results.get(i-1).equals("EAST")) {
					results.remove(i);
					results.remove(i-1);
					i-=1;
					reduc+=1;
				}
			}
		}
		return reduc;
	}
}
