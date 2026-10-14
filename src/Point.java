
public class Point {

	private double x;
    private double y;
    private String color;
    private char label;
    
    public Point(double x, double y, String color, char label){
        this.x = x;
        this.y = y;
        this.color = color ;
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = Character.toUpperCase(label);
    }
    
    public String findLocation(){
        if(x == 0 & y == 0)
            return"Origin";
        else if(y == 0)
            return"x-axis";
        else if(x == 0)
            return"y-axis";
        else if(x > 0 & y > 0)
            return"Quadrant I";
        else if(x < 0 & y > 0)
            return"Quadrant II";
        else if(x < 0 & y < 0)
            return"Quadrant III";
        else 
            return"Quadrant IV";
    }
    
    public void moveIt(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
                return label + " (" + x + ", " + y + ") - Location: " + findLocation() + " - Color: " + color;

    }
    
}
