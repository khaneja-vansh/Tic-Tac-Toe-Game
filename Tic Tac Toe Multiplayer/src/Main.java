/*
    Tic-Tac-Toe Multiplayer Game
    --> Main.java


    Developed 11 Feb 2023
    by Vansh Khaneja
 */

public class Main {
    public static void main(String[] args) {
        FrameWork frameWork = new FrameWork();
        GameSetup setup = new GameSetup();

        String[][] data = {
                           {" "," "," "},
                           {" "," "," "},
                           {" "," "," "}
                        };                      // Creates basic array for tic-tac-toe


        int count = 0;
        setup.initialize();                     // Begins the game by asking players name
        int playerTurn = 1;


        while(!setup.checkWin(data)){

            frameWork.frame=data;               // Updates the grid
            frameWork.getFrame();               // Shows the updated tic-tac-toe grid

            if(count>=9){                       // Checks for the draw
                System.out.println("Its a Draw !!!");
                break;
            }

            System.out.println("Player "+playerTurn+" turn :");

            int[] rowCol = setup.userChoice();  // Takes the user input for location
            int row = rowCol[0];
            int col = rowCol[1];


            if(row>2 || col>2){                 // Checks if row or column id out of range
                System.out.println("Row or Column should be less then 3");
                continue;
            }


            if(data[row][col].equals("O") || data[row][col].equals("X")){       // Checks if the cell is already used
                System.out.println("Already used that location");
                continue;
            }





            if(playerTurn==1){                  // Switches the player turn
                data[row][col] ="O";
                playerTurn=2;
            }
            else{                               // Switches the player turn
                data[row][col] ="X";
                playerTurn=1;
            }

            count++;

            
        }
        frameWork.getFrame();                   // Returns the final grid
    }
}