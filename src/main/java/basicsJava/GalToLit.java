package basicsJava;

public class GalToLit {
    /*Упражнение 1.1
    * Программа перевода галлонов в литры.
    * Присвойте файлу с исходным кодом имя GalToLit.java.
    * */
    public static void main(String[] args) {
        double gallons; // в этой переменной хранится значение,
                        // выражающее объем жидкости в галлонах.
        double liters;  // в этой пременной хранится значение,
                        // выражающее объем жидкости в литрах.
        gallons = 10;   // начальное значение соотвествует 10 галлонам.
        liters = gallons * 3.7854; // перевод в литры
        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
