package fit.challenge;

public class ImcCalculator {

    public static String calculate(double weight, double height){

        double value = weight / (height * height);
        String result = "";

        if (value < 18.5) {
            result =  "Magreza";
        }else if (value < 24.9) {
            result = "Normal";
        }else if (value < 30) {
            result = "Sobrepeso";
        }else {
            result = "Obesidade";
        }

        return result;
    }
}
