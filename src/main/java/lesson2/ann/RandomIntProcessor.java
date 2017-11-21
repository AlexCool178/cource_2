package lesson2.ann;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntProcessor {

    private RandomIntProcessor(){}

    public static void startProcess(RandomIntTest test) throws IllegalAccessException {

    //    Class classOfTest = test.getClass();
        Class classOfTest = RandomIntTest.class;
        final Field[] fields = classOfTest.getDeclaredFields();
        for (Field field : fields){
           final Annotation[] annotations = field.getAnnotations();
           for (Annotation annotation : annotations){
               System.out.println(annotation.toString());
           }
           final RandomInt annotation = field.getAnnotation(RandomInt.class);
            if (annotation != null){
                Random random = new Random();
                int RandomNumber = random.nextInt(Math.abs(annotation.max())
                        + Math.abs(annotation.min())) - Math.abs(annotation.min());
                field.setAccessible(true);
                field.set(test, RandomNumber);
            }
        }

    }
}
