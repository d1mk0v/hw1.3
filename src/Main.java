public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 150;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 320;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 26400L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.17f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 5.26568;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte j = 67;
        System.out.println(j);
            }
    public static void task3(){
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalPupils = class1 + class2 + class3;
        short totalPapers = 480;
        int eachStudentPaper = totalPapers / totalPupils;
        System.out.println("На каждого ученика рассчитано " + eachStudentPaper + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4");
        int minuteMachinePerformance = 16 / 2;
        int time1 = 20;
        int performance1 = minuteMachinePerformance * time1;
        System.out.println("За " + time1 + " минут машина произвела " + performance1 + " бутылок");
        int time2 = 1 * 24 * 60;
        int performance2 = minuteMachinePerformance * time2;
        System.out.println("За сутки машина произвела " + performance2 + " бутылок");
        int time3 = 3 * 24 * 60;
        int performance3 = minuteMachinePerformance * time3;
        System.out.println("За 3 дня машина произвела " + performance3 + " бутылок");
        int time4 = 30 * 24 * 60;
        int performance4 = minuteMachinePerformance * time4;
        System.out.println("За месяц машина произвела " + performance4 + " бутылок");
    }
    public static void task5(){
        int neededToRemoteSchool = 120;
        int whiteColorInOneClass = 2;
        int brownColorInOneClass = 4;
        int totalClasses = neededToRemoteSchool / (whiteColorInOneClass + brownColorInOneClass);
        int totalWhiteColor = totalClasses * 2;
        int totalBrownColor = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");

    }
}
