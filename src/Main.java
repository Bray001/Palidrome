public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    if isPalidrome is number(-1221)
        return true;
    if isPalidrome is number(707)
        return true;
    if isPalidrome is number(11212)
        return false;
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);

        int numberClone = number;
        int reverse = 0;
        int lastDigit = num % 10
        /*

        Find the last digit of number with %.  number % 10 = right most digit
        move reverse to the left.  Multiply by ten.  reverse *= 10;
        Add last digit to reverse;

        Repeat while number > 0
            lastDigit = number % 10
            reverse *= 10
            reverse += lastDigit
            number /= 10
         */

        return reverse == numberClone;



    }
}
