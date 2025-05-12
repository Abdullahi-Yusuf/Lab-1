public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int num = 100;
        while (num > 0){
            if (num % 2 == 0) {
                num = num / 2;
                counter++;
            }
            else{
                num--;
                counter++;
            }
        }
        System.out.println("The number of steps it takes to reach 0 if you start at 100 is " + counter);
    }
}
