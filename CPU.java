public class CPU {
    
    double price;
    
    
    class Processor {
        int noOfCores;
        String manufacturer;

       
        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

     
        void displayProcessorInfo() {
            System.out.println("Processor Info:");
            System.out.println("Number of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    
    static class Ram {
        int memory;
        String manufacturer;

        
        Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

       
        void displayRamInfo() {
            System.out.println("RAM Info:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

   
    CPU(double price) {
        this.price = price;
    }

    
    void displayPrice() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
 
        CPU myCPU = new CPU(399.99);

       
        CPU.Processor myProcessor = myCPU.new Processor(8, "Intel");

       
        CPU.Ram myRam = new CPU.Ram(16, "Corsair");

     
        myCPU.displayPrice();
        myProcessor.displayProcessorInfo();
        myRam.displayRamInfo();
    }
}
