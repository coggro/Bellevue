/* 
 * Corey Gross
 * Rectangle Class Exercise
 * April 18, 2016
 * Bellevue University
 * Assignment_9_3
*/

// Main test class
public class Assignment_9_3 {

    public static void main(String[] args) {
        
        System.out.println(); // Buffer for CLI
    
        // Create default Rectangle
        Rectangle defRect = new Rectangle();
        System.out.println("  Default Rectangle");
        defRect.rectangleOut();
        
        // Red Rectangle
        Rectangle redRect = new Rectangle(3.0, 4.5, "red");
        System.out.println(); // Buffer for CLI
        System.out.println("  Red Rectangle");
        redRect.rectangleOut();
        
        // Yellow Rectangle
        Rectangle yellowRect = new Rectangle(3.0, 4.5, "yellow");
        System.out.println(); // Buffer for CLI
        System.out.println("  Yellow Rectangle");
        yellowRect.rectangleOut();
        
        System.out.println(); // Buffer for CLI
    }

}

// Rectangle class, as defined in the assignment.
class Rectangle {

    private double width = 1.0;
    private double height = 1.0;
    private static String color = "white";

    Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
        this.color = "white";
    }

    Rectangle(double widthParam, double heightParam, String colorParam) {
        this.width = widthParam;
        this.height = heightParam;
        this.color = colorParam;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double widthParam) {
        this.width = widthParam;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double heightParam) {
        this.height = heightParam;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String colorParam) {
        this.color = colorParam;
    }
    
    public double findArea() {
        return (this.width * this.height);
    }
    
    public void rectangleOut() {
        System.out.println("  Width:  " + this.getWidth());
        System.out.println("  Height: " + this.getHeight());
        System.out.println("  Color:  " + this.getColor());
        System.out.println("  Area:   " + this.findArea());
    }

}
