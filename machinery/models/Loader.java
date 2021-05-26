package ua.lviv.iot.machinery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.machinery.enums.FuelType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Loader extends Machine {
	private double loadCapacityInGrams;
	private double angleOfTheLift;

	public Loader(final String model, final String wheelFormula, final double mileage, final double fuelConsumptionPerHour,
			final FuelType fuelType, double loadCapacityInGrams, double angleOfTheLift) {
		super(model, wheelFormula, mileage, fuelConsumptionPerHour, fuelType);
		this.loadCapacityInGrams = loadCapacityInGrams;
		this.angleOfTheLift = angleOfTheLift;
		
	}
}
