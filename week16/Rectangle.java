package week16.com.it;

public class Rectangle {
//instance variable //global variable
public String name;
public double width;
double length;
private double area;

public void printArea() {
area = width * length;
System.out.println("The area of " + name + " Reactangle is " + area);
}

public double getArea() {
area = width * length;
return area;
}

public static void main(String[]args) {
Rectangle A = new Rectangle();
A.name = "A";
A.width = 4.0;
A.length = 5.0;
System.out.println("Name : " + A.name + "\nWidth : " + A.width + "\nLength : " + A.length);
A.printArea();

System.out.println("============");

Rectangle B = new Rectangle();
B.name = "B";
B.width = 2.0;
B.length = 6.0;
System.out.println("Name : " + B.name);
System.out.println("Width : " + B.width);
System.out.println("Length : " + B.length);
B.printArea();

System.out.println("Length : " + A.getArea());
System.out.println("Length : " + B.getArea());
}
}