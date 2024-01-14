package Laboratornya6.Task5;

import java.util.Scanner;

public abstract class MainClass {
  public String name;
    public int age;
    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = scanner.next();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = scanner.nextInt();
    }

    public abstract void setName();

    public String getMainClass() {
        System.out.println("Введите возраст пользоателя");
        age = scanner.nextInt();
        return ("Возраст пользователя: " + age);
    }

}
