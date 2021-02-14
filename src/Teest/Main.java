package Teest;

public class Main {

    public static void main(String[] args) {
        //homeWork
//        byte bYte = 2;
//        short sHort = 123;
//        int iNt = 10123123;
//        long lOng = 12312413;
//
//        float fLoat = 42.5f;
//        double dOuble = 5235.21;
//
//        char cHar = 'c';
//
//        boolean tbOolean = true;
//        boolean fbOolean = false;

        float lesson1 = homeWork1();
        System.out.println(lesson1);

        boolean lesson2 = homeWork2(5,6);
        System.out.println(lesson2);

        homeWork3(-234);

        boolean lesson4 = homeWork4(-434);
        System.out.println(lesson4);

        String name = "Vadim";
        homeWork5(name);

        homeWork6(2022);



    }
    static float homeWork1 () {
        float a = 23.3f;
        float b = 23.43f;
        float c = 545.34f;
        float d = 34.434f;
        float x = (a*(b+(c/d)));
        return (x);
    }
    static boolean homeWork2 (int a,int b) {
        boolean x = false;
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            x = true;
            return x;
        } else {
            return x;
        }
    }
    static void homeWork3(int a){
        if (a >= 0) {
            System.out.println(a + " Число положительное");
        } else {
            System.out.println(a + " Число отрицательное");
        }
    }
    static boolean homeWork4(int a){
        boolean x = false;
        if (a >=0 ) {
            return x;
        } else {
            x = true;
            return x;
        }
    }
    static void homeWork5(String a){

        System.out.println("Привет, "+a);
    }
    static void homeWork6 (int a) {
        if (a % 4 == 0 || a % 400 ==0 ) {
            if (a % 100 ==0 && a % 400 !=0) {
                System.out.println(a+" не високосный год");
            } else
                System.out.println(a+" високосный год");
        } else {
            System.out.println(a+" не високосный год");
        }
    }
}

