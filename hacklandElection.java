/***
There are n citizens voting in this year's Hackland election. Each voter writes the name of their chosen candidate on a ballot and places it in a ballot box. The candidate with the highes number of votes win the election; if two or more candidates have the same number of votes, then the tied candidates' names are ordered alphabetically and the last name wins.

Complete the election Winner function in your editor. It has 1 parameter:L an array of strings, votes, describing the votes in the ballot box. This function must review these votes and return a string representing the name of the winning candidate.

Constraints

1<= n <= 10^4
Input Format An array of Strings

Output Format Name of the person who has the max votes. If there are multiple people with same number of votes(max) then print the last name.

Sample Input 1 String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"};

Sample Output 1 Michael

Explanation 1 votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"} Alex, Harry, Michael, and Mary are all tied for the highest number of votes. Because Michael is alphabetically last, we return his name as the winner.

Sample Input 2 String[] votes = { "victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };

Sample Output 2 veronica

Explanation 2 votes = {"Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica"} Veronica, Ryan, Maria, and Farah are all tied for the highest number of votes. Because Veronica is alphabetically last, we return her name as the winner.

**/


public class HacklandElection {

	public static void main(String[] args) {
		int num = 10;
		//String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael",
				//"Victor", "Harry", "Alex", "Mary", "Mary"};
		String[] votes = {"Victor", "Veronica", "Ryan", "Dave", "Maria",
				"Maria", "Farrah", "Farrah", "Ryan", "Veronica"};
		System.out.println(electionWinner(votes));
	}
	
    // Complete the electionWinner function below.
    static String electionWinner(String[] votes) {
        String[] votesSorted = insertionSort(votes);
        
        int highestVote = 0;
        int count = 0;
        String winner = "";
        for (int i = 1; i < votesSorted.length; i++)
        {
            if (votesSorted[i] == votesSorted[i - 1])
                count++;
            else
            {
                if (count > highestVote|| count == highestVote)
                {
                    highestVote = count;
                    winner = votesSorted[i - 1];
                }
                count = 1;
            }
        }
     
        // If last element is most frequent
        if (count > highestVote || count == highestVote)
        {
            highestVote = count;
            winner = votesSorted[votesSorted.length - 1];
        }
        return winner;

    }
    static String[] insertionSort(String[] votes) {
	     if (votes == null || votes.length == 0)
	        return votes;
	     for (int i=1; i<votes.length; i++) {
	         String temp = votes[i];
	         int j = i;
	         for(j=i; j>0; j--) {
	        	 if(temp.compareTo(votes[j - 1]) < 0)
                     votes[j] = votes[j - 1];
                else
                    break;
	         }
	         
	        votes[j] = temp;
	     }
	     return votes;
    }

}
