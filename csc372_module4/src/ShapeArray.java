
public static void main (String[] args) {
	//System.out.println("Test");	//Test line
	
	//Main ArrayList loop
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	Sphere testSphere = new Sphere(1.0);
	Cylinder testCylinder = new Cylinder(1.0, 2.0);
	Cone testCone = new Cone (1.0, 1.0);
	
	shapeArray.add(testSphere);
	shapeArray.add(testCylinder);
	shapeArray.add(testCone);
	
	int i;
	for (i = 0; i < shapeArray.size(); ++i) {
		shapeArray.get(i).toString();
	}
}





