package service.imp;

import repository.imp.CalculatorRepositoryImp;
import service.CalculatorService;
import repository.CalculatorRepository;

/**
 *
 * @author Marko Milosevic
 */
public class CalculatorServiceImp implements CalculatorService {

    private final CalculatorRepository calculatorRepository;

    public CalculatorServiceImp() {
        calculatorRepository = new CalculatorRepositoryImp();
    }

    @Override
    public double calculate(double height, double weight) {
        return calculatorRepository.calculate(height, weight);
    }

    @Override
    public String write(double index) {
        return calculatorRepository.write(index);
    }

}
