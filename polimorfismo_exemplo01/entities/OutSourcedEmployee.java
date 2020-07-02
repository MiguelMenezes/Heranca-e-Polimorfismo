package entities;

public class OutSourcedEmployee extends Employee {

	private double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final double payment() {
		return (valuePerHour * hours) + (additionalCharge * 1.1);
	}

}
