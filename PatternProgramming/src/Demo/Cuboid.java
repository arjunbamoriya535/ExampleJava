package Demo;

public class Cuboid {
private int length;
private int weidth;
private int height;

	public Cuboid(int length, int weidth, int height) {
	super();
	this.length = length;
	this.weidth = weidth;
	this.height = height;
}

	


	public int  area() {
		return this.weidth*this.length;
		
	}

	public int  volume() {
		return  this.height*this.length*this.weidth;
		
	}
	@Override
	public String toString() {
		return "Cuboid Surface  Area" + 6*this.length*this.weidth + "meter per square  "
				+ " volume"+this.length*this.weidth*this.height +"meter per cube";
	}
}
