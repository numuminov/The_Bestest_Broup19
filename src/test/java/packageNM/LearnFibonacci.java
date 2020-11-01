package packageNM;

public class LearnFibonacci {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        for(int i=0; i<=15;i++){

            int c=a+b;

            System.out.println(c);

            a=b;
            b=c;

        }
    }
}
