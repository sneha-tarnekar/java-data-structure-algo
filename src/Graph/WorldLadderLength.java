package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WorldLadderLength {
    public static int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        Queue<WorldLadderPair> queue = new LinkedList<>();
        queue.add(new WorldLadderPair(startWord, 1));
        Set<String> set = new HashSet<String>();
        for(int i=0; i<wordList.length; i++) {
            set.add(wordList[i]);
        }
        set.remove(startWord);
        while(!queue.isEmpty()) {
            String word = queue.peek().word;
            int level = queue.peek().level;
            queue.remove();

            if(word.equals(targetWord)) return level;

            for(int i=0; i<word.length(); i++) {
                for(char ch='a'; ch<='z'; ch++) {
                    char[] charArr = word.toCharArray();
                    charArr[i] = ch;
                    String replaceWord = new String(charArr);
                    if(set.contains(replaceWord)) {
                        set.remove(replaceWord);
                        queue.add(new WorldLadderPair(replaceWord, level+1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] wordList = {"poon", "plee", "same", "poie","plea","plie","poin"};
        String startWord = "toon";
        String targetWord= "plea";
        int result = wordLadderLength(startWord, targetWord, wordList);
        System.out.println("Word length : " + result);
    }
}

class WorldLadderPair {
    String word;
    int level;
    public WorldLadderPair(String word, int level) {
        this.word = word;
        this.level = level;
    }
}