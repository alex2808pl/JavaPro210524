package de.telran.module_4.lesson_18.practice;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    final static int SIZE_BUFFER = 1024*100;

    public static void main(String[] args) {

        System.out.println("Маленькие файлы: ");
        copyIO("d:/book.txt", "d:/bookCopyIo.txt");
        copyNIOChannel("d:/book.txt", "d:/bookCopyNio.txt");
        copyNIO2("d:/book.txt", "d:/bookCopyNio2.txt");
        copyNIOBufferChannel("d:/book.txt", "d:/bookCopyNioBuffer.txt");


        System.out.println("Большие файлы: ");
        copyIO("d:/video.webm", "d:/videoCopyIo.webm");
        copyNIOChannel("d:/video.webm", "d:/videoCopyNio.webm");
        copyNIO2("d:/video.webm", "d:/videoCopyNio2.webm");
        copyNIOBufferChannel("d:/video.webm", "d:/videoCopyNioBuffer.webm");

    }

    public static void copyIO(String src, String dst) {
        File srcLittle = new File(src);
        File dstLittle = new File(dst);
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;
        // логика
        try(InputStream inputStream = new FileInputStream(src);
            OutputStream outputStream = new FileOutputStream(dst)){
            byte[] buffer = new byte[SIZE_BUFFER]; //размер буфера
            int length;
            // Читаем данные в байтовый массив, а затем выводим в OutStream
            while((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах IO: " + (currentMills - startMills));
    }

    public static void copyNIOBufferChannel(String src, String dst) {
        File srcLittle = new File(src);
        File dstLittle = new File(dst);
        long currentMills = 0;
        long startMills = 0;
        // логика (Channel получаем из Stream)
        try (FileChannel srcFileChannel = new FileInputStream(src).getChannel();
             FileChannel dstFileChannel = new FileOutputStream(dst).getChannel()) {
            currentMills = System.currentTimeMillis();
            startMills = currentMills;

            ByteBuffer buf = ByteBuffer.allocate(SIZE_BUFFER);
            int bytesRead = srcFileChannel.read(buf);

            while (bytesRead != -1) {
                //System.out.println("Read " + bytesRead);
                buf.flip();
                while (buf.hasRemaining()) {
                    //System.out.print((char) buf.get());
                    dstFileChannel.write(buf);
                }
                buf.clear();
                bytesRead = srcFileChannel.read(buf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах NIO Channel Buffer: " + (currentMills - startMills));
    }


    public static void copyNIOChannel(String src, String dst) {
        File srcLittle = new File(src);
        File dstLittle = new File(dst);
        long currentMills=0;
        long startMills=0;
        // логика (Channel получаем из Stream)
        try(FileChannel srcFileChannel  = new FileInputStream(src).getChannel();
            FileChannel dstFileChannel = new FileOutputStream(dst).getChannel()){
            currentMills = System.currentTimeMillis();
            startMills = currentMills;
            long count = srcFileChannel.size();
            //System.out.println("count = "+count);
            while(count > 0) {
                long transferred = srcFileChannel.transferTo(srcFileChannel.position(), count, dstFileChannel); // копирование
                //System.out.println("transferred = "+transferred);
                srcFileChannel.position(srcFileChannel.position()+transferred);
                count -= transferred;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах NIO Channel: " + (currentMills - startMills));
    }

    public static void copyNIO2(String src, String dst) {
        Path pathSrcFile = Path.of(src);
        Path pathDstFile = Path.of(dst);

        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;


        try {
            Files.copy(pathSrcFile, pathDstFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах NIO 2: " + (currentMills - startMills));

    }

}
