package de.telran.lesson_3.enums;

public class DayOfWeek {
    private String title;

    private /*public*/ DayOfWeek(String title) {
        this.title = title;
    }

    public final static DayOfWeek MONDAY = new DayOfWeek("Понедельник");
    public final static DayOfWeek TUESDAY  = new DayOfWeek("Вторник");
    public final static DayOfWeek WEDNESDAY = new DayOfWeek("Среда");
    public final static DayOfWeek THURSDAY = new DayOfWeek("Четверг");
    public final static DayOfWeek FRIDAY = new DayOfWeek("Пятница");
    public final static DayOfWeek SATURDAY = new DayOfWeek("Суббота");
    public final static DayOfWeek SUNDAY = new DayOfWeek("Воскресенье");

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
