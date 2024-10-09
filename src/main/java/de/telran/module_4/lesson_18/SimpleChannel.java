package de.telran.module_4.lesson_18;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Разработать другой пример для демонстрации!!! Трудно воспринимаемый!
public class SimpleChannel {
    public static void main(String[] args) throws IOException {
        Path pathDefault = Paths.get("testChannelFile.txt");
        if(Files.notExists(pathDefault)) {
            pathDefault = Files.createFile(pathDefault);
        }

        String s = "I was here!";
        byte[] data = s.getBytes();

        ByteBuffer out = ByteBuffer.wrap(data);

        ByteBuffer copy = ByteBuffer.allocate(12);

        try (FileChannel fc = FileChannel.open(pathDefault, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            int nread;
            do {
                nread = fc.read(copy);
            } while(nread !=-1 && copy.hasRemaining());

            // Пишем "I was here!" в начало файла.
            fc.position(0); // в начало файла
            while (out.hasRemaining()) {
                fc.write(out);
            }

            long length = fc.size();
            System.out.println("length = "+length);
            fc.position(length); //переходим в конец файла
            copy.flip(); //
            while(copy.hasRemaining()) {
                fc.write(copy);
            }
            // С буфера пишем в файл
            while(out.hasRemaining()) {
                fc.write(out);
            }

           } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }



}
