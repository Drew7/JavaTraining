class TwoDShape {
    double width;
    double height;
    
    void showDim() {
        System.out.println("Width & height - " + width + " & " + height);
    }    
}

class Triangle extends TwoDShape {
    String style;
    
    double area() {
        return width * height / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquare(){
        if(width == height) return true;
        return false;
    }
    
    double area() {
        return width * height;
    }
}

class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "painted";
        
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlinear";
        
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