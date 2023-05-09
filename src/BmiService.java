public class BmiService {

    public double calculate(double heightCm, double weightKg) {

        double bmi = weightKg / ((heightCm / 100) * (heightCm / 100));
        return bmi;
    }


}
