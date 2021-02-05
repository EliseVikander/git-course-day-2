public class Main {

    public static void main(String[] args) {
//skapa en metod som inkrementerar en siffra med 1 och returnerar siffran
        //lägg till metod som dekrementerar den siffran

        int num = 10;

        int increment = increment(num);
        int decrement = decrement(increment);

        System.out.println(increment);
        System.out.println(decrement);
    }

    public static int increment(int number) {
        return ++number;
    }

    public static int decrement (int number) {
        return --number;
    }

}
