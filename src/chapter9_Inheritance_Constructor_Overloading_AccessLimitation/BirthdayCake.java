package chapter9_Inheritance_Constructor_Overloading_AccessLimitation;

public class BirthdayCake extends Cake{
	
	private int candle;
	
	public BirthdayCake() {
		super("vanilla");
	}

	public int getCandle() {
		return candle;
	}

	public void setCandle(int candle) {
		this.candle = candle;
	}

	
	
	
	
	
	
}
