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

	@SuppressWarnings("checkstyle:magicnumber")
	public Loader(final String model,
			final String wheelFormula, final double mileage,
			final double fuelConsumption,
			final FuelType fuelType,
			final double loadCapacityInGrams,
			final double angleOfTheLift) {
		super(model, wheelFormula, mileage, fuelConsumption,
				fuelType);
		this.loadCapacityInGrams = loadCapacityInGrams;
		this.angleOfTheLift = angleOfTheLift;

	}
}
