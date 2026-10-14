import java.util.Scanner;

public class PointPractice {

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter how many points : ");
        int num = scan.nextInt();
        
        Point[] p = new Point[num];
        
        for(int i = 0; i < num ; i++){
            System.out.println("Enter an abscissa for point " + (i+1) + ":");
            double x = scan.nextDouble();
 
            System.out.println("Enter an ordinate for point " + (i+1) + ":");
            double y = scan.nextDouble();
           
            System.out.println("Enter a color for point " + (i+1) + ":");
            String color = scan.next();
            
            System.out.println("Enter a Label for point " + (i+1) + ":");
            char label = scan.next().charAt(0);
            
            p[i] = new Point(x, y, color, label);
            
            System.out.println("Enter a Label to search for it : ");
            char sLabel = scan.next().charAt(0);
            
            Search(p,sLabel);
        }
               
    }
    
    public static void Search(Point[] p, char sLabel){
        for (int i = 0 ; i< p.length ; i++)
            if(p[i].getLabel() == sLabel){
                System.out.println("Point Found :" + p[i]);
                return;
            }
        
        System.out.println("None is found.");
    }
}
