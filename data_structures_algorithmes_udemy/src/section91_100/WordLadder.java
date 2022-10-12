package section91_100;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	
	private static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		Set<String> set = new HashSet<>(wordList);
		
		set.remove(beginWord);
		
		Queue<Pair> q = new LinkedList<>();
		
		q.offer(new Pair(beginWord, 1));
		
		while(!q.isEmpty()) {
			
			String word = q.peek().word;
			int step = q.peek().steps;
			
			q.poll();
			
			if(word.equals(endWord)) {
				return step;
			}
			
			for(int i = 0 ; i < word.length() ; i++) {
				for(char ch = 'a' ; ch <= 'z' ; ch++) {
					char[] replacedCharArray = word.toCharArray();
					replacedCharArray[i] = ch;
					String temp = new String(replacedCharArray);
					if(set.contains(temp)) {
						set.remove(temp);
						q.offer(new Pair(temp, step + 1));
					}
				}
			}
			
		}
		
		return 0;
	}
	
	private static class Pair{
		String word;
		int steps;
		
		Pair(String word, int steps){
			this.word = word;
			this.steps = steps;
		}
	}

}
