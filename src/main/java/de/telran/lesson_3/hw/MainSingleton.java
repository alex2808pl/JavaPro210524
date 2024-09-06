package de.telran.lesson_3.hw;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonStatic s1 = SingletonStatic.getInstance("1111111");
        System.out.println(s1);

        SingletonStatic s2 = SingletonStatic.getInstance("2222222");
        System.out.println(s2);

        SingletonStatic s3 = SingletonStatic.getInstance("55555");
        System.out.println(s3);


        System.out.println(s1.value);
        System.out.println(s3.value);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        // Singleton через static
        CoffeeMachine cm = CoffeeMachine.INSTANCE;

        CoffeeMachine.INSTANCE.cappuccino();
        CoffeeMachine.INSTANCE.latte();
        CoffeeMachine.INSTANCE.espresso();

        // Singleton через enum
        CoffeeMachineEnum cme = CoffeeMachineEnum.INSTANCE;
        CoffeeMachineEnum.INSTANCE.makeAmericano();

    }
}
