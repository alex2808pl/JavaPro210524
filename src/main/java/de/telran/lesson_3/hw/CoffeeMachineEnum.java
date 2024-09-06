package de.telran.lesson_3.hw;

public enum CoffeeMachineEnum {
        INSTANCE;

        private String water;
        private String coffee;
        private String milk;
        private String sugar;

        CoffeeMachineEnum() {
        }

        public void makeMilkCoffee(){
            System.out.println("To make milk coffee you need: 1 part of " + coffee + ", 1 part of " + water + " and 1 part of " + milk + ".");
        }

        public void makeAmericano(){
            System.out.println("To make Americano you need: 1 part of " + coffee + " and 2 parts of " + water + ".");
        }

        public void makeCappuccino(){
            System.out.println("To make Cappuccino you need: 1 part of " + coffee + " and 2 parts of " + milk + ".");
        }

        public void addSugar(){
            System.out.println("You can add " + sugar + " to your coffee.");
        }

}
