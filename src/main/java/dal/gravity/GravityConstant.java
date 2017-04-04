package dal.gravity;

//we use this to get the dynamic variable of the
//gravity for a given pendulum
public class GravityConstant implements GravityModel{
	private double g;
	
	//constructor
	public GravityConstant(double g){
		this.g = g;
	}
	
	public double getGravitationalField() {
		return g;
	}
}