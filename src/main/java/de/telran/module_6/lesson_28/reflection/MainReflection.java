package de.telran.module_6.lesson_28.reflection;

import java.awt.image.SampleModel;
import java.lang.reflect.*;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
        // Создаем объект для последующей проверки свойств
        Sample sample = new Sample();

        Class cls = sample.getClass(); //возвращаем ссылку на Class из конкретного объект
        System.out.println("Имя класса (длинное) — " + cls.getName());
        System.out.println("Имя класса (короткое)— " + cls.getSimpleName());
        // Получаем имя конструктора класса с помощью объекта
        Constructor constructor = cls.getConstructor();
        System.out.println("Имя конструктора по умолчанию — " + constructor.getName());

        Constructor[] constructors = cls.getConstructors();
        for (Constructor constr : constructors) {
            System.out.println("Имя конструктора — " + constr.getName());
        }

        System.out.println("Это публичные методы классов: ");
        Method methPublic = cls.getMethod("methPublic");
        System.out.println("Нашли метод - "+methPublic.getName());

        // Публичные методы
        Method[] publicMethods = cls.getMethods();
        for (Method method : publicMethods) {
            System.out.println("public метод - "+method.getName());
        }
        // Все методы (не показывает методы предков)
        Method[] allMethods = cls.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println(" метод - "+method.getName());
        }

        // Вызываем метод через рефлекцию
        methPublic = cls.getMethod("methPublic"); //публичный
        methPublic.invoke(sample); //запускаем метод

        // Вызываем метод через рефлекцию
        Method meth = cls.getDeclaredMethod("methPrivate"); //приватный
        meth.setAccessible(true); //просим доступ для private
        meth.invoke(sample); //запускаем метод

        // Вызываем метод с параметрами через рефлекцию
        meth = cls.getDeclaredMethod("methProtected", int.class);
        meth.invoke(sample, 25);

        // Вызываем метод с 2 параметрами через рефлекцию
        meth = cls.getDeclaredMethod("methDefault", int.class, double.class);
        meth.invoke(sample, 25, 13.01);

        // Вызываем метод с неизвестным количеством параметрами через рефлекцию
        System.out.println("Cумма = "+sample.methPublicVarArgs(1,2,3,4,5,6)); // стандартный вызов

        // Как візвать varargs с помощью reflection?
//        meth = cls.getMethod("methPublicVarArgs", int[].class);
//        meth.invoke(sample, 1,2,3,4,5,6);

        // --- Получаем перечень всех публичных характеристик класса
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        System.out.println("Все характеристики");
        fields = cls.getDeclaredFields(); //все характеристики
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field field = cls.getDeclaredField("priv");
        field.setAccessible(true); //открываем доступ
        System.out.println(field.getName()+" = "+field.get(sample));
        field.set(sample, "Я исправленный через рефлексию private");
        System.out.println(field.getName()+" = "+field.get(sample));
        field.setAccessible(false); //закрываем доступ

        //Создание объекта класса c помощью Reflection
        Class clazz = Class.forName(Sample.class.getName());
        //Конструктор по умолчанию
        Sample sampleRefl = (Sample) clazz.getConstructor().newInstance();
        sampleRefl.methPublic();

        //Используем private конструктор с параметрами
        Class strClass = String.class; //еще одна возможность вернуть ссылку на объект Class
        Class[] params = {strClass, String.class};
        constructor = clazz.getDeclaredConstructor(params);
        constructor.setAccessible(true);
        sampleRefl = (Sample) constructor.newInstance("arg1", "arg2");

        sampleRefl.methProtected(33);


    }
}
