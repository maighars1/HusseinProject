package com.hussein.net;

public class Computer {
	
	//Required Parameter
	private String RAM;
	private String HDD;
	private String CPU;
	
	//Optional variable
	
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnable;
	
	
	public Computer(Builder builder) {
		// TODO Auto-generated constructor stub
		
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.CPU = builder.CPU;
		this.isBluetoothEnable = builder.isBluetoothEnable;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
	}
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getCPU() {
		return CPU;
	}
	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}
	
	
	public static class Builder{
		
		//Required Parameter
		private String RAM;
		private String HDD;
		private String CPU;
		
		//Optional variable
		
		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnable;
		public Builder(String ram, String hdd, String cpu) {
			this.RAM = ram;
			this.HDD = hdd;
			this.CPU = cpu;
		}
		public Builder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}
		public Builder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}

}
