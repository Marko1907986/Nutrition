package repository.imp;

import repository.CalculatorRepository;

/**
 *
 * @author Marko Milosevic
 */
public class CalculatorRepositoryImp implements CalculatorRepository {

    @Override
    public double calculate(double height, double weight) {
        double result = weight / (height * height); // izracunaj index telesne mase
        double index = Math.round(result * 10); // zaokruzi dobijeni index na jednu decimalu
        return index / 10;
    }

    @Override
    public String write(double index) {
        String text = "";
        if (index <= 15) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: anoreksicni.";
        }
        if (index > 15 && index <= 18.5) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: mrsavi.";
        }
        if (index > 18.5 && index <= 25) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: normalni.";
        }
        if (index > 25 && index <= 30) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: popunjeni.";
        }
        if (index > 30 && index <= 40) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: debeli.";
        }
        if (index > 40) {
            text = "Vas indeks telesne mase je: " + index + "."
                    + System.lineSeparator() + "Vi pripadate grupi: gojazni.";
        }
        return text;
    }

}
