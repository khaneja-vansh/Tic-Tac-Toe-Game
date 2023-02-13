/*
    Tic-Tac-Toe Multiplayer Game
    --> GameSetup.java


    Developed 11 Feb 2023
    by Vansh Khaneja
 */
import java.util.Scanner;

public class GameSetup {
    private String player1;
    private String player2;

    public void initialize(){                           // This method asks user's names
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Player 1 Name (O):");
        player1 = input.nextLine();                         // Inputs Player 1 Name
        System.out.print("Enter Player 2 Name (X):");
        player2 = input.nextLine();                         // Inputs Player 2 Name
    }

    public int[] userChoice(){                          // This method asks user the cell to put O or X
        int[] rowCol = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Row    :");
        rowCol[0] = input.nextInt();                        // Inputs Row of cell to place O or X
        System.out.print("Enter Column :");
        rowCol[1] = input.nextInt();                        // Inputs Column of cell to place O or X
        return rowCol;

    }

    public boolean checkWin(String[][] data){           // This method checks if any winning possibility is matched
        boolean win = false;
        String winner = null;

        if(data[0][0].equals("O") && data[1][1].equals("O") && data[2][2].equals("O")){     //DO1 (Diagonal "O" 1)
            win = true;
            winner = player1;

        }
        else if(data[0][2].equals("O") && data[1][1].equals("O") && data[2][0].equals("O")){     //DO2 (Diagonal "O" 2)
            win = true;
            winner = player1;
        }
        else if(data[0][0].equals("X") && data[1][1].equals("X") && data[2][2].equals("X")){     //DX1 (Diagonal "X" 1)
            win = true;
            winner = player2;

        }
        else if(data[0][2].equals("X") && data[1][1].equals("X") && data[2][0].equals("X")){     //DX2 (Diagonal "X" 2)
            win = true;
            winner = player2;

        }
        else if(data[0][0].equals("O") && data[0][1].equals("O") && data[0][2].equals("O")){     //HO1 (Horizontal "O" 1)
            win = true;
            winner = player1;
        }
        else if(data[1][0].equals("O") && data[1][1].equals("O") && data[1][2].equals("O")){     //H02 (Horizontal "O" 2)
            win = true;
            winner = player1;

        }
        else if(data[2][0].equals("O") && data[2][1].equals("O") && data[2][2].equals("O")){     //HO3 (Horizontal "0" 3)
            win = true;
            winner = player1;
        }
        else if(data[0][0].equals("X") && data[0][1].equals("X") && data[0][2].equals("X")){     //HX1 (Horizontal "X" 1)
            win = true;
            winner = player2;

        }
        else if(data[1][0].equals("X") && data[1][1].equals("X") && data[1][2].equals("X")){     //HX2 (Horizontal "X" 2)
            win = true;
            winner = player2;

        }
        else if(data[2][0].equals("X") && data[2][1].equals("X") && data[2][2].equals("X")){     //HX3 (Horizontal "X" 3)
            win = true;
            winner = player2;
        }
        else if(data[0][0].equals("O") && data[1][0].equals("O") && data[2][0].equals("O")){     //VO1 (Vertical "O" 1)
            win = true;
            winner = player1;
        }
        else if(data[0][1].equals("O") && data[1][1].equals("O") && data[2][1].equals("O")){     //V02 (Vertical "O" 2)
            win = true;
            winner = player1;

        }
        else if(data[0][2].equals("O") && data[1][2].equals("O") && data[2][2].equals("O")){     //VO3 (Vertical "0" 3)
            win = true;
            winner = player1;

        }
        else if(data[0][0].equals("X") && data[1][0].equals("X") && data[2][0].equals("X")){     //VX1 (Vertical "X" 1)
            win = true;
            winner = player2;

        }
        else if(data[0][1].equals("X") && data[1][1].equals("X") && data[2][1].equals("X")){     //VX2 (Vertical "X" 2)
            win = true;
            winner = player2;

        }
        else if(data[0][2].equals("X") && data[1][2].equals("X") && data[2][2].equals("X")){     //VX3 (Vertical "X" 3)
            win = true;
            winner = player2;

        }
        if(win) {
            System.out.println(winner + " Won The Game !!!");

        }

        return win;

    }


}
