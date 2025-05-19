package task02;
//Одна компания решила заработать миллион. Для этого они решили создать курсы, где за 1000
//можно обучиться чему-то очень интересному и полезному:
//они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
//        Напишите программу, которая даст возможность набирать студентов на курс до тех пор,
//пока компания не заработает миллион :) Подумайте, можно ли использовать класс AtomicInteger для накопления.
//        (Нужно дописать условия, например что преподаватель обучает группу из 10 человек)

import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class CourseLearn {

    private static final int COURSE_PRICE = 1000;
    private static final int PROFIT_GOAL = 1_000_000;
    private static final int STUDENTS_PER_GROUP = 10;
    private static final AtomicInteger totalCompanyProfit = new AtomicInteger(0);
    private static final AtomicInteger totalTeacherEarnings = new AtomicInteger(0);
    private static final AtomicInteger totalStudentCount = new AtomicInteger(0);

    public static void main(String[] args) {
        int numberOfThreads = 5;
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(CourseLearn::enrollStudents);
            threads[i].start();
        }


        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


        System.out.println("\n✅ The company has reached its profit goal!");
        System.out.println(" Total students enrolled: " + totalStudentCount.get());
        System.out.println("Total company profit: €" + totalCompanyProfit.get());
        System.out.println("Total teacher earnings: €" + totalTeacherEarnings.get());
    }

    private static void enrollStudents() {
        while (true) {
            int currentProfit = totalCompanyProfit.get();


            if (currentProfit >= PROFIT_GOAL) {
                break;
            }
            totalStudentCount.incrementAndGet();


            int teacherShare = COURSE_PRICE / 10;
            int companyShare = COURSE_PRICE - teacherShare;

            totalCompanyProfit.addAndGet(companyShare);
            totalTeacherEarnings.addAndGet(teacherShare);
            if (totalStudentCount.get() % STUDENTS_PER_GROUP == 0) {
                System.out.println("📢 A new group of " + STUDENTS_PER_GROUP + " students has been formed.");
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}