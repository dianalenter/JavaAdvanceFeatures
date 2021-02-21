package oop.inherintence;

public class Triungle extends GeometricFigure {
    private int latura1;
    private int latura2;
    private int latura3;



    public Triungle(int latura1, int latura2, int latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;

    }

    @Override
    public double calculatePerimeter() {
        return latura1+latura2+latura3 ;
    }

    @Override
    public double calculateAria() {
        double p ;
        p=(latura1+latura3+latura2)/2;

        return Math.sqrt(p*(p-latura1)*(p-latura2)*(p-latura3));
    }

}
