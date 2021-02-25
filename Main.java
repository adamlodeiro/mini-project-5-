import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
//This string is just going to talk about welcome to the store 

Scanner scan = new Scanner(System.in);
    System.out.println( "Welcome to my shopify store, I sell perosnally designed t-shirts, my brand is called is called manic.");
//This will save the amount of t-shirts they want to buy so then later one we can calculate the price 
    System.out.println("How many custoum t-shirts do you plan on buying today");
//This next string is about to ask what kind of design would they look on their shirt 
  int numShirts = scan.nextInt();
  System.out.println("Which design would you like;)xxxxx[;;;;;;;;;> : $55.75,or $42.99 for the other two 龴ↀ◡ↀ龴 :                  ¦̵̱ ̵̱ ̵̱ ̵̱ ̵̱(̢ ̡͇̅└͇̅┘͇̅ (▤8כ−◦ , please choose style 1,2 or 3 ");
  int design = scan.nextInt();

  double style1 = 55.75;
  double style2 = 42.99;
  double style3 = 42.99;


  if (design == 1){
    System.out.println( "That'll be $55.75 ");
  }else{
  System.out.println(" That'll be $42.99");
  } 


  }
 


}