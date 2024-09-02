package de.telran.lesson_3.enums;

public class MainDays {
    public static void main(String[] args) {
//        DayOfWeek day1 = new DayOfWeek("Воскресенье");
//        System.out.println(day1.title);
//
//        DayOfWeek day2 = new DayOfWeek("Абра-катабра");
//        System.out.println(day2.title);

        // DayOfWeek day2 = new DayOfWeek("Абра-катабра"); // невозможная операция
        DayOfWeek day1 = DayOfWeek.MONDAY;
        System.out.println(day1);
        DayOfWeek day2 = DayOfWeek.WEDNESDAY;
        System.out.println(day2);


        // Enums
        DayOfWeekEnum dayE1 = DayOfWeekEnum.SUNDAY;
        DayOfWeekEnum dayE2 = DayOfWeekEnum.SATURDAY;
        System.out.println(dayE1);
        System.out.println(dayE2);

        System.out.println(dayE2.getTitle());

        System.out.println("--- values() ----");
        for (DayOfWeekEnum day : DayOfWeekEnum.values()) {
            System.out.println(day + " ordinal -> "+day.ordinal());
        }
        System.out.println("--- ordinal() ----");
        System.out.println(dayE1.ordinal());
        System.out.println(dayE2.ordinal());

        System.out.println("--- valueOf() ----");
        dayE1 = DayOfWeekEnum.MONDAY;
        System.out.println(dayE1);

        dayE2 = DayOfWeekEnum.valueOf("MONDAY"); // аналог DayOfWeekEnum.MONDAY
        System.out.println(dayE2);

        //dayE2 = DayOfWeekEnum.valueOf("Monday"); //нельзя, MONDAY строго писать большими буквами
        dayE2 = DayOfWeekEnum.valueOf("Monday".toUpperCase()); //так можно
        System.out.println(dayE2);

        System.out.println("Стандартный switch-case");
        // стандартный switch-case
        switch (dayE2) {
            case DayOfWeekEnum.SUNDAY:
            case DayOfWeekEnum.SATURDAY:
                 System.out.println("Выходноой");
                 break;
            default:
                System.out.println("Раб.день");

        }

        System.out.println("Новый подход при работе со switch-case");
        // Новый подход при работе со switch-case
        switch (dayE2) {
            case SATURDAY, SUNDAY -> System.out.println("Ура, выходной!");
            default -> System.out.println("Надо топать на работу!");
        }


    }
}
