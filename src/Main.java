public class Main {

    public static void main(String[] args) {
//skapa en metod som inkrementerar en siffra med 1 och returnerar siffran

        int num = 10;

        int increment = increment(num);

        System.out.println(increment);
    }

    public static int increment(int number) {
        return ++number;
    }

}
