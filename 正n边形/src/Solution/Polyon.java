package Solution;

public class Polyon {
    private int n;
    private double side;
    double x;
    double y;
    Polyon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    Polyon(int n,int side) {
        this.x = this.y = 0;
        this.n = n;
        this.side = side;
    }
    Polyon(int n,int side,int x,int y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public double getPerimeter() {
        return n * side;
    }

}
