package ua.lviv.iot.machinery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.machinery.enums.FuelType;
import ua.lviv.iot.machinery.enums.Material;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Snowcat extends Machine {
	private double bucketScopeInMeters;
	private Material material;

	@SuppressWarnings("checkstyle:magicnumber")
	public Snowcat(final String model,
			final String wheelFormula, final double mileage,
			final double fuelConsumption,
			final FuelType fuelType,
			final double bucketScopeInMeters,
			final Material material) {
		super(model, wheelFormula, mileage, fuelConsumption,
				fuelType);
		this.bucketScopeInMeters = bucketScopeInMeters;
		this.material = material;
	}
}
