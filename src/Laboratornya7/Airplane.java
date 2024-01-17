package Laboratornya7;


public class Airplane {
private static int wingWeight;

static class Wing{
    int getStaticWingWeight() {
        return wingWeight;
    }
    void setStaticWingWeight(int i) {
        Airplane.wingWeight = i;
    }
}

    public static void main(String[] args) {
        Airplane.Wing wingObj = new Airplane.Wing();
        Airplane.wingWeight = 500;
        System.out.println("Крыло самолета = " + wingObj.getStaticWingWeight());
        wingObj.setStaticWingWeight(450);
        System.out.println("Крыло =" + Airplane.wingWeight);
    }
}
