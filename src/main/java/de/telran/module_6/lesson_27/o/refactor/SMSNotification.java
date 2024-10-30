package de.telran.module_6.lesson_27.o.refactor;

// O - не нарушаем, т.к. просто добавили новый класс длы нового источника передачи
public class SMSNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправили по SMS ->"+message);
    }
}