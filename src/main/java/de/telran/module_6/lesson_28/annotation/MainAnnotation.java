package de.telran.module_6.lesson_28.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@HelloAnnotation(value = "Class", number = 1)
@Deprecated
public class MainAnnotation {

    @HelloAnnotation(value = "Field", number = 2)
    private int priv = 1111;

    // @HelloAnnotation не разрешено @Retention
    public MainAnnotation(int priv) {
        this.priv = priv;
    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        MainAnnotation ma = new MainAnnotation(222);
        ma.sayHi();

        // Reflection класса
        Class clazz = ma.getClass();
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annot : annotations) {
            System.out.println("Annotation Type: " + annot.annotationType());
        }

        // Аннотации методов
        Method m = clazz.getMethod("sayHi");
        annotations = m.getAnnotations(); // все аннотации, которім помечен метод


        Field f = clazz.getDeclaredField("priv");
        HelloAnnotation annotation = f.getAnnotation(HelloAnnotation.class);
        System.out.println("Value = "+annotation.value());
        System.out.println("Number = "+annotation.number());

    }

    @HelloAnnotation(number = 2)
    public void sayHi() {
        System.out.println("Hi -> "+priv);
    }
}
