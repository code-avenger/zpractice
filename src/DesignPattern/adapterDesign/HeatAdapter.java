package DesignPattern.adapterDesign;

public class HeatAdapter {
	private Double temperatureCentigrade;
	private Double temperatureFahrenheit;

	public Double getTemperatureCentigrade() {
		return temperatureCentigrade;
	}

	public void setTemperatureCentigrade(Double temperatureCentigrade) {
		this.temperatureCentigrade = temperatureCentigrade;
	}

	public Double getTemperatureFahrenheit() {
		return temperatureFahrenheit;
	}

	public void setTemperatureFahrenheit(Double temperatureFahrenheit) {
		this.temperatureFahrenheit = temperatureFahrenheit;
	}

	public void setCentigradeTemperature(Double heat) {
		this.temperatureCentigrade = heat;

		this.temperatureFahrenheit = (heat * 9 / 5) + 32;

	}

	public void setFahrenheitTemperature(Double heat) {
		this.temperatureFahrenheit = heat;
		this.temperatureCentigrade = (heat - 32) * 5 / 9;

	}

}
