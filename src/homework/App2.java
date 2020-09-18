package homework;

public class App {

	public static void main(String[] args) {
		//lines 7-14 are variables  with different types of data types
		double itemPrice = 21.55;
		double itemPrice2 = 5.00;
		double amountOfMoneyInWallet = 100.00;
		int numberOfFriends = 40;
		int ageInYears = 20;
		String firstName= "Armond ";
		char middleInitial= 'N';
		String lastName= " Mayberry";
		
		// lines 17-20 are performing operations using some variables above
		double newAmountOfMoney = amountOfMoneyInWallet - itemPrice - itemPrice2;
		int numberOfFriendsEachYear =numberOfFriends / ageInYears;
		String fullName = firstName+ middleInitial + lastName;
		double totalAmountOwed = itemPrice + itemPrice2;
		
		//These lines of code prints out statements in the console using the values of the listed variables above
		System.out.println("My full name is"+" "+fullName);
		System.out.println("I bought two items and my total cost = $"+ totalAmountOwed+" "+"I received $"+ newAmountOfMoney+ " as my change due");
		System.out.println("I am " +ageInYears+" years old"+" I've only made "+numberOfFriendsEachYear+" friends each year");
	}

}
