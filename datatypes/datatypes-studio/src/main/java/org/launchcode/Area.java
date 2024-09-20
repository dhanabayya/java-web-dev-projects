package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius= input.nextDouble();
        while(radius<0){
            System.out.println("Enter valid input");
            radius=input.nextDouble();
        }
        double area=Circle.getArea(radius);
        System.out.println("The area of circle of radius "+ radius+ " is "+area);
    }
}
