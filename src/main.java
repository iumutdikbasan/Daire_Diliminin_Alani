import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int yaricap,aci;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaricapi giriniz : ");
        yaricap = inp.nextInt();

        System.out.print("Merkez acisini giriniz : ");
        aci = inp.nextInt();

        double dairedilimi = (pi*(yaricap*yaricap)*aci / 360);

        System.out.print("Daire diliminin alani : " + dairedilimi);
    }
}
