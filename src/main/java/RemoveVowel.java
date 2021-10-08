package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RemoveVowel {
    public static void main(String[] args) {

        String sentence = " Find one character from the options between the brackets";
        System.out.println(noVowels(sentence));


    }

    public static String noVowels (String fullSentence){


        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(fullSentence.toLowerCase());


        return fullSentence.replaceAll("[aeiou]", "");
    }
}
