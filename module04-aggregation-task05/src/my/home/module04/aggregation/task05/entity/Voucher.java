package my.home.module04.aggregation.task05.entity;

public class Voucher {

	private TypeOfTrip typeOfTrip;
	private Transport transport;
	private int numberOfDays;
	private TypeOfFood typeOfFood;
	private Destination destination;

	public Voucher() {
		typeOfTrip = TypeOfTrip.BEACH;
		transport = Transport.AIRCRAFT;
		numberOfDays = 7;
		typeOfFood = TypeOfFood.ALL_INCLUSIVE;
		destination = Destination.GREECE;

	}

	public Voucher(TypeOfTrip typeOfTrip, Transport transport, int numberOfDays, TypeOfFood typeOfFood,
			Destination destination) {
		this.typeOfTrip = typeOfTrip;
		this.transport = transport;
		this.numberOfDays = numberOfDays;
		this.typeOfFood = typeOfFood;
		this.destination = destination;

	}

	public TypeOfTrip getTypeOfTrip() {
		return typeOfTrip;
	}

	public void setTypeOfTrip(TypeOfTrip typeOfTrip) {
		this.typeOfTrip = typeOfTrip;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public TypeOfFood getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(TypeOfFood typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeOfFood == null) ? 0 : typeOfFood.hashCode());
		result = prime * result + ((typeOfTrip == null) ? 0 : typeOfTrip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		if (destination != other.destination)
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (transport != other.transport)
			return false;
		if (typeOfFood != other.typeOfFood)
			return false;
		if (typeOfTrip != other.typeOfTrip)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [typeOfTrip=" + typeOfTrip + ", transport=" + transport
				+ ", numberOfDays=" + numberOfDays + ", typeOfFood=" + typeOfFood + ", destination=" + destination
				+ "]";
	}

}