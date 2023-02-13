/*
    Tic-Tac-Toe Multiplayer Game
    --> FrameWork.java


    Developed 11 Feb 2023
    by Vansh Khaneja
 */


public class FrameWork {
    public String[][] frame;
    void getFrame(){                // This method creates a basic grid frame for tic-tac-toe


        System.out.print ("       |       |       \n");
        System.out.printf("   %s   |   %s   |   %s   \n",frame[0][0],frame[0][1],frame[0][2]);
        System.out.print ("_______|_______|_______\n");
        System.out.print ("       |       |       \n");
        System.out.printf("   %s   |   %s   |   %s   \n",frame[1][0],frame[1][1],frame[1][2]);
        System.out.print ("_______|_______|_______\n");
        System.out.print ("       |       |       \n");
        System.out.printf("   %s   |   %s   |   %s   \n",frame[2][0],frame[2][1],frame[2][2]);
        System.out.print ("       |       |       \n");

    }


}
