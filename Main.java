import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a ;
       do {
           System.out.println("=============================================================");
           System.out.println("enter 1 for addition ");
           System.out.println("enter 2 for subtraction ");
           System.out.println("enter 3 for multiplication ");
           System.out.println("enter 4 for division ");
           System.out.println("enter 5 for square ");
           System.out.println("enter 6 for exit ");
        Scanner myscanner =new Scanner(System.in);
          a=myscanner.nextInt();

              switch (a) {
                  case 1:
                      int x;
                      float y;
                      System.out.print("enter two numbers for addition ");
                      x = myscanner.nextInt();
                      y = myscanner.nextInt();
                      System.out.println("your answer is " +(x + y));
                      break;
                  case 2:
                      System.out.print("enter two numbers for subtraction");
                      x = myscanner.nextInt();
                      y = myscanner.nextInt();
                      System.out.println("your answer is "+(x - y));
                      break;
                  case 3:
                      System.out.print("enter two numbers for multiplication");
                      x = myscanner.nextInt();
                      y = myscanner.nextInt();
                      System.out.println("your answer is "+(x * y));
                      break;
                  case 4:
                      System.out.print("enter two numbers for division");
                      x = myscanner.nextInt();
                      y = myscanner.nextInt();
                      System.out.println("your answer is "+(x/ y));
                      break;
                  case 5:
                      System.out.print("enter a number for square");
                      x = myscanner.nextInt();
                      System.out.println("your answer is "+(x*x));
                      break;

              }
          }while (a!=6);

          }



    }

