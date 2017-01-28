abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
    
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    
      TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    String getName() { return name; };
    
    void showDim() {
        System.out.println("Width & height - " + width + " & " + height);
    }
    
    abstract double area();
}

class Triangle extends TwoDShape {
    private String style;
    
    Triangle() {
        super();
        style = "none";
    }
        
    Triangle(String s, double w, double h) {
        super(w, h, "Triangle");
        style = s;
    }
    
    Triangle(double x) {
        super(x, "Triangle");
        style = "painted";
    }
    
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }
        
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Rectangle extends TwoDShape {
    
    Rectangle() {
        super();
    }
    
    Rectangle(double w, double h) {
        super(w, h, "Rectangle");
    }
    
    Rectangle(double x) {
        super(x, "Rectangle");
    }
    
    Rectangle(Rectangle ob) {
        super(ob);
    }
    
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }
    
    double area() {
        return getWidth() * getHeight();
    }
}

class Circle extends TwoDShape {
    
    Circle() {
        super();
    }
    
    Circle(double x) {
        super(x, "Circle");
    }
    
    Circle(Circle ob) {
        super(ob);
    }
    
    double area() {
        return Math.PI * getWidth() * getWidth();
    }
}

class AbsShapes {
    public static void main(String args[]) {
        
        Triangle triangle1 = new Triangle("outlinear", 8.0, 12.0);
        TwoDShape shapes[] = new TwoDShape[6];
        shapes[0] = triangle1;
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = triangle1;
        shapes[5] = triangle1;
        
        Circle circle1 = new Circle(5.0);
        System.out.println("Object - " + circle1.getName());
        System.out.println("Area - " + circle1.area());
        System.out.println(triangle1.getClass());
        System.out.println(triangle1.hashCode());
        System.out.println(triangle1.toString());
        
        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Object - " + shapes[i].getName());
            System.out.println("Area - " + shapes[i].area());
            System.out.println();
        }
    }
}