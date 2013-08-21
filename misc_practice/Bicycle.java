class Bicycle {
	int gear;
	
	void changeGear(int newGear) {
		gear = newGear;
	}
	
	void showGear() {
		System.out.println(String.valueOf(gear));
	}
	
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.changeGear(2);
		b.showGear();
		b.changeGear(11);
		b.showGear();
		System.out.println(b);
	}
	
}
