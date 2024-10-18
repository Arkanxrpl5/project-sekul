package ujiansuperclass;

public  class Circle extends Shape {

    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void luas(int radius) {
        System.out.println("Luas: " + (3.14 * radius * radius));
    }

    public void print() {
        super.print();
        System.out.println("Radius: " + radius);
    }


    
}