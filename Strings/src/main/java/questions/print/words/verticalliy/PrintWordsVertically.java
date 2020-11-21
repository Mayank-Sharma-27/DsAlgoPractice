package questions.print.words.verticalliy;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

    public List<String> printVertically(String s) {
        String[] strings = s.split(" ");
        int maxLength = 0;
        for(String c : strings){
            maxLength = Math.max(maxLength, c.length());
        }

        List<String> ans = new ArrayList();
        for(int i =0 ; i< maxLength ; i++){
            StringBuilder sb = new StringBuilder();

            for(int j = 0 ; j < strings.length ; j++){
                if(strings[j].length()> i){
                    sb.append(strings[j].substring(i, i+1));
                }
                else{

                    sb.append(" ");
                }
            }
          //  ans.add(sb.toString().stripTrailing());// works in java 11;
        }
        return ans;

    }

}
