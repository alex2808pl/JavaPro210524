package de.telran.module_6.lesson_27.o.refactor;

public class MainNotification {
    public static void main(String[] args) {
        NotificationService message = new EmailNotification();
        message.sendMessage("Заберите товар!");

        // новая функциональность
        message = new SMSNotification();
        message.sendMessage("Заберите товар!");
    }
}
