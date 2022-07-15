public class Main {
    public static void main(String[] args) {

        int current = 100;
        int topUp = 300;
        int bonus = topUp / 100;

        if (topUp > 1000) {
            current = current + topUp + bonus;
        } else {
            current = current + topUp;
        }
        System.out.println(current);
    }
}