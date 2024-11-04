package de.telran.module_6.lesson_28.reflection;

public class Sample {
    public String publ;
    String def;
    private String priv;
    protected String prot;

    public Sample() {
        publ = "Я public";
        def = "Я default";
        priv = "Я private";
        prot = "Я protected";
    }

    private Sample(String priv, String prot) {
        this.priv = priv;
        this.prot = prot;
    }

    //Публичный метод
    public void methPublic() {
        System.out.println("Я public метод");
    }

    //Приватный метод
    private void methPrivate() {
        System.out.println("Я private метод");
    }

    //Protected метод
    protected void methProtected(int x) {
        System.out.println("Я protected метод -> "+x);
    }

    //Default метод
    void methDefault(int x, double y) {
        System.out.println("Я default метод -> сумма = "+(x+y));
    }

    //Публичный метод
    public int methPublicVarArgs(int... args) { // int[] args, аналог  public int methPublicVarArgs(int[] args)
        int sum = 0;
        for (int el : args ) {
            sum += el;
        }
        return sum;
    }

}
