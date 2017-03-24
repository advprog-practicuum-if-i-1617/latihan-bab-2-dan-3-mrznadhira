package latihan;

public class Ang_Hrf {

    protected int ang[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    protected int pul[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    protected int ratus[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    protected String sat[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
    protected String blk[] = {"belas", "puluh", "ratus", "seribu"};
    protected int a;

    public Ang_Hrf() {
    }

    public Ang_Hrf(int a) {
        this.a = a;
    }

    public void getSatuan(int... params) {
        for (int i = 0; i < ang.length; i++) {
            if (a == ang[i] && a >= 0 && a < 10) {
                System.out.print(sat[i]);
            }
        }
    }

    public void getBelasan() {
        for (int i = 0; i < ang.length; i++) {
            if (a > 10 && a < 20) {
                int awal = a % 10;
                System.out.printf("%s %s", ang[awal], blk[0]);
            }
        }
    }

    public void getPuluhan(int... params) {
        for (int i = 0; i < 10; i++) {
            //10
            if (a == pul[0]) {
                System.out.printf("%s ", sat[11]);
                //20,30...
            } else if (a > 19 && a < 100 && a != pul[0]) {
                int p = a / 10;
                if (p == ang[i] && ang[i] > 1) {
                    System.out.printf("%s %s ", sat[i], blk[1]);
                    //20-an,30-an,....
                }
            } else if (a > pul[i]) {
                for (int j = 0; i < 10; i++) {
                    int s = a % 10;
                    int p = a - s;
                    int t = p / 10;
                    if (t == ang[i] && ang[i] > 1 && s == ang[j] && ang[j] > 0) {
                        System.out.print(sat[i] + " " + blk[1] + " " + sat[j]);
                    }
                }
            }
        }
    }

    public void getRatusan() {
        for (int i = 0; i < pul.length; i++) {
            //100
            if (a == ratus[0]) {
                System.out.printf("se%s ", blk[2]);
                //200,300,....
            } else if (a > 100 && a < 1000 && a != ratus[0]) {
                int awal = a / 100;
                if (awal == ang[i]) {
                    System.out.printf("%s %s ", sat[i], blk[2]);
                    //200-an,300-an,...
                }
            } else if (a > 100 && a < 1000 && a != ratus[i]) {
                int p = a % 100;
                int r = a - p;
                int r1 = r / 100;
                System.out.printf("%s %s ", sat[r], blk[2]);
                getPuluhan(p);
            } else if (a == 1000) {
                System.out.printf("%s ", blk[3]);
            }
        }
    }
}