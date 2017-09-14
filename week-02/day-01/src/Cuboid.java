// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000
public class Cuboid {
    public static void main(String[] args) {
    double a = 3.0;
    double b = 4.0;
    double c = 5.0;

    double surfaceArea = ((2 * a * b) + (2 * b * c) + (2 * a * c));
    double volume = (a * b * c);
    System.out.println("Surface area: " + surfaceArea);
    System.out.println("Volume: " + volume);
    }
}
