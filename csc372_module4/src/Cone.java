
public class Cone extends Shape {
	double Radius;
	Double Height;
	
	//Constructors
	public Cone() {
		Radius = 0.0;
		Height = 0.0;
	}
	
	public Cone(double Radius, double Height) {
		this.Radius = Radius;
		this.Height = Height;
	}
	
	//Calculate and return surface area
	double surface_area() {
		double surface_area = Math.PI * Radius * (Radius + Math.sqrt(Height * Height + Radius * Radius));
		return surface_area;
	}
	
	//calculate and return volume
	double volume() {
		double volume = Math.PI * Radius * Radius * (Height / 3.0);
		return volume;
	}
	
	public String toString() {
		String infoString = null;
		infoString = "Surface area of cone is: " + surface_area() + "\n"
			+ "Volume of cone is: " + volume();
		System.out.println(infoString + "\n");
		return infoString;
	}
	
}
