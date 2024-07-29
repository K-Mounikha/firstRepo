//16.Create a class representing a computer, with private variables for CPU and RAM and public methods for running programs.
package inheritance;
class Computer {
    private String cpu;
    private int ram;
    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public void runProgram(String programName) {
        System.out.println("Running " + programName + " on a computer with " + cpu + " CPU and " + ram + "GB RAM.");
    }
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

public class ComputerProgram {

	public static void main(String[] args) {
        Computer myComputer = new Computer("Intel i7", 16);
        myComputer.runProgram("IntelliJ IDEA");
        System.out.println("CPU: " + myComputer.getCpu());
        System.out.println("RAM: " + myComputer.getRam() + "GB");
        myComputer.setCpu("AMD Ryzen 9");
        myComputer.setRam(32);
        System.out.println("Updated CPU: " + myComputer.getCpu());
        System.out.println("Updated RAM: " + myComputer.getRam() + "GB");
        myComputer.runProgram("Eclipse");
		
	}

}
