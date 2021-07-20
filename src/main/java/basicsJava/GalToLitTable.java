package basicsJava;

public class GalToLitTable {
    /*  Упражнение 1.2.
    * Эта парограмма отображает таблицу перевода галлонов влитры.
    * Присвойте файлу с исходным кодом имя GalToLitTable.java.
    */
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //преобразование в литры
            System.out.println(gallons + " галлонам соответствует " + liters + " литра.");
            counter++; // <-- увеличивает значение счетчика на +1 с каждой итерацией.
            if (counter == 10) { // если значение счетчика равно 10 - вывести пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }


    }
}
