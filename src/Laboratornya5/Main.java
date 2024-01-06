package Laboratornya5;

import java.util.Scanner;

public class Main {

//    // Задание 5.1.
//    public static void main(String[] args) {
//        String s = "Lorem Ipsum - это текст-рыба, часто используемый в печати и " +
//                "вэб-дизайне. Lorem Ipsum является стандартной рыбой для текстов на" +
//                " латинице с начала XVI века. В то время некий безымянный печатник создал " +
//                "большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для " +
//                "распечатки образцов. Lorem Ipsum не только успешно пережил без заметных и" +
//                "зменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в" +
//                " новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х" +
//                " годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker," +
//                " в шаблонах которых используется Lorem Ipsum.";
//        String longest = Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(String::length))
//                .orElse(null);
//        System.out.println(longest);
//    }

    //    // Задание 5.2.
//    public static Scanner in = new Scanner(System.in);
//    public static void main(String[] args) {
//        String st = in.next();
//        System.out.println(isPalindrome(st));
//    }
//    private static boolean isPalindrome(String st) {
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

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String replayText = scanner.nextLine();
//        System.out.println(replBeakWithCensor(replayText));
//    }
//private static String replBeakWithCensor(String text) {
//    text = text.replaceAll("Бяка", "[вырезано цензурой]");
//    text = text.replaceAll("БЯка", "[вырезано цензурой]");
//    text = text.replaceAll("БЯКа", "[вырезано цензурой]");
//    text = text.replaceAll("БЯКа", "[вырезано цензурой]");
//    text = text.replaceAll("БЯКА", "[вырезано цензурой]");
//    text = text.replaceAll("бяка", "[вырезано цензурой]");
//    text = text.replaceAll("бЯка", "[вырезано цензурой]");
//    text = text.replaceAll("бяКа", "[вырезано цензурой]");
//    text = text.replaceAll("бякА", "[вырезано цензурой]");
//    text = text.replaceAll("БякА", "[вырезано цензурой]");
//    text = text.replaceAll("БяКА", "[вырезано цензурой]");
//    text = text.replaceAll("бЯКА", "[вырезано цензурой]");
//    return text;
//}

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

}
