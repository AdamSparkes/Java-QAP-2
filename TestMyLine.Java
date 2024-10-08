// The instructions said to name this clss "TesMyLine" though I assumed the t missing was an error.
public class TestMyLine {
    public static void main(String[] args) {
       // Constructor test with x1,y1
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println("Constructor test for int values.  " +line1);  
        
        // Construstor test with MyPoint objects
        MyPoint begin = new MyPoint(5, 6);
        MyPoint end = new MyPoint(7, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println("Constructor test for MyPoint objects.  " +line2);  
        
        // Test getters and setters for begin and end
        System.out.println("BeginX() setter and getter: " + line1.getBeginX()); 
        System.out.println("EndY() setter and getter: " + line1.getEndY()); 
        
        line1.setBeginXY(9, 10);
        line1.setEndXY(11, 12);
        System.out.println("BeginXY and EndXY Setters and getters.: " + line1);  
        
        // Test getLength and getGradient methods
        System.out.println("getLength() test:  " + line1.getLength());  
        System.out.println("getGradient() test:  " + line1.getGradient());  
        
        // Test individual getBegin and getEnd
        System.out.println("getBegin() test:  " + line2.getBegin()); 
        System.out.println("getEnd() test: " + line2.getEnd());     
    }
}