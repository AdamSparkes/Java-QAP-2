public class MyLine {
    // Two feilds including MyPoint instances for the beginning and end of the line.
    private MyPoint begin;
    private MyPoint end;
    
    //Constructors.
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint (x2,y2);
    }
    //Getters and setters.
     public MyPoint getBegin() {
        return this.begin;
    }
     public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return this.end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    //Getters and setters for points in begin and end.
     public int getBeginX() {
        return begin.getX();
    }
    
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
     public void setBeginY(int y) {
        begin.setY(y);
    }
     public int getEndX() {
        return end.getX();
    }
    
    public void setEndX(int x) {
        end.setX(x);
    } 
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY() {
    return new int[] { begin.getX(), begin.getY() };
    } 
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
     public int[] getEndXY() {
    return new int[] { end.getX(), end.getY() };
    } 
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    // Methods for getting the length and Gradient with the gradient using atan2 to return the gradient in radians.
    public double getLength(){
        return begin.distance(this.end);
    }
      public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff); 
    }

     //To string method
    
    public String toString(){
        return "MyLine begins at " + this.begin + ", and ends at " + this.end;
    }
     
}
    
   
 

