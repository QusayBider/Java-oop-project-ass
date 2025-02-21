import java.util.*;
public class assiag {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter any four different intrgers");
		   int numb1=in.nextInt();
		   int numb2=in.nextInt();
           int numb3=in.nextInt(); 
           int numb4=in.nextInt();
	    System.out.printf("Choose the action required:\n1- Print max integer\n2- Print min integer\n3- Print integers arranged in ascending order\n4- Print integers reversed\n5- Exit\n");
	    int choose=in.nextInt();
	    do {
	    switch(choose) {
		case 1:System.out.println("Max integer = "+getMax(numb1,numb2,numb3,numb4));
		break;
		case 2:System.out.println("Min integer = "+getMin(numb1,numb2,numb3,numb4));
		break;
		case 3:printArragedNumber(numb1,numb2,numb3,numb4);
		break;
		case 4:printReversedNumber(numb1,numb2,numb3,numb4);
		break;}
	    System.out.printf("Choose the action required:\n1- Print max integer\n2- Print min integer\n3- Print integers arranged in ascending order\n4- Print integers reversed\n5- Exit\n");
	    choose=in.nextInt();
	    }
	   while(choose!=5);
	    System.out.println("Thank you for using my program, goodbye");
	    in.close();
	}
	public static int getMax(int numb1,int numb2,int numb3,int numb4){
		int max=numb1;
		if(max<numb2)
			max=numb2;
		if (max<numb3)
		max=numb3;
		if (max<numb4)
			max=numb4;
		return max;	
	}
	public static int getMin(int numb1,int numb2,int numb3,int numb4){
		int min=numb1;
		if(min>numb2)
			min=numb2;
		if (min>numb3)
		    min=numb3;
		if (min>numb4)
			min=numb4;
		return min;
	}
	public static void printArragedNumber(int numb1,int numb2,int numb3,int numb4){
		int FirstNumb=getMin(numb1,numb2,numb3,numb4);
		int LastNumb=getMax(numb1,numb2,numb3,numb4);
		int SecondNumb=0;
		int TheardNumb=0;
		if(numb1!=FirstNumb && numb1!=LastNumb) {
			if(SecondNumb==0)
			SecondNumb=numb1;
			else 
			TheardNumb=numb1;}
		if(numb2!=FirstNumb && numb2!=LastNumb){
			if(SecondNumb==0)
				SecondNumb=numb2;
				else 
				TheardNumb=numb2;}
		if(numb3!=FirstNumb && numb3!=LastNumb){
			if(SecondNumb==0)
				SecondNumb=numb3;
				else 
				TheardNumb=numb3;}
		if(numb4!=FirstNumb && numb4!=LastNumb){
			if(SecondNumb==0)
				SecondNumb=numb4;
				else 
				TheardNumb=numb4;}
		if(TheardNumb<SecondNumb){
			int test=TheardNumb;
			TheardNumb=SecondNumb;
			SecondNumb=test;}
		    System.out.println("The integers arranged in ascending order are:");
			System.out.println(FirstNumb +" "+ SecondNumb+" " + TheardNumb+" " + LastNumb);
		}
	public static void printReversedNumber (int numb1,int numb2,int numb3,int numb4){
		System.out.println("The reversed integers in the order entered are:");
		System.out.println(Revers(numb1)+" "+Revers(numb2)+" "+Revers(numb3)+" "+Revers(numb4));
	}
	public static int Revers(int numb){
		int numbRev=0;
		int numbTest=numb;
		int count=0;
		while(numbTest!=0){
			numbTest/=10;
			count++;
		}
		for(int i=count;i>0;i--){
			numbRev+=(numb%10)*Math.pow(10,(i-1));
			numb/=10;
		}
		return numbRev;
	}	
}


