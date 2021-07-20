package basicsJava;

import java.util.Scanner;

public class LunaWeight {
    /**
     * стр 61 Шилдт, Основы. задание №9
     * Сила тяжести на Луне составляет 17% земной. Напишите программу,
     * которая бы вычислила ваш вес на Луне.*/
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш вес: ");
        float earthWeight = console.nextFloat();
        float lunaWeight = (float) (earthWeight * 0.17);
        System.out.println("Ваш вес на Луне равен: " + lunaWeight);
        System.out.println("Срочно летим на Луну... :-)");
    }
}
