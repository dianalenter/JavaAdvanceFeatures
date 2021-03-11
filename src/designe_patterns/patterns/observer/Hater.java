package designe_patterns.patterns.observer;

public class Hater extends Observer {
    public Hater(String name) {
        super(name);
    }

    @Override
    public void notifyOfSubjectUpdate() {
        System.out.println("sunt " + name + " si am primit o notificare de la "
                + subject.getName() + " : " + subject.getStatus() + "-Huuoooo! i hate this! ");
    }
}
