import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        System.out.print("Выберите конвертацию (k - Kelvin или f - Fahrenheit): ");
        String choosenSystem = scanner.next();
        if (Objects.equals(choosenSystem, "k")) {
            converter.convertToKelvin(celsius);
        } else if (Objects.equals(choosenSystem, "f")) {
            converter.convertToFahrenheit(celsius);
        }
        scanner.close();
    }
}