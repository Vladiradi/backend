
//№ 1
//Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Заменить все
// символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать строку Java c помощью метода String.substring().


public class Task1 {
    public void execute() {
        String myString = new String("I study Basic Java!");
        metodforstring(myString);

    }
}







    private void printReferenceTypes() {
        Character charObject = 'G';
        Integer intObject = 89;
        Byte byteObject = 4;
        Short shortObject = 56;
        Float floatObject = 4.7333436f;
        Double doubleObject = 4.355453532;
        Long longObject = 12121L;
        System.out.println("\nСсылочные типы:");
        System.out.printf("Character: %c, Integer: %d, Byte: %d, Short: %d, Float: %.7f, Double: %.9f, Long: %d%n",
                charObject, intObject, byteObject, shortObject, floatObject, doubleObject, longObject);
    }
}






public class Task1 {
    public void execute() {
        // 1. Создание строки через оператор new
        String myString = new String("I study Basic Java!");

        // 2. Вызов метода для работы со строкой
        manipulateString(myString);
    }

    /**
     * Метод выполняет различные операции со строкой:
     * - Выводит последний символ строки
     * - Проверяет, содержит ли строка подстроку "Java"
     * - Заменяет все символы 'a' на 'o'
     * - Преобразует строку в верхний и нижний регистры
     * - Вырезает слово "Java"
     *
     * @param inputString Входная строка
     */
    private void manipulateString(String inputString) {
        // 1. Получение последнего символа строки
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 2. Проверка, содержит ли строка подстроку "Java"
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\"? " + containsJava);

        // 3. Замена всех символов 'a' на 'o'
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // 4. Преобразование строки в верхний регистр
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 5. Преобразование строки в нижний регистр
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 6. Вырезание подстроки "Java" с помощью substring()
        int startIndex = inputString.indexOf("Java");
        if (startIndex != -1) { // Если "Java" присутствует в строке
            String subStringJava = inputString.substring(startIndex, startIndex + 4);
            System.out.println("Вырезанная подстрока: " + subStringJava);
        } else {
            System.out.println("Подстрока 'Java' не найдена в строке.");
        }
    }

    // Метод main для запуска программы
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.execute();
    }
}


