package de.telran.module_4.lesson_17;

import java.io.File;
import java.io.IOException;

public class MainFileSystemIO {
    public static void main(String[] args) throws IOException {
        File file = new File("./file.txt");

        //проверка существование
        boolean isExists = file.exists();
        System.out.println("file exists -> " + isExists);

        // создание файла
        boolean wasCreatedFile = file.createNewFile();
        System.out.println("created file -> " + wasCreatedFile);

        // Размер файла
        long length = file.length();
        System.out.println("size file -> " +length);

        // Удаление файла
        boolean success = file.delete();
        System.out.println("delete file -> "+success);

        // ==== Работа с папками ====

        // создание
        File dir = new File("new_dir");
        if(!dir.exists()) {
            System.out.println("Created new dir -> "+dir.mkdir());
        }

        File inFile = new File(dir, "newFile.txt");
        if(!inFile.exists()) {
            System.out.println("created file " + inFile.createNewFile());
        }

        // Проверка
        System.out.println("Is Folder -> "+dir.isDirectory());

        // Удаление
        File[] files = dir.listFiles(); // возвращает вложенные папки и файлы
        for (File fileDel : files) {
            // Проверка
            System.out.println("Is File -> "+fileDel.isFile());
            //удаление вложенного файла
            success = fileDel.delete();
            System.out.println("delete "+fileDel.getName()+" -> "+success);
        }

        // удаление папки
        success = dir.delete(); // только пустые каталоги можно удалить
        System.out.println("delete dir - "+success);


    }
}
