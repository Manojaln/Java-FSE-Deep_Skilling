package builder;

public class BuilderTest {
public static void main(String[] args) {
	// Creating a basic computer
    Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
            .build();
    System.out.println("--Basic Computer--");
    System.out.println(basicComputer);

    // Creating a high-end gaming PC
    Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
            .setStorage("1TB SSD")
            .setGpu("NVIDIA RTX 4080")
            .setOs("Windows 11 Pro")
            .build();

    System.out.println("---Gaming Computer---");
    System.out.println(gamingComputer);
}
}
