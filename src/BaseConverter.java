public class BaseConverter {
    public void convertToKelvin(double celsius) {
        double inKelvin = celsius + 273.15;
        System.out.println("Температура в Кельвинах:"+inKelvin);
    }

    public void convertToFahrenheit(double celsius) {
        double inFahrenheit = celsius * 1.8 + 32;
        System.out.println("Температура в Фаренгейтах:"+inFahrenheit);
    }
}
