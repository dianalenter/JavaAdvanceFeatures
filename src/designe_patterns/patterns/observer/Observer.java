package designe_patterns.patterns.observer;

public class Observer {


   protected String name;

    protected Subject subject;

    public Observer(String name) {
        this.name = name;
    }

    public void fallow(Subject subject) {
        this.subject = subject;
        subject.addFollower(this);
    }
    public void unfallow(Subject subject) {
        this.subject = null;
        subject.removeFollower(this);
    }

    public void notifyOfSubjectUpdate() {
        System.out.println("sunt " + name +
                " si am primit o notificare de la " +
                subject.getName() + " : " + subject.getStatus());
    }

    public void unfollow(Subject subject) {
    }
}
