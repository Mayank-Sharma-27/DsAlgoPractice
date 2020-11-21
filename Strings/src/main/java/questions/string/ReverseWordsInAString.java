package questions.string;

//problem link : https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInAString {

    public String reverseWords(String s) {
        String[] store = s.split("\\s+");
        if (store.length == 1) return store[0];
        StringBuilder sb = new StringBuilder();
        int len = store.length;
        for(int i = len - 1; i >= 0; i--){
            sb.append(store[i] + ' ');
        }
        return sb.toString().trim();
    }

}
