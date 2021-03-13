package designe_patterns.patterns.singleton.sun;

public class Main {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

    public static void main(String[] args) {
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        Sun.getInstance();
        System.out.println(sun1 == sun2);
    }
}


