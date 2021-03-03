import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
//This string is just going to talk about welcome to the store 

Scanner scan = new Scanner(System.in);
    System.out.println( "Welcome to my shopify store, I sell perosnally designed t-shirts, my brand is called is called manic. I also trade my T-shirts");
//This will save the amount of t-shirts they want to buy so then later one we can calculate the price 
    System.out.println("How many custoum t-shirts do you plan on buying today or how many do you plan to trade");
//This next string is about to ask what kind of design would they look on their shirt 
  int numShirts = scan.nextInt();
  System.out.println("Which design would you like;)xxxxx[;;;;;;;;;> : $55.75,or $42.99 for the other two 龴ↀ◡ↀ龴 :                  ¦̵̱ ̵̱ ̵̱ ̵̱ ̵̱(̢ ̡͇̅└͇̅┘͇̅ (▤8כ−◦ , please choose style 1,2 or 3 ");
  int design = scan.nextInt();
  



  if (design == 1){
    System.out.println( "That shirt would be $55.75 ");
  }else{
  System.out.println(" That shirt will be $42.99");
  } 
  System.out.println("What is the Price of the T-shirt you would like to buy from here again?");
   double tshirtBuy = scan.nextDouble();
    System.out.println("Would you like to comapre the prices? True or false");
  boolean tradingTORF = scan.nextBoolean();
  System.out.println("How much was your orignal tshirt");
  double orignalPrice = scan.nextDouble();

  double comparison = tradingTshirt(tshirtBuy, orignalPrice);
  System.out.println("Your T-shirts new price will be " + comparison + " that's your final price, if it's 0 you can trade it in with 0 cost if it's positive you need to pay the diffrence and if its negative we pay you that money" );
 

  

  }

  //Here I'm making another method 

static double tradingTshirt(double tshirtBuy, double orignalPrice ){
    double  newPrice = tshirtBuy - orignalPrice;
    return newPrice;}
}