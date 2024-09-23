package de.telran.module_3.lesson_12;

public class Calc {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3,5));
        System.out.println(sum(2,8));

        // реализацияю интерфейса через именованный класс
        MyOperation myOperationName = new SumMyOperation();
        System.out.println("myOperationName = " + myOperationName.operation(1, 2));

        // реализацияю интерфейса через анонимный класс
        MyOperation myOperationSum = new MyOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        System.out.println("myOperation = " + myOperationSum.operation(1, 2));

        MyOperation myOperationDiv = new MyOperation() {
            @Override
            public int operation(int x, int y) {
                return x / y;
            }
        };

        System.out.println("myOperationDiv = "+myOperationDiv.operation(12, 3));

        System.out.println("Sum = "+calcOper(1, 2, myOperationSum));
        System.out.println("Div = "+calcOper(12, 2, myOperationDiv));

        System.out.println("Div = "+calcOper(12, 2, new MyOperation() {
            @Override
            public int operation(int x, int y) {
                return x * y;
            }
        }));

        // === Java 8
        System.out.println("Sub = "+calcOper(12, 2, (x,y) -> { return x - y; }));

        MyOperation myOperationSub = (x,y) -> x - y; // аналог вышеуказанному ламбда выражению
        System.out.println("Sub = "+calcOper(12, 2, myOperationSub));

        MyOperationDublicat myOperationDublicat = (x,y) -> x - y; //еще один интерфейс со сходным методом
        System.out.println("Sub myOperationDublicat = "+myOperationDublicat.method(12, 2));

        // Данный интерфейс нельзя использовать с ламбда, т.к. у него более 1 метода абстрактны
        MyOperationTwoMethods myOperationTwoMethods = new MyOperationTwoMethods() {
            @Override
            public int operation(int x, int y) {
                return x - y;
            }

            @Override
            public double operationDouble(double x, double y) {
                return x + y;
            }
        };
        System.out.println("myOperationTwoMethods = "+myOperationTwoMethods.operation(10,5));
        System.out.println("myOperationTwoMethods = "+myOperationTwoMethods.operationDouble(10,5));

        //MyOperationTwoMethods  myOperationTwoMethodsLambda = (x,y) -> x - y; // нельзя передать ламбда выражение



    }

    static int calcOper (int a1, int a2, MyOperation myOperation) {
        return myOperation.operation(a1, a2);
    }

    static int sum (int a1, int a2) {
        return a1+a2;
    }

    static int div (int a1, int a2) {
        return a1 / a2;
    }
}


