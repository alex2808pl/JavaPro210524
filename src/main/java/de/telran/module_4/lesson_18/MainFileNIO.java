package de.telran.module_4.lesson_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MainFileNIO {
    public static void main(String[] args) throws IOException {
        //==== Короткие файлы
        Path path = Path.of("testRAF.txt");

        // Чтение данных
        List<String> lists = Files.readAllLines(path);
        System.out.println(lists);

        System.out.println();

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));


        //Запись данных в файл
        Path pathNew = Files.write(Path.of("newBytes.txt"),bytes);
        pathNew = Files.write(Path.of("newList.txt"),lists);


        //==== Возможная работа с большими файлами (сопряжение с IO)

        //Чтение
        List<String> stringList = new ArrayList<>();

        if (Files.exists(path)) {
            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
              ) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    stringList.add(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // Запись

        Path pathCopyFile = Paths.get("testCopyFile.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(pathCopyFile, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE/*,  StandardOpenOption.APPEND*/)) {
            stringList.stream().forEach(s -> {
                try {
                    writer.write(s);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
