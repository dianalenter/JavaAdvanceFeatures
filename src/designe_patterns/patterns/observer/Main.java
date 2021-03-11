package designe_patterns.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject smiley = new Subject("Smiley");
        Subject delia = new Subject("Delia");

        Observer diana = new Observer("diana");
        Observer costel = new Observer("costel");
        Observer costel2 = new Observer("costel2");
        Observer costel1 = new Observer("costel1");
        Observer costel4 = new Observer("costel4");
        Observer hater = new Hater("Hater Donald");

        diana.fallow(smiley);
        costel.fallow(smiley);
        costel1.fallow(delia);
        costel2.fallow(smiley);
        costel4.fallow(delia);
        hater.fallow(delia);

        smiley.postUpdate("Pesa mare pe radio zu");
        delia.postUpdate("Concert  DELIA Sala Palatului");

        costel4.unfollow(smiley);
        delia.postUpdate("Piesa noua ");

    }
}
