package latihan;

public class Hrf_Ang {

    Ang_Hrf a = new Ang_Hrf();
    private String h;

    public Hrf_Ang() {
    }
    
    public Hrf_Ang(String h) {
        this.h = h;
    }

    public void satuan() {
        for (int i = 0; i < a.sat.length; i++) {
            if (h.contains(a.sat[i])) {
                System.out.print(a.ang[i]);
            }
        }
    }

    public void belasan() {
        for (int i = 0; i < a.sat.length; i++) {
            if (h.contains(a.sat[i] + " " + a.blk[0])) {
                System.out.print(10 + a.ang[i + 1]);
            }
        }
    }

    public void puluhan() {
        for (int i = 0; i < a.sat.length; i++) {
            for (int j = 0; i < a.sat.length; i++) {
                if (h.contains("se" + a.blk[1])) {
                    System.out.print(a.pul[0]);
                } else if (h.contains(a.sat[i] + " " + a.blk[1])) {
                    System.out.print(a.pul[i]);
                } else if (h.contains(a.sat[i] + " " + a.blk[1] + " " + a.sat[j])) {
                    System.out.print(a.pul[i] + a.ang[j]);
                }
            }
        }
    }

    public void ratusan() {
        for (int i = 0; i < a.sat.length; i++) {
            for (int j = 0; i < a.sat.length; i++) {
                for (int k = 0; i < a.sat.length; k++) {
                    if (h.contains("se" + a.blk[2])) {
                        System.out.print(a.ratus[0]);
                    } else if (h.contains(a.sat[i] + " " + a.blk[2])) {
                        System.out.print(a.ratus[i]);
                    } else if (h.contains(a.sat[i] + " " + a.blk[2] + " " + a.sat[j] + " " + a.blk[1])) {
                        System.out.print(a.ratus[i] + a.pul[j]);
                    } else if (h.contains(a.sat[i] + " " + a.blk[2] + " " + a.sat[j] + " " + a.blk[1] + " " + a.sat[k])) {
                        System.out.print(a.ratus[i] + a.pul[j] + a.ang[k]);
                    } else if (h.contains(a.blk[3])) {
                        System.out.print(a.ratus[9]);
                    }
                }
            }
        }
    }
}
