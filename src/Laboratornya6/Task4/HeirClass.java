package Laboratornya6.Task4;

public class HeirClass extends MainClass {
    @Override
    public int getNum() {
        return super.getNum();
    }

    @Override
    public void setNum(int num) {
        super.setNum(num);
    }
    public static void main (String [] args) {
        HeirClass heirClass = new HeirClass();
        System.out.println(heirClass.getNumMainClass());
    }
private int getNumMainClass(){
        return getNum();
}

}
