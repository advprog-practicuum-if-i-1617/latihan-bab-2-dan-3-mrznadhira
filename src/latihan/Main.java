package latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Silahkan masukkan angka: ");
        int a = in.nextInt();
        Ang_Hrf o = new Ang_Hrf(a);

        System.out.print("Output: ");
        o.getSatuan();
        o.getBelasan();
        o.getPuluhan();
        o.getRatusan();

        System.out.print("\n\nSilahkan masukkan terbilang angka: ");
        in.nextLine();
        String s = in.nextLine();
        
        System.out.print("Output: ");
        Hrf_Ang p = new Hrf_Ang(s);
        p.satuan();
        p.belasan();
        p.puluhan();
        p.ratusan();
    }
}
