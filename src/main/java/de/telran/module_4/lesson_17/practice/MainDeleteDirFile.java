package de.telran.module_4.lesson_17.practice;


import java.io.File;

public class MainDeleteDirFile {
    public static void main(String[] args) {

        File dir = new File("./D1");
        deleteDir(dir);
    }

    // удаление папки с дочерними элементами
    public static void deleteDir(File file) {
        File[] files = file.listFiles();
        if (files != null) { //директорий пустой
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteDir(f);
                } else f.delete(); //удаляем файл
            }
        }
        file.delete(); //удаляем пустой директорий
    }
}

