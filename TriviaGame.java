/****************** 

* Project: FinalCulminating

* Programmer: Hiba Fatima 

* Date: February 4, 2021

* Program: FinalCulminating.java 

*******************/
package finalculminating;
import java.util.Scanner;

public class FinalCulminating {

    public static void main(String[] args) {
        Scanner scanS = new Scanner (System.in);   
        //listing main method variables
        char[] letters = {'a','b','c','d','e','f','g','h','i'};
        char response;
        int diceroll;
        int count;
        
        //caling intro method with title and instructions
        intro();
        
        //do while for the game to loop while user wants to play again
        do 
        {
            diceroll = (int) (1 + Math.random( ) * (6 - 1 + 1));
            System.out.println("\nYou rolled a " + diceroll);

            switch (diceroll) //switch with case for each category
            {
                case 1: 
                {
                    count = math(letters);
                    result(count);
                    break;
                }
                case 2: 
                {
                    count = geography(letters);
                    result(count);
                    break;
                }
                case 3: 
                {
                    count = science(letters);
                    result(count);
                    break;
                }
                case 4: 
                {
                    count = history(letters);
                    result(count);
                    break;
                }
                case 5: 
                {
                    count = sports(letters);
                    result(count);
                    break;
                }
                case 6: 
                {
                    count = general(letters);
                    result(count);
                    break;
                }
            }
            //asking user if they want to play again
            System.out.println("Do you want to play again? Y/N");
            response = scanS.nextLine().charAt(0);   
        } while (response == 'Y' || response == 'y');   
        
    }//end of main 
    
        /**
         * Into 
         * This method prints the title banner and the instructions for the game
         */
        public static void intro() {

           System.out.print("     \t\t\t\t");
           for (int i = 0; i < 22; i++)
           {          
               System.out.print("*");
           }

           System.out.println("\n\t\t\t\t*Hiba's Tricky Trivia*");

           System.out.print("     \t\t\t\t");
           for (int i = 0; i < 22; i++)
           {
               System.out.print("*");
           }    

           System.out.println("\n\nWelcome To Hiba's Tricky Trivia!");
            
           //instructions of the game
           System.out.println("\nA dice will be rolled with the numbers 1-6."
                   + "\nThe number rolled is the category of questions you will be answering:"
                   + "\n1 = Math \n2 = Geography \n3 = Science \n4 = History"
                   + "\n5 = Sports \n6 = General Knowledge");
           System.out.println("You receive one point for every correct answer.\n"
                   + "If you get the question wrong, you move on to the next question."
                   + "\nIn order to win, you must get 3 correct answers out of the 5 that will be displayed."
                   + "\nGood luck!");

       } //end of intro 

     
            /**
             * math 
             * this method has the math category questions that the user must answer
             * @param letters- an array of letter that correspond with the answer arrays
             * @return- returns the count of how many correct answers the user had
             */
            public static int math(char letters[]) {

           Scanner scanS = new Scanner (System.in);
            //variable for math method
           int math1[] = {24, 15, 18, 27, 9, 3, 10};
           int math2[] = {12, 11, 7, 10, 13};
           int math3[] = {6, 33, 25, 15, 20, 5};
           int math4[] = {6, 8, 4, 5};
           int math5[] = {30, 28, 32, 31};
           int count = 0;//counter will be returned

           System.out.println("\nWelcome to the math category!"
                   + "\nAnswer the multiple choice questions by choosing the corresponding letter."
                   + "\nRemember: You need 3 right answers out of 5 to win!");

           System.out.println("\nPlease enter your name:");
           String name = scanS.nextLine();              

            //asking and scanning answer to questions
           System.out.println("\nFirst question: Which is the prime number in this list?");
           for (int i = 0; i < math1.length; i++)
           {
               System.out.println(letters[i] + ") " + math1[i]);
           }
           String answer1 = scanS.nextLine();

           if (answer1.equalsIgnoreCase("f")) 
           {
               count++;
               System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
           } 
           else 
           {
               System.out.println("Incorrect, " + name + "! The answer was 3. You have answered " + count + " question(s) correct so far.");
           }

           System.out.println("\nSecond question: Which is the sqaure root of 144?");
           for (int i = 0; i < math2.length; i++) 
           {
               System.out.println(letters[i] + ") " + math2[i]);
           }
           String answer2 = scanS.nextLine();

           if (answer2.equalsIgnoreCase("a")) 
           {
               count++;
               System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
           } 
           else 
           {
               System.out.println("Incorrect, " + name + "! The answer was 12. You have answered " + count + " question(s) correct so far.");
           }

           System.out.println("\nThird question: What is five squared?");
           for (int i = 0; i < math3.length; i++) 
           {
               System.out.println(letters[i] + ")" + math3[i]);
           }
           String answer3 = scanS.nextLine();

           if (answer3.equalsIgnoreCase("c")) 
           {
               count++;
               System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
           } 
           else 
           {
               System.out.println("Incorrect, " + name + "! The answer was 25. You have answered " + count + " question(s) correct so far.");
           }

           System.out.println("\nFourth question: How many sides are in a hexagon?");
           for (int i = 0; i < math4.length; i++) 
           {
               System.out.println(letters[i] + ")" + math4[i]);
           }
           String answer4 = scanS.nextLine();

           if (answer4.equalsIgnoreCase("a")) 
           {
               count++;
               System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
           } 
           else 
           {
               System.out.println("Incorrect, " + name + "! The answer was 6. You have answered " + count + " question(s) correct so far.");
           }

           System.out.println("\nFinal question: What is 23+8?");
           for (int i = 0; i < math5.length; i++) 
           {
               System.out.println(letters[i] + ")" + math5[i]);
           }
           String answer5 = scanS.nextLine();

           if (answer5.equalsIgnoreCase("d")) 
           {
               count++;
               System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
           } 
           else 
           {
               System.out.println("Incorrect, " + name + "! The answer was 6. You have answered " + count + " question(s) correct so far.");
           }

           return count;

       } //end of math

            /**
             * geography
             * this method has the geography category questions that the user must answer
             * @param letters-an array of letter that correspond with the answer arrays
             * @return -returns the count of how many correct answers the user had
             */
            public static int geography (char letters[]){           
             Scanner scanS = new Scanner (System.in);
             //variables for geography method
             int geography1[] = {2,4,3,1};
             int geography2[] = {0,3,2,1};             
             String geography3[] = {"China", "Canada", "Russia", "US", "Australia"};
             String geography4[] = {"India", "Japan", "Canada", "US", "Brazil"};
             String geography5[] = {"Egypt", "Sudan", "Algeria", "Libya", "Afghanistan"};
             int count = 0; //counter will be returned
             
             System.out.println("\nWelcome to the geography category!"
                + "\nAnswer the multiple choice questions by choosing the corresponding letter."
                + "\nRemember: You need 3 right answers out of 5 to win!");
                  
            System.out.println("\nPlease enter your name:");
            String name = scanS.nextLine();   
              //asking and scanning answer to questions
            System.out.println("\nFirst question: How many time zones does China have?");
            for (int i = 0; i < geography1.length; i++)
            {
                System.out.println(letters[i] + ") " + geography1[i]);
            }
            String answer1 = scanS.nextLine();

            if (answer1.equalsIgnoreCase("d")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 1. You have answered " + count + " question(s) correct so far.");
            }
        
            System.out.println("\nSecond question: How many countries does the United States share a land border with?");
            for (int i = 0; i < geography2.length; i++)
            {
                System.out.println(letters[i] + ") " + geography2[i]);
            }
            String answer2 = scanS.nextLine();

            if (answer2.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 2. You have answered " + count + " question(s) correct so far.");
            }      
            
            System.out.println("\nThird question: Which is the largest country in the world?");
            for (int i = 0; i < geography3.length; i++)
            {
                System.out.println(letters[i] + ") " + geography3[i]);
            }
            String answer3 = scanS.nextLine();

            if (answer3.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was Russia. You have answered " + count + " question(s) correct so far.");
            }         
            
            System.out.println("\nFourth question: Which country has the most natural lakes?");
            for (int i = 0; i < geography4.length; i++)
            {
                System.out.println(letters[i] + ") " + geography4[i]);
            }
            String answer4 = scanS.nextLine();

            if (answer4.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was Canada. You have answered " + count + " question(s) correct so far.");
            } 
            
            System.out.println("\nFinal question: Which African nation has the most pyramids?");
            for (int i = 0; i < geography5.length; i++)
            {
                System.out.println(letters[i] + ") " + geography5[i]);
            }
            String answer5 = scanS.nextLine();

            if (answer5.equalsIgnoreCase("b")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was Sudan. You have answered " + count + " question(s) correct so far.");
            }                
            return count;  
            }//end of geography
            
            /**
             * science
             * this method has the science category questions that the user must answer
             * @param letters-an array of letter that correspond with the answer arrays
             * @return -returns the count of how many correct answers the user had
             */
            public static int science (char letters[])
            {
            Scanner scanS = new Scanner (System.in);
            //variables for science method
            String science1[] = {"Hydrogen", "Nitrogen", "Oxygen", "Bromine", "Chlorine"};
            String science2[] = {"Mercury", "Venus", "Mars", "Jupiter", "Earth"};
            String science3[] = {"Core", "Crust", "Mantle", "Atmosphere"};
            String science4[] = {"Ionic", "Venus", "Polar", "Hydrogen", "Covalent"};
            int science5[] = {7, 6, 5, 10, 2};
            int count=0; //counter will be returned 
            
            System.out.println("\nWelcome to the science category!"
            + "\nAnswer the multiple choice questions by choosing the corresponding letter."
            + "\nRemember: You need 3 right answers out of 5 to win!");
                  
            System.out.println("\nPlease enter your name:");
            String name = scanS.nextLine(); 
              //asking and scanning answers to questions
            System.out.println("\nFirst question: Which essential gas is important so that we can breath?");
            for (int i = 0; i < science1.length; i++)
            {
                System.out.println(letters[i] + ") " + science1[i]);
            }
            String answer1 = scanS.nextLine();

            if (answer1.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was oxygen. You have answered " + count + " question(s) correct so far.");
            }                
                 
            System.out.println("\nSecond question: Which planet is closest to the sun?");
            for (int i = 0; i < science2.length; i++)
            {
                System.out.println(letters[i] + ") " + science2[i]);
            }
            String answer2 = scanS.nextLine();

            if (answer2.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was mercury. You have answered " + count + " question(s) correct so far.");
            } 
            
            System.out.println("\nThird question: What is the outter most layer of the Earth?");
            for (int i = 0; i < science3.length; i++)
            {
                System.out.println(letters[i] + ") " + science3[i]);
            }
            String answer3 = scanS.nextLine();

            if (answer3.equalsIgnoreCase("b")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was the crust. You have answered " + count + " question(s) correct so far.");
            }  

            System.out.println("\nFourth question: What type of bond involves the sharing of electron pairs between different atoms?");
            for (int i = 0; i < science4.length; i++)
            {
                System.out.println(letters[i] + ") " + science4[i]);
            }
            String answer4 = scanS.nextLine();

            if (answer4.equalsIgnoreCase("e")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was covalent bond. You have answered " + count + " question(s) correct so far.");
            }       
            
            System.out.println("\nFinal question: What is the pH of a neutral solution?");
            for (int i = 0; i < science5.length; i++)
            {
                System.out.println(letters[i] + ") " + science5[i]);
            }
            String answer5 = scanS.nextLine();

            if (answer5.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 7. You have answered " + count + " question(s) correct so far.");
            }              
            return count;
            }//end of science       
         
            
            /**
             * history
             * this method has the history category questions that the user must answer
             * @param letters-an array of letter that correspond with the answer arrays
             * @return -returns the count of how many correct answers the user had
             */
            public static int history(char letters[]){
            Scanner scanS = new Scanner (System.in);
            //variables for history method
            String history1[] = {"Sweden", "Afghanistan", "Finland", "Poland"}; //soviet union never invade sweden
            int history2[] = {3, 2, 4, 6, 5}; //henry the eighth wive
            int history3[] = {1911, 1914, 1922, 1925}; //2 ww1
            String history4[] = {"WW1", "The Vietnam War", "WW2", "The Falklands War"};
            String history5[] = {"Lightbulb", "Phone", "Car", "Airplane"};
            int count = 0;//counter will be returned
              //asking and scanning answers to questions
             System.out.println("\nWelcome to the history category!"
            + "\nAnswer the multiple choice questions by choosing the corresponding letter."
            + "\nRemember: You need 3 right answers out of 5 to win!");
                  
            System.out.println("\nPlease enter your name:");
            String name = scanS.nextLine();
            
            System.out.println("\nFirst question: Which country did the Soviet Union never invade?");
            for (int i = 0; i < history1.length; i++)
            {
                System.out.println(letters[i] + ") " + history1[i]);
            }
            String answer1 = scanS.nextLine();

            if (answer1.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was Sweden. You have answered " + count + " question(s) correct so far.");
            }   
            
            System.out.println("\nSecond question: How many wives did Henry the VII have?");
            for (int i = 0; i < history2.length; i++)
            {
                System.out.println(letters[i] + ") " + history2[i]);
            }
            String answer2 = scanS.nextLine();

            if (answer2.equalsIgnoreCase("d")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 6. You have answered " + count + " question(s) correct so far.");
            }  
            
            System.out.println("\nThird question: When did World War 1 start?");
            for (int i = 0; i < history3.length; i++)
            {
                System.out.println(letters[i] + ") " + history3[i]);
            }
            String answer3 = scanS.nextLine();

            if (answer3.equalsIgnoreCase("b")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 1914. You have answered " + count + " question(s) correct so far.");
            }  
            
            System.out.println("\nFourth question: Which war started in 1939 and ended in 1945?");
            for (int i = 0; i < history4.length; i++)
            {
                System.out.println(letters[i] + ") " + history4[i]);
            }
            String answer4 = scanS.nextLine();

            if (answer4.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was WW2. You have answered " + count + " question(s) correct so far.");
            }   
            
            System.out.println("\nFinal question: What did Thomas Edison invent?");
            for (int i = 0; i < history5.length; i++)
            {
                System.out.println(letters[i] + ") " + history5[i]);
            }
            String answer5 = scanS.nextLine();

            if (answer5.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was the lightbulb. You have answered " + count + " question(s) correct so far.");
            }               
            return 0; 
            }//end of history           
            
            /**
             * sports
             * this method has the sports category questions that the user must answer
             * @param letters-an array of letter that correspond with the answer arrays
             * @return -returns the count of how many correct answers the user had
             */
            public static int sports(char letters[]) {
            Scanner scanS = new Scanner (System.in);
            //variables for sports method
            String sports1[] = {"Hockey", "Football", "Lacrosse", "Golf"};
            int sports2[] = {3, 1, 4, 6};
            String sports3[] = {"Toronto Raptors", "Miami Heat", "Golden State Warriors", "Brooklyn Nets"};
            String sports4[] = {"Football", "Cricket", "Hockey", "Soccer"};
            int sports5[] = {10, 12, 9, 7};
            int count=0; //counter will be returned
              //asking and scanning answers to questions
            System.out.println("\nWelcome to the sports category!"
            + "\nAnswer the multiple choice questions by choosing the corresponding letter."
            + "\nRemember: You need 3 right answers out of 5 to win!");
                  
            System.out.println("\nPlease enter your name:");
            String name = scanS.nextLine();
            
            System.out.println("\nFirst question: What is Canada’s national sport?");
            for (int i = 0; i < sports1.length; i++)
            {
                System.out.println(letters[i] + ") " + sports1[i]);
            }
            String answer1 = scanS.nextLine();

            if (answer1.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was lacrosse. You have answered " + count + " question(s) correct so far.");
            }    
            
            System.out.println("\nSecond question: The Olympics are held every how many years?");
            for (int i = 0; i < sports2.length; i++)
            {
                System.out.println(letters[i] + ") " + sports2[i]);
            }
            String answer2 = scanS.nextLine();

            if (answer2.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was every 4 years. You have answered " + count + " question(s) correct so far.");
            }   
            
            System.out.println("\nThird question: Who won the 2019 NBA championship?");
            for (int i = 0; i < sports3.length; i++)
            {
                System.out.println(letters[i] + ") " + sports3[i]);
            }
            String answer3 = scanS.nextLine();

            if (answer3.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was the Raptors. You have answered " + count + " question(s) correct so far.");
            }      
            
            System.out.println("\nFourth question: What is the most watched sport in the world?");
            for (int i = 0; i < sports4.length; i++)
            {
                System.out.println(letters[i] + ") " + sports4[i]);
            }
            String answer4 = scanS.nextLine();

            if (answer4.equalsIgnoreCase("d")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was soccer. You have answered " + count + " question(s) correct so far.");
            }     
            
            System.out.println("\nFinal question: How many players are on a baseball team?");
            for (int i = 0; i < sports5.length; i++)
            {
                System.out.println(letters[i] + ") " + sports5[i]);
            }
            String answer5 = scanS.nextLine();

            if (answer5.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 9. You have answered " + count + " question(s) correct so far.");
            }   
            
            return count;           
            }//end of sports
            
            /**
             * general
             * this method has the general knowledge category questions that the user must answer
             * @param letters-an array of letter that correspond with the answer arrays
             * @return -returns the count of how many correct answers the user had
             */       
            public static int general(char letters[]) {
            Scanner scanS = new Scanner (System.in);
            //variables for general method 
            int general1[] = {4, 3, 8, 5};
            String general2[] = {"Born with them", "Woke up with them after a strange dream", "Bitten by a spider", "Experiment gone wrong"};
            String general3[] = {"Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party"};
            String general4[] = {"Visible light", "Infrared radiation", "X-rays and gamma rays", "Ultraviolet radiation" };
            String general5[] = {"120 cm", "100 cm", "110 cm", "90 cm" };
            int count=0; //counter will be returned 
              //asking and scanning answers to questions
            System.out.println("\nWelcome to the general knowledge category!"
            + "\nAnswer the multiple choice questions by choosing the corresponding letter."
            + "\nRemember: You need 3 right answers out of 5 to win!");
                  
            System.out.println("\nPlease enter your name:");
            String name = scanS.nextLine();  
            
            System.out.println("\nFirst question: How many rings are on the Olympic flag?");
            for (int i = 0; i < general1.length; i++)
            {
                System.out.println(letters[i] + ") " + general1[i]);
            }
            String answer1 = scanS.nextLine();

            if (answer1.equalsIgnoreCase("d")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 5. You have answered " + count + " question(s) correct so far.");
            }   
            
            System.out.println("\nSecond question: How did Spider-Man get his powers?");
            for (int i = 0; i < general2.length; i++)
            {
                System.out.println(letters[i] + ") " + general2[i]);
            }
            String answer2 = scanS.nextLine();

            if (answer2.equalsIgnoreCase("c")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! He was bitten by a spider. You have answered " + count + " question(s) correct so far.");
            } 
            
            System.out.println("\nThird question: Hitler party which came into power in 1933 is known as?");
            for (int i = 0; i < general3.length; i++)
            {
                System.out.println(letters[i] + ") " + general3[i]);
            }
            String answer3 = scanS.nextLine();

            if (answer3.equalsIgnoreCase("b")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was the Nazi Party. You have answered " + count + " question(s) correct so far.");
            }        
            
            System.out.println("\nFourth question: What does the ozone layer restrict?");
            for (int i = 0; i < general4.length; i++)
            {
                System.out.println(letters[i] + ") " + general4[i]);
            }
            String answer4 = scanS.nextLine();

            if (answer4.equalsIgnoreCase("d")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was the ultraviolet radiation. You have answered " + count + " question(s) correct so far.");
            }        
            
            System.out.println("\nFinal question: How tall can an Emperor Penguin grow to?");
            for (int i = 0; i < general5.length; i++)
            {
                System.out.println(letters[i] + ") " + general5[i]);
            }
            String answer5 = scanS.nextLine();

            if (answer5.equalsIgnoreCase("a")) 
            {
                count++;
                System.out.println("Correct " + name + "! You have answered " + count + " question(s) correct so far.");
            } 
            else 
            {
                System.out.println("Incorrect, " + name + "! The answer was 120 cm. You have answered " + count + " question(s) correct so far.");
            }               
            return count;
            }//end of general
            
            public static void result(int count) {
        
                //using if..else to tell user if they won or not
            if (count >= 3)
            {
                System.out.println("\nGood job! You got " +count+ " questions right!"
                        + " That means you won!!!");
            }
            else
            {
                System.out.println("\nSorry you got less than 3 questions correct."
                        + " Better luck next time :(");
            }      
            } //end of result
}//end of class
