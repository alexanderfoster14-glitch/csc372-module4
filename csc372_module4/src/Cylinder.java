
public class Cylinder extends Shape {
	double Radius;
	double Height;
	
	//Constructors
	public Cylinder() {
		Radius = 0.0;
		Height = 0.0;
	}
	
	public Cylinder(double Radius, double Height) {
		this.Radius = Radius;
		this.Height = Height;
	}
	
	//Calculate and return surface area
	double surface_area() {
		double surface_area = 2.0 * Math.PI * Radius * Height + 2 * Math.PI * Radius * Radius;
		return surface_area;
	}
	
	//calculate and return volume
	double volume() {
		double volume = Math.PI * Radius * Radius * Height;
		return volume;
	}
	
	public String toString() {
		String infoString = null;
		infoString = "Surface area of cylinder is: " + surface_area() + "\n"
			+ "Volume of cylinder is: " + volume();
		System.out.println(infoString);
		return infoString;
	}

}
