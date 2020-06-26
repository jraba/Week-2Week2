
public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1.Boolean Expressions - Assignment 2
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1<5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		// System.out.println(“Hello" + char At (0) == ‘h’); would run nothing/error.
	
//2. Boolean Variables
 int itIsHotOutside = 90;
 System.out.println(90 > 70 && 90 > 80);
 
 String isAWeekday = "Wednesday";
 System.out.println(isAWeekday == "Wednesday");
 
 double hasMoneyInPocket = 56.78;
 System.out.println(0.00 == hasMoneyInPocket);
 
 //3. Different Variables (Not Boolean Type)
 double costOfMilk = 3.45;
 System.out.println("Today while shopping, I noticed milk was priced at $" + costOfMilk + " per gallon.");
 
 double moneyInWallet = 43.60;
 System.out.println("I added $20 cash to my wallet, and now I have $" + moneyInWallet + " in total.");
 
 int thirstLevel = 6;
 System.out.println("On a scale between 1-10, I'd say I was a " + thirstLevel + " thirst wise.");
 
 //4. True or False? 
 double shouldBuyIceCream = 3.50;
 System.out.println(itIsHotOutside > 70 && moneyInWallet > 7);
 
 int willGoSwimming = 75;
 System.out.println(itIsHotOutside > 75 && isAWeekday == "Saturday");
 
 String itIsAGoodDay = "Yes";
 System.out.println(itIsHotOutside > 75 && moneyInWallet > 0 && isAWeekday == "Saturday");
 
 double willBuyMilk = 3.47;
 System.out.println(itIsHotOutside > 75 && thirstLevel >= 3 && moneyInWallet >= 7.00);
 
 
 }
	
	
 
		
	}

