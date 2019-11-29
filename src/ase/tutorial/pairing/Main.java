package ase.tutorial.pairing;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Text input: hahaha you fool");

        System.out.println(countWordsUsingSplit("hahaha you fool"));
        System.out.println(getAverageWordLength("hahaha you fool"));

        //loesung

    }

    //Count Words
    static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
    //get average length of all words
    static double getAverageWordLength(String input) {

        String[] average = input.split(" ");

        int count = 0;
        int sum = 0;
        int currentWordLength;
        String tempString;
        for(int i = 0; i < average.length; i++)
        {
            average[i] = average[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            tempString = average[i];
            currentWordLength = tempString.length();
            sum += currentWordLength;
            count++;
        }
        double averageWordLength = sum / count;
        return averageWordLength;
    }

    static void countOccurencesOfEachWord(String input){
        Map<String, String> map = new HashMap<String, String>();

        if(input != null){
            String[] separatedWords = input.split(" ");
            for(String str: separatedWords){
                if(map.containsKey(str)){
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                }else{
                    map.put(str, "1");
                }
            }
        }
        //print map ...

    }
}


