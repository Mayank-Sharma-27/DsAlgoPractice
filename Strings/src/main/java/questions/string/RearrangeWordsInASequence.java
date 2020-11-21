package questions.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeWordsInASequence {

    class Word{
        String s;
        int index;
        int length;

        Word(String s , int index , int length){
            this.s = s;
            this.index=index;
            this.length = length;
        }
    }

    public String arrangeWords(String text) {
        String[] strings =  text.split("\\s+");
        List<Word> words = new ArrayList<>();
        for(int i = 0 ; i < strings.length; i++){
            Word word = new Word(strings[i], i, strings[i].length());
            words.add(word);
        }

        List<Word> sortedWords = words.stream()
                .sorted(Comparator.comparing((Word word) -> word.length)
                        .thenComparing(word -> word.index))
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < sortedWords.size(); i++){
            String word = sortedWords.get(i).s.toLowerCase();
            if(i==0){
                word= word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            sb.append(word);
            if(i!=sortedWords.size()-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
