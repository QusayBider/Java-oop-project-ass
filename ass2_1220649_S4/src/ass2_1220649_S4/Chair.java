package ass2_1220649_S4;
import java.util.Date;
public class Chair {
private double weight;
private double distanceFromFrontWall;
private String color;
private Date dateManufactured; 
public Chair(){
	this(0.0f,0.0f,null,null);
}
public Chair(double weight,double distanceFromFrontWall,String color,Date dateManufactured ){
	this.weight=weight;
	this.distanceFromFrontWall=distanceFromFrontWall;
	this.color=color;
	this.dateManufactured=dateManufactured;
}
public void setWight(double weight){
	this.weight=weight;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getDistanceFromFrontWall() {
	return distanceFromFrontWall;
}
public void setDistanceFromFrontWall(double distanceFromFrontWall) {
	this.distanceFromFrontWall = distanceFromFrontWall;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Date getDateManufactured() {
	return dateManufactured;
}
public void setDateManufactured(Date dateManufactured) {
	this.dateManufactured = dateManufactured;
}
public void moveChairForward(double distance){
	this.distanceFromFrontWall-=distance;
}
public void moveChairBackward(double distance){
	this.distanceFromFrontWall+=distance;
}

}
