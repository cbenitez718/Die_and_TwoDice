// Chapter 5 Game Zone Exercise page 228

public class Die
{
	// instance variable (data fields for this class)
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	private int dieValue;

	// custom constructor for the Die class
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	// accessor (getter) method for this class
	public int getDieValue()
	{
		return dieValue;
	}
}