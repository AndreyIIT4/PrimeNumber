import java.util.Scanner;

public class PrimeNumber {
    private int n;
    Scanner scan = new Scanner(System.in);
    public void scanNumber()
    {
        System.out.print("Range 1-");
        setN();
        System.out.print("Prime Numbers: ");
        for (int i = 1; i <getN(); i++) {
            if (i==1) continue;
            if(i>2 & i%2 == 0) continue;
            if(i>3 & i%3 == 0) continue;
            if(i>5 & i%5 == 0) continue;
            if(i>7 & i%7 == 0) continue;
            else System.out.print( i + "  ");
        }
    }

    public void setN() {
        this.n = scan.nextInt();
    }

    public int getN() {
        return n;
    }
}