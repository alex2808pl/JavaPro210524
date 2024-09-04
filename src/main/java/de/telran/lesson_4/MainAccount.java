package de.telran.lesson_4;
import de.telran.lesson_4.Account;

public class MainAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1234, 111);
        System.out.println("Account: "+account1.getId() + " -> "+ account1.getSum());
        // Account account2 = new Account("DE1234", 111); //нельзя передать String

        // ---- Счет с Object
        AccountObject accountObject1 = new AccountObject(1234, 111); // Object id = new Integer(1234);
        System.out.println("AccountObject: "+accountObject1.getId() + " -> "+ accountObject1.getSum());
        AccountObject accountObject2 = new AccountObject("DE1234", 222); // Object id = new String("DE1234");
        System.out.println("AccountObject: "+accountObject2.getId() + " -> "+ accountObject2.getSum());
        // Наша большая проблема, можно передать в переменную id любой ссылочный тип данных
        AccountObject accountObject3 = new AccountObject(true, 333); // Object id = new Boolean(true);
        System.out.println("AccountObject: "+accountObject3.getId() + " -> "+ accountObject3.getSum());


        // --- Счет с Generic типом
        AccountGeneric<Integer> accountGeneric1 = new AccountGeneric<Integer>(1234, 111);
        System.out.println("AccountGeneric: "+accountGeneric1.getId() + " -> "+ accountGeneric1.getSum());
        // Включается проверка типа и создание такого объекта невозможно
        //AccountGeneric<Integer> accountGeneric2 = new AccountGeneric<Integer>("DE1234", 111);

        AccountGeneric<String> accountGeneric2 = new AccountGeneric<>("DE1234", 222);
        System.out.println("AccountGeneric: "+accountGeneric2.getId() + " -> "+ accountGeneric2.getSum());

        //accountGeneric1 = accountGeneric2;  //нельзя //AccountGeneric<Integer> не точно такой же тип как  AccountGeneric<String>

        AccountGeneric<Integer> accountGeneric3 = new AccountGeneric<Integer>(5678, 333);
        System.out.println("AccountGeneric: "+accountGeneric3.getId() + " -> "+ accountGeneric3.getSum());

        accountGeneric1 = accountGeneric3; // коректно
        System.out.println("AccountGeneric: "+accountGeneric1.getId() + " -> "+ accountGeneric1.getSum());

        // !!!!!! Если не указать тип данных, то шаблонный тип автоматом станет Object
        // !!!!!! Нельзя использовать, оставлен только для совместимости со старым кодом
        AccountGeneric accountGeneric4 = new AccountGeneric(true, 666); //аналогично AccountGeneric<Object>
        System.out.println("AccountGeneric: "+accountGeneric4.getId() + " -> "+ accountGeneric4.getSum());


        AccountTwoParamGeneric<Integer, Double> accountTwoParamGeneric1 = new AccountTwoParamGeneric<>(1234, 111.01);
        System.out.println("AccountTwoParamGeneric: "+accountTwoParamGeneric1.getId() + " -> "+ accountTwoParamGeneric1.getSum());

        AccountTwoParamGeneric<Integer, Integer> accountTwoParamGeneric2 = new AccountTwoParamGeneric<>(1234, 111);
        System.out.println("AccountTwoParamGeneric: "+accountTwoParamGeneric2.getId() + " -> "+ accountTwoParamGeneric2.getSum());

        // Шаблонный интерфейс
        AccountInterface1 accountInterface1 = new AccountInterface1(1234, 111);
        System.out.println("AccountInterface1: "+accountInterface1.getId() + " -> "+ accountInterface1.getSum());

        AccountInterface2<Double> accountInterface2 = new AccountInterface2<>(1234, 111.01);
        System.out.println("AccountInterface2: "+accountInterface2.getId() + " -> "+ accountInterface2.getSum());

        AccountIntarface3<String, Double> accountIntarface3 = new AccountIntarface3<>("DE1234", 222.02);
        System.out.println("AccountInterface3: "+accountIntarface3.getId() + " -> "+ accountIntarface3.getSum());
        accountIntarface3.print();

        AccountIntarface4<String, Double> accountIntarface4 = new AccountIntarface4<>("DE1234", 222.02);
        System.out.println("AccountInterface4: "+accountIntarface4.getId() + " -> "+ accountIntarface4.getSum());


    }
}
