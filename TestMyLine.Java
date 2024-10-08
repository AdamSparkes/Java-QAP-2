// The instructions said to name this clss "TesMyLine" though I assumed the t missing was an error.
public class TestMyLine {
    public static void main(String[] args) {
        // Test constructor with (x1, y1, x2, y2)
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);  // MyLine[begin=(1,2),end=(3,4)]
        
        // Test constructor with MyPoint objects
        MyPoint begin = new MyPoint(5, 6);
        MyPoint end = new MyPoint(7, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2);  // MyLine[begin=(5,6),end=(7,8)]
        
        // Test getters and setters for begin and end
        System.out.println("Begin X: " + line1.getBeginX()); // 1
        System.out.println("End Y: " + line1.getEndY()); // 4
        
        line1.setBeginXY(9, 10);
        line1.setEndXY(11, 12);
        System.out.println("Updated Line: " + line1);  // MyLine[begin=(9,10),end=(11,12)]
        
        // Test getLength and getGradient methods
        System.out.println("Length of Line: " + line1.getLength());  // Output the distance between (9,10) and (11,12)
        System.out.println("Gradient of Line: " + line1.getGradient());  // Output the gradient in radians
        
        // Test individual getBegin and getEnd
        System.out.println("Begin: " + line2.getBegin()); // MyPoint(5, 6)
        System.out.println("End: " + line2.getEnd());     // MyPoint(7, 8)
    }
}