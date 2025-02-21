//Qusay Bdier      Id:122069       Sec:4
package ass2_1220649_S4;
import java.util.Random;

public class Driver{
 static final int SEEDVALUE=4;
  static final Random randomValue=new Random(SEEDVALUE);

	public static void main(String[] args){
		Room[] rooms=new Room[3];
		Chair[] chairs=new Chair[(int)randoumNumber(50,20)];
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<chairs.length;j++){
				chairs[j]= new Chair(0.0,randoumNumber(randoumNumber(50,30),0),randomColor(),null);
			}
			rooms[i]=new Room(201+i,randoumNumber(50,30) ,randoumNumber(30,20) ,chairs);
			chairs=new Chair[(int)randoumNumber(50,20)];
			
		}
		displayrooms(rooms);	
	}	
	
public static double randoumNumber(double max,double min){
		return (randomValue.nextDouble((max-min))+min);
	}
	
 public static void displayrooms(Room[] rooms) {
	 System.out.println("number		length		width		total chairs 	 red	 	yellow		white");
	for(int i=0;i<rooms.length;i++)
	rooms[i].displayRoomInfo();
 }
public static String randomColor(){
	String[] Color= {"yellow","red","white"};
	return Color[(int)(randoumNumber(3,0))];
	
}
}

