package ex2;

public class Circle {

    private double radius=1.0;
    private String color="red";
    private double PI=3.141592653589793;

    public Circle(){

    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return PI*radius*radius;
    }

}