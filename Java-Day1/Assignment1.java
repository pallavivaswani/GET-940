class ElectricityBill {
	double billAmount;
	int units;
	
	void setBill(int unit) {
		units = unit;
	}
	
	void calculateBill() {
		if(units <= 100) {
			billAmount = units * 1.20;
		}
		else if(units > 100 && units <= 300) {
			billAmount = 100 * 1.20 + (units - 100) * 2;
		}
		else if(units > 300) {
			billAmount = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
		}
	}
	
	void printBill() {
		System.out.println("Bill Generated for " + units + " units is : " +billAmount);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		
		ElectricityBill eb = new ElectricityBill();
		
		eb.setBill(75);
		eb.calculateBill();
		eb.printBill();
		
		eb.setBill(125);
		eb.calculateBill();
		eb.printBill();
		
		eb.setBill(320);
		eb.calculateBill();
		eb.printBill();
	}
}