package Laboratornya6.Task1;

public abstract class Client extends Person implements infoPers {
    private final String nameBank;
    private int visit;
    private int monye;

    public Client(String nameBank, String name, String surname) {
        super(name, surname);
        this.nameBank = nameBank;
    }


    @Override
    public void getIformOutput() {
        System.out.println("Банк" + this.nameBank);
        System.out.println("Клиент" + this.getName() + " " + this.getSurname());

    }

    public void getManye() {
        if (isNumberOfSessions(visit)){
            System.out.println("Клиент не обналичивал деньги");
        } else {
            System.out.println("Клиент снял" + monye + "тугриков");
        }

    }
    private boolean isNumberOfSessions(int visit) {
        return visit ==0;

    }
    public void addManye() {
        for (int i = 0; i < visit; i++) {
            monye++;
        }

    }



    }








