package by.andersen.training.generating.builder;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer("HDD","RAM","CPU");
    }

    public ComputerBuilder setCPU(String cpu) {
        computer.setcPU(cpu);
        return this;
    }

    public ComputerBuilder setHDD(String hdd) {
        computer.sethDD(hdd);
        return this;
    }

    public ComputerBuilder setRAM(String ram) {
        computer.setrAM(ram);
        return this;
    }

    public Computer getComputer() {
        return computer;
    }

}
