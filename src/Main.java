public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        short eachStudentPaper = (short) (totalPapers / totalPupils);
        System.out.println("На каждого ученика рассчитано " + eachStudentPaper + " листов бумаги");
    }
}