public class Game
{

    private String [][] board = new String [5][5];
    private String [][] tries = new String [5][5];

    /**
     Creates a 5x5 2D array with 5 prizes repeated 3 times
     which are randomly spread through the 2D Array
     Precondition: none
     Postcondition: 5x5 Penny Pitch Board is randomly created
     
     */ 
       
    public Game()
    {
        int puzzle=0;
        int game=0;
        int ball=0;
        int poster=0;
        int doll=0;
        
        while(puzzle!=3)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(board[row][column] == null )
            {
                board[row][column]="Puzz";
                puzzle++;
            }

        }
        
        while(game!=3)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(board[row][column] == null )
            {
                board[row][column]="Game";
                game++;
            }

        }

        while(ball!=3)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(board[row][column] == null )
            {
                board[row][column]="Ball";
                ball++;
            }

        }
        
        while(poster!=3)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(board[row][column] == null )
            {
                board[row][column]="Post";
                poster++;
            }

        }
        
        while(doll!=3)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(board[row][column] == null )
            {
                board[row][column]="Doll";
                doll++;
            }

        }
        
        for(int i=0; i<5;i++)
        {
            for(int j=0; j<5;j++)
            {
                if(board[i][j] == null )
                {
                    board[i][j]="-";
                }
            }
        }

    }
        /**
     Prints the 2D Array 'board'which was randomly generated in the
     'Game' constructor.
     Precondition: Game object must be initialized.
     Postcondition: Displays the randomly generated Penny Pitch board
     to the user.
     
     @return nothing
     */ 
   
    public void printBoard()
   {
       System.out.println("   0 \t 1 \t 2 \t 3 \t 4");
       int row=0;
       for (int i = 0; i < board.length; i++) 
       {
       System.out.print(row+ " ");
            for(int j = 0; j < board[i].length; j++) 
            {
                System.out.print(board[i][j]+"\t");
            }
            row++;
            System.out.println();
       }
   }
           /**
     Prints the 2D Array 'tries' which was randomly generated in the
     'throwPennies' method.
     Precondition: Game object must be initialized.
     Postcondition: Displays the positions on the board on which the user
     landed a penny at.
     
     @return nothing
     */ 
   
    public void printTries()
   {
       System.out.println("   0 \t 1 \t 2 \t 3 \t 4");
       int row=0;
       for (int i = 0; i < tries.length; i++) 
       {
       System.out.print(row+ " ");
            for(int j = 0; j < tries[i].length; j++) 
            {
                System.out.print(tries[i][j]+"\t ");
            }
            row++;
            System.out.println();
       }
   }  
   
           /**
     Randomly spread pennies represented as the letter 'X' in the 5x5
     2D array called 'tries'.
     Precondition: Game object must be initialized.
     Postcondition: 10 'X's are randomly set in a 5x5 array.
     
     @return nothing
     */ 
   
   public void throwPennies()
   {
        int pennies = 0;
        
        while(pennies!=10)
        {
            int row= (int)(Math.random() * (4+1)+ 0);
            int column= (int)(Math.random() * (4+1)+ 0);
            
            if(tries[row][column] == null )
            {
                tries[row][column]="X";
                pennies++;
            }

        }
        
        for(int i=0; i<5;i++)
        {
            for(int j=0; j<5;j++)
            {
                if(tries[i][j] == null )
                {
                    tries[i][j]="-";
                }
            }
        }
        
   }
   
           /**
     Checks if the user wins by checking if the location of the 'X's in the
     'tries' 2D array are the same than the location of the prizes in the 'board'
     2D array. If 3 pennies land in the same location as the same type of prize, then
     the user will be displayed that has won that prize. If no prize is won, then the user 
     would be displayed that no prize has been won
     Precondition: Game object must be initialized and throwPennies must be called.
     Postcondition: Displays if the user has won or  lost, and if so, what prize(s).
     to the user.
     
     @return nothing
     */ 
   
   public void checkWin()
   {
        int puzzle=0;
        int game=0;
        int ball=0;
        int poster=0;
        int doll=0;
        
       for(int i=0; i<tries.length;i++)
       {
           for(int j=0; j<tries[i].length;j++)
           {
               if(tries[i][j].equals("X"))
               {
                   if(board[i][j].equals("Puzz"))
                   {
                       puzzle++;
                   }
                   
                    if(board[i][j].equals("Game"))
                   {
                       game++;
                   }
                   
                    if(board[i][j].equals("Ball"))
                   {
                       ball++;
                   }
                   
                    if(board[i][j].equals("Post"))
                   {
                       poster++;
                   }
                   
                    if(board[i][j].equals("Doll"))
                   {
                       doll++;
                   }
               }
           }
       }
       
       if(puzzle==3)
       {
           System.out.println("Congrats! You won a Puzzle!");
       }
       
        if(game==3)
       {
           System.out.println("Congrats! You won a Game!");
       }
       
        if(ball==3)
       {
           System.out.println("Congrats! You won a Ball!");
       }
       
        if(poster==3)
       {
           System.out.println("Congrats! You won a Poster!");
       }
       
        if(doll==3)
       {
           System.out.println("Congrats! You won a Doll!");
       }
       
       if(puzzle!=3 && game!=3 && ball!=3 && poster!=3 && doll!=3)
       {
           System.out.println("Unfortunately you did not win anything. Try again later!");
       }
   }

}