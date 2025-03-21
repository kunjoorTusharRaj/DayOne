import java.util.Scanner;

public class cn1 {
    public static void main(String[] args) {
        System.out.println("enter the bucket size");
        Scanner s = new Scanner(System.in);
        int bk = s.nextInt();
        System.out.println("enter the rate ");
        int rate = s.nextInt();
        System.out.println("enter the no of packets");
        int n = s.nextInt();

        
        System.out.println("enter the elements ");
        int ps[] = new int[n];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = s.nextInt();
        }
        int  packetleft = 0, acc = 0,pacsent=0;
        for (int j = 0; j < ps.length; j++) {
            if ((packetleft + ps[j]) <= bk) {
                packetleft += ps[j];
                acc = ps[j];
            } else {
                acc = 0;
            }

            packetleft -= 10;
            if (packetleft > 0) {
                pacsent = rate;
            } else {
                break;
            }
            System.out.println((j + 1) + " " + ps[j] + " " + acc + " " + rate + " " + packetleft);
        }
    }
}
