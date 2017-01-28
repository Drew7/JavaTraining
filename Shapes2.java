class TwoDShape {
    private double width;
    private double height;
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    void showDim() {
        System.out.println("Width & height - " + width + " & " + height);
    }    
}

class Triangle extends TwoDShape {
    private String style;
    
    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        
        style = s;
    }
    
    double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }
    
    double area() {
        return getWidth() * getHeight();
    }
}

class Shapes2 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("painted", 4.0, 4.0);
        Triangle t2 = new Triangle("outlinear", 8.0, 12.0);
        
        System.out.println("t1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        
        System.out.println();
        
        System.out.println("t2 info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}