public class Reduce {
    public static int reduce(int num) {
        int counter = 0;
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
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
}
