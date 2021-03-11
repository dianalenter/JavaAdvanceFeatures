package designe_patterns.patterns.singleton;

public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("s-a apelat constructorul sun ");

    }

    public static synchronized Sun getInstance() {
//double null check
        //Singletone

        if (instance == null) {   //verificam de 2 ori pt ca o data este null pun lacat si  a 2 oara nu en mai da null
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}
