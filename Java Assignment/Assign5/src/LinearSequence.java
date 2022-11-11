package Series;

public class LinearSequence extends Sequence {

	private double current;
	private float step;

	public LinearSequence(double first, float differance){
		current = first;
		step = differance;
	}
	public double next (){
		double term = current;
		current += step;
		return term;
	}
}

