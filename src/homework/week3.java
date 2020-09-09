package homework;

public class week3 {

	public static void main(String[] args) {
		//question number 1
		int[] ages ={3,9,23,64,2,8,28,93};
		
		// 1a
		int num = ages.length;
		 System.out.println(ages[num-1]-ages[num-num]);
		 //1b
			int[] ages2= new int[ages.length];
		 for(int c=0;c<ages.length;c++) {
			 
			 // assign first element of ages to the first element of ages2
			 ages2[c] = ages[c];
		 }
		 ages2[ages2.length-1] = 20;
		 int ages2Length = ages2.length;
		 System.out.println(ages2[ages2Length - 1]-ages2[ages2Length - ages2Length]);
		 
		 //1c
		 int adds=0;
		 for(int i=0;i<ages.length;i++) {
			  adds+=ages.length;
		 }
			int  avg=adds/ages.length;
			System.out.println(avg);

		 
		 
		 
		 
		 // This is problem  2a and 2b
		 String[]names= {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		 //2a
			 int sum = 0;
				for (int i = 0; i < names.length; i++) {
					sum += names[i].length();
				}
				int average = sum / names.length;
				System.out.println("The average number of letters per name in names[] = " + average );
				
		//2b
				String allNames = "";
				for (int i = 0; i < names.length; i++) {
					allNames += names[i] + " ";
				}
				System.out.println(allNames);
				
				//Line Break
				System.out.println();
				
				
			//this is problem 5
				int[] nameLengths = new  int[names.length];
				for (int a = 0; a < names.length; a++) {
					nameLengths[a] = names[a].length(); 
					System.out.println(names[a]+": "+nameLengths[a]);
					}
				//Line break
				System.out.println();
				
				
				//this is problem 6
				int add=0;
				for(int b=0;b < nameLengths.length;b++) {
					
					add+=nameLengths[b];
				}
				System.out.println("The sum of all elements in the nameLenghts[] is: "+add);
				
				//Line Break
				System.out.println();
				
				//This is problem 7
				printStringNumTimes("Hello",3);
				
				//Line Break
				System.out.println();
				
				//This is problem 8
				fullName("Armond","Mayberry");
				
				//Line Break
				System.out.println();
				
				//This is problem 9
				System.out.println(greaterThan100());
				
				//Line Break
				System.out.println();
				//This is problem 10
				System.out.println(averageNumber());
				
				//Line Break
				System.out.println();
				//This is problem 11
				twoArrays();
				
				//Line Break
				System.out.println();
				//This is problem 12
				willBuyDrink(true,12.50);
				
				//Line Break
				System.out.println();
				//This is problem 13
				int[] minArray = new int[10];
				minArray[0] =1;
				minArray[1] =2;
				minArray[2] =3;
				minArray[3] =4;
				minArray[4] =5;
				minArray[5] =6;
				minArray[6] =7;
				minArray[7] =8;
				minArray[8] =9;
				minArray[9] =10;
				
				
				minuteConverter(minArray);
				
			}
	
	
		public static void printStringNumTimes(String str, int num) {
			for(int i=0;i<num;i++) {
				System.out.print(str);
			}
		}
		
		public static void fullName(String firstName, String lastName) {
			String myName= firstName+" "+lastName;
			System.out.println(myName);
		}
		
		public static boolean greaterThan100() {
			int[]numbers = new int[4];
			numbers[0]=25;
			numbers[1]=25;
			numbers[2]=30;
			numbers[3]=30;
			
			int sum=0;
			for(int i=0;i<numbers.length;i++) {
				sum+=numbers[i];
			}
			 boolean isItGreater=sum>100;
			return isItGreater;
		}
		
		public static double averageNumber() {
			double[] grades = new double[6];
			grades[0]=100;
			grades[1]=90;
			grades[2]=80;
			grades[3]=70;
			grades[4]=65;
			grades[5]=50;
			
			double sum=0;
			for(double percentage:grades) {
				sum+=percentage;
			}
			return sum/grades.length;
			
		}
		
		public static void twoArrays() {
			double myArrays[][] ={ {80,70,100,95}, {50,65,70,80} } ;
			int sum=0;
			for(double gradesForStudent1:myArrays[0]) {
				sum+=gradesForStudent1;
			}
			double avg1=sum/myArrays[0].length;//The average is 86
			
			int sum2=0;
			for(double gradesForStudent2:myArrays[1]) {
				sum2+=gradesForStudent2;
			}
			double avg2=sum2/myArrays[1].length;//The average is 66
			
			boolean isItGreater =avg1>avg2;
			System.out.println(isItGreater);
		}
		
		public static void willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside==true && moneyInPocket>10.50){
				System.out.println(isHotOutside==true && moneyInPocket>10.50);
			}
			else {
				System.out.println(isHotOutside==false && moneyInPocket<10.50);
			}
		}
		/*
		 * This Method converts minutes into seconds
		 * I created it because it can be useful formula for people who need to convert mins into seconds
		 */
		public static void minuteConverter (int[] minute) {
			int seconds=60;
			int converter;
			int minutes;
			
			for(int min:minute) {
				converter=min*seconds;
				minutes=converter/seconds;
				System.out.println(minutes+ " Minutes" +" Equals "+converter+ " Seconds ");
			}
		}
		

	}


