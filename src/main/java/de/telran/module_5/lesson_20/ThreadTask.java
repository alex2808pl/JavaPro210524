package de.telran.module_5.lesson_20;

// используем наследование класса Thread
class ThreadTask extends Thread {
    private int start;
    private int end;
    private int div;
    public int count;

    public ThreadTask(int start, int end, int div) {
        this.start = start;
        this.end = end;
        this.div = div;
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();

        for (int i = start; i <= end; i++) {
            if(i % div == 0) {
                count++;
            }
        }
        System.out.println(Thread.currentThread().getName()+" -> количество = "+count);
        System.out.println(Thread.currentThread().getName()+" -> время выполнения = "+(System.currentTimeMillis()-currentTime));
    }
}
