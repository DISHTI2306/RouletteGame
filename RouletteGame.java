/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import javax.swing.JOptionPane;
/**
 *
 * @author Chitapain Dishti
 */
public class RouletteGame {
    static int playerWinningNumber,winningNumber;
    static double betOnWinningNumber;
    static int winningSplitNumber;
    static double betOnWinningSplitNumber;
    static int playerWinningStreetNumber,winningStreetNumber;
    static double betOnWinningStreetNumber;
    static int playerWinningDoubleStreetNumber,winningDoubleStreetNumber;
    static double betOnWinningDoubleStreetNumber;
    static int playerWinningTrioNumber,winningTrioNumber;
    static double betOnWinningTrioNumber;
    static int playerWinningFirstFourNumber,winningFirstFourNumber;
    static double betOnWinningFirstFourNumber;
    static int playerWinningLowOrHighNumber,winningHighOrLowNumber;
    static double betOnWinningLowOrHighNumber;
    static int playerWinningColor,winningColor;
    static double betOnWinningColor;
    static int playerEvenOrOddNumber,winnningEvenOrOddNumber;
    static double betOnWinningEvenOrOddNumber;
    static double payout;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    JOptionPane.showMessageDialog(null ," Welcome to the Roulette Game! ");    
    
    // request the user to select his option
        int choice = play();
        /*  request user to choose one option from the straight bet, split bet, 
            street bet, six line bet, trio bet, first four or basket bet, low or high bet,
            red or black bet and even or even bet
        */ 
        String input = "", input2 = "";
        String output = " ";
        input = JOptionPane.showInputDialog("Enter a single choice: playOnWinningNumber, playOnSplitNumber, playOnStreetNumber, playOnDoubleStreetNumber, playOnTrioNumber, playOnFirstFourNumber, chooseHighOrLowNumber, chooseAcolor, chooseEvenOrOddNumber?");
        
        //program must now make a decision
        switch(input){
           //body of the switch contains the diefferent course of action
            case "playOnWinningNumber": output = " The player has placed a bet on a single number!!! ";break;
            case "playOnSplitNumber": output = " The palyer has placed a bet on two vertically,horizontally or adjacent number!!!\n\nThere are 114 of these split bet combinations. ";break;
            case "playOnStreetNumber": output = " The player has place a bet on three consecutive numbers in a horizontal line!!!\n\nThere are twelve of these bets on the table. ";break;
            case "playOnDoubleStreetNumber": output = " The player has placed a bet on six consecutive numbers that form two horizontal lines!!!\n\nThere are 11 such combinations. ";break;
            case "playOnTrioNumber": output = " The player has placed a bet on three numbers that involoves at least one zero!!! ";break;
            case "playOnFirstFourNumber": output = " The player has placed a bet on 0-1-2-3!!! ";break;
            case "chooseHighOrLowNumber": output = " The player has placed a bet either on a high number or a low number!!! ";break;
            case "chooseAcolor": output = " The player has placed a bet either on black color or red color!!! ";break;
            case "chooseEvenOrOddNumber": output = " The player has placed a bet either on an even number or an odd number!!! ";break;
            default: output="Incorrect user choice!\n\nPlease re-enter your choice";
        }
        JOptionPane.showMessageDialog(null, output);
        
        //INSIDE BET
        //STRAIGHT BET
        input = JOptionPane.showInputDialog("Enter your number in the range 0-36"); 
        playerWinningNumber = Integer.parseInt(input); 
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningNumber = Double.parseDouble(input2);
        //program generates the winning straight/single number
        winningNumber = generateWinningNumber();
        if(playerWinningNumber==winningNumber){
            payout = (35*betOnWinningNumber) + betOnWinningNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning number= "+
                    playerWinningNumber + "\nGenerated Winning Number= "+winningNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning number= "+
                    playerWinningNumber + "\nGenerated Winning Number= "+winningNumber);
        }
        
        //SPLIT BET
        int num1,num2;
        num1 = Integer.parseInt(input);
        num2 = Integer.parseInt(input);
        if(choice==1){
            output = " The player chooses the vertical split!!! ";
        }else{
            output = " The player chooses the horizontal split!!! ";
        }
        JOptionPane.showMessageDialog(null, output);
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningSplitNumber = Double.parseDouble(input2);
        //program generates the two vertically,horizontally,adjacent winning split numbers
        winningSplitNumber = generateWinningNumber();
        if(choice==winningSplitNumber){
            payout = (17*betOnWinningSplitNumber) + betOnWinningSplitNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning split number= "+
                    choice + "\nGenerated Winning Split Number= "+winningSplitNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning split number= "+
                    choice + "\nGenerated Winning Split Number= "+winningSplitNumber);
        }
        
        //STREET BET
        int num3,num4,num5;
        choice = Integer.parseInt(input);
        choice = Integer.parseInt(input); 
        choice = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter num3,num4,num5");
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningStreetNumber = Double.parseDouble(input2);
        //program generates the three consecutive winning street numbers
        winningStreetNumber = generateWinningNumber();
        if(playerWinningStreetNumber==winningStreetNumber){
            payout = (8*betOnWinningStreetNumber) + betOnWinningStreetNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning street number= "+
                    playerWinningStreetNumber + "\nGenerated Winning Street Number= "+winningStreetNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning street number= "+
                    playerWinningStreetNumber + "\nGenerated Winning Street Number= "+winningStreetNumber);
        }
        
        //SIX LINE OR DOUBLE STREET BET
        input = JOptionPane.showInputDialog("Enter any six numbers from two horizontal rows"); 
        playerWinningDoubleStreetNumber = Integer.parseInt(input); 
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningDoubleStreetNumber = Double.parseDouble(input2);
        //program generates the six consecutives double street numbers that form two horizontal lines 
        winningDoubleStreetNumber = generateWinningNumber();
        if(playerWinningDoubleStreetNumber==winningDoubleStreetNumber){
            payout = (5*betOnWinningDoubleStreetNumber) + betOnWinningDoubleStreetNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning double street number= "+
                    playerWinningDoubleStreetNumber + "\nGenerated Winning Double Street Number= "+winningDoubleStreetNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning double street number= "+
                    playerWinningDoubleStreetNumber + "\nGenerated Winning Double Street Number= "+winningDoubleStreetNumber);
        }
        
        //TRIO BET
        input = JOptionPane.showInputDialog("Enter any three numbers including a 0"); 
        playerWinningTrioNumber = Integer.parseInt(input); 
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningTrioNumber = Double.parseDouble(input2);
        //program generates the 3 Trio numbers that involves at least one zero
        winningTrioNumber = generateWinningNumber();
        if(playerWinningTrioNumber==winningTrioNumber){
            payout = (6*betOnWinningTrioNumber) + betOnWinningTrioNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning trio number= "+
                    playerWinningTrioNumber + "\nGenerated Winning Trio Number= "+winningTrioNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning trio number= "+
                    playerWinningTrioNumber + "\nGenerated Winning Trio Number= "+winningTrioNumber);
        }
        
        //FIRST FOUR OR BASKET BET
        input = JOptionPane.showInputDialog("Enter 0-1-2-3 for the first four bet"); 
        playerWinningFirstFourNumber = Integer.parseInt(input); 
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningFirstFourNumber = Double.parseDouble(input2);
        /*program generates the the first four or basket bet where the user
          bets on 0-1-2-3
        */ 
        winningFirstFourNumber = generateWinningNumber();
        if(playerWinningFirstFourNumber==winningFirstFourNumber){
            payout = (8*betOnWinningFirstFourNumber) + betOnWinningFirstFourNumber;
            JOptionPane.showMessageDialog(null, "Congrats You Win!!\nYour winning first four number= "+
                    playerWinningFirstFourNumber + "\nGenerated Winning First Four Number= "+winningFirstFourNumber); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning first four number= "+
                    playerWinningFirstFourNumber + "\nGenerated Winning First Four Number= "+winningFirstFourNumber);
        }
        
        
        //OUTSIDE BET
        //HIGH OR LOW BET
        input = JOptionPane.showInputDialog("Enter your number in the range 1 to 18 for low number or 19 to 36 for high number!"); 
        playerWinningLowOrHighNumber = Integer.parseInt(input);
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningLowOrHighNumber = Double.parseDouble(input2);
        //program generates the winning low number or high number
        winningHighOrLowNumber = generateWinningNumber();
        if(playerWinningLowOrHighNumber==winningHighOrLowNumber){
            payout = (1*betOnWinningLowOrHighNumber) + betOnWinningLowOrHighNumber;
            JOptionPane.showMessageDialog(null, "Congrats You win!!!\n\nYour winning number= " +
                    playerWinningLowOrHighNumber + "\nGenerated Winning number= " + winningHighOrLowNumber);
        }
        else{
          JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning number= "+
                    playerWinningLowOrHighNumber + "\nGenerated Winning Number= "+winningHighOrLowNumber);  
        }
        
        //RED OR BLACK COLOR BET
        input = JOptionPane.showInputDialog("Enter 1 for red color or 2 for black color"); 
        playerWinningColor = Integer.parseInt(input);
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningColor = Double.parseDouble(input2); 
        //program generates on the winning color (call method for winning color
        winningColor = generateWinningNumber();
        if(playerWinningColor==winningColor){
            payout = (1*betOnWinningColor) + betOnWinningColor;
            JOptionPane.showMessageDialog(null, "Congrats You win!!!\n\nYour winning color= " +
                    playerWinningColor + "\nGenerated Winning color= " + winningColor);
        }
        else{
            JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning color= "+
                    playerWinningColor + "\nGenerated Winning Color= "+winningColor);
        }
        
        //EVEN OR ODD NUMBER BET
        input = JOptionPane.showInputDialog("Enter {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36}for even numbers or {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35} for odd numbers!"); 
        playerEvenOrOddNumber = Integer.parseInt(input);
        input2 = JOptionPane.showInputDialog("How much you want to bet?");
        betOnWinningEvenOrOddNumber = Double.parseDouble(input2);
        //program generates on the winning even number or oddd number
        winnningEvenOrOddNumber = generateWinningNumber();
        if(playerEvenOrOddNumber==winnningEvenOrOddNumber){
             payout = (1*betOnWinningEvenOrOddNumber) + betOnWinningEvenOrOddNumber;
             JOptionPane.showMessageDialog(null, "Congrats You win!!!\n\nYour winning number= " +
                    playerEvenOrOddNumber + "\nGenerated Winning number= " + winnningEvenOrOddNumber);
        }
        else{
          JOptionPane.showMessageDialog(null, "Bad Luck, You lose this game!!\nYour winning number= "+
                    playerEvenOrOddNumber + "\nGenerated Winning Number= "+winnningEvenOrOddNumber);  
        }
    }
    
    //method definition to see whether the user wants to play the roulette game or he wants to exit
    public static int play(){
        int a = JOptionPane.showConfirmDialog(null,"Make your choice..", "Do you want to play or Exit", 
                JOptionPane.YES_NO_OPTION);
        
        if(a==JOptionPane.YES_OPTION){  
        System.out.println( "Yes, you wanna play the roulette game bet on an appropriate field!!!...." + a );
        }else{
                System.out.println( " Bye!!Have a nice day ahead!" );
                System.exit(0); 
             }
    return a; 
    }
    
    //INSIDE BET
    //method definition for the user to choose any single number
    public static void playOnWinningNumber(){
        
    }
    
    /*method definition for the user to choose if he wants to bet on two vertically ,
      horizontally adjacent numbers
    */
    public static void playOnSplitNumber(){
        
    }
    
    /*method definition for the user to choose if he wants to bet on three consecutive
      numbers in a horiwontal line
    */
    public static void playOnStreetNumber(){
        
    }
   
    /*method definition for the user to choose if he wants to place a bet on six consecutives
     numbers that form two horizontal lines
    */
    public static void playOnDoubleStreetNumber(){
        
    }
    
    /*method definition for the user to choose if he wants to place a bet on 3 numbers that
      involves at least one zero
    */
    public static void playOnTrioNumber(){
        
    }
    
    /*method definition for the user to choose if he wants to place a bet on 0-1-2-3
      (single-zero layout only)
    */
    public static void playOnFirstFourNumber(){
        
    }
    
    //OUTSIDE BET
    //method definition for the user to choose whether he wants to bet on a low number or a high number
    public static void chooseHighOrLowNumber(){
       
    }
    
    //method definition for the user to choose a color
    public static void chooseAcolor(){
       
    }
    
    //method definition for the user to choose whether he wants to bet on an even number or odd number
    public static void chooseEvenOrOddNumber(){
          
    }
    
    //method to generate the winning number
    public static int generateWinningNumber(){
        return (int)(Math.random()*37); 
    }
    
}
       