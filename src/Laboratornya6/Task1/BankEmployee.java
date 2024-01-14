package Laboratornya6.Task1;

public abstract class  BankEmployee extends Person implements infoPers {
private String nameBank;
private String today;
int countClient = 0;
    public BankEmployee(String nameBank, String name, String surname) {
        super(name, surname);
        this.nameBank = nameBank;
    }


    public BankEmployee(String name, String surname) {
        super(name, surname);
    }


    @Override
    public void getClient() {
        if (isNonWorkingDay(today)){
        System.out.println("Сотрудник выходной");
        } else {
            System.out.println("Сотрудник принял" + countClient + "клиентов");
        }
    }
    @Override
    public void addClient() {
        int workTime = 12;
for (int i = 0; i < workTime; i++);
countClient++;
    }

    private boolean isNonWorkingDay(String day) {
        return day == "Суббота" || day == "Воскресенье" || day == "Праздник/отпуск";
    }
}
