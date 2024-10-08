public class TestMyRectangle {
    public static void main(String[] args) {
        //MyRectangle object using ints
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        System.out.println("MyRectangle test using int input constructor.");
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
      

        // MyRectangle object using MyPoint objects
        MyPoint topLeft = new MyPoint(2, 6);
        MyPoint bottomRight = new MyPoint(8, 2);
        MyRectangle rect2 = new MyRectangle(topLeft, bottomRight);
        System.out.println("MyRectangle test using MyPoint object constructor.");
        System.out.println("Rectangle 2: " + rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        

        // Set new points for rectangle 1
        rect1.setTopLeft(new MyPoint(3, 7));
        rect1.setBottomRight(new MyPoint(9, 2));
        System.out.println("Testing the Setters for setTopLeft and setBottomRight, includng the area calculation with updated valaues.");
        System.out.println("Updated Rectangle: " + rect1);
        System.out.println("Updated Area: " + rect1.getArea());
        
    }
}