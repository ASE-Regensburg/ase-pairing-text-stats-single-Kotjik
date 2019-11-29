package ase.tutorial.pairing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
       //String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Konstantin\\Documents\\GitHub\\ase-pairing-text-stats-single-Kotjik\\data\\1H4.txt")));


        File folder = new File("C:\\Users\\Konstantin\\Documents\\GitHub\\ase-pairing-text-stats-single-Kotjik\\data");
        File[] listOfFiles = folder.listFiles();

        String content = "";

        for(int i = 0; i< listOfFiles.length; i++) {
            System.out.println(listOfFiles[i]);
            //content = new String(Files.readAllBytes(Paths.get(listOfFiles[i])));
            //System.out.println(countWordsUsingSplit(content));

        }
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


