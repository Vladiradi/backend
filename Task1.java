
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
        manipulateString(myString);
    }

    private void manipulateString(String inputString) {
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\"? " + containsJava);

        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);


        int startIndex = inputString.indexOf("Java");
        if (startIndex != -1) {
            String subStringJava = inputString.substring(startIndex, startIndex + 4);
            System.out.println("Вырезанная подстрока: " + subStringJava);
        } else {
            System.out.println("Подстрока 'Java' не найдена в строке.");
        }
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.execute();
    }
}




