/*
create weight, distance, travelTime, speed, gravity, moonName, planetName(etc)
create char userChoice;
//create one big case statement, planetName, moonName, gravity (only variables in case)

do{

Display "Moon Front Property Menu"
Display "----------------------------------"
Display 1. a). Earth\a) Earth
2. b) Jupiter
3. c) Saturn
4. d) Uranus
5. e) Neptune
6. f) Pluto
7. q) Quit
switch(userChoice)
{
case 1.
planetName = "Earth";
moonName = "Luna";
gravity = 0.1654;
break;
case 2.
planetName = "Jupiter";
moonName = "Ganymede";
gravity = 0.146; 
break;
case 3.
planetName = "Saturn";
moonName = "Titan";
gravity = 0.14;
break;
case 4.
planetName = "Uranus";
moonName = "Titania";
gravity = 0.037;
break;
case 5:
planetName = "Neptune";
moonName = "Triton";
gravity = 0.0779;
break;
case 6:
planetName = "Pluto";
moonName = "Charon";
gravity = 0.0288;
break;

}


}while(userChoice != 'q')



*/

import java.util.Scanner;


public class moonProgram
{
   public static void main(String[] args)
   {
     double weight, distance, travelTime, speed, gravity, kiloToMile;
     String moonName, planetName;
     char userChoice;
   
     weight = distance = travelTime = speed = gravity =0;
     userChoice = 's';
     moonName = planetName = " ";
   
      kiloToMile = 0.621371;
      
     Scanner input = new Scanner(System.in);
   
       do{
        
           System.out.println("How much do you weigh?");
           weight = input.nextDouble();
           System.out.println("How fast do you want to travel?");
           speed = input.nextDouble();
         
           System.out.println("Moon Front Property Menu");
           System.out.println("-----------------------");
           System.out.println("1. a) Earth");
           System.out.println("2. b) Jupiter");
           System.out.println("3. c) Saturn");
           System.out.println("4. d) Uranus");
           System.out.println("5. e) Neptune");
           System.out.println("6. f) Pluto");
           System.out.println("7. q) Quit");
           userChoice = input.next().charAt(0);
      
              switch(userChoice)
              {
                case 'a':
            
                   planetName = "Earth";
                   moonName = "Luna";
                   gravity = 0.1654;
                   distance = (384000)/kiloToMile;
               
                   break;
            
                case 'b':
            
                   planetName = "Jupiter";
                   moonName = "Ganymede";
                   gravity = 0.146; 
                   distance = ((778-150)/kiloToMile)*1000000;
               
                   break;
            
               case 'c':
            
                  planetName = "Saturn";
                  moonName = "Titan";
                  gravity = 0.14;
                  distance = ((1433-150)/kiloToMile)*1000000;
               
                  break;
            
               case 'd':
            
                  planetName = "Uranus";
                  moonName = "Titania";
                  gravity = 0.037;
                  distance = ((2875-150)/kiloToMile) * 1000000;
               
                  break;
            
               case 'e': 
            
                  planetName = "Neptune";
                  moonName = "Triton";
                  gravity = 0.0779;
                  distance = ((4500-150)/kiloToMile)*1000000;
               
                  break;
            
               case 'f':
            
                  planetName = "Pluto";
                  moonName = "Charon";
                  gravity = 0.0288;
                  distance = ((5906-150)/kiloToMile)*1000000; 
               
                  break;
            
               case 'q':
            
                  System.exit(0);
            
               default:
                  System.out.println("Invalid char input, try again");
              
                  break;
      
            }
            
            
            
          
              System.out.println("Inter-Planetary Travel: To " + planetName + "'s moon of " + moonName);
              System.out.println("------------------------------------------");
              System.out.println("Your weight on " + moonName + ": " + (weight*gravity));
              System.out.println("Your travel time to " + moonName + ":");
              System.out.println("In Hours: " + (distance/speed));
              System.out.println("In Days: " +  ((distance/speed)/24));
              System.out.println("In Years: " +  (((distance/speed)/24/365)));
      
      
        }while(userChoice != 'q');
    
    }
}