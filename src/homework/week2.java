package homework;

public class week2 {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday= false;
		boolean hasMoneyInPocket= true;
		
		double costOfMilk = 3.99;
		double moneyInWallet=20.00;
		int thirstLevel=5;
		
		boolean shouldByIcecream=isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming=isHotOutside&&!isWeekday;
		boolean isAGoodDay = isHotOutside &&hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside&&(thirstLevel>=3)&&(moneyInWallet>=costOfMilk*2);
	
		System.out.println(shouldByIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay );
		System.out.println(willBuyMilk );
		System.out.println("========================");
		
		int i=0;
		while(i<=100) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("========================");
		int x=100;
		while(x>=0) {
			System.out.println(x);
			x-=3;
		}
		System.out.println("========================");

		
		for(int y=0;y<=100;y+=3) {
			System.out.println(y);
		}
		
		System.out.println("========================");

		
		for (int z=0; z<100; z++) {
			
			 if(z%3==0 && z%5==0) {
				System.out.println("Hello World ");
			 }
			
				else if (z%3==0) 
			System.out.println("Hello ");	
			else if(z%5==0){
				System.out.println("World ");
			}
			else if(z%3==0 && z%5==0) {
				System.out.println("Hello World ");
			}
			else {
				System.out.println(z);
			}
		}
		
		
  }

}
