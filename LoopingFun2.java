//Kevin Kovack
      public class LoopingFun2 
      {

          public static void main( String [] args ) 
          {
             
              int index = 1;
              int sum = 0;
              do 
              {
                  sum+=index;
                  System.out.println( index + " <--index // sum--> " + sum);
                  index++;

     
              }while ( index < 101 );
          }
      }