
public class Sphere extends Shape{
	double Radius;
	
	//Constructors
	public Sphere() {
		Radius = 0.0;
	}
	
	public Sphere(double Radius) {
		this.Radius = Radius;
	}
	
	//Calculate and return surface area
	double surface_area() {
		double surface_area = 4 * Math.PI * Radius;
		return surface_area;
	}
	
	//calculate and return volume
	double volume() {
		double volume = (4.0/3.0) * Math.PI * Radius;
		return volume;
	}
	
	public String toString() {
		String infoString = null;
		infoString = "Surface area of sphere is: " + surface_area() + "\n"
			+ "Volume of sphere is: " + volume();
		System.out.println(infoString + "\n");
		return infoString;
	}
	
}
