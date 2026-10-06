import java.util.Scanner;
public class Lms3c{

public static double calculateTotalWaste(double point1Waste, double point2Waste){

return point1Waste + point2Waste;
}


 

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter point 1 waste: ");
double point1Waste= sc.nextDouble();
System.out.println("Enter point 2 waste: ");
double point2Waste= sc.nextDouble();

double totalwaste= calculateTotalWaste(point1Waste, point2Waste);

System.out.println("Total waste collected at two points: "+ totalwaste);
}
}















