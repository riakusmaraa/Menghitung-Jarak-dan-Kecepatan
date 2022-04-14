import java.util.Scanner;

public class glbb {
    public static void main(String[] args) {
        double V0, a, t, Vt, s;
        
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan kecepatan awal benda (V0): ");
        V0 = input.nextDouble();
        
        System.out.print("Masukkan percepatan benda (a): ");
        a = input.nextDouble();
        
        System.out.print("Waktu yang ditempuh benda (t): ");
        t = input.nextDouble();
        
        //proses
        Vt = V0 + (a*t);
        s =  (V0*t) + (0.5*a*Math.pow(t, 2));
        
        //output
        System.out.println("Kecepatan benda (Vt) adalah " + String.format("%.1f", Vt) + " m/s");
        
        System.out.println("Jarak yang ditempuh benda (s) adalah " + String.format("%.1f", s) + " m");
        
        
    }
}
