package Laboratornya6.Task5;

public class HeirClass extends MainClass{
    @Override
    public String getName() {
        super.getName();
        return name;
    }

    @Override
    public void setName() {
        super.setName(name);
    }

    @Override
    public String getMainClass() {
        super.getMainClass();
        System.out.println("Введите имя пользователя ");
        name = scanner.next();
        return "Имя пользователя: " + name;
    }
    public static void main(String [] args) {
        HeirClass heirClass = new HeirClass();
        System.out.println(heirClass.getMainClass());
    }
    }



