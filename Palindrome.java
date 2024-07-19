public class Palindrome{
    public static void main(String[] args){
        //use to parse args Integer.parseInt() -> Integer.parseInt(args[0])
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        int num6 = Integer.parseInt(args[5]);
        //NO IF STATEMENTS
        boolean result = (num1 == num6) && (num2 == num5) && (num3 == num4);
        //assume all input values will always be integers and that there will always be 6 values
        System.out.println(result);
    }
}