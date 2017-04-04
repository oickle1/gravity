package dal.gravity;

/* 
 * simple interface for the model to receive the
 * dynamically changed gravity value.
 */
public interface GravityModel {
	//getter method, gets directly from 
	//the GravityConstant class
	public double getGravitationalField();
}