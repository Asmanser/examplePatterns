package by.andersen.training.generating.builder;

public class Computer {

    private String hDD;
    private String rAM;
    private String cPU;

    public Computer() {
    }

    public Computer(String hDD, String rAM, String cPU) {
        this.hDD = hDD;
        this.rAM = rAM;
        this.cPU = cPU;
    }

    public String gethDD() {
        return hDD;
    }

    public void sethDD(String hDD) {
        this.hDD = hDD;
    }

    public String getrAM() {
        return rAM;
    }

    public void setrAM(String rAM) {
        this.rAM = rAM;
    }

    public String getcPU() {
        return cPU;
    }

    public void setcPU(String cPU) {
        this.cPU = cPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hDD='" + hDD + '\'' +
                ", rAM='" + rAM + '\'' +
                ", cPU='" + cPU + '\'' +
                '}';
    }
}
