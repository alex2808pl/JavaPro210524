package de.telran.lesson_3.enums;

public enum DayOfWeekEnum {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY("Суббота"),
    SUNDAY;

    private String title;

    private DayOfWeekEnum() {
    }

    private DayOfWeekEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                "} " + super.toString();
    }

    public String getTitle() {
        return title;
    }
}
