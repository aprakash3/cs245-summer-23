// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
        1. Write a function that computes n!. Write this function without using recursion.
        Example: 4! = 4 * 3 * 2 * 1 = 24
     */
    public static int factorialIterative(int n){
        if(n == 0){
            return 1;
        }
        int result = 1;
        while(n > 0){
            result *=  n;
            n -= 1;
        }
        return result;
    }

    /*
        2. Write a recursive function that computes n!.
        Example: 4! = 4 * 3 * 2 * 1 = 24
     */
    public static int factorialRecursive(int n){
        if(n == 0){
            return 1;
        };
        return n * factorialRecursive(n - 1);
    }

    /*
        3. Reverse the string that is passed as input to the function
        Example: "abCD" --> "DCab"
     */
    public static String reverseString(String s){
        StringBuilder reversed = new StringBuilder();
        int stringLength = s.length();
        for(int sIdx = stringLength - 1; sIdx >= 0; sIdx --){
            reversed.append(s.charAt(sIdx));
        }
        return reversed.toString();
    }

    /*
        4. Assume a and b are positive integers. What does
        the function myFunction return in terms of a and b?
        What is the runtime complexity of the function below?
     */
    public static int myFunction(int a, int b){
        if (b == 0){
            return 1;
        } else if(b % 2 == 0){
            int partialRes = myFunction(a, b / 2);
            return partialRes * partialRes;
        }
        int partialRes = myFunction(a, b / 2);
        return a * partialRes * partialRes;
    }

    public static void main(String[] args){
        System.out.println(Main.factorialIterative(6));
        System.out.println(Main.factorialRecursive(6));
        System.out.println(Main.reverseString("abcEDghA"));
    }
}