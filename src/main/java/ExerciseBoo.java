package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExerciseBoo {
    public static void main(String[] args) {

        //String importantWord = "trap";
        String sentence = "We enrolled in DCI course. We are in a trap. The trap is successful";
        System.out.println(scaryWord(sentence));
        System.out.println(sentence);

    }

    public static String scaryWord (String userSentence) {

        String no = "Relax, there's no trap.";
        String yes = "BOO!!";


        Pattern p = Pattern.compile("trap");
        String str = userSentence.toLowerCase();
        Matcher m = p.matcher(str);

        if (m.find()) {
            return yes;
        }
        else {
            return no;
        }



    }
}
