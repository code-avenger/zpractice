package DesignPattern.adapterDesign;

public class MainClass {
	public static void main(String[] args) {

		Double heatF = new Double(98.6);
		Double heatC = new Double(26);

		HeatAdapter temperature = new HeatAdapter();

		temperature.setCentigradeTemperature(heatC);
		System.out.println("temperature Celcius: " + String.valueOf(temperature.getTemperatureCentigrade()));
		System.out.println("temperature Fahrenheit: " + String.valueOf(temperature.getTemperatureFahrenheit()));

		HeatAdapter temperature1 = new HeatAdapter();
		temperature1.setFahrenheitTemperature(heatF);
		System.out.println("temperature1 Celcius: " + String.valueOf(temperature1.getTemperatureCentigrade()));
		System.out.println("temperature1 Fahrenheit: " + String.valueOf(temperature1.getTemperatureFahrenheit()));
	}
}
