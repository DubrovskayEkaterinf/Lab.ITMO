package Laboratornya4;

import Laboratornya2.RunShoes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    //Задание 1.1.
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 100; i++ ) {
//            if (i % 2 != 0)
//                System.out.println("i = " + i);
//        }
//
//    // Задание 1.2.
//public static void main(String[] args) {
//    for (int i = 1; i <= 100; i++ ) {
//        if (i%3 == 0 && i%5 ==0)
//            System.out.println("Делится на 3 и на 5: " + i);
//           else if (i % 3 == 0)
//                System.out.println("Делится на 3: " + i);
//            else if (i % 5 == 0)
//                System.out.println("Делится на 5: " + i);
//        }
//
//}
//    //    Задание 1.3.
//    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int intA = Integer.parseInt(scanner.next());
//        System.out.println("Введите второе число: ");
//        int intB = Integer.parseInt(scanner.next());
//        System.out.println("Введите третье число: ");
//        int intC = Integer.parseInt(scanner.next());
//        if ((intA+intB) == intC )
//            System.out.println("True");
//        else
//            System.out.println("False");
//
//        }

//    //    Задание 1.4.
//    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int intA = Integer.parseInt(scanner.next());
//        System.out.println("Введите второе число: ");
//        int intB = Integer.parseInt(scanner.next());
//        System.out.println("Введите третье число: ");
//        int intC = Integer.parseInt(scanner.next());
//        if ((intA < intB && intC > intB))
//            System.out.println("True");
//        else
//            System.out.println("False");
//
//        }

//    //    Задание 1.5.
//    public static void main(String[] args) {
//
//        int[] numArray = {3,-3,7,4,5,4,3};
//        System.out.print("array = ");
//        for (int num : numArray) {
//        System.out.print(num);}
//
//    System.out.println((numArray[0] == 3 || numArray[numArray.length - 1] == 3));}
//


//    //    Задание 1.6.
//    public static void main(String[] args) {
//       String [] values = {Arrays.toString(new int[]{3, 15, 6, 4, 1})};
//        String target = String.valueOf(1);
//        String target2 = String.valueOf(3);
//        boolean found = Arrays.toString(values).contains(target);
//        boolean found2 = Arrays.toString(values).contains(target2);
//        System.out.println(found);
//        System.out.println(found2);
//    }



//    //    Задание 2.1.
//    public static void main(String[] args) {
//        int[] array = {5,7,6,3,4};
//
//        boolean sorted= true;
//
//        if (array[0] <= array[1]) {
//
//            for (int i = 2; i < array.length; i++) {
//                if (array[i] < array[i - 1]) {
//                    sorted = false;
//                    break;
//                }
//            }
//            if (sorted) {
//                System.out.println("OK");
//            }
//            else {
//                System.out.println("Please, try again");
//            }
//        }
//    }


//    //    Задание 2.2.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Array length: ");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//        System.out.println("Numbers of array:");
//        for (int i = 0; i < length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("Result: " + Arrays.toString(array));
//    }

//    //    Задание 2.3.
//
//    public static void main(String[] args) {
//        int[] myArrya ={5, 6, 7, 2};
//        System.out.println("Arrya 1:" + Arrays.toString(myArrya));
//        String temp = String.valueOf(myArrya[0]);
//        myArrya[0] = myArrya[3];
//        myArrya[3] = Integer.parseInt(temp);
//        System.out.println("Arrya 2:" + Arrays.toString(myArrya));
//    }

    //    Задание 2.4.

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 1, 2, 4};
        for (int i = 0; i < myArray.length; i++){
            int count1 = 0;
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[i] == myArray[j]){
                    count1++;
                    if (count1 == 0)
                    System.out.println(myArray[i]);
                }
            }
        }
    }


}






