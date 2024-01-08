package Laboratornya5;

import java.util.Scanner;

public class Main {

//    // Задание 5.1.
//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String newText = scanner.nextLine();
//    String  maxWordLength = getLongWord(newText);
//    System.out.println("Максимальное длинное слово: " + "\n" + maxWordLength);
//    }
//    private static String getLongWord(String text) {
//    String [] word1 = text.split(" ");
//    int lengthWord = 0;
//    String maxWordLength = " ";
//    for (int i = 0; i < word1.length; i++) {
//    if (word1[i].length() > lengthWord) {
//        lengthWord = word1[i].length();
//    }
//}
//    for (int i = 0; i < word1.length; i++){
//    if (word1[i].length() == lengthWord) {
//        maxWordLength += word1[i] + ", ";
//    }
//
//        }
//    return maxWordLength.substring(0, maxWordLength.length() - 1);
//    }

    //    // Задание 5.2.
//    public static Scanner in = new Scanner(System.in);
//    public static void main(String[] args) {
//        String st = in.next();
//        System.out.println(isPalindrome(st));
//    }
//    private static boolean isPalindrome(String st){
//    st = st.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
//        st = st.toLowerCase();
//        int j = st.length() - 1, i=0;
//        boolean flag = true;
//        while ((flag && i < j)) {
//            if (st.charAt(i) != st.charAt(j)) {
//                flag = false;
//            }
//            i++;
//            j--;
//        }
//        return flag;
//    }

//    // Задание 5.3.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str1 = scanner.nextLine();
        System.out.println("С цензурой: " + substitutionForCensor(str1));
    }

       public static String substitutionForCensor(String text){
String st1 = "Бяка";
String st2 = "[вырезано цензурой]";
        text = text.replaceAll(st1
                , st2);

        return text;

        }


//    // Задание 5.4.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//System.out.println("Введите строку: ");
//String str1 = scanner.nextLine();
//System.out.println("Введите подстроку: ");
//String str2 = scanner.nextLine();
//Integer numOccurStr = numOccur(str1, str2);
//System.out.println(numOccurStr);}
//
//
//
//public static int numOccur (String str1, String str2){
//    int strs = 0;
//    String[] words = str1.split(" ");
//    for (String word : words) {
//        if (word.contains(str2)) {
//            strs++;
//        }
//    }
//    return strs;
//}

    // Задание 5.5.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(("Введите слова: "));
//        String stringOrig = scanner.nextLine();
//        System.out.println(invWords(stringOrig));
//    }
//    public static String invWords(String stringOrig) {
//
//        int n = stringOrig.length();
//
//        String reverString = "";
//
//        char ch;
//
//        for (int i = n - 1; i >= 0; i--) {
//            ch = stringOrig.charAt(i);
//            reverString = reverString + ch;
//        }
//        return reverString;
//    }


}

