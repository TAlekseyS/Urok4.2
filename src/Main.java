public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightCm = 192;
        double weightkg = 77;
        double bmi = service.calculate(heightCm, weightkg);
        int bmitrue = (int) bmi;

        System.out.println(bmitrue);


    }
}

