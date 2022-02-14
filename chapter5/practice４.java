package chapter5;

public class practice４ {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("面積" + triangleArea + "c㎡(三角形)");

		double circleArea = calcCircleArea(5.0);
		System.out.println("面積" + circleArea + "c㎡(円)");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius){
		double area = radius * radius * 3.14;
		return area;
	}
}
