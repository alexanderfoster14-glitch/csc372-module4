
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
	
	//Test cases
	/*

	Sphere testSphere1 = new Sphere();
	Cylinder testCylinder1 = new Cylinder();
	Cone testCone1 = new Cone();
	shapeArray.add(testSphere1);
	shapeArray.add(testCylinder1);
	shapeArray.add(testCone1);
	
	Sphere testSphere2 = new Sphere(2);
	Cylinder testCylinder2 = new Cylinder(2,5);
	Cone testCone2 = new Cone(2,2);
	shapeArray.add(testSphere2);
	shapeArray.add(testCylinder2);
	shapeArray.add(testCone2);
	
	*/
	
	int i;
	for (i = 0; i < shapeArray.size(); ++i) {
		shapeArray.get(i).toString();
	}
}





