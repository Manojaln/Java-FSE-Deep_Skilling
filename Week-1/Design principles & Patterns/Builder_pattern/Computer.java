package builder;

public class Computer {
	// Required variable
    private final String cpu;
    private final String ram;
    // Optional variable
    private final String storage;
    private final String gpu;
    private final String os;
    private Computer(Builder builder) {
		super();
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.gpu = builder.gpu;
		this.os = builder.os; }
    
    public static class Builder{
    	 // Required
        private final String cpu;
        private final String ram;
        private String storage = "256GB SSD";
        private String gpu = "Integrated";
        private String os = "No OS";
		public Builder(String cpu, String ram) {
			super();
			this.cpu = cpu;
			this.ram = ram;
		}
        
		//Builder method for those optional field 
		public Builder setStorage(String storage) {
            this.storage = storage;
            return this;}
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        // Final method to return the built object
        public Computer build() {
            return new Computer(this);
        }
    }

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", gpu=" + gpu + ", os=" + os + "]";
	}
    
}
