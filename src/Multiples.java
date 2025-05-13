public class Multiples {
    public static int multiplesOf(int n, int a, int b) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        return count;
    }

    public static int main(int n, int a, int b) {
        return multiplesOf(n,a,b);

    }
    public static void main(){
        int numMultiples = multiplesOf(10,3,5);
        System.out.println(numMultiples);
    }
    public static void main(String[] args){
        main();
    }
}
