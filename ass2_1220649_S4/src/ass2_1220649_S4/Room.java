package ass2_1220649_S4;
public class Room {
  private int number;
  private double length;
  private double width;
  private Chair[] chairs;
public Room(int number,double length,double width,Chair[] chairs){
	this.number=number;
	this.length=length;
	this.width=width;
	this.chairs=chairs;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public double getLenght() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public Chair[] getChairs() {
	return chairs;
}
public void setChairs(Chair[] chairs) {
	this.chairs = chairs;
}
public void displayRoomInfo(){
	int numberOfYellow=0;
	int numberOfWhite=0;
	int numberOfRed=0;
	for(int i=0;i<chairs.length;i++){
	  if(chairs[i].getColor()=="yellow")
		 numberOfYellow++;
	  if(chairs[i].getColor()=="red")
		 numberOfRed++;
	  if(chairs[i].getColor()=="white")
		numberOfWhite++;
	}
	System.out.printf("%d \t\t%.2f\t\t%.2f\t\t%d\t\t%d\t\t%d\t\t%d\n",number,length,width,chairs.length,numberOfRed,numberOfYellow,numberOfWhite);

}
}

