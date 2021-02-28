package oop.inputoutput.tema;

import java.io.*;

//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        File inputFile = new File("C:/Test/lorem.txt");
//        String contentWords;
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
//        filecontent = bufferedReader.readLine();
//        while ((contentWords = bufferedReader.readLine()) != null) {
//            System.out.println(contentWords);
//        }
//    } catch(
//    FileNotFoundException e)
//
//    {
//        e.printStackTrace();
//    } catch(
//    IOException e)
//
//    {
//        e.printStackTrace();
//    }
//        System.out.println(contentWords);
//        System.out.println("words number :"+
//
//    countWords(contentWords));
//}
//
//    public static int countWords(String text) {
//        String[] wordsArray = text.split(" ");
//        return wordsArray.length;
//    }
//}


//Create a file with a „ lorem ipsum " paragraph within it can be done by copy pasting
//existing paragraph or generating it dynamically using Java library . Read that file.
//a)Count words
//b)Count special signs like comma , dot , spaces
//c)*Select one word and print it's number of occurences .
public class Main {
    public static void main(String[] args) throws IOException {

        File checkedFile = new File("C:/test/loream.txt");
        String fileContent = "";
        String fileLine;
        //fileContent = bufferedReader.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(checkedFile));
        while ((fileLine = bufferedReader.readLine()) != null) {
            fileContent += fileLine;
            fileContent += "";
        }
        System.out.println(fileContent);
        System.out.println("Number of words: " + countWords(fileContent));
        System.out.println(fileContent);
        countSpecialSigns(fileContent);

        System.out.println("Numbers of occurences " + numberOfOccurences(fileContent, "amet"));
    }

    public static int countWords(String text) {
        String[] wordsArray = text.split(" ");
        return wordsArray.length;
    }

    public static void countSpecialSigns(String text) {
        int commaCount = 0;
        int dotCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            } else if (text.charAt(i) == ',') {
                commaCount++;
            } else if (text.charAt(i) == '.') {
                dotCount++;
            }
        }
        System.out.println("Number of commas: " + commaCount);
        System.out.println("Number of dots: " + dotCount);
        System.out.println("Number of spaces: " + spaceCount);
    }

    public static int numberOfOccurences(String text, String word) {
        String[] wordArray = text.split(" ");
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            String newWord = wordArray[i];
            // System.out.println(newWord);
            if (((newWord.charAt(newWord.length() - 1) < 65) || (newWord.charAt(newWord.length() - 1) > 90))
                    && ((newWord.charAt(newWord.length() - 1) < 97)
                    || (newWord.charAt(newWord.length() - 1) > 122))) {
                newWord = newWord.substring(0, newWord.length() - 1);
            }
            if (newWord.equals(word)) {
                count++;
            }
        }
        return count;
    }
}

