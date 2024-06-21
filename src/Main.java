import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Specify the value of s (Указываем значение s)
        int s=3; 

        //Reading numbers as a string (Читаем числа как строку)
        System.out.print("Enter a number: ");
        String digit = scanner.nextLine();

       if(digit.chars().allMatch( Character::isDigit))
       {
           logicProgram(s,digit);
       }
       else
       {
           System.out.println("Incorrect number entry!");
       }


}


    //A method for printing a single number in the style of an LCD display
    public static void logicProgram(int s, String digit)
    {

        for (int level = 1; level <=5; level++ ) {
            if(level %2 == 0)
            {
                for (int count = 0; count<s;count++)
                {
                    Cycle(s,digit,level);
                }
            }
            else
            {
                Cycle(s,digit,level);
            }
        }
    }
    public static void Cycle(int s, String digit, int level)
    {
        for(int j=0;j <digit.length();j++){
            char digit2 = digit.charAt(j);// We process each number (Обрабатываем каждое число)
            printNumber (digit2, s,level);
            System.out.print("  ");
        }
        System.out.println();
    }
public static void printNumber(char digit, int s, int level) {
    switch (digit) {
        case '0':
               switch (level){
                  case 1:
                      System.out.print(" "+"-".repeat(s)+" ");
                      break;
                  case 2:
                      System.out.print("|" + " ".repeat(s) + "|");
                      break;
                  case 3:
                      System.out.print(" " +" ".repeat(s)+ " ");
                    break;
                   case 4:
                       System.out.print("|" + " ".repeat(s) + "|");
                     break;
                  case 5:
                      System.out.print(" "+ "-".repeat(s)+" ");
                    break;
              }
            break;
        case '1':
            switch (level){
                case 1:
                    System.out.print(" ");
                    break;
                case 2:
                    System.out.print("|");
                    break;
                case 3:
                    System.out.print(" ");
                    break;
                case 4:
                    System.out.print("|");
                    break;
                case 5:
                    System.out.print(" ");
                    break;
            }
            break;
        case '2':
            switch (level){
                case 1:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print(" "+" ".repeat(s)+"|");
                    break;
                case 3:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print("|"+ " ".repeat(s)+" ");
                    break;
                case 5:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
            }
            break;
        case '3':
            switch (level){
                case 1:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print(" "+" ".repeat(s)+"|");
                    break;
                case 3:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print(" "+" ".repeat(s) + "|");
                    break;
                case 5:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
            }
            break;
        case '4':
            switch (level){
                case 1:
                    System.out.print(" "+" ".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print("|" + " ".repeat(s) + "|");
                    break;
                case 3:
                    System.out.print(" " + "-".repeat(s) +" ");
                    break;
                case 4:
                    System.out.print(" "+" ".repeat(s)+"|");
                    break;
                case 5:
                    System.out.print(" "+" ".repeat(s)+" ");
                    break;
            }
            break;
        case '5':
            switch (level){
                case 1:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print("|"+" ".repeat(s)+" ");
                    break;
                case 3:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print(" "+" ".repeat(s) + "|");
                    break;
                case 5:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
            }
            break;
        case '6':
            switch (level){
                case 1:
                    System.out.print( " "+"-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print("|"+ " ".repeat(s)+" ");
                    break;
                case 3:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print("|"+" ".repeat(s)+"|");
                    break;
                case 5:
                    System.out.print( " "+"-".repeat(s)+" ");
                    break;
            }
            break;
        case '7':
            switch (level){
                case 1:
                    System.out.print(" "+"-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print( " "+" ".repeat(s) + "|");
                    break;
                case 3 :
                    System.out.print(" "+" ".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print(" "+" ".repeat(s) + "|");
                    break;
                case 5:
                    System.out.print(" " +" ".repeat(s)+" ");
                    break;
            }
            break;
        case '8':
            switch (level){
                case 1:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print("|"+" ".repeat(s)+"|");
                    break;
                case 3:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print("|"+" ".repeat(s)+"|");
                    break;
                case 5:
                    System.out.print(" "+ "-".repeat(s)+ " ");
                    break;
            }
            break;
        case '9':
            switch (level){
                case 1:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
                case 2:
                    System.out.print("|"+" ".repeat(s)+"|");
                    break;
                case 3:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
                case 4:
                    System.out.print(" "+" ".repeat(s)+"|");
                    break;
                case 5:
                    System.out.print(" "+ "-".repeat(s)+" ");
                    break;
            }

            break;
        default:;
    }
}
}
