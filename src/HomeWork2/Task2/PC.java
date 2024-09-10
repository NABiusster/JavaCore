package HomeWork2.Task2;

public class PC {
    private String CPU;
    private String GPU;
    private String RAM;
    private String HDD;

    //Constructors
    //AllArg
    public PC(String CPU, String GPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    //noArg
    public PC() {
    }

    //Getters & Setters
    //CPU
    public String getCPU() {
        return this.CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    //GPU
    public String getGPU() {
        return this.GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    //Ram
    public String getRAM() {
        return this.RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    //HDD
    public String getHDD() {
        return this.HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return  "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                '}';
    }
}
