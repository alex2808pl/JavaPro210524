package de.telran.module_6.lesson_27.o.refactor;

public class EmailNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправили по EMail ->"+message);
    }
}
