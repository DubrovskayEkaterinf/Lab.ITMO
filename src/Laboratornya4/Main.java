package Laboratornya4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
//    public static void main(String[] args) {
//        //Задание 1.1.
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }
//        //Задание 1.2.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("Делится на 3 и на 5: " + i);
//            else if (i % 3 == 0)
//                System.out.println("Делится на 3: " + i);
//            else if (i % 5 == 0)
//                System.out.println("Делится на 5: " + i);
//        }
//        // Задание 1.3.
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
//        if ((intA + intB) == intC)
//            System.out.println("True");
//        else
//            System.out.println("False");
//
//        // Задание 1.4.
//        int d;
//        int e;
//        int f;
//
//        System.out.println("Введите первое число: ");
//        int intD = Integer.parseInt(scanner.next());
//        System.out.println("Введите второе число: ");
//        int intE = Integer.parseInt(scanner.next());
//        System.out.println("Введите третье число: ");
//        int intF = Integer.parseInt(scanner.next());
//        if ((intA < intB && intC > intB))
//            System.out.println("True");
//        else
//            System.out.println("False");
//    }
//}

//        // Задание 1.5.
//        public static void main(String[] args) {
//
//           Scanner sc = new Scanner(System.in);
//            int lengthArray;
//            while (true) {
//                System.out.println("Ввести массив. Он должен быть не меньше, чем 2");
//                lengthArray = sc.nextInt();
//                if (lengthArray >= 2) {
//                    break;
//                }
//            }
//
//            System.out.println("Заполните массив");
//            int[] numbers = inputArray(lengthArray);
//            sc.close();
//
//            String arrayAsString = getNumsFromArr(numbers);
//            System.out.println("array = " + arrayAsString);
//            System.out.println(CheckAppearNumbers(numbers));
//        }
//        public static int[] inputArray(int lengthArray) {
//        int[] numbers = new int[lengthArray];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < lengthArray; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        sc.close();
//        return numbers;
//    }
//    private static String getNumsFromArr(int[] nums) {
//        String s = "";
//        for (int i = 0; i < nums.length - 1; i++) {
//            s += Integer.toString(nums[i]) + ", ";
//        }
//        return s + Integer.toString(nums[(nums.length - 1)]);
//    }
//    private static boolean CheckAppearNumbers(int[] numbers) {
//        return numbers[0] == 3 || numbers[numbers.length - 1] == 0;
//    }
//}

    //// Задание 1.6.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int lengthArray;
//        while (true) {
//            System.out.println("Ввести массив. Он должен быть не меньше, чем 2");
//            lengthArray = sc.nextInt();
//            if (lengthArray >= 2) {
//                break;
//            }
//        }
//        System.out.println("Заполните массив");
//        int[] numbers = inputArray(lengthArray);
//        sc.close();
//        System.out.println(containsOneOrThree(numbers));
//    }
//    public static int[] inputArray(int lengthArray) {
//        int[] numbers = new int[lengthArray];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < lengthArray; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        sc.close();
//        return numbers;
//    }
//    private static String getNumbersFromArray(int[] nums) {
//        String s = "";
//        for (int i = 0; i < nums.length - 1; i++) {
//            s += Integer.toString(nums[i]) + ", ";
//        }
//        return s + Integer.toString(nums[(nums.length - 1)]);
//    }
//    private static boolean containsOneOrThree(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 1 || numbers[i] == 3) {
//                return true;
//            }
//        }
//        return false;
//    }
//}

//    public static int[] main(String[] args) {
    //       // Задание 2.1.
//        int[] array = {5, 7, 6, 3, 4};
//        boolean sorted = true;
//        if (array[0] <= array[1]) {
//            for (int i = 2; i < array.length; i++) {
//                if (array[i] < array[i - 1]) {
//                    sorted = false;
//                    break;
//                }
//            }
//            if (sorted) {
//                System.out.println("OK");
//            } else {
//                System.out.println("Please, try again");
//            }
//        }
    //       // Задание 2.2.
//        System.out.println("Введите длину массива");
//            Scanner sc = new Scanner(System.in);
//            int lengthArray = sc.nextInt();
//            System.out.println("Array length: " + lengthArray);
//            System.out.println("Введите числа своего массива");
//            int[] numbers = new int[lengthArray];
//            for (int i = 0; i < lengthArray; i++) {
//                numbers[i] = sc.nextInt();
//            }
//            sc.close();
//            System.out.println("Result: " + Arrays.toString(numbers));
//            }
//    }

    //          // Задание 2.3.
//        public static void main(String[] args) {
//        int[] myNum = {5, 6, 7, 2};
//        System.out.println("Arrya 1:" + Arrays.toString(myNum));
//        String temp = String.valueOf(myNum[0]);
//        myNum[0] = myNum[3];
//        myNum[3] = Integer.parseInt(temp);
//        System.out.println("Arrya 2:" + Arrays.toString(myNum));
//    }
//}

//      // Задание 2.4.
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 1, 2, 4};
//        int num = getFirUniqNum(numbers); //идем в метод поиска первого уникального числа
//        System.out.println("Уникальное число: " + num);
//    }
//    private static int getFirUniqNum(int[] array) {
//        int result = array[0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && i != j) {
//                    break;
//                } else if (j == array.length - 1) {
//                    return array[i];
//                }
//            }
//        }
//        return result;
//    }

    // Задание 2.5.

    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
       Scanner sc = new Scanner(System.in);
        int lengthArray = 10;
        int upperBound = 100;

        int[] numbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = sc.nextInt();

            int[] randNums = getRandNumsArr(numbers);
            System.out.println("Созданный массив: " + Arrays.toString(randNums));

        int[] sortedWithMergeArray = sortMerge(randNums);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedWithMergeArray));

        }
    }
        private static int[] getRandNumsArr(int[] nums) {
            Random random = new Random();

            int[] randNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                randNums[i] = random.nextInt(100);
            }
            return randNums;
        }

                private static int[] sortMerge(int[] randNums){

                    if (randNums.length == 0 || randNums.length == 1) {
                        return randNums;
                    }
                    int middle = randNums.length / 2;
                    int[] leftArray = new int[middle];
                    int[] rightArray;

                    if (randNums.length % 2 == 0) {
                        rightArray = new int[middle];
                    } else {
                        rightArray = new int[middle + 1];
                    }

                    for (int i = 0; i < leftArray.length; i++) {
                        leftArray[i] = randNums[i];
                    }

                    for (int i = 0; i < rightArray.length; i++) {
                        rightArray[i] = randNums[middle + i];
                    }


                    leftArray = sortMerge(leftArray);
                    rightArray = sortMerge(rightArray);

                    return mergePartSort(leftArray, rightArray);
                }


                private static int[] mergePartSort ( int[] leftArray, int[] rightArray){
                    int[] result = new int[leftArray.length + rightArray.length];

                    int leftPointer = 0;
                    int rightPointer = 0;
                    int resultPointer = 0;

                    while (leftPointer < leftArray.length || rightPointer < rightArray.length) {
                        if (leftPointer < leftArray.length && rightPointer < rightArray.length) {
                            if (leftArray[leftPointer] < rightArray[rightPointer]) {
                                result[resultPointer++] = leftArray[leftPointer++];
                            } else {
                                result[resultPointer++] = rightArray[rightPointer++];
                            }
                        } else if (leftPointer < leftArray.length) {
                            result[resultPointer++] = leftArray[leftPointer++];
                        } else if (rightPointer < rightArray.length) {
                            result[resultPointer++] = rightArray[rightPointer++];
                        }
                    }
                    return result;
                }


    //5.1 метод для заполнения массива рандомными числами



}






