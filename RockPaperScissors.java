/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rock.paper.scissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mczo4
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scan = new Scanner (System.in); 
                while(true ){
                String [] rps = { "R" , "P" , "S"}; 
                String ComputerMove = rps [new Random().nextInt(rps.length)];

                String PlyerMove ;


                while(true){
                    System.out.println(" Please Enter Your Move : ( R , P , S ) ? ") ;
                    PlyerMove = scan.next(); 
                    if (PlyerMove.equals("R") || PlyerMove.equals("P") || PlyerMove.equals("S"));
                    break ;
                    }
                    System.out.println(PlyerMove + " is not a valid move ! ");
                    System.out.println("Compter Move is : " + ComputerMove);
                    if (PlyerMove.equals(ComputerMove)){
                        System.out.println(" The Game was a draw ! ");
                    } else if (PlyerMove.equals("R")){
                        if (ComputerMove.equals("P")){
                            System.out.println("you lose ");
                        }
                    }else if (PlyerMove.equals("S")){
                        System.out.println("you win !");
                    }
                    else if (PlyerMove.equals("P")){
                        if (ComputerMove.equals("R")){
                            System.out.println("you you win !  ");
                        }
                    }else if (PlyerMove.equals("S")){
                        System.out.println("you lose !");
                    }
                    else if (PlyerMove.equals("S")){
                        if (ComputerMove.equals("P")){
                            System.out.println("you lose ");
                        }
                    }else if (PlyerMove.equals("R")){
                        System.out.println("you lose ");
             }
                        System.out.println("do u want to play again ? (y/n)");
                        String PA = scan.nextLine();
                        if (!PA.equals("y")){
                           break;
            }
        }
    
    }
}






                
            
        
           
        
        


