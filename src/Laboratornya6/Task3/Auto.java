package Laboratornya6.Task3;

public class Auto {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut () {
        System.out.println("Вес" + model + "состовляет" + weight + "кг.");
        System.out.println("Цвет машины - " + color + "и ее скорость - " + speed);
    }

    public Auto(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
            }
            public Auto () {}
}
