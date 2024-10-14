package de.telran.module_5.lesson_20;

// используем имплементация интерфейса Runnable
// используем когда класс имеет предка (наследует другой класс)
class ThreadTaskRun extends Object implements Runnable {
    private int start;
    private int end;
    private int div;
    public int count;

    public ThreadTaskRun(int start, int end, int div) {
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