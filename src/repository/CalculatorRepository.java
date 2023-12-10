package repository;

/**
 *
 * @author Marko Milosevic
 */
public interface CalculatorRepository {

    public double calculate(double height, double weight);

    public String write(double index);
}
