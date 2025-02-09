
//№ 1
//Создайте строку через new - I study Basic Java!
//        Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать строку Java c помощью метода String.substring().


public class Task1 {
    public void execute() {
        String myString = new String("I study Basic Java!");
        metodforstring(myString);

    }
}


//
//public class Task1 {
//    public void execute() {
//        System.out.println("\nTask 1: Примитивные и ссылочные типы");
//        printPrimitiveTypes();
//        printReferenceTypes();
//    }
//
//    private void printPrimitiveTypes() {
//        char charValue = 'G';
//        int intValue = 89;
//        byte byteValue = 4;
//        short shortValue = 56;
//        float floatValue = 4.7333436f;
//        double doubleValue = 4.355453532;
//        long longValue = 12121L;
//        System.out.println("Примитивные типы:");
//        System.out.printf("char: %c, int: %d, byte: %d, short: %d, float: %.7f, double: %.9f, long: %d%n",
//                charValue, intValue, byteValue, shortValue, floatValue, doubleValue, longValue);
//    }
//
//    private void printReferenceTypes() {
//        Character charObject = 'G';
//        Integer intObject = 89;
//        Byte byteObject = 4;
//        Short shortObject = 56;
//        Float floatObject = 4.7333436f;
//        Double doubleObject = 4.355453532;
//        Long longObject = 12121L;
//        System.out.println("\nСсылочные типы:");
//        System.out.printf("Character: %c, Integer: %d, Byte: %d, Short: %d, Float: %.7f, Double: %.9f, Long: %d%n",
//                charObject, intObject, byteObject, shortObject, floatObject, doubleObject, longObject);
//    }
//}



