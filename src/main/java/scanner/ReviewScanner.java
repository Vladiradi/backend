package scanner;

import annotation.Review;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ReviewScanner {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java scanner.ReviewScanner <fully.qualified.ClassName> …");
            System.exit(1);
        }
        for (String className : args) {
            try {
                Class<?> cls = Class.forName(className);
                scanClass(cls);
            } catch (Exception e) {
                System.err.println("Error loading " + className + ": " + e.getMessage());
            }
        }
    }

    private static void scanClass(Class<?> cls) {

        if (cls.isAnnotationPresent(Review.class)) {
            Review r = cls.getAnnotation(Review.class);
            System.out.printf("CLASS       %s, %s, %s%n",
                    cls.getSimpleName(), r.reviewedBy(), r.comment());
        }

        for (Constructor<?> ctor : cls.getDeclaredConstructors()) {
            if (ctor.isAnnotationPresent(Review.class)) {
                Review r = ctor.getAnnotation(Review.class);
                System.out.printf("CONSTRUCTOR %s, %s, %s%n",
                        cls.getSimpleName(), r.reviewedBy(), r.comment());
            }
        }

        for (Field f : cls.getDeclaredFields()) {
            if (f.isAnnotationPresent(Review.class)) {
                Review r = f.getAnnotation(Review.class);
                System.out.printf("FIELD       %s, %s, %s%n",
                        f.getName(), r.reviewedBy(), r.comment());
            }
        }

        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Review.class)) {
                Review r = m.getAnnotation(Review.class);
                System.out.printf("METHOD      %s, %s, %s%n",
                        m.getName(), r.reviewedBy(), r.comment());
            }
        }
    }
}