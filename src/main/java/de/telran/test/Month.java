package de.telran.test;

public enum Month {

    // Константы, представляющие месяцы с русскими названиями
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    // Поле для хранения русского наименования месяца
    private final String russianName;

    // Конструктор для инициализации констант
    Month(String russianName) {
        this.russianName = russianName;
    }

    // Метод для получения русского наименования месяца
    public String getRussianName() {
        return russianName;
    }

    // Метод для рекомендации режима питания в зависимости от сезона
    public String recommendDiet() {
        switch (this) {
            case DECEMBER, JANUARY, FEBRUARY:
                String str = "Это зима! Питайтесь калорийными блюдами, чтобы сохранять тепло.";
                //return str;
            case MARCH, APRIL, MAY:
                return "Весна! Рекомендуются легкие блюда с большим количеством овощей и фруктов.";
            case JUNE, JULY, AUGUST:
                return "Лето! Употребляйте свежие фрукты, ягоды и много воды.";
            case SEPTEMBER, OCTOBER, NOVEMBER:
                return "Осень! Включите в рацион больше витаминов и согревающих супов.";
            default:
                return "Нет рекомендаций для данного месяца.";
        }
    }

    // Метод для поиска месяца по его русскому названию
    public static Month getByRussianName(String name) {
        name = name.trim(); // Убираем лишние пробелы
        for (Month month : Month.values()) {
            if (month.getRussianName().equalsIgnoreCase(name)) {
                return month;
            }
        }
        return null; // Возвращаем null, если имя некорректно
    }
}