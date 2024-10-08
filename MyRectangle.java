public class MyRectangle{
    private MyPoint topLeft;
    private MyPoint bottomRight;
    //Constructors.
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    //Setters getters for topLeft and bottomRight MyPoint objects.
     public MyPoint getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
     public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    //Methods for calculating width, height and area
    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }
    public int getArea(){
        return getWidth() * getHeight();
    }
    //To String Method.
    public String toString(){
        return "My Rectangles top left corner is " + this.topLeft + ", The bottom right is " + this.bottomRight +", the width is " +getWidth()+ " and the height is " +getHeight();
    }
}