// Write a program that prints the numbers from 1 to 100 and for multipples of '3' print 'Fizz' instead of the number, and for the multiples of '5' print 'Buzz'.
//1,2,Fizz,4,Buzz,Fizz....Buzz

class Main {
    public static void main(String[] args) {
        //psuedo code
        for (int count = 1; count <= 100; count++) {

            if (count % 3 == 0 && count % 5 == 0 ){
                System.out.println("FizzBuzz");
            }
            else if (count % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (count % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(count);
            }
        }
    }
}